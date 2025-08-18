package implementation;


//코딩시 중요한 것
//        1. 가독성: 코드의 역할에 집중, 길어지거나 중복부분 발생시 변수와 메서드에 역할에 맞는 이름을 붙임
//        2. 효율성: 시간복잡도 고려
//        3. 설계: 가독성과 효율성을 고려해 단계별로 로직을 구현

//문제 상황: 사용자가 입력한 전화번호를 가진 사람들을 전화번호부에서 검색

    /*설계*/
//1. 전화번호는 어떤 형식으로 받을 것인지
//2. 전화번호부에 있는 사람들은 어떻게 나타낼 것인지
//3. 사람과 전화번호부 매칭 방식
//4. 전화번호부 표현 형식정하기

import java.util.ArrayList;
import java.util.List;

class PhoneBook {
    //1. 전화번호부 나타내기
    private static class PhoneNumber {
        public final String phoneNumber;

        public PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
        }

        @Override
        public String toString() {       //toString(): 객체를 구성하는 멤버 변수들을 문자열로 반환
//             [참고]   자바에서는 ' 과 " 를 문자 그대로 표현시키기 위해 이스케이프 시퀀스(\)를 사용
//                return "PhoneNumber{" + "phoneNumber='" + phoneNumber + '\'' + '}';
            return "PhoneNumber{" + "phoneNumber='" + phoneNumber + '\'' + '}';
        }

        @Override
        public boolean equals(Object o){
            if(!(o instanceof PhoneNumber)) return false;
            return phoneNumber.equals(((PhoneNumber)o).phoneNumber);
            // 객체 o를 PhoneNumber로 캐스팅한뒤, 두 객체의 필드 값을 비교
        }

    }

    //2. 전화번호부 사람 나타내기
    // 한 사람은 여러개의 전화번호를 가질 수 있음을 가정
    private static class Person {
        //이름과 numbers는 생성자에서 값이 정해진이후 바뀌지 않으므로 final로 처리
        // List 처럼 외부에서 접근해서 임의의 값을 바꿀 수 있는 값은 해당 클래스에서만 접근 가능하도록 private로 처리(의도대로 해당 객체 사용)
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }
        public boolean hasPhoneNumber(PhoneNumber number){
            return numbers.contains(number);        //contains 메서드는 equals()메서드를 사용하는데 이는 객체만 비교. 오버라이딩 필요
        }




    }

    public static void main(String[] args) {
        Person person = new Person("오지민");
        person.addPhoneNumber(new PhoneNumber("010-2107-7833"));
        System.out.println(person.hasPhoneNumber(new PhoneNumber("01021077833")));
    }
}



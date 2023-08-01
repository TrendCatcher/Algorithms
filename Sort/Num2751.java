package Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/*[문제]*/
//오름차순 정렬

// 1. Collection.sort() 사용
//    - [주의점 1] ArrayList로 선언 후 사용
//    - [주의점 2] StringBuilder 객체 선언 후 .append()메소드 사용, StringBuilder의 객체를 선언해야함
// 2. counting sort 사용 (O(n))


//public class Num2751 {
//    public void solution() throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//
//public class Num2751{
//    public void solution() throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        List<Integer> arr = new ArrayList<>();
//
//        int N = Integer.parseInt(br.readLine());
//
//        for(int i =0; i<N;i++){
//            arr.add(Integer.parseInt(br.readLine()));
//        }
//
//        Collections.sort(arr);
//
//        for(int value: arr){
//            sb.append(value).append("\n");
//        }
//
//        System.out.println(sb);
//
//    }
//    public static void main(String[]args) throws IOException{
//        new Num2751().solution();
//    }
//
//}
public class Num2751{
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        for(int result: arr){
            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
    public static void main(String[]args)throws IOException{
        new Num2751().solution();
    }
}

/*

StringBuilder 사용 이유
- java에서 String은 불변의 문자열, 따라서 concatenation 연산시 기존의 문자열을 가비지 컬렉터로 들어감 >> 메모리적으로 비효율
- StringBuilder는 변경가능한 문자열을 생성해준다. (객체(sb)호출후 .append()를 사용해서 문자열을 잇는다. )*/

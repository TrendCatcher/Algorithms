package String;
//수가 주어지면 내림차순으로 정렬
import java.io.*;
import java.util.Arrays;
/*[도전]
1. Array.sort안쓰고 해보기
2. toCharArray, charAt둘다 활용해보기*/

class Boj_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counting = new int[10];       //카운팅 배열의 인덱스는 저장된 숫자임을 반드시 기억!!!
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            counting[s.charAt(i) - '0']++;
        }
        StringBuilder sb = new StringBuilder();

        //counting 배열에 0이상의 값이 있으면 1. i(숫자) 출력하고
        // 2. counting배열의 값은 인덱스가 나온 횟수

        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                sb.append(i);  //중요
                //*************카운팅 배열의 인덱스는 저장된 숫자임을 반드시 기억!!!****************//
            }
        }
        System.out.println(sb);
    }
}

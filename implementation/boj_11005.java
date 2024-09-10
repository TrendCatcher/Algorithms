package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
//[reference] int형은 약 2억의 +-정수를 담을 수 있다.
class boj_11005 {
    static StringTokenizer st;

     public static void main(String[]args) throws IOException {
         //N과 B가 주어질때
         // B의 거듭제곱수의 덧셈으로만 N을 B진법으로 구성가능
//         B의 제곱수는 자릿수 +1을 의미
         //예시로 11을 2진법 > 2^3+2^1+2^0 > 1011
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         st = new StringTokenizer(br.readLine());
         int N = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken()); // B는 2이상 36이하
         List<Character> list = new LinkedList<>();
         // 2. 몫이 0이 될때까지 N/B
         // 3. 몫이 0이면 나머지 들의 역순으로 읽음
         // 아스키 코드 값: A부터 Z까지 65~90
         while(true){
             if(N==0)   break;
             if(N%B>=10){         // 몫이 10 이상으면 나머지를 A부터 Z까지의 수로 변환
                 list.add((char) (N % B - 10 + 'A'));
             }else {
                 list.add((char) (N % B + '0'));      //나머지가 0부터 9까지이면 문자형으로 변환후 0을 더하면 아스키코드 값으로 숫자0~9표현가능
             }
             N = N / B;  // 몫은 0이 될때 까지 계속 초기화
         }
         for (int i = list.size() - 1; i >= 0; i--) {
             System.out.print(list.get(i));
         }
     }
}
/*중요했던 부분 (크게 3가지)*/
//1. 진법 변환 원리: 나머지를 계속 N으로 초기화, N이 0이면 무한 루프 빠져나오기, 나머지의 역순이 진법 변환 한 수
//2. 나머지 역순을 결과로 변환: 나머지가 10이상일 때와 10미만일 때를 구분
//2.1 나머지가 10 미만일때는 나머지를  '0'을 더하고 char형으로 바꾸어 주면 0부터 9까지의 수로 변환
//2.2 나머지가 10 이상 일때는 A~Z까지의 수로 변환시켜주어야 하므로 나머지-10에 'A'를 더한 값을 char형으로 변환
//3. 출력 방법: 나머지는 지속적으로 list자료형이 넣고 역순으로 뺴냄

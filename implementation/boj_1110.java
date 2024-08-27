package implementation;

import java.io.*;

class boj_1110{
    static int count=0;
    static int n;
    static int calculateNum(int n){
        int original =n;

        while(true){
            int one = n%10;    //첫째 자리
            int ten = n/10;    //2자리수
            int sum = one+ten;

            n = one*10 + sum%10;    //새로운 수
            count++;

            if(original == n){
                break;
            }
        }
        return count;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(calculateNum(n));
    }
}
/*중요했던 점*/
//1. while 루프 생성
//        >> 루프 도는 동안 새로운 수 계속 창출
//2. break문
//        >>만약 처음수와 같다면 while 루프 빠져나옴
//[break 정의] 현재 실행중인 가장 안 쪽 루프문을 나옴
/*특히 중요!!*/
//3. original 변수를 사용해 n(초기값) 저장, 이후 새로운 변수 선언 없이 n만 업데이트
//>> newNum = = one*10 + sum%10; 와 같이 선언 하면 새로만든 수가 다시 싸이클을 돌지 못함!!
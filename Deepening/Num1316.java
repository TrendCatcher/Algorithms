package Deepening;

import java.util.Scanner;


/*
[그룹단어 개수 출력]
*/

public class Num1316 {
    public void solution()  {
        Scanner scan = new Scanner(System.in);
        int count =0;
        int N = scan.nextInt();

        for(int i =0; i<N;i++){
            if(check() == true){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(){      // 그룹단어인지 검사하는 로직
        Scanner scan = new Scanner(System.in);
        boolean[] check = new boolean[26];
        int prev=0;
        String str = scan.next();

        for(int i = 0 ; i<str.length();i++){    // 현재단어와 이전 단어를 비교
            int now = str.charAt(i);        // i번째 문자

            // 지금문자가 이전 문자와 다르면..
            // 1. 전에 안나온 문자면 prev에 저장
            // 2. 전에 나온 문자면 그룹문자가 아니고
            if (prev !=now ){
                if(check[now-'a'] == false){
                    check[now-'a'] = true;
                    now = prev;
                }
            else{
                return false;
                }

            }
            // 지금 문자와 이전 문자 같으면 계속 진행
            if(prev == now)
                continue;
        }
        return true;
    }

//    public static boolean check() {
//        Scanner scan = new Scanner(System.in);
//        boolean[] check = new boolean[26];
//        int prev = 0;
//        String str = scan.next();
//
//        for(int i =0; i<str.length();i++){
//            int now = str.charAt(i);    // i번째 문자 저장 (현재 문자)
//
//            //앞선 문자와 i번째 문자가 같지 않다면? 검사
//            if(prev != now){
//                // 해당 문자를 처음보는 경우
//                if(check[now - 'a'] == false){
//                    check[now -'a'] = true;     //true로 바꿈
//                    prev = now;                 // 갱신
//                }
//                //해당 문자를 본 경우
//                else{
//                    return false;   //함수 종료
//                }
//            }
//            // 앞선 문자와 i번째 문자가 같다면 (연속된 문자)
//
//        }
//        return true;
//    }
    public static void main(String[]args) {
        new Num1316().solution();
    }
}

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2745 {

    /*계산*/
// 입력받은 N배열로 받고 해당 문자를 아스키코드 변환후 계산

//    static char[] charArrDigit; //각 자리에 저장된 인덱스를 자릿수(Digit)로 사용
//    //EX) charArrDigit[3]은 4자리수
//    static StringTokenizer st;
//    static int result = 0;
//    static int value = 0;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        st = new StringTokenizer(br.readLine(), " ");
//        //[입력] String N, 진법 B
//        String N = st.nextToken();
//        int B = Integer.parseInt(st.nextToken());
//        charArrDigit = new char[N.length()];
//
//
//
//
//
////      각 자리수(혹은 문자)에 해당하는 수 * 진법^자릿수
//        for (int i = 0; i<N.length(); i++) {
//            //역순으로 인덱싱 (자릿수 계산작업)
//            charArrDigit[i] = N.charAt(N.length()-1-i);
//
//            if (charArrDigit[i] >= 'A' && charArrDigit[i] <= 'Z') {   //A~Z은 ASCII로 65~90
//                value = charArrDigit[i] - 55;
//            } else if (charArrDigit[i] >= '0' && charArrDigit[i] <= '9') {
//                value = charArrDigit[i] - 48;
//            }
//
//            result += value * (int) Math.pow(B, i);
//
//        }
//        System.out.println(result);
//    }
    static int sum=0;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //input
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        //logic
        for(int i=0; i<N.length();i++){
            char c = N.charAt(N.length()-1-i);
            if(c>='A'&&c<='Z'){
                sum += (c - 55) * (int) Math.pow(B, i);
            }else{
                sum += (c - '0') * (int)Math.pow(B,i);
            }
        }
        System.out.println(sum);
    }
}

//int형 :4바이트 (32비트)	-2,147,483,648 ~ 2,147,483,647 (약 ±21억)
//long형 :8바이트 (64비트)-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (약 ±9경)
package String;
/*
* 단어 S (알파벳 소문자로만 이루어짐)
* 각 알파벳에 대해서 a가 처음 등장하는 위치, b가 처음 등장하는 위치, ..z가 처음으로 등장하는 위치를 출력한다.
* 만약 어떤 알파벳이 단어에 포함되어 있지 않으면, -1을 출력,
* 단어의
* */
import java.io.*;

//public class Num10809 {
//    static int[] arr;
//    static String s;
//    public static void main(String[]args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        1. int형 배열 생성후 모두 -1로 초기화
//
//        arr = new int[26];
//        for(int i =0 ; i<arr.length; i++){
//            arr[i] = -1;
//        }
//        //2. 문자열 입력 받음
//        s = br.readLine();
////        3. 각 문자열을 검색
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            // 4. ch의 문자의 위치를 앞서 만든 arr 배열의 값으로 바꿔준다.
//            if(arr[ch-97] == -1){
//                arr[ch-97] = i;
//            }
//
//        }
//        for(int val: arr){
//            System.out.println(val + " ");
//        }
//    }
//}

class Num10809{
    static int[] arr;
    static String s;

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        arr = new int[26];

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(arr[ch-'a'] ==-1){
                arr[ch-'a'] = i;
            }
        }
        for(int val: arr){
            System.out.println(val+" ");
        }

    }
}
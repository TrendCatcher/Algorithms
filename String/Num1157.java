package String;

/*[문제]*/
//대소문자 구분없이 알파벳 대소문자로 이루어진 단어중 가장 많이 사용된 알파벳 출력
//[입력]
//        첫째줄에 알파벳 대소문자로 이루어진 단어
//[출력]
//    가장 많이 사용된 알파벳 대문자로 출력, 여러개인 경우 ?출력
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


 class Num1157 {
     private void solution() throws IOException{
        //1. 입력 받고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        // 2. 알파벳 검사, 잘라서 배열에 저장후
        // 3. 가장 많이 나온 거 출력 (핵심), 단, 대소문자도 구분없어야 된다.
        // 대문자 범위(A~Z): 65 ~ 90, 소문자 범위: 97 ~ 122,따라서 22차이가 난다.
        int [] arr = new int [26];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >='A'&& s.charAt(i)<='Z'){
                arr[s.charAt(i)-'A']++;
            }
            else {
                arr[s.charAt(i)-'a']++;
            }
        }
        // 4. 최댓값 변수 max를 선언해 각 배열의 값이 max보다 클경우 max로 변경
        int max = -1;
        char ch = '?';

        for(int i =0; i<26;i++){
            if(arr[i]>max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i]==max)
                ch = '?';
        }
        System.out.println(ch);



    }
    public static void main(String[]args) throws IOException{
        new Num1157().solution();
    }

}

package String;
import java.io.*;


public class Boj_10809 {
    static int[] alphabet;
    static String word;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        alphabet = new int[26]; // 출력할 alphabet 문자열 크기 선언

        // alphabet배열 모든 요소 -1로 초기화
        for(int i=0;i<alphabet.length;i++) {
            alphabet[i] = -1;
        }

        word = br.readLine();

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(alphabet[ch - 'a'] == -1){   // 중복되는 문자 방지
                alphabet[ch - 'a'] = i;     // 입력받은 문자열의 각 문자의 위치 i
            }

        }
        for(int val: alphabet){
            System.out.print(val + " ");
        }
    }
}
/* ************** 문제에서 중요한 것들 ************ */
//velog정리함
/* ************** Idea ************ */
// 문자를 입력받고 각 알파벳 문자를 배열로 바꾼후
// 각 알파벳 문자열의 인덱스를 알파벳 배열의 위치로 그대로 옮기는 코드를 찍어면 된다.
// 문제는 입력받은 알파벳의 인덱스 각각을 알파벳 배열에 대응시켜 넣느냐가 관건 >> 인코딩값!!

/* ************** 아스키 코드 ************ */
// [소문자] a는 10진수 97
// [대문자] A는 10진수로 65

package implementation;
import java.io.*;
import java.util.Arrays;

public class boj_11644 {
    static String[] words;
    static char[] word;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cmd = br.readLine();         //cmd = this is java

        //1. 공백 단위로 쪼개고
        words = cmd.trim().split(" ");  //words "this" "is" "java"
        StringBuilder sb = new StringBuilder();

        //2. 각 쪼갠 문자를 문자 배열에 저장
        for(int i=0; i<words.length;i++){
            word = words[i].toCharArray(); //매번 새로운 word인스턴스 생성 //word [t h i s] ,[i s] , [j a v a]
            for(int j=0; j<word.length;j++){
                if(word[j]>='a'&&word[j]<='z'){     //aplhabet소문자, 대문자에 대해서는
                    word[j]= (char)('a'+(word[j]-'a'+13)%26);        //각 문자를 13글자씩 민다.
                }else if(word[j]>='A'&&word[j]<='Z'){
                    word[j]= (char)('A'+(word[j]-'A'+13)%26);
                }
            }
            words[i]=new String(word);    //쪼개진 char[] String으로 합친 결과로 words초기화 하고
            sb.append(words[i]).append(" ");    //sb객체에 넣은다음 공백을 추가
        }
        System.out.println(sb);
    }
}

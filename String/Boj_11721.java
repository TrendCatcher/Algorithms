package String;
// 10개씩 끊어서 출력하기
//만약 10개가 되면 10개를 StringBuilder에 저장했다가 출력 + "\n"
import java.io.*;
public class Boj_11721 {
   public static void main(String[]args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       String S = br.readLine();

       for(int i=0; i<S.length();i++){
           char ch = S.charAt(i);
           sb.append(ch);
           if(sb.length() == 10){
               System.out.println(sb);
               sb.setLength(0);
           }

       }
       if(sb.length() > 0){
           System.out.println(sb);
       }


   }
}

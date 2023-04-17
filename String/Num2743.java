package String;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2743 {
    public void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        System.out.println(S.length());
    }
    public static void main(String[]args)throws IOException{
        new Num2743().solve();
    }
}
*/
/*
[문제]
1. 입력받은 문자열의 길이를 측정
*/

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 public class Num2743{
   public void solution() throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String S = br.readLine();
       System.out.println(S.length());
   }
   public static void main(String[]args) throws IOException{
       new Num2743().solution();
   }
 }


package String;
/*
[문제]
공백없는 숫자문자열 parse해서 합출력
* */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num11720 {
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /*방법 1 - charAt() 사용*/
//        String str = br.readLine();
//        int sum=0;
//
//        for(int i=0; i < str.length(); i++){
//            sum += str.charAt(i)-'0';
//        }



        /*방법 2- toCharArray() 사용*/
        char[] arr = br.readLine().toCharArray();
        int sum =0;

        for(int i=0;i<N;i++){
            sum+=arr[i]-'0';
        }
        System.out.println(sum);
    }


    public static void main(String[]args) throws IOException{
        new Num11720().solution();
    }
}


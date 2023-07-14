package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num11720 {
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /*방법 1 - charAt() 사용*/
//        String str = br.readLine();
//        int sum = 0;
//
//        for(int i =0;i<N;i++){
//            sum += str.charAt(i) - '0';     //IDE에서 설정한 인코딩 형식의 10진수 값을 정수로 바꿈
//        }
        /*방법 2- toCharArray() 사용*/
        char[] numbers = br.readLine().toCharArray();
        int sum = 0;
        for(int i=0;i<N;i++){
            sum+= numbers[i]-48;
        }

        System.out.println(sum);
    }


    public static void main(String[]args) throws IOException{
        new Num11720().solution();
    }
}

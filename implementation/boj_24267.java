package implementation;
import java.io.*;

public class boj_24267 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Integer.parseInt(br.readLine()); //num은 최대 500000이다.

        long count = (num*(num-1)*(num-2))/6;       //주어진 함수에 대한 다항식, num최대시 int 점위 초과 조심
        System.out.println(count);
        System.out.println(3);
    }
}

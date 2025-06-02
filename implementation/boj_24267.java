package implementation;
import java.io.*;

public class boj_24267 {
    static long count =0L;      // 최대 10^18승
    public static void main(String[]args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long num = Integer.parseInt(br.readLine()); //num은 최대 500000이다.
//
//        long count = (num*(num-1)*(num-2))/6;       //주어진 함수에 대한 다항식, num최대시 int 점위 초과 조심
//        System.out.println(count);
//        System.out.println(3);
//    }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Integer.parseInt(br.readLine());     //num의 최대는 500000(5만)

        count = (num*(num-1)*(num-2))/6;     //다항식 계산은 NC3
        System.out.println(count);
        System.out.println(3);

    }
}

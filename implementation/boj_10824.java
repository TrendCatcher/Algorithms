package implementation;
import java.io.*;
import java.util.*;

class boj_10824{
    static StringTokenizer st;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] arr = new long[4];

        st = new StringTokenizer(br.readLine()," ");
        for (int i=0;i<4;i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        String num1 = arr[0] + String.valueOf(arr[1]);
        String num2 = arr[2] + String.valueOf(arr[3]);


        long result =  Long.parseLong(num1)+ Long.parseLong(num2);
        System.out.println(result);
    }
}
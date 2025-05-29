package implementation;
import java.io.*;
import java.util.*;
public class boj_9093 {
    static String[] arr;
    static String[] reversed;
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        sb = new StringBuilder();

        for(int i=0 ;i<num;i++){
            String cmd1 = br.readLine();

            arr = cmd1.trim().split(" ");
            reversed = new String[arr.length];

            for(int j=0;j<arr.length;j++){
                sb.append(new StringBuilder(arr[j]).reverse());
                sb.append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);

    }
}

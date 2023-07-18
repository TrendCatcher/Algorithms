package Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Num10818 {
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int min = 1000001;
        int max = -1000001;


        while(st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            if(val <min)
                min = val;
            if(val>max)
                max= val;
        }
        System.out.println(min + " " + max);
    }
    public static void main(String[]args) throws IOException{
        new Num10818().solution();
    }
}

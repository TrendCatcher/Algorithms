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

        int [] arr = new int [N];
        int index =0;

        while(st.hasMoreTokens()){
            arr[index]= Integer.parseInt(st.nextToken());
            index ++;
        }

        Arrays.sort(arr);

        int max, min= 0;
        min=arr[0];
        max=arr[N-1];
        System.out.println(min+ " "+ max);
    }
    public static void main(String[]args) throws IOException{
        new Num10818().solution();
    }
}

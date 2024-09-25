package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class boj_5597{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];
        Arrays.fill(arr,0);

        for(int i=0; i<28;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num-1]++;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
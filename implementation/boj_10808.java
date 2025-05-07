package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int[] result = new int[26];

        for(int num:result){
            num = 0;
        }


        for(int i=0; i<arr.length;i++){
            result[arr[i]-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(result[0]);
        for(int i=1;i<result.length;i++){
            sb.append(" ").append(result[i]);

        }
        System.out.println(sb);
    }

}

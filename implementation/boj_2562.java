package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class boj_2562 {
    static int[] arr;
    static int []max ={-1};

    public static void main(String[]args) throws IOException {
        HashMap<Integer, Integer> hm = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9];

        //1. 수 입력
        for(int i=0;i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
            hm.put(arr[i], i+1);
        }

        Arrays.sort(arr);

        System.out.println(arr[8]+"\n"+ hm.get(arr[8]));
    }
}

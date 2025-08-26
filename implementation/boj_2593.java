package implementation;

import java.io.*;
import java.util.*;

class boj_2953{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Map<Integer, Integer> map = new HashMap<>();
                int[] sum = new int[5];

                for(int j=0;j<5;j++){
                    int[] arr = new int[4];
                    st = new StringTokenizer(br.readLine());
                    for(int i=0;i<4;i++){
                        arr[i] = Integer.parseInt(st.nextToken());
                        sum[j]+=arr[i];
                    }
                }
                for(int i=0;i<5;i++){
                    map.put(i,sum[i]);
                }
                int max =0;
                for(int i=0;i<5;i++){
                    max = Math.max(max,map.get(i));
                }

                //output
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.println(key+1 + " " + max);
            }
        }
    }
}

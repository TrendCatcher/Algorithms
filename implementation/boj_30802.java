package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_30802 {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++){/*단, 0일수도 있다!!*/
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int shirt = Integer.parseInt(st.nextToken());
        int pen = Integer.parseInt(st.nextToken());
//shirt count (ouput 1)
        int shirt_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                if (arr[i] % shirt == 0) {
                    shirt_count+=(arr[i]/shirt);
                } else {
                    shirt_count += ((arr[i] / shirt) + 1);
                }
            }
        }
        //pen count(output 2)


//        [output]
        System.out.println(shirt_count);
        System.out.println((num / pen) + " " + num % pen);
    }
}

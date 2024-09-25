package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_10817 {
    static int []nums;
    static int temp = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        nums = new int[3];
        for(int i=0; i<3;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        second(nums);
    }
    static void second(int [] nums){


        for(int i=0 ;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(nums[1]);
    }
}

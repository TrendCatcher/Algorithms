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


        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
// more memory used in using sort() due to dual-pivot algorithm
//but more efficient time complexity by O(nlogn) while using doubled for loop is O(n^2)

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2309 {
    //입력받은 수들중에 2개를 골라 빼면 100이 되되는 조합을 고른다.
    static int sum = 0;

    public static void main(String[]args)throws IOException {
        //난재잉 키 입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i=0 ;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        search(arr);

    }   //end of main

     static void search(int[] arr) {
        int sum = 0;

        // Calculate the sum of all elements in the array
        for (int num : arr) {
            sum += num;
        }

        // Nested loop to find the pair whose exclusion results in the sum of 100
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    arr[i]=0;
                    arr[j]=0;
                    break;
                }
            }
        }
         Arrays.sort(arr);
         for(int k=2; k<arr.length;k++){
             System.out.println(arr[k]);
         }

    }

}   //end of class

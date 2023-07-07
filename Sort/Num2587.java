package Sort;
/*입력받은 수의 대표값과 중앙값 구하기*/
/* [고민]
배열 나열 후 가운데 값을 출력 >> Array.sort로 가능? */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Num2587 {
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int avg=0;
        int mid =0;
        int arr[] = new int[5];     //입력 받은 수 만큼 배열에 초기화

        for (int i = 0; i < 5; i++) {   // 배열 입력 받기
            arr[i]= Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        avg=sum/5;
        Arrays.sort(arr);

        //중앙값 출력
        mid =  arr[2];
        System.out.println(avg + "\n" + mid);
    }
    public static void main(String[]args)throws IOException{
        new Num2587().solution();
    }
}

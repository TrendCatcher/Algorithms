package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class boj_10773 {
    static long sum = 0;
    public static void main(String[] args) throws IOException {
        Stack<Long> nums = new Stack<>();
//  최종적으로 적어낸 수의 합은 2^31-1보다 작거나 같은 정수 ->8바이트(long형)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        for(int i=0; i<k;i++){  //k만큼 수입력 받기
            long n = Integer.parseInt(br.readLine());
            if(n==0&&nums.isEmpty()!=true){     //0일경우 지울수 있는수 보장
                nums.pop();     //1. 정수가 0일경우 최근수 지움
            }else
                nums.add(n);        //2. 0정수가 0이 아닐경우 해당수를 씀
        }
        while(true) {
            if (nums.isEmpty() != true) {
                sum+=nums.pop();
            }else break;
        }

        System.out.println(sum);
    }//end of main
}//end of class

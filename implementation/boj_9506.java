package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_9506 {
    static ArrayList<Integer> nums = new ArrayList<>();
    static StringBuilder sb;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());
            //약수의 합을 구하는 로직, 2<n<100,000
            //약수란? n보다 작은 모든 수로 나누었을때 나머지가 0
            for(int i=1;i<=n/2;i++){    // 약수중 가장 큰수는 n/2를 넘지 않음:
                if(n/i==0){
                    //ArrayList에 등록
                    nums.add(i);
                }
            }
            //완전수인 경우 약수들의 합으로 출력
            if(sumList(nums)==n){
                sb.append(n).append(" = ");
                for(int j:nums){
                    sb.append(j).append(" + "); //약수들의 합으로 어떻게 출력하지..?
                }

                System.out.println(sb);
            }else{
                System.out.println(n + " is NOT perfect.");
            }

            if(n==-1)   //-1이면 TC를 빠져나감
                break;
        }

    }
    //(배열안의 수)모든 약수를 더하는 로직
    static int sumList(ArrayList<Integer> list){
        int sum = 0;
        for(int num:list){
            sum += num;
        }
        return sum;
    }
}

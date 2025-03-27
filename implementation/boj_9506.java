package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//public class boj_9506 {
//
//    static StringBuilder sb;
//    public static void main(String[]args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        sb = new StringBuilder();
//
//        while(true){
//            int n = Integer.parseInt(br.readLine());
//            //약수의 합을 구하는 로직, 2<n<100,000
//
//            if(n==-1)   //-1이면 TC를 빠져나감
//                break;
//            ArrayList<Integer> nums = new ArrayList<>();
//            for(int i=1;i<n;i++){   //자기 자신을 제외한 약수의 합
//                if(n%i==0){   //약수란? n보다 작은 모든 수로 나누었을때 나머지가 0
//                    //ArrayList에 등록
//                    nums.add(i);
//                }
//            }
//
//            //완전수 아닌 경우
//            if(sumList(nums)!=n) {
//                sb.append(n + " is NOT perfect.\n");
//                continue;
//            }else{
//                sb.append(n).append(" = ");
//                for(int i=0; i<nums.size();i++){
//                    if(i>0) sb.append(" + ");
//                    sb.append(nums.get(i));
//                }
//                sb.append("\n");
//            }
//        }
//        System.out.println(sb);
//    }
//    //(배열안의 수)모든 약수를 더하는 로직
//    static int sumList(ArrayList<Integer> list){
//        int sum = 0;
//        for(int num:list){
//            sum += num;
//        }
//        return sum;
//    }
//}
class boj_9506{

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while(true){
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();

            for(int i=1;i<n;i++){
                if(n%i==0){
                    nums.add(i);    //약수를 저장
                }
            }

            if(n==-1)
                break;
            else if(n==sumFun(nums)){
                sb.append(n).append(" = ");
                for(int i=0;i<nums.size();i++){
                    if(nums.get(i)!=1){     //1은 모든 수(2<1000,000)의 약수
                        sb.append(" + ").append(nums.get(i));   //1을 제외한 수
                    }else{
                        sb.append(nums.get(i));
                    }

                }
                sb.append("\n");
            }else if(n!=sumFun(nums)){
                sb.append(n+ " is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }//end of main

    static int sumFun(ArrayList<Integer> list){
        int sum=0;
        for(int i=0; i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }//end of sumFun

}//end of class

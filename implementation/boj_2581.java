package implementation;

import java.io.*;
import java.util.*;

class boj_2581{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());



        for(int i=N;i<=M;i++){  //N이상 M 이하 수에 대하여
            int count=0;

                for(int j=2;j<=i;j++){      //1을 제외하고 나머지는 자기 자신으로 나누어 count가 1이면 소수 판정(list.add)
                    if(i%j==0)
                        count++;    //소수는 이어야함
                }
                if(count==1){   //자지자신으로만 나눈 수가
                    list.add(i);
                }

        }

        int sum=0;
        int[] num= new int[list.size()];
        for(int i=0; i<list.size();i++){
            num[i]=list.get(i);
            sum+=list.get(i);
        }
        Arrays.sort(num);
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(num[0]);
        }

    }
}

package Deepening;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//A: 고정비용
//B: 가변비용
//C: 노트북 비용
/*고민: 손익분기점(모르는 값)을 어떻게 출력하지?...?*/
public class Num1712 {
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());


       int result = 0;
//       totalCost = A+B*N;
//       breakPointCost = C*N;
//        A + B * N = C*N, A = (C-B) N,

       if(C <= B){
           result = -1;
       }
       else if (C > B){
           result = A/(C - B) +1 ;
       }
        System.out.println(result);
    }

    public static void main(String[]args)throws IOException{
        new Num1712().solution();
    }
}

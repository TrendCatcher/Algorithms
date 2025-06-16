package implementation;

import java.io.*;

public class boj_1193 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        1번째 그룹: 1/1 → (분자 1, 분모 1)
//
//        2번째 그룹: 1/2 → 2/1
//
//        3번째 그룹: 3/1 → 2/2 → 1/3
//
//        4번째 그룹: 1/4 → 2/3 → 3/2 → 4/1

        int X = Integer.parseInt(br.readLine());
        int group = 1;

        while (X > group) {
            X = X - group;
            group++;
        }       //어느 그룹인지 판별

        int numerator, denomiator;      //분모, 분자

        if(group%2==1){     //
            numerator = X;  //분모
            denomiator = group - X + 1;   //분자
        }else{
            numerator = group - X + 1;  //분모
            denomiator = X;   //분자
        }
        StringBuilder sb = new StringBuilder();
        sb.append(denomiator).append("/").append(numerator);
        System.out.println(sb);

    }
}

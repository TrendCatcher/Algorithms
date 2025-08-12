package implementation;

import java.io.*;
import java.util.*;

class boj_14696{
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        while(TC-->0){
            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");

            //각 사용자별 map선언
            Map<Integer, Integer> mapA = new HashMap<>();
            Map<Integer, Integer> mapB = new HashMap<>();

            //A 딱지 개수 + 딱지들
            for(int i=1;i<A.length;i++){
                int cardA = Integer.parseInt(A[i]);
                mapA.put(cardA, mapA.getOrDefault(cardA, 0) + 1);
            }
            //B 딱지 개수 + 딱지들
            for(int i=1;i<B.length;i++){
                int cardB = Integer.parseInt(B[i]);
                mapB.put(cardB, mapB.getOrDefault(cardB, 0) + 1);
            }

            String winner = "D";
            for (int i = 4; i >= 1; i--) {
                int countA = mapA.getOrDefault(i, 0);
                int countB = mapB.getOrDefault(i, 0);
                // 오류 코드!!! 4의 개수가 같아도 받드시 결과가 나오므로 다음으로 3의 개수를 카운트 못함!!
//                if (countA > countB) {
//                    sb.append('A').append("\n");
//                    break;
//                } else if (countA < countB) {
//                    sb.append('B').append("\n");
//                    break;
//                } else {
//                    sb.append('D').append("\n");
//                    break;
//                }
                if (countA > countB) {
                    winner = "A";
                    break;  //결과가 결정되면 다음 TC로 넘어가야함
                }else if (countA < countB) {
                    winner = "B";
                    break;
                }
            }
            sb.append(winner).append("\n");
        }//end of TC
        System.out.println(sb);
    }
}

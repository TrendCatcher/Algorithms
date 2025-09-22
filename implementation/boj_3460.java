package implementation;
import java.io.*;
import java.util.*;

class boj_3460{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();


        while(TC-->0){
            int pos =0;
            int num = Integer.parseInt(br.readLine());
            while(num>0){
                if((num&1)==1){    //비트연산, 0번째 위치 부터 조사
                    list.add(pos);  //해당 자리에 있으면 list에 add
                }
                num = num>>1;    //*2 시프트 연산
                pos++;           //위치 출력하는 변수 pos 도 +1로 초기화
            }


            //output
            for(int i=0;i<list.size();i++){
                sb.append(list.get(i));
                sb.append(" ");
            }
            list.clear();
            sb.append("\n");
        }//end of TC
        System.out.println(sb);
    }//end of main
}//end of Class
package implementation;

import java.io.*;
import java.text.*;

class boj_5355{
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        while(TC-->0){
            String line = br.readLine().trim();
            String[] arr = line.split(" ");
            float result=Float.parseFloat(arr[0]);
            //각 라인은 가장 앞에 숫자 이후 문자
            for(int i=1;i<arr.length;i++){
                switch (arr[i]){
                    case "@": result*=3;
                        break;
                    case "%": result+=5;
                        break;
                    case "#": result-=7;
                        break;
                }
            }
            DecimalFormat df = new DecimalFormat("0.00");
            sb.append(df.format(result)).append("\n");
        }//end of TC
        System.out.println(sb);
    }//end of main
}//end of Class

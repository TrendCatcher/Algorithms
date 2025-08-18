package implementation;

import java.io.*;
import java.util.*;

class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] rec = new int[3];
        for(int i=0; i<3;i++){
          rec[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(rec);
        
        if(rec[2]>rec[0]+rec[1]){    //각 변이 180도 일때만
            if(rec[0]==rec[1]&&rec[1]==rec[2]){
                System.out.println("Equilateral");
            }else if(rec[0]==rec[1] && rec[1]!=rec[2]){
                System.out.println("Isosceles");
            }else if(rec[0]!=rec[1]&&rec[1]!=rec[2]){
                System.out.println("Scalene");
            }
         }else{
            System.out.println("Error");
        }
        
        
    }
}
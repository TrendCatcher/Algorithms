package implementation;

import java.io.*;
import java.util.*;

class boj_1919{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        //map에 각 문장을 등록, value가 짝수가 아니면 result++
        Map<Character,Integer>map = new HashMap<>();
        for(char c: line1.toCharArray()){
//            map.put(c,1);
//            if(map.get(c)>=1){
//                map.put(c,map.get(c)+1);
//            }
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c: line2.toCharArray()){
//            map.put(c,1);
//            if(map.get(c)>=1) {
//                map.put(c, map.get(c) + 1);
//            }
            map.put(c, map.getOrDefault(c, 0)-1);

        }
        int result=0;

        for(int i:map.values()){
            result += Math.abs(i);
        }
        System.out.println(result);
    }
}
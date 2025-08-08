package implementation;

import java.io.*;
import java.util.*;
class boj_1475{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        //같은 숫자 겹치면 +1, 단 6,9는 개수 모두 합치고 (/2)후 오름차순 반환
        int result =0;
        Map<Character,Integer>map = new HashMap<>();

        for(char c: N.toCharArray()){
            if(c=='9'){
                map.put('6',map.getOrDefault('6',0)+1);
            }else{
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        int sixNineCount = (int)Math.ceil((double) map.getOrDefault('6', 0) / 2);
        int max=0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getKey()!= '6'){
                max = Math.max(max, entry.getValue());
            }
        }

        result = Math.max(sixNineCount, max);
        System.out.println(result);
    }
}
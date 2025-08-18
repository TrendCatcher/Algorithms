package implementation;

import java.io.*;
import java.util.*;
/*
* [문제 요구사항]
* 라인 하나를 입력받고 최대 몇개의 세트가 필요한지 출력하는
* 6또는 9는 같은 숫자로 입력받는다.
* */
class boj_1475{
    public static void main(String[]args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String N = br.readLine();
//
//        //같은 숫자 겹치면 +1, 단 6,9는 개수 모두 합치고 (/2)후 오름차순 반환
//        int result;
//        Map<Character,Integer>map = new HashMap<>();
//
//        for(char c: N.toCharArray()){
//            if(c=='9'){
//                map.put('6',map.getOrDefault('6',0)+1);
//            }else{
//                map.put(c,map.getOrDefault(c,0)+1);
//            }
//        }
//        int sixNineCount = (int)Math.ceil((double) map.getOrDefault('6', 0) / 2);
//        int max=0;
//
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//            if (entry.getKey() != '6') {
//                max = Math.max(max, entry.getValue());
//            }
//        }
//
//        result = Math.max(sixNineCount, max);
//        System.out.println(result);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : line.toCharArray()) {
            if(c=='9'){
                map.put('6', map.getOrDefault('6', 0) + 1);     //getOrDefault(): 값이 있으면 가져오고 아니면 0
            }else{
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        //map의 각 value중에 가장 큰 값이 결과 값, 단, 6(9개수도 포함)은 2로 나누어서 올림한다.
        int max = 0;
        int sixNineCount = (int)Math.ceil((double)(map.getOrDefault('6', 0)/2));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {    //map내의 모든 키-값쌍 조회
            if(entry.getKey()!='6'){    //우선 6제외하고 max count
                max = Math.max(max, entry.getValue());
            }
        }
        max = Math.max(max, sixNineCount);

        System.out.println(max);
    }
}
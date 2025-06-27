package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.*;

public class boj_1159 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] names = new String[num];

        for(int i=0;i<num;i++){
            names[i] = br.readLine();
        }

        //입력받은 모든 문자열의 첫 문자에 대해 사전 등록 chatAt(0)
        //5개 이상이면 정답에 sb.append()
        //정답 null이면 기권 출력
        Map<Character, Integer> nameDic = new HashMap<>();      //b-1, s-3



        for(int i=0; i<names.length;i++){
            if(nameDic.containsKey(names[i].charAt(0))) {   //만약 등록 되어있으면 key에 해당하는value만 +1
                nameDic.put(names[i].charAt(0),nameDic.get(names[i].charAt(0))+1);
            }else{      //등록되어 있지 않으면 새로 등록 (value는 항상 1)
                nameDic.put(names[i].charAt(0), 1);
            }
        }//등록 완료
        /*
        * b-5
        * s-5
        *
        * */
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : nameDic.entrySet()){
            if(entry.getValue() >=5){
                sb.append(entry.getKey());
            }
        }

        if(sb.length()==0){
            System.out.println("PREDAJA");
        }else{
            System.out.println(sb);
        }
    }
}
//entrySet() : 맵의 모든 키-값 쌍 (Map.Entry)을 순회
package implementation;

import java.io.*;
import java.util.*;

class boj_11577{
    static StringTokenizer st;
    static Map<String, Integer> map;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(TC-->0){
            int num = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            //map만들어서 넣고
            for(int i=0; i<num;i++){    //대학, 주량 입력받은 개수만큼 put
                st = new StringTokenizer(br.readLine());
                String univ = st.nextToken();
                int drink = Integer.parseInt(st.nextToken());
                map.put(univ,drink);
            }
            List<String> maxKeys = new ArrayList<>();

            int maxValue = Collections.max(map.values());

            for(Map.Entry<String,Integer> entry:map.entrySet()){
                if(entry.getValue()==maxValue){
                    maxKeys.add(entry.getKey());
                }
            }
            // map size는 1이상

            sb.append(maxKeys.get(0));


            sb.append("\n");
        }   //end of TC

        System.out.println(sb);
    }
}

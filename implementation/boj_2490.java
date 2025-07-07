package implementation;
import java.io.*;
import java.util.*;

public class boj_2490 {
    static StringTokenizer st;
    static int[] num;
    static Map<Integer,Integer> map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //[input] 0 or 1

        //[logic] 1.입력 받고 map.put하고 만약 키가 같으면 value만 ++
        // 2.  0(배)이 0,1,2,3,4경우 나누어서 결과 출력
        int TC = 3;
        StringBuilder sb = new StringBuilder();
        while(TC-->0){
            num = new int[4];   //웇은 4로 매 tc마다 초기화
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<4;i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }

            //map Initialization
            map = new HashMap<>();
//            for(int i=0;i<4;i++) {
//                if (map.containsKey(num[i])) {    //만약 해당 값을 가지고 있으면
//                    map.put(num[i], map.get(num[i]) + 1);   // value만 +1
//                }
//                map.put(num[i], 1); //아니면 새로 등록
//            }
            for(int i=0;i<4;i++){
                map.put(num[i], map.getOrDefault(num[i], 0) + 1);
            }

            switch(map.getOrDefault(0,0)){ //0(배)의 개수만 세기
                case 0:
                    sb.append("E");
                    break;
                case 1:
                    sb.append("A");
                    break;
                case 2:
                    sb.append("B");
                    break;
                case 3:
                    sb.append("C");
                    break;
                case 4:
                    sb.append("D");
                    break;
            }
            sb.append("\n");
        }//end of while
        System.out.println(sb);
    }
}

package implementation;

import java.io.*;
import java.util.*;

class boj_2953{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //2차원 배열을 입력받는다.
        //5행 4열
        int[][]arr = new int[5][4];
        int[] sum = new int[5];    //각 행에 대한 합계

        //[input], 각 행에 대한 sum계산
        for(int i=0;i<arr.length;i++){
            st =  new StringTokenizer(br.readLine());
            for(int j=0;j<arr[i].length;j++){    //각 행에 대한 4개의 요소 입력받기
                arr[i][j]=Integer.parseInt(st.nextToken());
                sum[i] +=arr[i][j];
            }
        }

        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i+1,sum[i]);
        }
        //최대값은 유일
        int max =0;
        for(int i=1;i<=5;i++){
            max = Math.max(max,map.get(i));
        }
        //최대값 구하고 그에 해당하는 키 가져오기
        for(Integer key:map.keySet()){  //keySet()으로 탐색하면서
            if (map.get(key) == max) {  //get(key로 가져온 값이 특정 값과 일지하면)
                System.out.println(key+" "+max);    //그 키 출력
            }
        }
    }
}

package implementation;

import java.io.*;
import java.util.*;

class boj_2846{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        //최대 오르막길크기 구하기 = 끝- 시작
        //계속 수열이 증가하면 다른 배열에 넣고 아니면 break;

        int n  =Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max =0;
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j<i;j++){ //전의 요소와만 비교
                if(arr[j]<arr[i]){  //뒤의 원소가 크다면 set.add
                    //집합에 요소 추가
                    set.add(arr[j]);
                    set.add(arr[i]);
                }else{
                    break;      //아니면 빠져나옴
                }
            }

            List<Integer> list = new ArrayList<>();

            for(int elements:set){
                list.add(elements);
            }
            int[] elements = new int[list.size()];

            for(int j=0;j<list.size();j++){
                elements[i] = list.get(i);
            }
            Arrays.sort(elements);

            max=Math.max(max,((elements[list.size()-1])-elements[0]));
        }   //end of for loop


    }
}

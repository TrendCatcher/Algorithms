package implementation;

import java.io.*;
import java.util.*;

class boj_133000{
    static StringTokenizer st;
    static int sex;
    static int grade;
    static int result;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());       // 인원 수
        int K = Integer.parseInt(st.nextToken());       // 최대 방 인원수

        result = 0;
        Map<Integer, Integer> mapMen = new HashMap<>();
        Map<Integer, Integer> mapWomen = new HashMap<>();

        while (N-- > 0){
            st = new StringTokenizer(br.readLine());
            sex = Integer.parseInt(st.nextToken());     //성별
            grade = Integer.parseInt(st.nextToken());   //학년
            if(sex == 0) {//여자면 여자 맵에 학년, 인원으로 등록
                mapWomen.put(grade, mapWomen.getOrDefault(grade,0)+1);  //학년, 인원수 map에 저장
            }else{
                mapMen.put(grade, mapMen.getOrDefault(grade, 0) + 1);
            }
        }

        for (int i : mapWomen.values()) {
            result += (int)Math.ceil((double)i / K);
        }
        for (int i : mapMen.values()) {
            result += (int)Math.ceil((double)i / K);
        }
        //각 모든 맵을 조사해서 각 학년당 /K에서 오름연산 적용후 result에 ++
        System.out.println(result);
    }//emd of main
}//end of class

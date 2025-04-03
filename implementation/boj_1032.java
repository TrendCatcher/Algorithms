package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class boj_1032 {
//    static String[] cmd;
//    //static char[][] ch;
//    static StringBuilder sb;
//    public static void main(String[]args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //[input] 1. 파일개수 N (50이하 자연수)
//        // 2.파일명(알파벳,"."으로만 구성) -> 길이는 모두 같음
//        int N = Integer.parseInt(br.readLine());    //입력 명령 개수
//        //모든 String을 다 비교해서 같은부분만 글대로 출력
//        //하나라도 아니면 ?출력
//        //ch = new char[N][cmd[0].length()];  //입력어를 한단어씩 저장할 2차원 char 배열
//        cmd = new String[N];
//
//        for(int i =0; i<N;i++){
//            cmd[i] = br.readLine();
//        }
//
//        sb = new StringBuilder();
//        int M = cmd[0].length();
//
//        //각 위치별로 Set(중복허용X)을 사용하여 문자 저장
//        List<Set<Character>> list = new ArrayList<>();
//        for(int j=0; j<M; j++){
//            list.add(new HashSet<>());
//        }
//
//        //문자열의 각 위치별 문자 저장
//        for(int i=0;i<N;i++){
//            for(int j=0;j<M;j++){
//                list.get(j).add(cmd[i].charAt(j));
//            }
//        }
//
//        //만약 한위치에 한 종류의 문자만 존재한다면 결과로 출력, 아니면 "?" 출력
//        for(int j=0;j<M;j++){
//            if(list.get(j).size()==1){
//                sb.append(cmd[0].charAt(j));
//            }else{
//                sb.append("?");
//            }
//        }
//
//        //[output] 알파벳 소문자, ".", "?"로만 구성
//        System.out.println(sb);
//    }
//}
class boj_1032{
    static String[] cmd;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //N은 50이하 자연수

        cmd = new String[N];

        for(int i=0;i<N;i++){
            cmd[i] = br.readLine();
        }
        int length = cmd[0].length();

        List<Set<Character>> list = new LinkedList<>();
        for(int j=0;j<length;j++){      //문자열의 각 문자에 set<Character>가 들어가는 것이 중요
            list.add(new HashSet<>());  // 모든 문자열을 hashset으로 선언 -> 중복 허용X
        }

        for(int i=0; i<N;i++){
            for(int j = 0; j< length; j++){
                list.get(j).add(cmd[i].charAt(j));
            }
        }

        StringBuilder sb = new StringBuilder();


            for(int j=0;j<length;j++){
                if(list.get(j).size()==1){  //set<Character>형 문자열 꺼내서 사이즈가 1즉, 모든 문자열의 특정 문자가 같으면 그대로 출력
                    sb.append(cmd[0].charAt(j));
                }else{
                    sb.append("?");
                }
            }

        System.out.println(sb);
    }
}

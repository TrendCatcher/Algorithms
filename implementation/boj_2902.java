package implementation;

import java.io.*;
class boj_2902{
    static String[] arr;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;    //영어 알파벳 대문자, 소문자, 그리고 하이픈d으로만 구성
        line = br.readLine();

        arr = line.trim().split("-");       //-(하이픈)단위로 짤라서 나눈다음 대문자이면 대문자만 반환하고 sb.append
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length;i++){     // 대문자이면 대문자만 반환하고
            for(int j=0; j<arr[i].length();j++) {
                if (arr[i].charAt(j) >= 'A' && arr[i].charAt(j)<='Z') {
                    sb.append(arr[i].charAt(j));
                }
            }
        }
        System.out.println(sb);
    }
}

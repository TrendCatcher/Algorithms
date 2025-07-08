package implementation;

import java.io.*;
class boj_10820{
    static int[] count;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line=br.readLine())!=null) {
            count = new int[4]; //소 대 숫자 공백

            for(char c: line.toCharArray()){
                if(c-'a'>=0&&c-'z'<=26){      //소문자 일때
                    count[0]++;
                }else if(c-'A'>=0&&c-'Z'<=26){    //대문자 일때
                    count[1]++;
                }else if(c-'0'>=0&&c-'9'<=10){    //숫자 일 때
                    count[2]++;
                }else{  //공백일떄
                    count[3]++;
                }
            }
            sb.append(count[0]).append(" ").append(count[1]).append(" ").
                    append(count[2]).append(" ").append(count[3]).append("\n");
        }//end of TC

        System.out.println(sb);
    }//end of main
}
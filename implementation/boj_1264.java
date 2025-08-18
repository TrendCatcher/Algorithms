package implementation;

import java.io.*;
class boj_1264{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while(true){
            int count=0;
            line = br.readLine();
            if(line.equals("#"))    break;  //종료조건
            for (char c : line.toLowerCase().toCharArray()) {
                if("aeiou".indexOf(c)!=-1){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}

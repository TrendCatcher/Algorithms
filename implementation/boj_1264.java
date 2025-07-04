package implementation;

import java.io.*;
class boj_1264{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while(true){
            line = br.readLine();  //각 라인마다 모음개수 count해서 sb.append()

            if(line.equals("#"))    break;


            int count=0;
            for(char c : line.toLowerCase().toCharArray()){

                if ("aeiou".indexOf(c) != -1) {      //포함되어 있지 않으면 -1을 반환                    count++;
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}

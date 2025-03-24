package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2941 {
    static String input;
    static int count = 0;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*input*/
        input = br.readLine();
        int len = input.length();

        for(int i=0;i<len;i++){
            char c = input.charAt(i);

            if(c=='c'&&i<len-1){
                //aedzdz=ls=c에서 input.charAt(i+1)은 인덱스를 벗어나므로
                if(input.charAt(i+1)=='-'||input.charAt(i+1)=='=')
                    i++;
            }else if(c=='d'&&i<len-1){
                if(input.charAt(i+1)=='z'&&i<len-2){//dz=
                    if(input.charAt(i+2)=='=')
                        i+=2;
                } else if (input.charAt(i+1)=='-') {    //d-
                    i++;
                }
            }else if((c=='l'||c=='n')&&i<len-1){
                if(input.charAt(i+1)=='j'){
                    i++;
                }
            }else if((c=='s'||c=='z')&&i<len-1){
                if(input.charAt(i+1)=='='){
                    i++;
                }
            }
            count++;
        }//end of for loop
        System.out.println(count);
    }//end of main
}//end of class

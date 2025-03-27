package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class boj_2941 {
//    static String input;
//    static int count = 0;
//    public static void main(String[]args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        /*input*/
//        input = br.readLine();
//        int len = input.length();
//
//        for(int i=0;i<len;i++){
//            char c = input.charAt(i);
//
//            if(c=='c'&&i<len-1){
//                //aedzdz=ls=c에서 input.charAt(i+1)은 인덱스를 벗어나므로
//                if(input.charAt(i+1)=='-'||input.charAt(i+1)=='=')
//                    i++;
//            }else if(c=='d'&&i<len-1){
//                if(input.charAt(i+1)=='z'&&i<len-2){//dz=
//                    if(input.charAt(i+2)=='=')
//                        i+=2;
//                } else if (input.charAt(i+1)=='-') {    //d-
//                    i++;
//                }
//            }else if((c=='l'||c=='n')&&i<len-1){
//                if(input.charAt(i+1)=='j'){
//                    i++;
//                }
//            }else if((c=='s'||c=='z')&&i<len-1){
//                if(input.charAt(i+1)=='='){
//                    i++;
//                }
//            }
//            count++;
//        }//end of for loop
//        System.out.println(count);
//    }//end of main
//}//end of class
/*[key point] i+1, i+2를 검사하기전에 인덱스 범위가 벗어나지 않는지 검사한다. */
class boj_2941{
    static int count = 0;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //[input] 알파벳 소문자와 '-', '=' cc==
        String N = br.readLine();

        for(int i=0; i<N.length();i++){

            char ch = N.charAt(i);

            if(ch =='c'&&i<N.length()-1){    //z=cc인경우 N.charAt(i+1)에서 IndexOutOfBound error -> i<N.length()-1 추가
                if(N.charAt(i+1) == '=' || N.charAt(i+1)=='-'){//c= c-인경우
                    i++;//다음으로 넘어감
                }
            }else if(ch == 'd'&&i<N.length()-1){
                if(N.charAt(i+1)=='z'&&i<N.length()-2){
                    if(N.charAt(i+2)=='='){// dz=인경우
                        i+=2;
                    }
                }else if(N.charAt(i+1)=='-'){    //d-인경우
                    i++;
                }
            }else if((ch=='l'||ch=='n')&&i<N.length()-1){
                if(N.charAt(i+1) == 'j'){     //nj lj인경우
                    i++;
                }
            }else if((ch=='s' || ch=='z')&&i<N.length()-1){
                if(N.charAt(i+1)=='='){    //s= z=인 경우
                    i++;
                }
            }
            count++;
        }//end of for loop
        System.out.println(count);
    }//end of main
}//end of Class

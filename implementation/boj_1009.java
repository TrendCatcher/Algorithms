package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class boj_1009 {
//    static StringTokenizer st;
//
//    public static void main(String[]args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int TC = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<TC;i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int result =1;
//            for(int j=1; j<=b;j++){
//                //a가 0일때는 0출력, 10의 배수일 때는 10출력
//                if(a==0){
//                    result = 0;
//                    break;
//                }else if(a%10==0){
//                    result =10;
//                    break;
//                }
//                result = (result * a) % 10;
//            }
//            sb.append(result).append("\n");
//        }
//        System.out.println(sb);
//
//
//    }// end of main
//}//end of class

class boj_1009{
    static StringTokenizer st;
    static int result;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine());

        for(int i=0; i<TC;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j=1; j<b; j++){
                if(a%10 ==0){
                    result = 10;
                    sb.append(result).append("\n");
                }
                result = (1 * result) % 10;
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);
    }//end of main
}//end of class

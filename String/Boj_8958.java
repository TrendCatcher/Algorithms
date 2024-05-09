package String;
//OX퀴즈 문제
import java.io.*;

class Boj_8958 {
    static String arr[];
    static int cnt;
    static int score;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        arr = new String[T];
        for(int i=0; i<T;i++){
            arr[i] = br.readLine();
        }
        for(int i=0;i<T;i++){
            cnt =0;
            score=0;
            for(int j=0; j<arr[i].length();j++){
                if(arr[i].charAt(j) == 'O'){
                    cnt++;
                }
                else{
                    cnt=0;
                }
                score += cnt;
            }
            System.out.println(score);
        }
    }
}

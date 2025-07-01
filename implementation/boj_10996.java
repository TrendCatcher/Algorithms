package implementation;
import java.io.*;

public class boj_10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
for(int j=0;j<n;j++) {
    for (int i = 0; i < n; i++) {   //2중 for loop로 횟수는 해결 가능, 내부 for loop에서 홀수
        //홀수행
        if (i % 2 == 0) {
            sb.append("*");
        } else {
            sb.append(" ");
        }
    }
    sb.append("\n");
    //짝수행
    for (int i = 0; i < n; i++) {   //2중 for loop로 횟수는 해결 가능, 내부 for loop에서 홀수
        if (i % 2 == 1) {
            sb.append("*");
        } else {
            sb.append(" ");
        }
    }
    sb.append("\n");
}
            System.out.println(sb);
        }//end of main
    }//end of class


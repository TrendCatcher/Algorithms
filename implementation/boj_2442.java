package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) { // 공백은 내림차순
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // 별은 오름차순 출력
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

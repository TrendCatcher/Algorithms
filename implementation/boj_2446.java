package implementation.boj_2446;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if (N == 1) {
            sb.append("*");
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2 * (N - i) - 1; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            // 역순 출력
            for (int i = N - 1; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2 * (N - i + 1) - 1; j++) {
                    sb.append("*");
                }
                sb.append("\n"); // 공백 추가 X
            }
        }
        System.out.println(sb);
    }
}
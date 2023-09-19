package DP;
import java.io.*;

class Num2748 {
    static void solution() throws IOException {
        int memo[] = new int[91];

        memo[0] = 0;
        memo[1] = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        System.out.println(memo[n]);
    }

    public static void main(String[] args) throws IOException {
        new Num2748().solution();
    }
}

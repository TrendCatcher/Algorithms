package implementation;

import java.io.*;

class boj_2739 {
    static int N;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            result = N * i;
            System.out.println(N+" * " +i+" = "+result);
        }
    }
}

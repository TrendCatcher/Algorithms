package implementation;

import java.io.*;
class boj_2440{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = number; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

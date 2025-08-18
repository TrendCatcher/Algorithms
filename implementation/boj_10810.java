import java.util.*;
import java.io.*;

class boj_10810 {
    static int[] arr;
    static StringTokenizer st;

    public static void main(String[] args5) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // TC크기

        arr = new int[N];

        for (int i = 0; i < N; i++) { // 각 바구니 초기화
            arr[i] = 0;
        }

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            for (int k = i - 1; k <= j - 1; k++) { // i부터 j번 바구니 까지는 num으로 초기화
                arr[k] = num;
            }
        }
        if (N == 1) {
            sb.append(arr[0]);
        } else {
            sb.append(arr[0]);
            for (int i = 1; i < N; i++) {
                sb.append(" ").append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
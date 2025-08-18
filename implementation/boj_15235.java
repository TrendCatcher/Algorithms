package implementation;

import java.io.*;
import java.util.*;

class boj_15235 {

    static int[] time;
    static int value = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<int[]> q = new ArrayDeque<>();

        time = new int[N]; // 결과 저장 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int pizza = Integer.parseInt(st.nextToken());
            q.offer(new int[] { i, pizza });
        }

        int times = 0;

        while (!q.isEmpty()) {
            times++; // 시간은 계속 감
            int[] tmp = q.poll();
            int pizza = tmp[1] - 1;
            if (pizza == 0) { // 0이면 그대로 뺴놓기
                time[tmp[0]] = times;
            } else { // 아니면 다시 집어넣기
                q.offer(new int[] { tmp[0], pizza });
            }

        }
        StringBuilder sb = new StringBuilder();
        sb.append(time[0]);
        for (int i = 1; i < N; i++) {
            sb.append(" ").append(time[i]);
        }
        System.out.println(sb);
    }
}
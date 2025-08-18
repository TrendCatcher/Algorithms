package SSaffy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Solution {
    static int[] answer;
    static int[] error;
    static StringTokenizer st;
    static int count = 0;
    static int result = 0;

    public static void main(String args[]) throws Exception {
        ArrayDeque<Integer> q1 = new ArrayDeque<>();
        ArrayDeque<Integer> q2 = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine()); // TC입력

        for (int k = 0; k < TC; k++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            answer = new int[M];
            error = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {   //정답코드 큐에 다 넣고
                answer[i] = Integer.parseInt(st.nextToken());
                q1.offer(answer[i]);
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {   //오류코드 큐에 다 넣고
                error[i] = Integer.parseInt(st.nextToken());
                q2.offer(error[i]);
            }

            for (int i = 1; i <= 1500; i++) {   //
                while (!q1.isEmpty() && q1.peekFirst() <= i) {
                    int ans = q1.pollFirst();
                    if (ans / 2 <= i) {
                        count++;
                    }
                }

                while (!q2.isEmpty() && q2.peekFirst() > i) {
                    q2.offer(q2.pollFirst());
                }

                if (q1.isEmpty() && count > 0 && q2.size() == N) {
                    result = i;
                    break;
                } else {
                    result = -1;
                }
            }

            System.out.println(result);
        }
    }
}// end of class

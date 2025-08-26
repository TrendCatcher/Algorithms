package implementation;

import java.io.*;
import java.util.*;

public class boj_1018 {
    static int N,M;
    static char[] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean visited[][];
    static StringTokenizer st;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            arr = br.readLine().toCharArray();
        }


        int result = bfs(0,0);
        System.out.println(result);
    }

    static int bfs(int x,int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx > 0 && nx < N && ny > 0 && ny < M) {
                    if (!visited[nx][ny]  &&) {

                    }
                }
            }
        }

        return ;
    }
}

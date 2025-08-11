package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_7576 {
    static int n, m;
    static StringTokenizer st;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        //[input 1] 가로(열) 세로(행) 입력
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        //[input 2] 토마토 밭 상태 입력
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==1){
                    queue.add(new int[]{i, j});
                }
            }
        }
        bfs();

        int max =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }

        System.out.println(max-1);
    }
/* idea 익은 날짜를 arr[][]에 기록한다! */
    static void bfs(){
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (arr[nx][ny] == 0) {
                        arr[nx][ny] = arr[cx][cy] + 1;  //익은 날짜 기록
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }

    }
}

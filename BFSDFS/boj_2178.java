package BFSDFS;
import java.io.*;
import java.util.*;

public class boj_2178 {
    static int[][] arr;
    static StringTokenizer st;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){
            char[] line = br.readLine().toCharArray();
            for(int j=0; j<M;j++){
                arr[i][j]=line[j]-'0';
            }
        }

        int result = Integer.MAX_VALUE;

        for(int i=0; i<N;i++){
            for(int j=0; j<M;j++){
                if(arr[i][j]==1&&!visited[i][j]){
                    result = Math.min(result,bfs(i,j));
                }
            }
        }
        System.out.println(result);
    }
    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y,1});
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            int distance = current[2];

            if(cx==N-1&&cy==M-1){
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!visited[nx][ny] && arr[nx][ny] == 1) {
                        visited[nx][ny]=true;
                        q.offer(new int[]{nx,ny,distance+1});
                    }
                }
            }

        }//end of while
        return -1;
    }
}

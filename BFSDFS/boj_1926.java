package BFSDFS;
import java.io.*;
import java.util.*;

public class boj_1926 {

    static StringTokenizer st;
    static int[][] board;
    static boolean[][] vistied;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int row;
    static int col;
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        board = new int[row][col];
        vistied = new boolean[row][col];

        //그림판 입력받기 (0과 1로 구성)
        for(int i=0;i<row;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<col;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==1&&!vistied[i][j]){
                    count++;
                    max = Math.max(max, bfs(i, j));
                }
            }
        }
        sb.append(count).append("\n").append(max);
        System.out.println(sb);
    }

    static int bfs( int x, int y){
        int area =1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        vistied[x][y] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            for(int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx>=0&&nx<row&&ny>=0&&ny<col){
                    if(!vistied[nx][ny] &&board[nx][ny]==1){    //방문가능하면 방문처리
                        area++;
                        vistied[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }

        return area;
    }
}

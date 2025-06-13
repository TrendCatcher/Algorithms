package BFSDFS;

import java.io.*;
import java.util.*;
//구하는 값: 최소 칸수 -> BFS

public class boj_2178 {
    static int row;
    static int column;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());

        arr = new int[row][column];
        visited = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < column; j++) {
                arr[i][j] = line[j] - '0';
            }
        }

        int result = 0;
        int distance = 1;   //distance 초기값은 1

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {   //갈수 있으면 탐색
                    result = Math.min(result, bfs(i, j, distance));
                }
            }
        }
        System.out.println(result);
    }//end of main

    static int bfs(int x, int y, int distance) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, distance});
        visited[x][y] = true;

        while (!q.isEmpty()) {  //큐 빌때 까지

            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            int dis = current[2];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < row && ny >= 0 && ny < column) {
                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                        if (nx == row - 1 && ny == column - 1) {    //목적지에 도달했으면 지나온 칸수 리턴
                            return dis;
                        } else { // 아직 목적지 탐색 안됬으면 recursion
                            q.offer(new int[]{nx, ny, dis + 1});    //다시 큐에 넣고
                            visited[nx][ny] = true; //방문처리
                        }
                    }
                }
            }//end of for-loop

        }
        return -1;
    }
}//end of class

package Algorithm.BFSDFS;
//BFS == 인접한 범위내의 접근가능한 모든 노드 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BfsReview {
    static int N,M,K;
    static int[] dx = {0, 0, 1, -1};    //상하우좌
    static int[] dy = {1, -1, 0, 0};
    static int[][] farm;
    static boolean visited[][];
    static StringTokenizer st;
    static int count = 0;

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        //nx,ny가 범위내에 있어야하고
        while(!q.isEmpty()){    //큐에서 꺼내면 현재 좌표를 변수에 담음
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
        }
        for(int i=0;i<4;i++){
            int curx = dx[i] + x;
            int cury = dy[i] + y;
            if(curx>=0&&cury>=0&&curx<M&&cury<N){
                if(farm[curx][cury] ==0 && visited[curx][cury] == false){
                    bfs(curx, cury);
                }
            }
        }

    }

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        visited = new boolean[M][N];
        int TC = Integer.parseInt(br.readLine());
        for (int k = 0; k < TC; k++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());   //가로M = 열의 개수
            int N = Integer.parseInt(st.nextToken());   //세로 N = 행의개수
            int K = Integer.parseInt(st.nextToken());
            farm = new int[M][N];

            for (int j = 0; j < K; j++) {   // 배추있는 좌표 입력
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[x][y] = 1;
            }
            count=0;
            for(int i=0;i<M;i++){
                for(int j=0;i<N;j++){
                    bfs(i,j);
                    count++;
                }
            }
            System.out.println(count);
        }//end of TC
    }//endofmain
}//end of class

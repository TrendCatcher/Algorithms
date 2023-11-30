package Algorithm.BFSDFS;
//나이트의 이동

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_7562 {
    static int I;

    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    //탐색할 2차원 배열 or 그래프
    static int[][] arr;
    // 방문처리를 위한 boolean type
    static boolean[][] visited;
    //현재좌표, 이동후 좌표
    static int x1,y1,x2, y2;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(br.readLine());
            arr = new int[I][I];
            visited = new boolean[I][I];
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            bfs();

            sb.append(arr[x2][y2]).append("\n");
        }
        System.out.println(sb);
    }
    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        //1. queue에 시작점 넣고 방문처리
        q.add(new int[]{x1,y1});
        visited[x1][y1] =true;

        while(!q.isEmpty()){
            int now[] = q.poll();
            int nx = now[0];
            int ny = now[1];

            for(int i=0; i<8; i++){
                int ox = nx+dx[i];
                int oy = ny+dy[i];
                //말이 이동할 수 있는 위치에 한해 queue에 넣고 카운터+1후 방문처리
                if(ox >=0 && oy >=0 && ox<I && oy<I){
                    if(!visited[ox][oy]){
                        q.add(new int[]{ox,oy});
                        arr[ox][oy] = arr[nx][ny]+1;
                        visited[ox][oy]= true;
                    }
                }
            }
        }

    }

}

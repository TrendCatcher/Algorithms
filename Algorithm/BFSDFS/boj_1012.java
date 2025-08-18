package Algorithm.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//배추흰지렁이 최소 개수구하기
public class boj_1012 {
    static int M;
    static int N;
    static int K;
    static int farm[][];
    static boolean visited[][];
    static int dx[] = {0,0,1,-1};   //상하좌우
    static int dy[] = {-1,1,0,0};
    static int count = 0;

    static void BFS(int x,int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});     //X좌표와 Y좌표를 저장하는 길이 2의 int[]배열
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();       //q.add(new int[]{x, y}); 에 의해 cur는 {x,y}를 가리킴
            int curx = cur[0];
            int cury = cur[1];
        }
        //인접한 상하좌우 탐색
        for(int i=0;i<4;i++){
            int curx = x+ dx[i];
            int cury = y + dy[i];

            if(curx>=0&&curx<M && cury>=0&&cury<N){     //farm범위 내만 탐색 가능
                if(farm[curx][cury] ==1 && !visited[curx][cury]){   //탐색할 수 있는 위치이고 아직 바움ㄴ하지 않았다면
                    BFS(curx, cury);    //재귀 호출
                }
            }
        }

    }//end of BFS
    public static void main(String[]args)throws IOException {
        //TC입력받기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());


        for(int k=0; k<TC;k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            //크기 초기화, 후 배추밭 1로 표기
            farm = new int[M][N];
            visited = new boolean[M][N];

            for(int i=0; i<K;i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[x][y] = 1;
            }

            //TC끝날때마다 count 초기화
            count =0;

            for(int i=0; i<M;i++){
                for(int j=0; j<N;j++){
                    //1이고 방문하지 안않다면 재귀 호출
                    if(farm[i][j]==1&&!visited[i][j]){
                        BFS(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }//end of TC
    }//end of main
}//end of class

/*생소한 것
* 1.q.add(new int[]{x, y});     //X좌표와 Y좌표를 저장하는 길이 2의 int[]배열
  2.따라서 q에서 꺼낸 이 int 형 배열 은 {x,y}이며 x = cur[0], y=cur[1]이다
 * */
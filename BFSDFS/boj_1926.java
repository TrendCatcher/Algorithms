package BFSDFS;
import java.io.*;
import java.util.*;
public class boj_1926 {
    static int[][] arr;
    static boolean[][] visited;
    static StringTokenizer st;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int row;
    static int column;

    public static void main(String[]args)throws IOException{
        //탐색 실시해서 그림 있는 곳(1)이 끝나면 count++
            // 방문처리하고
            //갈수 있는 곳이고 방문하지 않았으면 탐색
        // 그림판 끝날 동안 다음 탐색 실시
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());


        arr = new int[row][column];
        visited = new boolean[row][column];

        for(int i=0; i<row;i++){        //0 과 1로 이루어진 그림판 입력 받고 방문여부 배열 초기화
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<column;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = false;
            }
        }

        int result=0;

        for(int i=0; i<row;i++){
            for(int j=0; j<column;j++){
                if(arr[i][j]==1&&!visited[i][j]){
                    result++;
                    bfs(i,j);   /// BFS 탐색을 시작하여 현재 그림의 모든 부분을 방문 처리
                }
            }
        }
        System.out.println(result);


    }

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;   //시작점 방문처리
        while(!q.isEmpty()){
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i=0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(nx>=0 &&nx<=row&& ny>=0 &&nx<=column){   //range check
                    if(arr[nx][ny]==1&&!visited[nx][ny]){   //if can go,
                        q.offer(new int[]{nx,ny});      //add to queue
                        visited[nx][ny]=true;          //방문처리
                    }
                }
            }
        }

    }
}

package BFSDFS;
import java.io.*;
import java.util.*;
public class boj_1926 {
//    static int[][] arr;
//    static boolean[][] visited;
//    static StringTokenizer st;
//    static int[] dx = {-1, 1, 0, 0};
//    static int[] dy = {0, 0, 1, -1};
//    static int row;
//    static int column;
//
//    public static void main(String[]args)throws IOException{
//        //탐색 실시해서 그림 있는 곳(1)이 끝나면 count++
//            // 방문처리하고
//            //갈수 있는 곳이고 방문하지 않았으면 탐색
//        // 그림판 끝날 동안 다음 탐색 실시
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        st = new StringTokenizer(br.readLine());
//        row = Integer.parseInt(st.nextToken());
//        column = Integer.parseInt(st.nextToken());
//
//
//        arr = new int[row][column];
//        visited = new boolean[row][column];
//
//        for(int i=0; i<row;i++){        //0 과 1로 이루어진 그림판 입력 받고 방문여부 배열 초기화
//            st = new StringTokenizer(br.readLine());
//            for(int j=0; j<column;j++){
//                arr[i][j] = Integer.parseInt(st.nextToken());
//                visited[i][j] = false;
//            }
//        }
//
//        int result=0;
//        int maxSize = 0;
//
//        for(int i=0; i<row;i++){
//            for(int j=0; j<column;j++){
//                if(arr[i][j]==1&&!visited[i][j]){       //그림판 순차적으로 전수조사
//                    result++;
//                    int size = bfs(i, j);   /// BFS 탐색을 시작하여 현재 그림의 모든 부분을 방문 처리
//                    maxSize = Math.max(size,maxSize);
//                }
//            }
//        }
//        System.out.println(result);
//        System.out.println(maxSize);
//
//    }
//
//    static int bfs(int x, int y){
//        Queue<int[]> q = new LinkedList<>();
//        q.offer(new int[]{x,y});
//        visited[x][y] = true;   //시작점 방문처리
//        int area=1;
//
//        while(!q.isEmpty()){
//            int[] current = q.poll();
//            int cx = current[0];
//            int cy = current[1];
//
//            for(int i=0;i<4;i++){
//                int nx = cx+dx[i];
//                int ny = cy+dy[i];
//                if(nx>=0 && nx<row && ny>=0 && ny<column){   //range check
//                    if(arr[nx][ny]==1&&!visited[nx][ny]){   //if can go,
//                        q.offer(new int[]{nx,ny});      //add to queue
//                        visited[nx][ny]=true;          //방문처리
//                        area++;
//                    }
//                }
//            }
//        }
//        return area;
//    }
    static StringTokenizer st;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int row;
    static int column;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());

        arr = new int[row][column];
        visited = new boolean[row][column];

        for(int i=0; i<row;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<column;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count=0;
        int maxSize=0;

        for(int i=0; i<row;i++){        //그림판을 처음부터 순차적으로 끝까지 탐색해서
            for(int j=0; j<column;j++){
                if(arr[i][j]==1&&!visited[i][j]){   //만약 갈 수 있으면
                    count++;
                    maxSize = Math.max(maxSize,bfs(i,j));
                }
            }
        }

        System.out.println(count);
        System.out.println(maxSize);
    }
    static int bfs(int x,int y){    //탐색후 탐색한 크기를 리턴
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});    //현재 좌표를 q에 넣음
        int[] current = q.poll();
        int area=1;                 //1. 시작 영역의 크기는 1

        while(!q.isEmpty()){        //큐가 빌때까지 아래 코드 반복
            for(int i=0; i<4;i++){      //현재 위치에서 이동 가능한 영역 있는지 조사
                int cx = current[0];
                int cy = current[1];

                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(nx>=0&&nx<row&&ny>=0&&ny<column){        //1. 움직일수 있는 범위에 있고
                    if(arr[nx][ny]==1&&!visited[nx][ny]){   //2. 갈수있고 방문하지 않았다면
                        area++;                 //영역 ++
                        visited[nx][ny] = true; // 방문처리
                    }
                }
            }// 갈수 있는 모든 방향 탐색 end
        }// queue비면 end
        return area;
    }
}

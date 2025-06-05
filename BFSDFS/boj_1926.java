package BFSDFS;
import java.io.*;
import java.util.*;

public class boj_1926 {
    static StringTokenizer st;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx= {1,-1,0,0};
    static int[] dy= {0,0,1,-1};
    static int row;
    static int column;
//
//    static StringTokenizer st;
//    static int[][] arr;
//    static boolean[][] visited;
//    static int[] dx = {1, -1, 0, 0};
//    static int[] dy = {0, 0, -1, 1};
//    static int row;
//    static int column;
//    public static void main(String[]args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        st = new StringTokenizer(br.readLine());
//        row = Integer.parseInt(st.nextToken());
//        column = Integer.parseInt(st.nextToken());
//
//        arr = new int[row][column];
//        visited = new boolean[row][column];
//
//        for(int i=0; i<row;i++){
//            st = new StringTokenizer(br.readLine());
//            for(int j=0;j<column;j++){
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        int count=0;
//        int maxSize=0;
//
//        for(int i=0; i<row;i++){        //그림판을 처음부터 순차적으로 끝까지 탐색해서
//            for(int j=0; j<column;j++){
//                if(arr[i][j]==1&&!visited[i][j]){   //만약 갈 수 있으면
//                    count++;
//                    maxSize = Math.max(maxSize,bfs(i,j));
//                }
//            }
//        }
//
//        System.out.println(count);
//        System.out.println(maxSize);
//    }
//
//    static int bfs(int x,int y){    //탐색후 탐색한 크기를 리턴
//        Queue<int[]> q = new LinkedList<>();
//        q.offer(new int[]{x,y});    //현재 좌표를 q에 넣음
//        visited[x][y] =true;
//
//        int area=1;                 //1. 시작 영역의 크기는 1
//
//
//
//        while(!q.isEmpty()){        //큐가 빌때까지 아래 코드 반복
//            int[] current = q.poll();
//            int cx = current[0];
//            int cy = current[1];
//            for(int i=0; i<4;i++){      //현재 위치에서 이동 가능한 영역 있는지 조사
//                int nx = cx+dx[i];
//                int ny = cy+dy[i];
//                if(nx>=0&&nx<row&&ny>=0&&ny<column){        //1. 움직일수 있는 범위에 있고
//                    if(arr[nx][ny]==1&&!visited[nx][ny]){   //2. 갈수있고 방문하지 않았다면
//                        area++;                 //영역 ++
//                        visited[nx][ny] = true; // 방문처리
//                        q.offer(new int[]{nx,ny});  //방문 큐에 다시 넣기 (끝날때까지 반복문 반목하기 위함)
//                    }
//                }
//            }// 갈수 있는 모든 방향 탐색 end
//        }// queue비면 end
//        return area;
//    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st= new StringTokenizer(br.readLine());
        //[input1] row column
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());

        arr = new int[row][column];
        visited = new boolean[row][column];

        //[input2] 그림판
        for(int i = 0; i< row; i++) {
            st= new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count=0;
        int maxSize=0;

        for(int i = 0; i< row; i++){
            for(int j=0; j<column;j++){
                if(arr[i][j]==1&&!visited[i][j]){
                    count++;
                    maxSize= Math.max(maxSize,bfs(i,j));        //탐색 시작과 함께 최대크기 리턴
                }
            }
        }
        //[output] 개수, 최대 면적
        sb.append(count).append("\n").append(maxSize);
        System.out.println(sb);
    }
    static int bfs(int x,int y){        //가능한 모든 이동 경우의 수를 파악하고 크기를 리턴하는 bfs
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});    //큐에 매개변수로 들어온 위치 넣고
        visited[x][y]=true;         //방문처리 [계속 까먹음!!!]
        int area=1;     //처음 넓이는 1
        while(!q.isEmpty()){
            int[] current = q.poll();       //queue에서 빼서 현재 좌표 초기화
            int cx = current[0];
            int cy = current[1];

            for(int i=0; i<4;i++){      //이동할 좌표 (nx,ny) feasibility 설정
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(nx>=0&&nx<row&&ny>=0&&ny<column){
                    if(!visited[nx][ny]&&arr[nx][ny]==1){
                        area++;
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }// end of while
        return area;
    }

}

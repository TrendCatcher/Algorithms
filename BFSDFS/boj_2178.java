package BFSDFS;
//[미로 탐색]

import java.io.*;
import java.util.*;
//구하는 값: 최소 칸수 -> BFS

public class boj_2178 {
    static int[][] arr;
    static boolean[][] visited;
    static StringTokenizer st;
    static int row,column;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    //    static int row;
//    static int column;
//    static int[][] arr;
//    static int[] dx = {-1, 1, 0, 0};
//    static int[] dy = {0, 0, 1, -1};
//    static boolean[][] visited;
//
//    static StringTokenizer st;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        st = new StringTokenizer(br.readLine());
//        row = Integer.parseInt(st.nextToken());     //100이하 2이상의 자연수
//        column = Integer.parseInt(st.nextToken());
//
//        arr = new int[row][column];
//        visited = new boolean[row][column];
//
//        for (int i = 0; i < row; i++) {
//            char[] line = br.readLine().toCharArray();
//            for (int j = 0; j < column; j++) {
//                arr[i][j] = line[j] - '0';
//            }
//        }
//
//        int result = row*column;
//        int distance = 1;   //distance 초기값은 1
//        result = Math.min(result, bfs(0, 0, distance));
//        System.out.println(result);
//    }//end of main
//
//    static int bfs(int x, int y, int distance) {
//        Queue<int[]> q = new LinkedList<>();
//        q.offer(new int[]{x, y, distance});
//        visited[x][y] = true;
//
//
//        while (!q.isEmpty()) {  //큐 빌때 까지
//
//            int[] current = q.poll();
//            int cx = current[0];
//            int cy = current[1];
//            int dis = current[2];
//
//            if (cx == row - 1 && cy == column - 1) {    //목적지에 도달했으면 지나온 칸수 리턴
//                return dis;
//            }
//
//            for (int i = 0; i < 4; i++) {
//                int nx = cx + dx[i];
//                int ny = cy + dy[i];
//                if (nx >= 0 && nx < row && ny >= 0 && ny < column) {
//                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
//                            q.offer(new int[]{nx, ny, dis + 1});    //다시 큐에 넣고
//                            visited[nx][ny] = true; //방문처리
//                        }
//                    }
//                }
//            }//end of for-loop
//        return -1;
//        }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //[input1: row, column]
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());

        arr = new int[row][column];
        visited = new boolean[row][column];

        for(int i=0;i<row;i++){
            char[] line = br.readLine().toCharArray();  //line의 길이 = column개수만큼
            for(int j=0;j<column;j++){
                arr[i][j] = line[j] - '0';
            }
        }

        int result = row * column;
        int distance = 1;   //거리 초기값은 1

        result = Math.min(result,bfs(0, 0, distance));
        System.out.println(result);
    }

    static int bfs(int x, int y, int distance) {   //지나온 경로 개수을 리턴하는 함수
        //좌표가 주어지고 q에 넣었다가 방문 가능하면 빼서 탐색을 진행
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, distance});        //큐에 들어온 좌표 넣고 offer
        visited[x][y] = true;           //방문처리

        while (!q.isEmpty()) {      //큐 빌때까지 큐에서 빼고 넣고 반복

            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            int dis = current[2];

            if (cx == row - 1 && cy == column - 1) {
                return dis;
            }

            for (int i = 0; i < 4; i++) {   //갈수 있는 모든 방향, 여부 탐색 -> 갈 수 있으면 while문 계속, 없으면 while문 out
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < row && ny >= 0 && ny < column){
                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                        q.offer(new int[]{nx, ny,dis + 1});     //최신화된 좌표 및 거리 큐에 넣고
                        visited[nx][ny] = true;                 //방문 처리
                    }
                }
            }
        }//end of while
        return -1;
    }

    }//end of class

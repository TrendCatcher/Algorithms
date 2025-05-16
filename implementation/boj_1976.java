package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class boj_1976 {
    static int[][] connected;
    static StringTokenizer st;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        //[input]
        //4. 여행 순서
        //[output] 여행 가능 여부
//        즉, 가고자 하는 곳에 바로 연결이 안되있어도 다른 경로로(완전탐색) 갈수 있으면 ok
    //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cities = Integer.parseInt(br.readLine());   //1. 도시 수 N
        int nums = Integer.parseInt(br.readLine());     //2. 여행계획에 속한 도시의 수 N
        connected = new int[cities][cities];

        for(int i=0; i<cities;i++){       //3. N*N 도시 연결 여부 //ex a-b b-a, b-c c-b
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<cities;j++){
                connected[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] priority = new int[cities];     /

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums; i++) {
            priority[i] = Integer.parseInt(st.nextToken())-1;
        }

        boolean possible = true;
        for (int i = 0; i < nums - 1; i++) {
            visited = new boolean[nums];
            if (!isConnected(priority[i], priority[i + 1])) {
                possible = false;
                break;
            }
        }
        //갈수 있으면 YES, 아니면 NO
        System.out.println(possible ? "YES" : "NO");
    }

    private static boolean isConnected(int start, int end) {
        if(start == end) return true;

        visited[start] = true;

        for (int i = 0; i < connected.length; i++) {
            if (connected[start][i] == 1 && !visited[i]) {
                if (isConnected(i, end)) return true;
            }
        }
        return false;
    }
}

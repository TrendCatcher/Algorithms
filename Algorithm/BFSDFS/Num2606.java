package Algorithm.BFSDFS;
/*[문제- 바이러스]*/
//1번 컴퓨터를 통해 바이러스에 걸리게 되는 컴퓨터의 수 출력
/*[입력 요구사항]*/
//첫째 줄 : 컴퓨터의 수( 100이하인 양의 정수 ), 각 컴퓨터는 차례대로 번호가 매겨진다.
//둘쨰 줄 : 네트워크 상에 직접 연결되어 있는 컴퓨터 쌍의 수가 주어짐,
//        이어서 컴퓨터 쌍의 수 만큼 한 줄에 한쌍 씩 네트워크 상에서 직접 연결되어 있는 컴퓨터 번호의 쌍이 주어짐
/*[출력 요구사항]*/
//1번 컴퓨터가 윔바이러스에 걸렸을 때 함께 감염되는 컴퓨터의 수

import java.io.*;
import java.util.StringTokenizer;

class Main{
    static int map[][];
    static boolean visit[];
    static int n,m,v;
    static int count = 0;

    private static int dfs(int i){
        visit[i] = true;

        for(int j=1; j<=n; j++){
            if(map[i][j]==1 && visit[j] == false) {
                count++;
                dfs(j);
            }
        }
        return count;
    }
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(br.readLine());    // 컴퓨터의 수 (정점)
        m = Integer.parseInt(br.readLine());    // 연결된 컴퓨터 쌍의 수
        v=1;    //탐색을 시작할 정점의 번호
        map = new int [n+1][n+1];       //각 정점간 탐색 경로를 저장할 배열
        visit = new boolean[n+1];       // 정점의 탐색 여부 체크

        for(int i=0; i<m;i++){          // 연결된 컴퓨터 쌍의 수 만큼 간선 연결 되어있는 쌍 등록
            while(st.hasMoreTokens()){
                int a = st.nextToken();
                int b = Integer.parseInt(br.readLine());
            }

            map[a][b] = map[b][a] = 1;
        }
        System.out.println(dfs(1));
    }
}
/*그래프 저장 방식*/
//1. 인접행렬 2. 인접리스트 3. 간선리스트
//그중에서도 인접리스트는 가장 많이 사용하는 방법이다.
//1. 인접 행렬은 N*N 행렬로 graph[i][j]가 true 라면 정점 i에서 정점 j로의 간선이 있다는 것을 의미
//    - 정점의 개수가 V라면 V^2크기의 2차원 배열을 생성하여 true/false를 구분하여 값을 저장함
//    - 양방향 인접 행렬의 경우 대칭 행렬의 형태로 구성




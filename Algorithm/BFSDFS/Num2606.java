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
    static int node,line,v;
    static int count = 0;

    private static int dfs(int i){
        visit[i] = true;

        for(int j=1; j<=node; j++){
            if(map[i][j]==1 && visit[j] == false) {
                count++;
                dfs(j);
            }
        }
        return count;
    }
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());    // 컴퓨터의 수 (정점)
        line = Integer.parseInt(br.readLine());    // 연결된 컴퓨터 쌍의 수
        v=1;    //탐색을 시작할 정점의 번호("1번 컴퓨터가 바이러스에 걸렸을 때")
        map = new int [node+1][node+1];       //각 정점간 탐색 경로를 저장할 배열
        visit = new boolean[node+1];       // 정점의 탐색 여부 체크

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 노드의 쌍 입력받기
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }
        System.out.println(dfs(1));
    }
}
/*문제풀이 흐름*/
//[step0] 정점간 탐색 경로를 저장할 배열 && 정점 탐색 여부 배열 크기 할당
//[step1] 노드(컴퓨터의 개수) && 간선의 개수 입력받기 + 정점 간 탐색경로 저장 배열에 입력받은 쌍에 대해 등록
//[step2]







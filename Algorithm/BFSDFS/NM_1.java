package Algorithm.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class NM_1 {
    static StringBuilder sb = new StringBuilder();
    static int n,m;
    static int arr [];
    static boolean visit[];

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int [m];
        visit = new boolean[n];
        //재귀함수 호출 (핵심)
        dfs(n,m,0);
        System.out.println(sb);
    }
    static void dfs(int n, int m, int depth){
        if(depth == m){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<n;i++){
            if(visit[i] == false){  // 만약 방문하지 않았다면
                visit[i] = true;    // 방문처리하고
                arr[depth] = i+1;    // 다음 수를 정함
                dfs(n,m,depth+1);   // 깊이 들어가 다른 한자리를 또 채움
                visit[i] = false;    // arr[depth] = i+1인 경우를 모두 탐색 했으므로 visit초기화
            }
        }
    }
}

package implementation;
import java.io.*;
import java.util.*;

class boj_11866{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> q = new ArrayDeque<>();

        //1. 큐 원소 모두1~7까지원소 모두 넣고
        for(int i=0;i<N;i++){
            q.offer(i+1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        //==========큐 빌때 까지 반복===========
        //2. 계속 K번째 수 나오기 전까지 pop하고 addLast
        while(!q.isEmpty()){
            for(int i=0;i<K-1;i++){
                q.addLast(q.pollFirst());
            }
            if(q.size()==1){    //출력 마무리 처리
                sb.append(q.pollFirst()).append(">");
                break;
            }
            //3. K번째 수 나오면 pop해서 sb.append()
            sb.append(q.pollFirst()).append(", ");
        }
        System.out.println(sb);
    }
}
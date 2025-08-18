package BinarySearch;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제 해설: 트리 레벨, 방문 순서 주어지면 레벨별로 방문 노드 출력 */


// InOrderSearch (중위순회)
// left - root - right
class Boj_9934 {
    static int K;
    static int inorder[];
    static StringBuffer[] ans;
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // input: 1. tree depth 2. visit order
        K = Integer.parseInt(br.readLine());
        // 둘쨰줄 입력 : 어떻게 방문순서를 입력 받을 것인가. >> 방문 배열 선언
        //(중위순회 방문 순서를 저장할 배열 타입 지정, Math.pow는 double형으로 int로 형변환 하지 않으면 타입 불일치, 데이터 손실발생하여 오류)
        inorder = new int[(int)Math.pow(2, K) - 1];    //방문 순서 배열을 선언하여 입력 받는다.

        String[] input = br.readLine().split(" ");
        for(int i=0; i<inorder.length;i++) {
            inorder[i] = Integer.parseInt(input[i]);
        }
            ans = new StringBuffer[K];
        for(int i=0; i<K;i++){
            ans[i] = new StringBuffer();
        }
        buildTree(0,0,inorder.length-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<inorder.length;i++){
            sb.append(ans[i]).append("\n");
        }
        System.out.println(sb);

        //output >> 레벨이 높은 순서대로 아래부터 시작하여 출력

    }
    //중위순회 트리구축
    static void buildTree(int floor, int start, int end) {
        if (floor == K)    // 인덱스가 가장 낮은 순서대로 방문해야 함, 중위순회 트리는 left root - right
            return;

        int mid = (start + end) / 2; //현재 방문중인 서브트리의 루트 노드 인덱스 계산
        ans[floor].append(inorder[mid] + " ");
        buildTree(floor+1, start, mid - 1);
        buildTree(floor+1, mid + 1, end);

    }

}


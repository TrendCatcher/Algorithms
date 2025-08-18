package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// Collection (인터페이스)
//               ▲
//               │
//          Queue (인터페이스) ←────── Deque (인터페이스)
//             ▲                      ▲
//             │                      │
//     ┌──────┴──────┐           ┌────┴────┐
//     │             │           │         │
// LinkedList   PriorityQueue  ArrayDeque  LinkedList

//하위 구현체들은 상위 구현제들의 메소드들을 모두 사용 가능!!

//public class boj_1158 {
//    static StringTokenizer st;
//    public static void main(String[]args) throws IOException {
//        LinkedList<Integer> list = new LinkedList<>();  //원형노드 이므로 마지막 노드가 첫번때 노드를 가리키게
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());   //N은 1이상 자연수
//        int K = Integer.parseInt(st.nextToken());
//
//
//
//        for(int i=1; i<=N;i++){
//            list.offer(i);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        //삭제한 요소 출력
//
//        sb.append("<");
//        while(list.size()!=1) {     //1개가 남을 때까지 계속 출력
//            for (int i = 0; i < K-1; i++) { //K-1까지는 값을 맨뒤로 꺼내서 보냄(순환됨)
//                list.offer(list.poll());
//            }
//            sb.append(list.poll()+ ", ");    //K번째는 poll하고 출력
//            //이제 N-1개가 남고 다시 while문으로
//        }
//        //1개면 while문 빠져나오고 출력마무리
//        sb.append(list.poll()).append(">");
//
//
//        System.out.println(sb);
//    }//end of main
//}//end of class
class boj_1158{
    static StringTokenizer st;

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //순서대로 K번째 사람 제거
        st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1; i<=N;i++){
            list.offer(i);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");

        while(list.size()!=1){
            for(int i=0; i<K-1;i++){
                list.offer(list.poll());
                //k-1아니면 나머지는 꺼내서 다시 뒤로 집어 넣음
                //(논리적 원형 테이블)
            }
            //k-1면(k번째)제거해서 sb에 넣음
            sb.append(list.poll()).append(", ");
        }
        sb.append(list.poll()).append(">");
        System.out.println(sb);
    }//end of main
}//end of class

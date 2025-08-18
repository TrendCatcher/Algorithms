package implementation;

//중요도는 숫자가 높을 수록 크다...!
// 왼쪽이 가장 앞의 원소이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*설계*/
//0. N은 과, M은 은 어떤 형식으로 받을 것인가.
// 1. 중요도가 높은 문서들은 어떻게 큐의 가장 뒤에 매치할 것인가.
// 만약 중요도가 높은 배열이 있다면 카운트?
//중요도를 배열의 값으로 사용!

/*Queue*/
//  큐 용량 초과 등의 이유로 값 추가,삭제에 실패했을 때,
// add(),remove()는 예외를 발생, offer(),poll() 메서드는 false 리턴
class 사Main{
    static LinkedList<int[]> queue;
    static StringTokenizer st;
    public static void main(String[]args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());    // 테스트케이스 입력받기
        while(T-- >0){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N;i++){
                // {초기위치, 중요도}
                queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
                //첫번째 요소(i)는 반복문 인덱스의 값, 두번째 요소는 사용자가 입력한 정수
            }
            int count =0;

            while(!queue.isEmpty()){
                int[] front = queue.poll();
                boolean isMax = true;

                for(int i=0;i< queue.size();i++){

                    if(front[1]<queue.get(i)[1]){
                        queue.offer(front);
                        for(int j=0;j<i;j++){
                            queue.offer(queue.poll());
                        }
                        isMax=false;
                        break;
                    }
                }
                if(isMax == false){
                    continue;
                }
                count++;
                if(front[0]==M){    //원하는 위치의 요소가 반환 되었으면 멈
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);

    }//end of main
}// end of class
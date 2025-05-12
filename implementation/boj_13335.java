package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import java.util.Queue;
import java.util.StringTokenizer;

public class boj_13335 {
    public static void main(String[]args) throws IOException {
        //[input]1줄 n(트럭 개수),w(다리 길이),L최대 하중(10이상)
        //[input]2줄 n개 무게 => 배열 (10이하)
        //[output]모두 건너는 최단시간
        //대기 queue에 넣었다가 빼서 L이하 만큼 처리하고 poll()

        /*input*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] truckWeights = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n;i++){
            truckWeights[i] = Integer.parseInt(st.nextToken());
        }

        //logic 큐에 넣고
        LinkedList<Integer> waitingQ = new LinkedList<>();
        for(int weight:truckWeights){
            waitingQ.offer(weight);
        }
        //브리지 상태 추가
        Queue<Integer> bridgeQ = new LinkedList<>();
        int currentWeight = 0;
        int time = 0;

        // 초기 다리 상태를 0으로 채움
        for (int i = 0; i < w; i++) {
            bridgeQ.offer(0);
        }
        while (!waitingQ.isEmpty()) {
            time++;
            // 1초 흐름: 다리에서 트럭 한 대 나감
            currentWeight -= bridgeQ.poll();

            // 다음 트럭을 올릴 수 있다면
            if (!waitingQ.isEmpty() && currentWeight + waitingQ.peek() <= L) {
                int nextTruck = waitingQ.poll();
                bridgeQ.offer(nextTruck);
                currentWeight += nextTruck;
            } else {
                // 다리에 트럭 못 올리면 0으로 채워 유지
                bridgeQ.offer(0);
            }
        }

        // 마지막 트럭이 다리를 건너는 데 걸리는 시간 추가
        time += w;

        System.out.println(time);
//previous code
//        currentWeight = waitingQ.pollFirst();
//        count++;
//        currentTime += w; //일단 다리에 들어갔으면 길이만큼 시간+
//
//        while(!waitingQ.isEmpty()){
//            if(currentWeight+waitingQ.pollFirst()<=L){  //만약 다음거 꺼낸거 합쳐도 L이하면
//                if(count<=w) { //그리고 다리길이 이하고
//                    currentWeight = waitingQ.pollFirst();   //q에서 빼고 현재 무게 추가
//                    count++;
//                    currentTime += w-1; //시간 count, 앞 화물차 통과 즉시 다음 화물차+ 이므로 시간은 +w-1
//                }else{          //다리 길이가 충분하지 못해 들어가지 못하면
//                    //wait
//                    currentTime++;
//                }
//            }else{  //만약 다음거 꺼낸거 합쳐도 L초과면
//                //wait
//                currentTime++;
//            }
//            //waitingQ비면 while빠져나와 currentTime출력
//            currentTime += w;   //마지막 화물차 통과 시간 count
//        }//end of while
//        System.out.println(currentTime);
    }//end of main
}//end of class

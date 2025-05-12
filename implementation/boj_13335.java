package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

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
        int currentWeight=0;    //현재 다리 위의 화물차 무게
        int currentTime=0;
        int count=0;    // 큐에서 뺴낸 화물차의 개수

        //처음 화물차는 무조건 카운트

        currentWeight = waitingQ.pollFirst();
        count++;
        currentTime += w; //일단 다리에 들어갔으면 길이만큼 시간+

        while(!waitingQ.isEmpty()){
            if(currentWeight+waitingQ.pollFirst()<=L){  //만약 다음거 꺼낸거 합쳐도 L이하면
                if(count<=w) { //그리고 다리길이 이하고
                    currentWeight = waitingQ.pollFirst();   //q에서 빼고 현재 무게 추가
                    count++;
                    currentTime += w-1; //시간 count, 앞 화물차 통과 즉시 다음 화물차+ 이므로 시간은 +w-1
                }else{          //다리 길이가 충분하지 못해 들어가지 못하면
                    //wait
                    currentTime++;
                }
            }else{  //만약 다음거 꺼낸거 합쳐도 L초과면
                //wait
                currentTime++;
            }
            //waitingQ비면 while빠져나와 currentTime출력
            currentTime += w;   //마지막 화물차 통과 시간 count
        }//end of while
        System.out.println(currentTime);
    }//end of main
}//end of class

package Sort;

//1-N명의 사람, i번째 사람이 돈을 인출하는데 걸리는 시간 Pi


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


//1.돈 인출하는데 걸리는 시간은 입력은 어떻게 받을 것인지
//2. 최솟값은 어떻게 구할 것인지
//3. 각 사람들이 기다려야하는 시간을 누적해서 계산, 그 합이 최솟값이 되어야함
public class Boj_11399 {
    static String [] times;
    static int num=0;
    static int[] arr;
    static int[] person;    // 각 사람당 걸리는 누적 대기시간
    static int Min=0;
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    //사람수 입력받기
        times = new String[N];

        times = br.readLine().split(" ");   // 배열에 각 사람이 거리는 시간을 저장

        //각 사람마다 걸리는 시간을 우선계산 후 최솟값을 구하면 될 듯?
//        최솟값은 가장 시간이 걸리는 시간이 짧은 사람을 오름차순으로 배치한 누적합
        arr = new int[times.length];
        for(int i=0; i<times.length;i++){
            arr[i] = Integer.parseInt(times[i]);
        }
        Arrays.sort(arr);  // 받아들인 시간 오른차순 정렬하고

        //각 사람의 누적합 구하기
        person = new int[N];

        for(int i=arr.length-1; i>=0;i--){
            for(int j=i;j>=0;j--){
                person[i]+=arr[j];
            }
        }
        for(int i=0;i< person.length;i++){
            Min += person[i];
        }

        System.out.println(Min);
    }//end of main

}// end of class

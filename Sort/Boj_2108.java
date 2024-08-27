package Array;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이
/*출력요구사항*/
//        첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//        둘째 줄에는 중앙값을 출력한다.
//        셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//        넷째 줄에는 범위를 출력한다
class Boh_2108{
    static float [] arr;
    static float sum=0;
    static int count = 0;
    public static void main(String[]args)throws IOException{
        //산술평균: 모두더하고 남은 값의 소숫점 한자리수 반올림
        //중앙값: 정렬후 N/2값의 소숫점 한자리수의 반올림 인덱스 값
        //count정렬 후 만약 최빈값 2개면 가장 작은 값보다 하나 큰값을 출력하는 로직
        // 최대, 최소값 차이의 절대값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        //N은 홀수

        arr = new float[N];
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        BigDecimal bd = new BigDecimal(sum/N);
        bd = bd.setScale(0, RoundingMode.HALF_UP);  //소숫점 천째자리에서 반올림
        //1. 산술평균
        System.out.println(bd.intValue());

        Arrays.sort(arr);
        //2. 중앙값
        System.out.println(arr[Math.round(N/2)-1]);
        // 3. 최반값
        for(int i=0;i< arr.length;i++){
            float prev = arr[0];
            if(prev == arr[i+1]){

            }
        }
    }
}


    /*몰았던 것*/
//        1. 특정 소숫점 자리 봔환 메소드 (BigDecimal)
//class Main{
//    public static void main(String[]args){
//        double value = 12.3456;
//        BigDecimal bd = new BigDecimal(value);
//        bd = bd.setScale(0, RoundingMode.HALF_UP);
//        System.out.println(bd.intValue());
//    }
//}

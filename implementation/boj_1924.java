package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* <idea>
경과일수를 구한다음 7로 나눈 나머지를 요일로 사용
* */
public class boj_1924 {
//    static String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
//    static int x, y;
//    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    static StringTokenizer st;
//    static int totalDays = 0;       //일의 경과일수를 구함
//    public static void main(String[] args) throws IOException {
//        //[입력] 월 일
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        st = new StringTokenizer(br.readLine(), " ");
//
//        x = Integer.parseInt(st.nextToken());
//        y = Integer.parseInt(st.nextToken());
//
//        //[로직] 현재 날짜까지의 총 일수를 더함
//        for(int i=0; i<(x-1);i++){
//            totalDays += daysInMonth[i];
//        }
//
//        totalDays += y-1;// 오늘(y일)까지 지난 일수를 구하기 위해 y-1 ex) 1월1일
//
//        System.out.println(day[(totalDays+1)%7]);   // 1월1일은 MON이므로 totalDays+1
//    }
    static int totalDays =0;


    public static void main(String[] args) throws IOException {
        String[] month = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //input
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        //logic 현재까지의 일수를 구함

        for(int i=0; i<x-1; i++) {
            totalDays += daysInMonth[i];//전월까지의 합계
        }

//오늘까지 지난 일수 계산
        totalDays +=y-1;
//      근데 1월1일이 MON 즉, month[1]이므로
        System.out.println(month[(totalDays+1)%7]);

    }
}

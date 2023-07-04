package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
[문제]
도화지: 정사각형(100*100)
검은색 색종이: 정사각형(10*10)으로 붙임

입력:
첫 줄: 색종이의 수
둘째 줄이후부터 한줄에 하나씩 색종이를 붙인 위치가 출력됨
    - 색종이 위치 표기법
        <두개의 자연수>
        첫번째 자연수: 왼쪽벽과 왼쪽 색종이 사이의 거리
        두번째 자연수: 아래쪽 변과 색종이 아래쪽 변과의 거리
[생각]
>> 출력은 (모든 색종이 넓이) - (겹치는 부분의 넓이)

하지만.. 겹치는 부분이 2부분, 3부분..N부분일 수도 있다.
따라서 base case(겹X) 와 그렇지 않을 때 의 규칙을 생각해보자..

어차피 검정색 종이는 10*10정사각형이고, 주어진 두 수는 얼마나 땅으로부터 띄워져있는지의 수이다...

[모든색종이의 넓이]
우선, 모든 색종이의 넓이는 항상 N*100이다.

[겹치는 부분의 넓이]
각 입력받은 색종이의 객체를 생성해서 겹치는 부분의 넓이를 계산
* */
public class Num2563 {
    public void solution()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {       //입력받은 숫자만큼 자연수 입력받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

        }

        public calculationWidth(){

            return;
        }

        int allWidths = N*100;      //입력받은 모든 검정색 색종이의 넓이


    }
    public static void main(String[]args)throws IOException{
        new Num2563().solution();
    }
}

package implementation;

import java.io.*;
import java.util.*;

public class boj_25206 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //[input]
//        과목 학점 등급 >> 공백단위로 나누어서 저장 (how? what datastructure?)
//        최소 한 과목은 등금이 P가 아님

        //[output] //절대오차 또는 상대오차가 10^-4 이하이면 정답으로 인정
//        전공평점(학점 * 과목평점의 합)/학점의 총합

//풀이과정
//        1. 모든 (이수학점*과목평점)의 (sum1)을 구하고
//        2.  모든 학점의 합(sum2)도 구한다.
//        과목명은 중요하지 않다!

        ArrayList<Double> sum1 = new ArrayList<>();//(이수학점*과목평점)의 합
        ArrayList<Double> sum2 = new ArrayList<>();//(이수학점)의 합


        for (int i = 0; i < 20; i++) {
            String[] line = br.readLine().split(" "); //공백단위로 끊어서

            //과목 평점이 들어가는 연산은 경우의 수에 따라 처리를 해준다.
            if(line[2].equals("P")){

            }else{
                sum2.add(Double.parseDouble(line[1]));  //P아닌 경우만 이수학점 합계에 계산
                switch (line[2]) {
                    case "A+":
                        sum1.add(4.5 * Double.parseDouble(line[1]));
                        break;
                    case "A0":
                        sum1.add(4.0 * Double.parseDouble(line[1]));
                        break;
                    case "B+":
                        sum1.add(3.5 * Double.parseDouble(line[1]));
                        break;
                    case "B0":
                        sum1.add(3.0 * Double.parseDouble(line[1]));
                        break;
                    case "C+":
                        sum1.add(2.5 * Double.parseDouble(line[1]));
                        break;
                    case "C0":
                        sum1.add(2.0 * Double.parseDouble(line[1]));
                        break;
                    case "D+":
                        sum1.add(1.5 * Double.parseDouble(line[1]));
                        break;
                    case "D0":
                        sum1.add(Double.parseDouble(line[1]));
                        break;
                    case "F":
                        sum1.add(0.0 * Double.parseDouble(line[1]));
                        break;
                }
            }



        }//(이수학점*과목평점)의 합  +이수학점의 합 계산 완료 (for loop end)
        double sum3 =0.0;
        for(double sum:sum1){
            sum3+=sum;
        }
        double sum4 =0.0;
        for(double sum:sum2){
            sum4+=sum;
        }

        double result = sum3 / sum4;//전공 평점
        System.out.println(String.format("%.6f",result)); //소수 7번째 자리에서 반올림
    }
}

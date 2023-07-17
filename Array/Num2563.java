package Array;
/*[문제]*/
//100*100인 정사각형 도화지위 10*10인 색종이를 변과 변이 평행하게 붙임.
//겹쳐서도 붙이기 가능
//*입력:*/ 첫째 줄에 색종이수, 둘째 줄에 색종이를 붙인 위치(왼쪽변과 색종이 왼쪽변과의 거리, 아래쪽 변과 돠화지 아래쪽 변과의 거리)
//*출력:*/ 넓이
/*[고민]*/
//입력에 대해 정사각형의 위치를 출력
//        최종 넓이는 = 100*(색종이 수)- (겹치는 넓이)
//겹치는 넓이를 어떻게 구하지?
import java.io.*;
import java.util.StringTokenizer;
public class Num2563 {
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int overlapWidth =0;
        int x, y = 0;
        boolean [][] width = new boolean [101][101];    //도화지 넓이 설정

        //좌표 입력받고 색종이 넓이 계산 (1로 채움)
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int a=0; a<10; a++){
                for(int b=0; b<10; b++){
                    if(!width[x+a][y+b]){
                        width[x+a][y+b] = true;
                        ++overlapWidth;
                    }
                }
            }
        }
        System.out.println(overlapWidth);


    }

    public static void main(String[]args) throws IOException{
        new Num2563().solution();
    }

}

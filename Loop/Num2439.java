package Loop;
/*
별찍기 반쪽자리(오른쪽) 트리
입력: N
출력: N개수만큼 별 출력
ex) N=3
출력
    *
   **
  ***
[생각]
입력 받은 수(N) - 줄위치 만큼 공백출력
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Num2439 {
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {     // 공백은 N-(줄의 수)만큼 출력후 *과 붙임
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args)throws IOException{
        new Num2439().solution();
    }
}

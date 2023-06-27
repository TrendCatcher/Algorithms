package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*입력 요구사항
*
* 첫출: TC개수 T,
* 다음 줄: 두 숫자
* [고민]
* 1. 숫자를 입력받을 때 한칸 만 띄어서 두 숫자를 입력받기
* 2. 출력할때는 입력받은 T 만큼 저장했다가 한꺼번에 출력하기
* */
public class Num15552 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        // TC읽어들이기
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            pw.println(num1+num2);
        }
        pw.flush();
        pw.close();
        br.close();
    }
    public static void main(String[]args)throws IOException {
        new Num15552().solution();
    }
}

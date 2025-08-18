import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2292 {
    public static void main(String[] args) throws IOException {

        //[테두리 방 개수]1(1)-> 6(2)->12(3)->18(4)->24 => 6의 배수만큼 방의 개수 증가?
        //[누적 방 개수] 1 (1)->7(2)-> 19(3)->37(4)->

        //누적 된 합이 EX) /6 =4 ~ /6=5 사이라면 나눈 숫자가 정답
        //13은? 1+[(1)*6 ~ (1+2)*6사이의 수]           답 => 1+()안의 수 개수 = 3
        //58은? 1+[(1+2+3)*6 ~ (1+2+3+4)*6 사이의 수] 답=>  1+()안의 수 개수 = 5

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 1;     //방의 개수는 1로 시작
        int total = 1;      //
        //1. N이 1 이면 result =1
        //2. N이 2이상이면 while문 동작

        while (N - total>0) {
            total += 6 * result;
            result++;
        }

        System.out.println(result);
    }//end of main
}//end of class

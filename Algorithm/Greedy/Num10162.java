package Algorithm.Greedy;

/*[문제]*/
//3개의 시간 조절용 버튼 A B C가 달린 전자레인지
//버튼 누를때마다 더해짐 각각 5분, 1분, 10초
//
//T (초) : 냉동음식 조리 시간, A B C를 적절하게 눌러서 시간 합이 T가 되게 해야함
//단, 버튼 누른 횟수는 항상 최소
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Num10162 {
    private static void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int a,b,c;

        if(T % 10 != 0)
            System.out.println(-1);
        else {
            a = T/300;
            T = T %300;

            b= T / 60;
            T = T % 60;

            c = T/10;

            System.out.println(a+" "+b+" "+c);
        }

    }
    public static void main(String[]args) throws IOException{
        new Num10162().solution();
    }

}

//[그리디 알고리즘]
//최선의 결정을 하기 위해 `Greedy choice`를 함
//    - 전체적으로 보았을때 최선의 방법이 아닐수 도 있다!
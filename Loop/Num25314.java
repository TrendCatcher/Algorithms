package Loop;

/*
* [문제]
* 입출력이 N바이트의 크기라면 어떻게 프로그램을 구현?
* long, int는 4바이트까지 저장 가능
* long long int 는 8바이트의 정수까지 저장할 수있는 정수이다.
* >> long이 부틀 때 마다 4바이트까지 늘어나나?
*
* [입력]
* 첫째 줄 : N이 주어짐
*
* [출력]
* N의 개수 만큼 앞에 long을 붙인 int를 출력한다.
*
* [상상및 고민....]
* 숫자 16입력 받으면 16/4 = 4개수 만큼 Long출력
* 바이트를 입력받으면 (N) 그 바이트를 4로 나눈 크기 만큼 Long을 출력한다.
* 근데 Long을 어떻게 한칸만 띄어서 출력하지..?
*
* */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num25314{
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        N = Integer.parseInt(br.readLine()); // 바이트의 크기를 입력받으면
        int A = 0;
        A = N/4;
        for(int i=0; i<A; i++){             //바이트 크기를 4로 나눈 만큼 반복한다.
            System.out.print("long ");
        }
        System.out.println("int");

    }

    public static void main(String[]args) throws IOException {
        new Num25314().solution();
    }
}

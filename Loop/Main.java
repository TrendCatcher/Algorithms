package Loop;// for loop
/*
 * 구매한 각 물건의 가격 & 개수
 * 구매한 물건들의 총 금액
 *
 * (입출력 요구사항)
 * [입력]
 * 1. 영수증에 적힌 총 금액 X가 주어짐.
 * 2. 영수증에 적힌 구매한 물건의 종류의 수 N이 주어짐
 * 3. N개의 줄에는 a(각물건의 가격)와 b(물건의 개수)가 공백을 사이에 두고 주어진다.
 *
 * [출력]
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 yes, 아니면 No
 *
 * [제한]
 * 1<=X && X<=100,000,000
 * 1<=N && N<=100
 * 1<=a && a<=100,000
 * 1<=b && b<=10
 * */
import java.util.Scanner;

public class Main{
    public void solve(){
        Scanner scan= new Scanner(System.in);

        int X = scan.nextInt();     // 총 금액
        int N = scan.nextInt();    // 물건의 개수
        int sum=0;

        for(int i=0; i<N; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            sum= sum+ a*b;
        }
        if(sum==X)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public  static void main(String[]args) {
        new Main().solve();
    }
}

/*
내 풀이:
     1. 총 금액과 물건의 개수를 입력받기
     2. 루프문을 사용해서 N(물건개수) 만큼 a(금액)와 b(개수)를 입력받고 (How?)
     3. sum으로 a*b의 합계를 계산하여 총 금액(X)와 맞는지 비교

고민  1. for 루프안의 N개 만큼의 a와b를 어떻게 입력하지?
           idea. 2차원 배열 선언 product[][]
        2. 루프안에 입력받은 수를 어떻게 계산하지?
           idea. for문안에 sum= sum+a*b로 계산!
        */







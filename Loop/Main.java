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
/*
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
*/

    import java.io.IOException;

    import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws IOException{
        InputStreamReader sr = new InputStreamReader(System.in);
        char [] c = new char [10];  // 배열 초기화
        sr.read(c);

        for(char val : c){
            System.out.println(val);
        }
    }
}





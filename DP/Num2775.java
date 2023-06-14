package DP;
/*
* [문제]
* a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호 까지
*  사람들의 수의 합만큼 사람들을 데려와 살아야한다.
*
* [입력]
*첫 줄: TC T가 주어짐
*
* [출력]
* */
import java.util.Scanner;
public class Num2775 {
    public static int solution(int k, int n){
        int [][] residents = new int[k+1][n+1];

        for(int i=1;i<=n;i++){          // base case
            residents[0][i] = i;        // 0층의 i호에는 i명이 산다. (initialization)
        }
        for(int i =1; i<=k; i++){
            for(int j=1;j<n;j++)
                residents[i][j] = residents[i-1][j]+ residents[i][j-1];
        }
        // recurrence(1층 이상인 경우)

        return residents[k][n];
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int k= scan.nextInt();
        int n = scan.nextInt();

        new Num2775().solution(k,n);
    }
}

package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;
public class Num10815 {
    public  void solve(){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int [] card = new int[N];
        for(int i=0;i<N;i++){
            card[i] = scan.nextInt();
        }
        int M = scan.nextInt();
        int [] check = new int[M];
        for(int i=0;i<M;i++){
            check[i] = scan.nextInt();
        }

        Arrays.sort(card);


    }
    public static void main(String[]args){
        new Num10815().solve();
    }
}

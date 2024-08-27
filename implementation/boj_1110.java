package implementation;
import java.io.*;

class boj_1110{
    static int count=0;
    static int n;
    static int calculateNum(int n){
        int original =n;

        while(true){
            int one = n%10;    //첫째 자리
            int ten = n/10;    //2자리수
            int sum = one+ten;

            n = one*10 + sum%10;    //새로운 수
            count++;

            if(original == n){
                break;
            }
        }
        return count;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(calculateNum(n));
    }
}
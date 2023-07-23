package Loop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*Fibonacci*/
public class Num10870 {
    public int solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        n = Integer.parseInt(br.readLine()) ;

        int [] fibbonacci =new int [n+1];
        for (int i = 0; i < fibbonacci.length; i++) {

            if (i==0) fibbonacci[0] = 0;
            if (i==1) fibbonacci[1] = 1;
            else if (i>=2) fibbonacci[i] = fibbonacci[i - 1] + fibbonacci[i - 2];
        }
        System.out.println(fibbonacci[n]);
        return 0;
    }



    public static void main(String[]args) throws IOException{
        new Num10870().solution();
    }
}

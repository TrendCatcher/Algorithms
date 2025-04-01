package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//public class boj_15829 {
//    static int [] arr;
//    public static void main(String[]args) throws IOException {
//        //[입력] 1. 문자열 길이(1<=L<=5) 2. a~z로 구성된 문자열, 각 알파벳은 1~26으로 매칭됨
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //[input]
//        int L = Integer.parseInt(br.readLine());
//        String input = br.readLine();
//
//        arr = new int[L];
//        BigInteger sum = new BigInteger("0");       // sum은 BigInteger 0으로 초기화
//        BigInteger mod = BigInteger.valueOf(1234567891);    //작은 정수는 valueOf
//
//
//        for(int i=0;i<L;i++){
//            char ch =input.charAt(i);
//            arr[i] =(ch - 'a'+1);   //아스키코드로 a는 97, z는 122
//            sum = sum.add((BigInteger.valueOf(arr[i]).multiply(BigInteger.valueOf(31).pow(i))));
//            //(long)Math.pow(31, i)대신
//            // BigInetger.valueof(31).pow(i)
//        }
//
//        System.out.println(sum.remainder(mod));
//    }
//}
class boj_15829{
    static BigInteger sum;

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //a ->65
        int L=Integer.parseInt(br.readLine());
        String input = br.readLine();

        sum = new BigInteger("0");//sum=0

        //1 ≤ L ≤ 50 -> L이 50일때 31의 49승은 long 범위인 9.2*10^18을 넘어버림 -> BigInteger
        for(int i=0; i<L;i++){
            //sum+=(input.charAt(i)-64)*Math.pow(31,i);
            sum=sum.add(BigInteger.valueOf(input.charAt(i)-96).multiply(BigInteger.valueOf(31).pow(i)));
        }


        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));

    }
}
/*point*/
/*이 문제에서 나올 수 있는 입력의 가장 큰 수는?? */
//[1 ≤ L ≤ 50]이라면 입력이 최대 몇까지 될수 있는가? int vs long

// long 최대 값 =약  9.2*10^18
// int 최대값 = 약 2.1*10^12

/* BigInteger => 무한정 큰 범위 사용*/
/*a~z->97~122 A~Z->65~90*/
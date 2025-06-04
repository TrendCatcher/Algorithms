package implementation;
import java.io.*;

public class boj_2851 {
    static int[] arr;
    static int[] sum;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[10];
        sum = new int[10];

        for(int i=0; i<10;i++){
            arr[i] = Integer.parseInt(br.readLine());   //양의 정수만 입력 받음
        }
        int sum1 =0;
        int Min =100;

        for(int i=0; i<10;i++){     //100과의 최소차 구하고
            sum1+=arr[i];
            sum[i]=sum1;
            Min=Math.min(Min,Math.abs(100-sum[i])); //최소인 값을 구함,
        }
        int result = 0;
        for(int i=0; i<10;i++) { //단 최소값(Min) 값이 같으면 sum[i]가 큰 값이 result
            if(Min == Math.abs(100-sum[i])){
                result = Math.max(result,sum[i]);
            }
        }
        System.out.println(result);
    }
}

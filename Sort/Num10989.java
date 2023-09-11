package Sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Num10989 {

   private static void solution()throws IOException{      // private: 접근을 같은 클래스내로 제한 , static: 인스턴스 생성없이 바로접근 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

       int arr[] = new int[N];
       for(int i=0;i<N;i++){
           arr[i] = Integer.parseInt(br.readLine());
       }
       Arrays.sort(arr);
       for(int i=0;i<N;i++ ){
           sb.append(arr[i]).append('\n');
       }
       System.out.println(sb);
   }
   public static void main(String[]args)throws IOException{
       new Num10989().solution();
   }
}

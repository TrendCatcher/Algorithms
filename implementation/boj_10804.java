package implementation;
import java.io.*;
import java.util.*;
class boj_10804{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[21];

        int [] rev = new int[21];

        // 배열 1,2,3,,,20까지 초기화
        for(int i=1; i<21;i++){
            arr[i]=i;
        }

        for(int i=0;i<10;i++) { //TC
            st = new StringTokenizer(br.readLine(), " ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            //a부터 b까지 배열을 뗴어와서 rev에 역순 대입후
            for(int j=a;j<=b;j++){
                rev[b-j+1] = arr[j];        //wrong line!!!
            }
            //역순 바뀐 구간을 다시 arr에 넣기
            for(int j=a;j<=b;j++){
                arr[j]= rev[j];
            }
        }
        //출력
        StringBuilder sb = new StringBuilder();
        for(int i:arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());

    }//end of main
}//end of   class
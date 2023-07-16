package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num25305 {
    public static void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int [] arr = new int [n];

        st = new StringTokenizer(br.readLine());
        //StringTokenizer는 항상 사용되고 나서 재사용을 위해(arr[]요소를 읽기 위해) 리셋되거나 재 초기화 되어야 함
        for(int i=0; i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[n-k]);

    }

    public static void main(String[]args) throws IOException{
        new Num25305().solution();
    }
}

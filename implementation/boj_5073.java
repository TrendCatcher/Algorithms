package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_5073 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[3];    //1,000을 넘지 않는 양의 정수 3개
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<3;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if(arr[0]==0&&arr[1]==0&&arr[2]==0){
                break;
            }else if (arr[2] >= arr[1] + arr[0]) {
                sb.append("Invalid").append("\n");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                sb.append("Equilateral").append("\n");
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                sb.append("Isosceles").append("\n");
            } else {
                sb.append("Scalene").append("\n");
            }
        }
        System.out.println(sb);
    }
}

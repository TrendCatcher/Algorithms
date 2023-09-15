package Sort;

/*[counting 정렬 풀이]*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    private static void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int cnt [] = new int [1000001];

        for(int i=0;i<N;i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }
        for(int i=1;i<1000001;i++){
            while(cnt[i]>0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }

    public static void main() throws IOException{
        new Main().solution();
    }
}




//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Num10989 {
//    private static void solution() throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//        int cnt []= new int [1000001];      // 입력받은 수의 빈도수를 저장하는 배열
//
//        for(int i=0;i<N;i++){
//            cnt[Integer.parseInt(br.readLine())]++;     //입력받은 수의 빈도수 체크
//        }
//        for(int i=1;i<1000001;i++){         // cnt배열 안의 빈도수 만큼 안의 수 출력
//            while(cnt[i]>0){
//                sb.append(i).append('\n');
//                cnt[i]--;
//            }
//        }
//        System.out.println(sb);
//    }
//
//    public static void main(String[] args) throws IOException{
//        new Num10989().solution();
//    }
//}

























/*
[Arrays.sort 풀이]*/
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.Arrays;
//class Num10989 {
//
//   private static void solution()throws IOException{      // private: 접근을 같은 클래스내로 제한 , static: 인스턴스 생성없이 바로접근 가능
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//
//       int arr[] = new int[N];
//       for(int i=0;i<N;i++){
//           arr[i] = Integer.parseInt(br.readLine());
//       }
//       Arrays.sort(arr);
//       for(int i=0;i<N;i++ ){
//           sb.append(arr[i]).append('\n');
//       }
//       System.out.println(sb);
//   }
//   public static void main(String[]args)throws IOException{
//       new Num10989().solution();
//   }
//}

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10813 {
    static int N,M;
    static int[] arr;
    //call by reference, 배열은 객체로 다루어짐
    static void Swap(int [] arr, int a, int b){
        int temp = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = temp;
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = i + 1; //1부터 N까지 N개의 공
        }

        for(int i=0; i<M;i++){
            //위치 바꿀 두수 입력
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Swap(arr, a, b);
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*개념정리*/
//call by value: 자바의 primitive type(int, float, double, boolean)등을 메소드의
//매개변수로 전닳 라 때, 실제 값이 아닌 그 값의 복사본이 전달됨, 따라서 Swap메소드를 호출해도 영향이 가지 않음

//call by reference : 메모리 주소값을 참조사는 참조변수의 복사본을 swap
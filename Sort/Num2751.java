package Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/*[문제]*/
//오름차순 정렬

//1. 선택 정렬
//2. Array.sort() 사용

public class Num2751 {
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List <Integer> arr = new ArrayList<>();

       for(int i=0; i<N;i++){
           arr.add(Integer.parseInt(br.readLine()));
       }

       Collections.sort(arr);

       for(int result : arr){
           sb.append(result).append("\n");
       }

       System.out.println(sb);
    }
    public static void main(String[]args)throws IOException{
        new Num2751().solution();
    }
}
/*

StringBuilder 사용 이유
- java에서 String은 불변의 문자열, 따라서 concatenation 연산시 기존의 문자열을 가비지 컬렉터로 들어감 >> 메모리적으로 비효율
- StringBuilder는 변경가능한 문자열을 생성해준다. (객체(sb)호출후 .append()를 사용해서 문자열을 잇는다. )*/

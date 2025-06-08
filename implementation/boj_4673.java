package implementation;
import java.io.*;
import java.util.*;

public class boj_4673 {

    public static void main(String[]args)throws IOException{
        List<Integer>list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
       //10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력
            //1~10000 생성자 있는 숫자 뺴기
            //나머지를 출력
            // 앞뒤 10개씩만 출력하고 중간에는 문제 지정 방식으로 출력

        for(int i=1;i<=10000;i++) {     //생성자 있는 수 구하기
            list.add(i);    //1부터 만까지 리스트에 넣고
        }

        for(int i=1;i<=10000;i++) {
            int sum = i;
            String num = Integer.toString(sum); //각 수를 String으로 바꿔서 toCharArray로 변환
            char[] arr = num.toCharArray();
            for(int j=0; j<arr.length;j++){
                sum+=(arr[j]-'0');      //숫자로 변환
            }
            if(sum<=10000){
                list.remove(Integer.valueOf(sum));
            }

        }

        //출력 부분,
        for (int n : list) {
            System.out.println(n);
        }
    }
}

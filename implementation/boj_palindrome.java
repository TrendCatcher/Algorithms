package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class boj_palindrome{
    static String N;
    static boolean answer;
    public static void main(String[]args) throws IOException {
        List<Character> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        while(true){
            N = br.readLine();

            if(N.equals("0"))   break;
            list.clear();       //!중요!루프문이 돌때마다  list가 쌓이는 걸 방지

            for (char c : N.toCharArray()) {
                list.add(c);
            }
            List<Character> reversedList = new ArrayList<>(list);
            //list로 부터 깊은복사 또는 새로운 복사본 생성
            //즉, 모든 list 의 모든 요소를 새롱누 ArrayList인 reversedList에 저장
            //reverseList를 뒤집거나 변경해도 복사본이므로 list에 영향을 끼치지 못함
            Collections.reverse(reversedList);

            answer = list.equals(reversedList);
            if (answer == true) {
                q.add("yes");
            } else q.add("no");

        }
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }//end of main
}// end of class


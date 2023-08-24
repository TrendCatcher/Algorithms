package String;
/*Remove Consecutive Char in String*/
/*기능 요구사항*/
//임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를
//return 하도록하는 solution 메서드 완성하기
/*제한사항*/
//1. 문자열의 길이는 1이상 1000이하
//2. 알파벳 소문자만

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(solution(str));
    }

    private static String solution(String cryptogram) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cryptogram.length(); i++) {
            Character c = cryptogram.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}



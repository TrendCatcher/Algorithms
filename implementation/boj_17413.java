package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //input: 문자열 S
        //S의 길이는 100,000 이하
        String S = br.readLine();
        String S_trim = S.trim();
        //conditions of S
        //1. 알파벳 소문자, 숫자, 공백(' '), 특수 문자('<', '>')로만 이루짐
        //2. 문자열의 시작과 끝은 공백이 아니다. S.trim();으로 앞뒤 공백 제거
        //3. '<'쓰이면 '>'가 뒤에 반드시 나온다.

        //tag의 정의
        // 1. <로 시작해서 >로 끝나는 길이 3 이상인 부분문자열
        //2. <와 >사이에는 alpha 소문자 & 공백만

        //단어의 정의
        //1. 알파벳 소문자 && 숫자
        //2. 연속하는 두단어는 공백 하나로만 구분
        //3. 태그는 단어가 아니며 태그와 단어사이 공백은 없음
        String[] tags = new String[1000000];

        //logic
        //단어만 인식해서 String 배열에 넣어두고 순서 바꾸어서 다시 출력
        // 1. tag내의 단어 제외
        for(int i=0; i<S_trim.length();i++){
            if (S.startsWith("<") && S.endsWith(">")) {
                tags[i] = new String(S_trim.toCharArray(), S.indexOf('<'), S.indexOf(">"));
            }
        }
        for(String word: tags){
            S = S.replace(word, ""); //word는 S 에서 tag를 뺸 나머지 부분 중 공백을 사이로 둔 부분 문자열
        }

        //2. 공백단위로 단어 배열에 단어 저장
        String[] words;
        words = S.split("");

        String[] reversedWord = new String[1000000];

        for (int i = 0; i < words.length;i++) {
            reversedWord[i] = new StringBuilder(words[i]).reverse().toString();
        }

            //output : (문자열 S중) 단어만 뒤집어서 출력
            System.out.println();
        }
    }


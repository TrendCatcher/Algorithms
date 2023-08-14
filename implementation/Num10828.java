package implementation;
/*문제*/
//정수 저장 스택
//1. push X : 정수 X 스택에 넣기
//2. pop: 스택 가장 위에 있는 정수 빼고 그 수를 출력, 없는 경우 -1 출력
//3. size: 스택에 들어있는 정수의 개수 출력
//4. empty: 스택이 비어있으면 1 아니면 0 출력
//5. top: 스택의 가장 위에 있는 정수를 출력
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
class Main {
    private void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());    // 입력1: 명령어 개수 입력 받기

        Stack<Integer> stack = new Stack<>();

        while(T >0){                                // 입력2: 입력받은 개수 만큼 명령어 입력받기
            st =new StringTokenizer(br.readLine()," ");

        /*
        switch case 문으로 들어오는 문자열 입력 받고
        */
            switch(st.nextToken()){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(stack.pop()).append('\n');
                    break;

                case "size" :
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty" :
                    sb.append(stack.empty()).append('\n');
                    break;

                case "top" :
                    sb.append(stack.peak()).append('\n');
                    break;
            }
        }
        System.out.println(sb);


    }
    public static void main(String[]args)throws IOException{
        new Main().solution();
    }
}
/*자바 스택*/
/*모든 자료구조는 "동적 할당"*/
//스택 자료구조 선언: Stack<Integer> stack = new Stack<>();
//숫자 push: stack.push(X), 리스트에서 add와 같은 역할, 인덱스를 증가시키며 추가
//숫자 pop: stack.pop(), 리스트에서 remove와 같은 역할, '가장 마지막 데이터' 삭제
//제거 없이 위의 숫자 출력: stack.peek()


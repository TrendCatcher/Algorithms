package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class boj_10866 {
    static int num = 0;
    static String Command;
    /*LinkedList method
//1. addFirst
//2. addLast()
    3. remove()
    4. removeFirst()
    5.removeLast()
    6.get(): 특정인덱스 요소 반환
    7.indexOf(): 지정도니 요소의 인덱스를 반환
    8.size()
    9.clear() 모든요소 삭제
 */
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());    //[입력1] 줄의 개수



        while(count>0){
            String cmd = br.readLine().trim();  //혹시 모를 앞뒤 공백 제거
            String[] parts = cmd.split(" ");    //공백을 두고 숫자 입력 받기

            switch (parts[0]){
                case "push_front":
                    list.addFirst(Integer.parseInt(parts[1]));
                    break;
                case "push_back":
                    list.addLast(Integer.parseInt(parts[1]));
                    break;
                case "pop_front":   //push = offer, pop = poll
                    if(list.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(list.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if(list.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(list.pollLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    // error : isEmpty()반환형은 boolean
                    // sb.append(list.isEmpty()).append("\n");
                    if(list.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(list.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(list.peekFirst()).append("\n");

                    }
                    break;
                case "back":
                    if(list.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(list.peekLast()).append("\n");

                    }
                    break;
            }
            count--;
        }
        System.out.println(sb);
    }//end of main
}//end of Class

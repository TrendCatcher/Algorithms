package implementation;
import java.io.*;
import java.util.*;

public class boj_11723 {
    static String[] command;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        while(num-->0){
            String cmd = br.readLine();
            switch (cmd){
                case "add":
                    command = cmd.split(" ");
                    if(list.contains(Integer.parseInt(command[1]))){    //x가 이미 있는 경우에는 연산을 무시
                        break;
                    }
                    list.add(Integer.parseInt(command[1]));
                    break;
                case "remove":
                    command = cmd.split(" ");
                    if(!list.contains(Integer.parseInt(command[1]))){ //x가 없는 경우에는 연산을 무시
                        break;
                    }
                    list.remove(Integer.parseInt(command[1]));
                    break;
                case "check":
                    command = cmd.split(" ");
                    if(list.contains(Integer.parseInt(command[1]))){
                        sb.append(1);
                        break;
                    }
                    sb.append(0);
                    break;
                case "toggle":
                    command = cmd.split(" ");
                    if(list.contains(Integer.parseInt(command[1]))){    //x가 있는 경우에는 제거
                        list.remove(Integer.parseInt(command[1]));
                        break;
                    }else{  //x가 없는 경우에는 제거
                        list.add(Integer.parseInt(command[1]));
                        break;
                    }
                case "all":

                    break;
                case "empty":
                    list.clear();
            }
        }

    }
}
/*
* [List Set이 비효율적인 이유]
* 1. 시간 복잡도
* - list.contains(), list.remove
*   - ArrayList 기준 O(N)
* - HashSet.contains(x) / HashSet.add(x)
*   - 최악의 경우 O(N), 해시 충돌, 리사이징
* ==> 3백만 회 반복되면 O(N) 연산은 금지 수준
*
* 2. 메모리 사용량
* List<Integer> 또는 Set<Integer>
  - 내부적으로 Integer객체 저장 -> 오토박싱으로 int 가 아닌 Integer저장
* - Integer 객체당 약 16바이트 이상 + 추가 오버헤드
* - 1MB = 1024KB, 1KB = 1024바이트
* - 16 바이트 × 3,000,000 = 48,000,000 바이트
* - 비트마스크(int) 사용
*  - 단 하나의 int(4byte)로 1~20 전체 상태 표현 가능
* - 메모리: 단 4바이트!
 * */
/*
[비트 마스크를 쓰는 이유]
*x가 최대 20이고, 명령 수가 3,000,000회까지 되기 때문
* */

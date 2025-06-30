package implementation;
import java.io.*;
public class boj_11723 {
    static int x;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //1~20사이의 수에 대해서만 다룸

        StringBuilder sb = new StringBuilder();

        while(N-->0){
            String line = br.readLine();
            String[] cmd = line.split(" ");
            int s = 0;  //bitmask usage
            if(cmd.length>1){
                x = Integer.parseInt(cmd[1]);
            }

            switch (cmd[0]){
                case "add":     //add 1
                    s |= (1 << x);
                    break;
                case "remove":      //remove 2
                    s &= ~(1 << x); // 입력값으로 들어온 부분을 1로 바꾸고 모든 비트를 반전시킨후 and연산을 하면 해당 부분만 삭제됨
                    break;
                case "check":   //있으면 1, 없으면 0
                    sb.append((s & (1 << x)) != 0 ? 1 : 0).append("\n");       // 예: 1001 & 0010 => 0 (s & (1 << x)): 원래 원소에 있으면 0이 아니고 없으면 0반환
                    break;
                case "toggle":      //있으면 제거, 없으면 추가 -> XOR연산!
                    s ^= (1 << x);  //XOR연산을 통해 겹치면 0, 안 겹치면 1
                    break;
                case "all": //S를 {1, 2, ..., 20} 으로 바꾼다 => 모든 비트 마스크를 1로 만든다.
                    s = (1<<21)-1;
                    break;
                case "empty":
                    s = 0;
                    break;

            }
        }//end of while
        System.out.println(sb);
    }//end of main
}//end of class
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

/*[grammer]
* 1. << (bit 왼쪽 시프트)
* 의미: 숫자의 이진수 표현을 왼쪽 x칸으로 민다.
* 따라서 1<<x 는 2의 거듭 제곱과 의미가 같다.
*
* 2. |= (비트 OR연산 후 대입)
* 의미: 특정 비트를 키는데 사용
* s|=(1<<x): s에서 x번째 비트가 0에서 1로, 이미 1이면 그대로
*
* 3. (&= ~(1<<x))
*
* 4. ^= (비트 XOR 연산 후 대입)
* x 비트 반전 연산
* */

package implementation;
import java.io.*;
public class boj_11723 {
    static String[] command;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int s = 0; // bitmask집합
        StringBuilder sb = new StringBuilder();

        while(num-->0){
            String[] input = br.readLine().split(" ");
            String cmd = input[0];
            int x = input.length == 2 ? Integer.parseInt(input[1]) : 0;

            switch (cmd){
                case "add":
                    s |= (1 << x);  //ex) add 1: 0001 >> 0010 (2)
                    break;
                case "remove":
                    s &= ~(1 << x);
                    break;
                case "check":
                    sb.append((s & (1 << x)) != 0 ? 1 : 0).append("\n");    // x가 집합에 돈재하는지 확인, 있으면 1, 없으면 0
                    break;
                case "toggle":
                    s ^= (1 << x);
                        break;
                case "all":
                    s = (1 << 21) - 1;
                    break;
                case "empty":
                    s = 0;
                    break;
            }
        }
        System.out.println(sb);
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

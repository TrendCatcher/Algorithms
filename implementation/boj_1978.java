package implementation;

//소수란, 자기자신과 1의 곱만으로 이루어진수,
import java.io.*;
import java.util.*;
class boj_1978{
    static StringTokenizer st;
    static int [] num;
    public static void main(String[]args)throws IOException{

        int N;
        int res=0;
        int count=0;    //나머지 개수 새기위함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());    // 입력받을 수의 개수
        num = new int[N];   //배열크기 할당

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N;i++){    //입력받은 수의 개수 만큼 공백 단위로 입력받기
            num[i] = Integer.parseInt(st.nextToken());
        }
        //소수찾기 로직
        for(int j=0;j<num.length;j++) {
            if (num[j] == 1 && num[j]==2) {         //주어진수가 1,2일경우(소수)
                res += 1;
            } else {  //주어진 소수가 1이 아닐 경우(자기자신을 포함한 1~자기자신까지의 모든 수로 나누어 나머지가 0인 경우가 2번만 나와야함
                for (int i = 1; i <= num[j]; i++) {
                    int share = num[j] % i;
                    if (share == 0) {
                        count++;
                    }  //나머지가 0이 2개뿐이라면 소수임
                }
                if (count == 2) {
                    res += 1;
                }

                count = 0;    // 나머지 0인 수 개수 초기화
            }
        }
        //소수 개수 출력
        System.out.println(res);
    }
}


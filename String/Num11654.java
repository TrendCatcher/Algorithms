package String;
/*
* ASCII 코드 변환 문제
* 알파벳 소문자, 대문자, 숫자0-9까지 하나가 주어졌을 때
* 주어진 글자의 아스키 코드 값을 출력하는 프로그램 작성
*
* */
import java.io.IOException;

public class Num11654 {
    public void solve() throws IOException{
        int a = System.in.read();
        System.out.println(a);
    }
    public static void main(String[]args) throws IOException{
        new Num11654().solve();

    }
}

/*
[System. in의 동작원리]
<가장 기초적인 System.in을 쓰는 법>
System.in은 byte값으로 문자 한개 만 읽으면서 해당 문자에 대응되는
아스키코드값을 저장할 수 있다.
즉, 위와 같다.
단, 예외처리를 해주어야 한다!

[자바의 인코딩]
1. 자바는 내부적으로 문자열이 UTF-16으로 인코딩되어 처리됨
2. 문자열 송.수신을 위해 직렬화가 필요한 떼에는 변형된 UTF-8을 사용한다.
3. 문자열을 입출력 할때는 운영체제 기본 인코딩 값, 또는 사용자가 지정한 인코딩 값으로 문자열을 인코딩한다.
4. 1~127까지는 Ascii코드값과 유티코드(UTF-8,UTF-16등...) MS계열 코드의 값이 같다.

System.in이란 뭘까??
블로그 래퍼런스 참고하기!! [Whale] > []

*/

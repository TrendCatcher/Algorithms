package String;
// 10개씩 끊어서 출력하기
//만약 10개가 되면 10개를 StringBuilder에 저장했다가 출력 + "\n"
import java.io.*;
public class Boj_11721 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        for(int i=0; i< s.length();i++){
            char ch = s.charAt(i);
            sb.append(ch);

            if(sb.length()==10){       //StringBuilder객체의 길이가 10이 될 때 마다 출력하고 비움
                System.out.println(sb);
                sb.setLength(0);    //객체에 저장된 문자열이 모두 삭제되고, 길이가 0이 됨
            }
        }
        if(sb.length()>0){      //StringBuilder 안의 길이가 10미만이고 0보다 클 때는 StringBuilder안 나머지 객체 출력
            System.out.println(sb);
        }

    }
}

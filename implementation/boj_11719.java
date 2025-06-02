package implementation;
import java.io.*;

public class boj_11719 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String line;
            if((line=br.readLine())!=null){     //line을 입력받고 null이 아니면 그대로 출력
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{       //예외처리하든 말든 반드시 실행됨
            try{                    //close()도 내부적으로 I/O 작업을 하기 때문에 IOException이 발생가능
                if(br!=null){       //스트림을 닫는 메서드로, 시스템 자원을 반환
                    br.close();     //메모리 누수, 파일 잠금 유지
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

package implementation;
import java.io.*;

public class boj_11719 {
    public static void main(String[]args)throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String line;
            while((line=br.readLine())!=null){     //line을 입력받고 null이 아니면 그대로 출력
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

package implementation;
import java.io.*;

public class boj_7567 {
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int result=10;

        for(int i=0; i<arr.length-1;i++){ //문자열의 길이 3이상
            if(arr[i]=='('){
                if(arr[i+1]==')'){      //()
                    result+=10;
                }else{          //((
                    result += 5;
                }
            }else{
                if(arr[i+1]==')'){      //))
                    result+=5;
                }else{          //)(
                    result += 10;
                }
            }
        }
        System.out.println(result);


    }
}

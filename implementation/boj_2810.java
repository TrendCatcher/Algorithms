package implementation;

import java.io.*;
class boj_2810{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr=br.readLine().toCharArray();    //N길이의 좌석
        int result=0;
        int i = 0;
        while(i<arr.length){
            if(arr[i]=='S'){
                result+=1;
                if(i+1<arr.length&&arr[i]=='L'){        //SL
                    i+=2;        //인덱스 뒤로
                }else{                //SS
                    i++;
                }
            }else if(arr[i]=='L'){
                result++;
                i+=2;
            }
        }//end of While
        if(result>=N){
            result = N;
        }else{
            result+=1;
        }

        System.out.println(result);
    }
}

package implementation;

import java.io.*;
class boj_2810{

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] arr=br.readLine().toCharArray();

        int result=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]=='S'){
                result++;
                i++;
            }else{
                result++;
                i+=2;
            }
        }
        if(result>=N){
            result = N;
        }else{
            result++;
        }

        System.out.println(result);


    }
}

package implementation;

import java.io.*;
class boj_10886{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<N;i++){
            int a = Integer.parseInt(br.readLine());
            if(a==1){
                count1++;
            }else{
                count0++;
            }
        }
        String result = "Junhee is cute!";
        if(count0>count1){
            result = "Junhee is not cute!";
        }
        System.out.println(result);
    }
}
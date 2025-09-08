package implementation;
import java.io.*;
import java.util.StringTokenizer;

class boj_1547{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[] cups = new int[4];

        cups[1]=1;  //1번 컵에 공이 있는 상태

        while(TC-->0){
            st = new StringTokenizer(br.readLine());
            int num1  = Integer.parseInt(st.nextToken());
            int num2  = Integer.parseInt(st.nextToken());
            if (cups[num1] == 1) {//만약 둘중 공이 있다면 value swap
                int tmp;
                tmp = cups[num1];
                cups[num1] = cups[num2];
                cups[num2] = tmp;
            }else if(cups[num2] == 1){
                int tmp;
                tmp = cups[num2];
                cups[num2] = cups[num1];
                cups[num1] = tmp;
            }
        }
        for(int i=0;i<4;i++){
            if(cups[i]==1)
                System.out.println(i);
        }
    }//end of main
}//end of class

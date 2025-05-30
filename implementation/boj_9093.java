package implementation;
import java.io.*;

class boj_9093{
    static String[] arr;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-->0){
            String cmd = br.readLine();
            arr = cmd.trim().split(" ");    //convert sentence cmd to array in blank units

            for(int i=0;i<arr.length;i++) {
                sb.append(new StringBuilder(arr[i]).reverse());
                sb.append(" ");
            }
            sb.append("\n");

        }

        System.out.println(sb);
    }
}

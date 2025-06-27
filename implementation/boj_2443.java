package implementation;


    import java.io.*;
    class boj_2443{
        public static void main(String[]args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            for(int i=1;i<=num;i++){
                for(int j=1;j<i;j++){   //0,1,2,...num-1까지공백 먼저 출력
                    sb.append(" ");
                }
                for(int j=2*num-(2*i-1);j>=1;j--){  //-1 -3 -5 -7
                    sb.append("*");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }


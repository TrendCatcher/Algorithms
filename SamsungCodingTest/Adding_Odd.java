package SamsungCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;






    class Adding_Odd
    {
        public static void main(String args[]) throws IOException
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T;
            T=Integer.parseInt(br.readLine());


            for(int test_case = 1; test_case <= T; test_case++)
            {
                int sum =0;
//                int num=0;
                String nums[] = br.readLine().split(" ");

                for(String j: nums){
                    int num = Integer.parseInt(j);
                    if(num%2 ==1)
                        sum+=num;
                }
                System.out.println("#"+test_case+" "+sum);
            }
        }
    }
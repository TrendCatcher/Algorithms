package implementation;

import java.io.*;
class boj_11655{
    static String[] words;
    static char[] arr;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        arr = line.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<arr.length;j++){
            if(arr[j]>='a' && arr[j]<='z'){
                arr[j] = (char)((arr[j]-'a'+13)%26+'a');
            }else if(arr[j]>='A'&& arr[j]<='Z'){
                arr[j] = (char)((arr[j]-'A'+13)%26+'A');
            }
            sb.append(arr[j]);
        }
        System.out.println(sb);
    }
}
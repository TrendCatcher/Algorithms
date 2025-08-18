package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min_x = x;
        int min_y = y;
        int min;

        //x최소
        if(Math.abs(w-x)< min_x){
            min_x = Math.abs(w-x);
        }
        System.out.println("min_x: "+min_x);
        //y최소
        if(Math.abs(y-h)<min_y){
            min_y = Math.abs(y - h);
        }
        System.out.println("min_y: "+min_y);

        if(min_x>min_y){
            min = min_y;
        } else min = min_x;

        System.out.println(min);
    }
}

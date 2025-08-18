package implementation;


import java.io.*;
import java.util.*;

public class boj_1292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int range1 = Integer.parseInt(st.nextToken());
        int range2 = Integer.parseInt(st.nextToken());
        // range is 1~1000
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
            }
        }

        int result = 0;

        for (int i = range1 - 1; i < range2; i++) {
            result += list.get(i);
        }
        System.out.println(result);

    }

}
// get specific index of ArrayList => indexOf()
// get specific value of index int ArrayList => get(index)

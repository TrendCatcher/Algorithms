package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, int[]> map = new HashMap<>();

        String[] colors = new String[] { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey",
                "white" };

        for (int i = 0; i < colors.length; i++) {
            map.put(colors[i], new int[] { i, (int) Math.pow(10, i) });
        }

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();

        String result = "";
        result += map.get(color1)[0]; // ""+4
        result += map.get(color2)[0]; // "4"+
        long N = (long) Integer.parseInt(result) * (long) map.get(color3)[1];
        System.out.println(N);
    }
}

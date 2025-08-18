package Softeer;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Prob5 {
    static int height, width;
    static int Max =0;
    static boolean reachable = true;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim();
        String[] Chess = input.split(" ");

        if(Chess.length !=2){
            System.out.println(-1);
            return;
        }



        try{
            height = Integer.parseInt(Chess[0]);
            width = Integer.parseInt(Chess[1]);
        }catch (NumberFormatException e){
            System.out.println(-1);
            return;
        }
        if(height<=0 || width<=0){
            System.out.println(-1);

        }

        boolean[][] visited = new boolean[height][width];
        int[][] howFar = new int[height][width];

        int[][] knightMoves = {{-2, -1}, {-2, 1}, {2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2},{-1, -2}};
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0,0});
        visited[0][0] = true;



        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curHeight = cur[0];
            int curWidth = cur[1];

            for(int[] knightmove: knightMoves){
                int newHeight = curHeight + knightmove[0];
                int newWidth = curWidth + knightmove[1];

                if(newHeight >= 0 && newHeight < height && newWidth >=0 && newWidth < width && !visited[newHeight][newWidth]){
                    visited[newHeight][newWidth] = true;
                    howFar[newHeight][newWidth] = howFar[curHeight][curWidth] +1;
                    Max = Math.max(Max, howFar[newHeight][newWidth]);
                    queue.add(new int[]{newHeight, newWidth});
                }
            }

        }
        for(int i =0; i<height;i++){
            for(int j = 0;j<width;j++){
                if(!visited[i][j]){
                    reachable=false;
                    break;
                }
            }
        }
        if(reachable){
            System.out.println("T"+Max);
        }else{
            System.out.println("F"+Max);
        }

    }
}

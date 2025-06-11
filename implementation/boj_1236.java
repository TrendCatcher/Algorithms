package implementation;

import java.io.*;
import java.util.*;
/*던질 수 있는 질문*/
//1. 어떻게 필요한 최소 경비원의 개수를 구할 수 있을까?
    //각 행과 열을 모두 조사해서 X가 없으면 needRow++ or needCol++
    //두 변수중 최대 값이 최소 필요한 경비원의 수


class boj_1236{

    static char[][] arr;
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int Row = Integer.parseInt(st.nextToken());
        int Column = Integer.parseInt(st.nextToken());

        arr = new char[Row][Column];

        for(int i=0;i<Row;i++){ // line의 길이가 Column개수 만큼 입력 받았다 가정
            arr[i] = br.readLine().toCharArray();
        }

        int needRow=0;
        int needCol=0;


        for(int i=0;i<Row;i++){
            boolean guard = false;

            for(int j=0;j<Column;j++){  //행 조사
                if (arr[i][j] == 'X') {
                    guard = true;
                    break;      //해당 행에 경비원이 있으면 해당 행 탐색 종료
                }
            }
            if(!guard)  needRow++;  //해당 행에 가드있으면 needRow++
        }//끝나면 needRow count

        for(int j=0;j<Column;j++){
            boolean guard = false;
            for(int i=0;i<Row;i++){  //열 조사
                if (arr[i][j] == 'X') {
                    guard = true;
                    break;      //해당 열에 경비원이 있으면 해당 열 탐색 종료
                }
            }
            if(!guard)  needCol++;
        }

        int result = Math.max(needCol, needRow);
        System.out.println(result);
    }
}//end of class
/*
1. 만약 열에는 있고? 행에는 없다면 그 반대는 어떻게 처리?
    >> 행조사, 열 조사해서 둘다 있으면 pass
    >> 열에만 없으면
    >> 행에만 없으면
* */
package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2816 {
    static int cmd;
    static String[] channels;

    public static void main(String[] args) throws IOException {

        //4가지 옵션
//        버튼 1: 커서를 아래로 한 칸 이동
//        버튼 2: 커서를 위로 한 칸 이동
//        버튼 3: 커서와 아래 채널의 위치를 바꿈
//        버튼 4: 커서와 위 채널의 위치를 바꿈

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());    // count는 2이상의 자연수
        channels = new String[count];

        for(int i=0;i<channels.length;i++){
            channels[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        int cursor =0 ;
// 최종 목표ㅣ KBS1 KBS2 ...
        //처음에는 첫번째 채널(channels[0])을 가리키고 있음
        //1단계. KBS1을 0번으로 보낸다.
            //KBS1인덱스 찾기

        int idx1=-1;

        for(int i=0; i<channels.length;i++){
            if(channels[i].equals("KBS1")){
                idx1 = i;
                break;
            }
        }
        //커서를 0에서 idx1까지 버튼 1을 눌러서 이동
        for(int i=0; i< idx1;i++){
            sb.append("1");
        }
        //버튼 3을 idx1번 누르면 됨
        for(int i=0; i<idx1;i++){
            sb.append("3");
        }

        //2단계. KBS2을 1번으로 보낸다.
        //KBS2인덱스 찾기
        int idx2 = -1;
        for(int i=0; i<channels.length;i++){
            if(channels[i].equals("KBS2")){
                idx2 = i;
            }
        }
        //커서를 0에서 idx1까지 버튼 1을 눌러서 이동
        for(int i=0; i< idx2-1;i++){
            sb.append("1");
        }
        //버튼 3을 idx1번 누르면 됨
        for(int i=0; i<idx2-1;i++){
            sb.append("3");
        }


        System.out.println(sb);
    }//end of main
}//end of class

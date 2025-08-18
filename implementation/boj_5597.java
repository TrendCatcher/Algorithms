package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


class boj_5597{
    static char answer;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=90 && n<=100){
            answer = 'A';
        }else if(n>=80 && n<=89){
            answer ='B';
        }else if(n>=70 && n<=79){
            answer ='C';
        }else if(n>=60 && n<=69){
            answer ='D';
        }else {
            answer ='F';
        }
        System.out.println(answer);
    }
}
package Softeer;

import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //가능하면 정수롸 기약분수로 유리수를 표현
        String input = br.readLine().trim();

        //1. 예외 처리 우선
        try {
            Rational result = Exp(input);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("ERR");
        }
    }

    private static Rational Exp(String input) {
        String[] code = input.split(",");


        String[] codes = input.split(" ");
        Rational num1 = Parse(codes[0]);
        Rational num2 = Parse(codes[2]);
        String operator = codes[0];

        switch (operator) {
            case "+":
                return num1.add(num2);
            case "-":
                return num1.sub(num2);
            case "*":
                return num1.mul(num2);
            case "/":
                return num1.div(num2);
        }

        return num1;
    }


    private static Rational Parse(String str){
        String []code  = str.split(",");
        int num = Integer.parseInt(code[0]);
        int dem = Integer.parseInt(code[1]);

        if(dem <0){
            num = -num;
            dem = -dem;
        }
        return new Rational(num, dem);
    }

    static class Rational {
        private final int num;
        private final int dem;

        public Rational(int num, int dem) {
            if (dem == 0) {
                throw new IllegalArgumentException();
            }
            int res = res(Math.abs(num), Math.abs(dem));
            this.num =num/res;
            this.dem = dem/res;
        }
        public Rational add(Rational others){
            int newNum = this.num*others.dem + others.num*this.dem;
            int newDem = this.dem*others.dem;
            return new Rational(newDem, newNum);
        }
        public Rational sub(Rational others){
            int newNum = this.num*others.dem - others.num*this.dem;
            int newDem = this.dem*others.dem;
            return new Rational(newDem, newNum);
        }
        public Rational mul(Rational others){
            int newNum = this.num*others.dem;
            int newDem = this.dem*others.dem;
            return new Rational(newDem, newNum);
        }

        public Rational div(Rational others){
            if(others.dem ==0){
                throw new IllegalArgumentException();
            }
            int newNum = this.num*others.dem;
            int newDem = this.dem*others.num;
            return new Rational(newDem, newNum);
        }
        @Override
        public String toString(){
            return "[" + num + ","+ dem + "]";
        }




        private int res(int a, int b) {
            while (b != 0) {
                int t = b;
                b = a % b;
                a = t;
            }
            return a;
        }
    }
}
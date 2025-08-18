import java.io.*;

class boj_1977 {
    static int min = 0;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // M과 N은 10000이하의 자연수
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < 101; i++) {// 100의 제곱수는 10000이므로 forloop는 100까지만
            if ((int) Math.pow(i, 2) >= M) { // 처음으로 M넘는 수가 최소값
                min = (int) Math.pow(i, 2);
                break;
            }
        }

        for (int i = 1; i < 101; i++) {
            if ((int) Math.pow(i, 2) >= M && (int) Math.pow(i, 2) <= N) {
                sum += (int) Math.pow(i, 2); // 합을 구한다.
            } else if ((int) Math.pow(i, 2) > N) {
                break;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
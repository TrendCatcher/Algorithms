import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class boj_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        int avg = 0;
        int mid = 0;
        int most = 0;
        int scope = 0;
        // 산술평균 : N개의 수들의 합을 N으로 나눈 값
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        avg = (int)Math.round(sum/5);
        // 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        Arrays.sort(numbers);
        mid = numbers[(num / 2) + 1];
        // 범위 : N개의 수들 중 최댓값과 최솟값의 차이
        scope = numbers[num] - numbers[0];
//        최빈값 : N개의 수들 중 가장 많이 나타나는 값,여러개 있을 때 2번째로 작은값 출력
        int[] counting = new int[num];

        for(int i=0;i<num;i++) {
            if ((i + 1) == numbers[i]) {
                counting[i]++;
            }
        }
            Arrays.sort(counting);
            List<Integer> list = new ArrayList<>();
            for(int nums:counting){
                list.add(nums);
            }
            int max = list.get(list.size() - 1); // 오름차순이므로 마지막 값이 최대값
            long count = list.stream().filter(n -> n == max).count();

            if(list.size()>=3){
                if(count>=2){
                    list.remove(max);
                    list.get(max);
                }
            }else{
                
            }


        //여러개 있을 때 2번째로 작은값 출력




    }
}

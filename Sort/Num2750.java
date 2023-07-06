package Sort;

/*
[문제]
* N개의 수가 주어졌을 때, 오름차순으로 프로그램 작성
*
[입력]
- 첫째 줄 = 수의 개수 N이 주어진다.
- 둘째 줄 = N개의 줄에 수를 입력받음

[출력]
- 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한줄에 하나씩 출력

[고민]
1. 선택 정렬(in-place: 모든 요소를 다 꺼내서 비교한 다음 넣을 필요가 없다.):
    - 순서대로 리스트의 가장 작은 수를 찾고
      그 수를 확정되지 않은 부분의 가장 앞자리에 놓는 방법,
      리스트 안에서 순서반 바꿔주기 떄문에 in-place 정렬
    - 시간 복잡도: n-1+n-2+ ..=n(n-1)/2 == O(n*n) , 최악,평균,최선 모두!!
    - 비교를 전부 해보기 전까지는 모르기 떄문이다.....

- 10 7 8 6 3 (3과 10 스위칭)
- 3 7 8 6 10 (6과 7 스위칭)
- 3 6 8 7 10
-
2. 버블 정렬
3. 삽입 정렬
    - 요소를 하나씩 꺼내서 그 요소 앞에 있는 다른 요소들과 모두 비교한다.
        [예시]
        1. 7 8 6 3 9 (7다음 8을 꺼내서 7보다 작은지 > X)
        2. 7 8 6 3 9 (6을 꺼내서 8보다 작은지 > O 8과 6을 바꿈)
    - 시간복잡도: 최악의 경우 O(n*n), average: O(n), 최선: O(n), 이미 정렬이 되어있는 경우
    - 이미 정렬이 되어있는 경우(ex> database)에 많이 사용됨 >> stable, in-place
    - 코드예시
        for(int i = 1; i< array.length; i++){
            int j, v = array[i];
            for(j = i-1; j>=0; j--){
                if(array[j]<=v) // j번째 위치에 있는 요소가 v라는 변수보다 작거나 같으면
                    break;  // 무언가를 할 필요 없이 정렬이 끝남
                array[j+1] = array[j];  // 그렇지 않으면 요소를 옯김
            }
            array[j+1] = v;
        }
4. 셀 정렬
5. merge sort
6. quick sort
7. 기수 정렬
>> edwards 교수님의 강의 참고
* */

/*
* 1. 배열 입력 받아서 저장하고 (How?)
* 2. insertion sort로 정렬해서 출력
* */
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*선택정렬*/
//1. 첫번째 원소 뒤의 수중 가장 작은 수를 찾아내고
//2. swap
//3. 끝날떄 까지 반복
public class Num2750{
    public void solution()throws IOException{

        /*Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] arr = new int [N];*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [N];

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);       // 개선된 퀵 정렬 알고리즘

        for(int val : arr){
            System.out.println(val);
        }
    }
    public static void main(String[]args)throws IOException{
        new Num2750().solution();
    }
}


/*//Selection Sort
        for(int i=0; i < N-1;i++){
            for(int j = i+1;j<N;j++){
                if(arr[i]>arr[j]){  //뒤의 원소중 작은것이 있다면 swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }*/
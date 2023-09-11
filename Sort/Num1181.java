package Sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/*단어 정렬*/
//: 알파벳 소문자로 이루어진 N개의 단어가 들어오면
//    1. 길이가 짧은 것 부터
//    2. 길이 같으면 사전순으로 나열
//    단, 중복단어는 하나만

/*고민*/
//1. 어떻게 짧은 순으로 정렬?
//    (추측) length()를 이용?
//2. 길이가 같은 것을 어떻게 사전순으로?
//      compareTo가 양수일 떄만 고려
//    (추측)배열의 각 원소에 접근한다할때 마지막 s[N-1]과 s[N]과 비교 오류? >>
//    (해결) 이중 Loop로 해결
//3. 같은 문자열을 어떻게 하나로 출력?


 class Num1181 {
    static void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //단어의 길이가 같을 경우
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);        // 양수를 반환하면 s1과 s2의 위치가 바뀜
                }
                else {
                    return s1.length() - s2.length();
                    // <길이 같지 않으면> (1) s1이 더 길 경우(양수 반환) 둘의위치 바뀜
                    // (2) s2가 더 길 경우
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for(int i=1; i<N;i++){
            //중복되지 않는 단어만 출력
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static void main(String[]args) throws IOException{
        new Num1181().solution();
    }
}

/*[새로 알게 된점]*/
//- 유니코드 코드 포인트
//    - 문자의 순서를 나타내는 숫자
//    - "A" ~ "Z" : 65 ~ 90
//    - "a" ~ "z" : 97 ~ 122
// 기본적으로 양수일경우 `Arrays.sort()`에서 정렬 알고리즘에 의해 위치를 바꾸고,
// 0 이나 음의 정수인 경우는 두 객체의 위치는 바뀌지 않는다.
// 즉, s1.compareTo(s2) < 0 이면 s2가 뒤의 문자이므로 compareTo가 양수일때(s1이 뒤의 문자일때)만 둘을 swap해주면 된다.
/*public static <T> void sort(T[] a , Comparator<? super T> c)*/
//sorts the specified array of objects according to he order induced by the specified coparator

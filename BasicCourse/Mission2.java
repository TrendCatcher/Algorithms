package BasicCourse;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Mission2 {
    static Stack<Integer>[] arrays = new Stack[4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //[functional requirements]
        //[input] 매 턴마다의 카드 숫자 값

        //[terminal condition]더 이상 입력값이 없거나, 더 이상 비울 배열이 없으면 게임을 종료
        //[output] 각 참가자별 벌점
        //입력 배열 개수가 3의 배수가 아니라면 리턴값을 모두 0점으로 처리
        for(int i=0;i<4;i++){
            arrays[i] = new Stack<>();
        }
        arrays[0].push(10);
        arrays[1].push(30);
        arrays[2].push(50);
        arrays[3].push(80);

        //[input] ex) [21,9,4]
        String input = br.readLine();
        input = input.replace("[", "");
        input = input.replace("]", "");
        String[] tokens = input.split(",");

        int[] arr = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            arr[i] = Integer.parseInt(tokens[i].trim());    //공백 제거후 파싱
        }
        //[output]

        Map<Character, Integer> result = play(arr);
        System.out.println(result);
    }
    static Map<Character, Integer> play(int[] cards) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 0);
        map.put('C', 0);

        if (cards.length % 3 != 0) return map;

        char[] who = {'A', 'B', 'C'};

        for (int i = 0; i < cards.length; i += 3) {
            List<int[]> turnCards = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                turnCards.add(new int[]{cards[i + j], who[j]});
            }

            // 오름차순 정렬 (카드값 기준)
            turnCards.sort(Comparator.comparingInt(a -> a[0]));

            // 정렬된 순서대로 compareAndScore 수행
            for (int[] pair : turnCards) {
                int card = pair[0];
                char player = (char) pair[1];
                compareAndScore(card, map, player);
            }
        }

        return map;
    }



    static void compareAndScore(int card, Map<Character, Integer> map, char who) {
        int minDiff = Integer.MAX_VALUE;
        List<Integer> candidateIndexes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            if (arrays[i] != null && !arrays[i].isEmpty()) {
                int diff = Math.abs(card - arrays[i].peek());
                if (diff < minDiff) {
                    minDiff = diff;
                    candidateIndexes.clear();
                    candidateIndexes.add(i);
                } else if (diff == minDiff) {
                    candidateIndexes.add(i);
                }
            }
        }

        // 큰 peek 값 가진 스택 선택
        int target = candidateIndexes.get(0);
        int maxPeek = arrays[target].peek();
        for (int idx : candidateIndexes) {
            int peek = arrays[idx].peek();
            if (peek > maxPeek) {
                maxPeek = peek;
                target = idx;
            }
        }

//        if (arrays[target].peek() < card) {
//            int penalty = arrays[target].size();
//            arrays[target].clear();
//            map.put(who, map.get(who) + penalty);
//        }
        if (arrays[target].peek() < card) {
            int penalty = arrays[target].size();
            arrays[target].clear();
            map.put(who, map.get(who) + penalty);

            // 스택 자체 제거 (비활성화 의미)
            arrays[target] = null;
            return;
        }


        arrays[target].push(card);
    }

}

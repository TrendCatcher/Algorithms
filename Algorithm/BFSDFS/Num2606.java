package Algorithm.BFSDFS;
/*[문제- 바이러스]*/
//1번 컴퓨터를 통해 바이러스에 걸리게 되는 컴퓨터의 수 출력
//[입력 요구사항]
//첫째 줄 : 컴퓨터의 수( 100이하인 양의 정수 ), 각 컴퓨터는 차례대로 번호가 매겨진다.
//둘쨰 줄 : 네트워크 상에 직접 연결되어 있는 컴퓨터 쌍의 수가 주어짐,
//        컴퓨터 쌍의 수 만큼 한 줄에 한쌍 씩 네트워크 상에서 직접 연결되어 있는 컴퓨터 번호의 쌍이 주어짐
//

//BFS(너비우선 탐색) -reference by chatgpt
//- BFS는 그래프나 트리구조에서 너미우선으로 탐색하는 알고리즘.
//- 큐를 사용하여 구현,
import java.util.LinkedList;

class BFSExample{
    static class Graph{
        private int V;
        private LinkedList<Integer>[] adjList;

        Graph(int v){
            V =v;
            adjList = new LinkedList[v];
            for(int i=0; i<v; ++i){
                adjList[i] = new LinkedList<>();
            }
        }

    }
}



// class Num2606 {
//     private static void solution(){
//
//     }
//     public static void main(String[]args){
//         new Num2606().solution();
//     }
//}

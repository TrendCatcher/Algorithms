package Array;

/*
* 문제 설명
* Ax+By+C=0으로 표현 될수 있는 n개의 직선이 주어짐,
* 이 직선의 교점 중 정수 좌표에 별을 그린다.
* 모든별을 포함하는 최소한의 크기만 나타낸다.
*
* 입력: 직선 A,B,C에 대한 정보가 담긴 배열 line이 매개변수로 주어짐. 모든 별을 포함하는 최소 사각형을 return하도록
* 출력: 모든 별을 포함하는 최소 사각형을 return
*
* 풀이 흐름
* 1. 모든 직선 쌍에 대해 반복
*   1.1. 교점 좌표 구하기
*   1.2. 정수 좌표만 저장
* 2. 저장된 정수들에 대해 x,y좌표의 최대최소구하기
* 3. 구한 최대최소를 사용하여 2차원배열의 크기 구하기
* 4. 2차원 배열에 별 표시
* 5. 문자열 배열로 변환 후 변환
 * */

import java.util.ArrayList;
import java.util.List;

public class MakeStarIntersection {
    public static class Point{  //좌표를 나타내는 클래스
        public final long x,y;      // 데이터를 나타내는 클래스 >> final로 선언(불변성)
        private Point(long x,long y){   // 생성자로 초기화
            this.x=x;
            this.y=y;
        }
    }
    for(int i=0; i < line.length; i++){     //모든 직선쌍에서 반복
        for(int j=1; j < line.length; j++ ){
            // line[i], line[j]를 사용하여 1-A, 1-B 수행
        }
    }
    // 1-A
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){
        //교점 구해서 반환하기
        double x = (double)(b1*c2-b2*c1)/(a1*b2-a2*b1);
        double y = (double)(a2*c1-a1*c2)/(a1*b2-a2*b1);
        return null;
    }

    //1-B 정수 좌표만 저장
    // 이 메서드를 사용하며 정수 좌표일 때 Point 객체가 반환되므로 좌표를 저장할 리스트를 만들고, 객체가 반환되었을 때만 리스트에 저장
    List<Point> points = new ArrayList<>();
    for(int i=0; i<line.length;i++){
        for(int j= i+1; j<line.length;j++){
            Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                    line[j][0], line[j][1], line[j][2]);
            if(intersection !=null){
                points.add(intersection);
            }
        }
    }
    // 저장된 정수들에 대해 x,y의 최대최소 구하기

    public void solution(){

    }
    public static void main(String[]args){
        new MakeStarIntersection().solution();
    }
}

package Array;

/*
* 문제 설명
* Ax+By+C=0으로 표현 될수 있는 n개의 직선이 주어짐,
* 이 직선의 교점 중 정수 좌표에 별을 그린다.
* 모든별을 포함하는 최소한의 크기만 나타낸다.
*
* 입력: 직선 A,B,C에 대한 정보가 담긴 배열 line이 매개변수로 주어짐. 모든 별을 포함하는 최소 사각형을 return하도록
* 출력: 모든 별을 포함하는 최소 사각형을 return
*/

/* 풀이 흐름
* 1. 모든 직선 쌍에 대해 반복
*   1.1. 교점 좌표 구하기
*   1.2. 정수 좌표만 저장
* 2. 저장된 정수들에 대해 x,y좌표의 최대최소구하기
* 3. 구한 최대최소를 사용하여 2차원배열의 크기 구하기
* 4. 2차원 배열에 별 표시
* 5. 문자열 배열로 변환 후 변환
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeStarIntersection {
    public static class Point {  //좌표를 나타내는 클래스
        public final long x, y;      // 데이터를 나타내는 클래스 >> final로 선언(불변성)

        private Point(long x, long y) {   // 생성자로 초기화
            this.x = x;
            this.y = y;
        }
    }


    // 1-A: 교점좌표 구하기
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        //교점 구해서 반환하기
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0) return null;


        return new Point((long) x, (long) y);
    }

    //1-B 정수 좌표만 저장
    // 이 메서드를 사용하며 정수 좌표일 때 Point 객체가 반환되므로 좌표를 저장할 리스트를 만들고,
    // 객체가 반환되었을 때만 리스트에 저장

    // 2. 저장된 정수들에 대해 x,y의 최대최소 구하기
    private Point getMinimumPoint(List<Point> points) {
        //가장 작은 좌표 찾기, points 리스트 안의 모든 Point 객체를 순회하면서
        // 가장 작은 x,y값을 찾고 Point 객체를 만들어 반환
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        return new Point(x, y);

    }

    private Point getMaximumPoint(List<Point> points) {
        //가장 큰 좌표 찾기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }

    public String[] makeStarIntersection(int[][] line) {
        List<Point> points = new ArrayList<>();        // 좌표를 나타내는 클래스 타입 point를 ArrayLIst로 선언
        for (int i = 0; i < line.length; i++) {     //모든 직선쌍에서 반복
            for (int j = 1; j < line.length; j++) {
                // line[i], line[j]를 사용하여 1-A, 1-B 수행
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }
        //3. 구한 최대,최소를 이용하여 2차원 배열의 크기 설정
        // 배열 크기를 설정해야 하므로 +1에 유의!!
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];     //char타입의 2차원배열을 선언하고 초기화  arr = new char
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }                                           // 2차원 'char'형 배열 'arr'의 모든 요소를 '.'로 채움
    /*
    [더 조사]
    1.new char[height] [width]
        - height와 width로 정의된 배열을 선언
    2. Arrays.fill()
        - Array클래스의 fill()메서드
        - for(char[]row : arr): 향상된 for문을 활용해 배열 'arr'을 순회,
        -'row'는 'arr'의 각 행을 나타내는 1차원 'char'배열이다.
    */

        //4. 2차원 배열에 표시
        //별을 찍을 위치인 교점 정보는 points 변수에 있으니 순회하면서 별을 찍음
        for (Point p : points) {
            //2차원 배열에 별 찍기
            /*주의점*/
            // 2차원배열상과 좌표상은 위치는 다르므로 변환해야함
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }

        //5. 문자열 배열로 변환 후 반환
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;

    }
}

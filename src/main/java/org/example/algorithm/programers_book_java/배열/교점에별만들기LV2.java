package org.example.algorithm.programers_book_java.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 교점에별만들기LV2 {
    public static class Solution {
        private static class Point {
            public final long x, y; // 교점을 구함

            //생성자 초기화
            private Point(long x, long y) {
                this.x = x;
                this.y = y;
            }
        }

        // 교점을 구하는 공식
        // a1x + b1y + c1 = 0
        // a2x + b2y + c2 = 0 일때,
        // x = (b1*c2 - b2*c1) / (a1*b2 - a2*b1)
        // y = (a2*c1 - a1*c2) / (a1*b2 - a2*b1) 으로 교점을 구함
        private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
            double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
            double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

            // 정수가 아닌 교점이 나오면 null 리턴
            if (x % 1 != 0 || y % 1 != 0) return null;

            return new Point((long) x, (long) y);
        }

        private Point getMinimumPoint(List<Point> points) {
            long x = Long.MAX_VALUE;
            long y = Long.MAX_VALUE;

            for (Point p : points) {
                if (p.x < x) x = p.x;
                if (p.y < y) y = p.y;
            }
            return new Point(x, y);
        }

        private Point getMaximumPoint(List<Point> points) {
            long x = Long.MIN_VALUE;
            long y = Long.MIN_VALUE;

            for (Point p : points) {
                if (p.x > x) x = p.x;
                if (p.y > y) y = p.y;
            }
            return new Point(x, y);
        }

        public String[] solution(int[][] line) {
            List<Point> points = new ArrayList<>();
            for (int i = 0; i < line.length; i++) {
                for (int j = i + 1; j < line.length; j++) {
                    Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                            line[j][0], line[j][1], line[j][2]);
                    if (intersection != null) {
                        points.add(intersection);
                    }
                }
            }

            Point minimum = getMinimumPoint(points);
            Point maximum = getMaximumPoint(points);

            int width = (int) (maximum.x - minimum.x +1);
            int height = (int) (maximum.y - minimum.y +1);

            char[][] arr = new char[height][width];

            for(char[] row : arr){
                Arrays.fill(row, '.');
            }

            for(Point p : points){
                int x = (int) (p.x - minimum.x);
                int y = (int) (maximum.y - p.y);
                arr[y][x] = '*';
            }

            String[] result = new String[arr.length];
            for( int i = 0; i< result.length; i++){
                result[i] = new String(arr[i]);
            }
            return result;

        }
    }
}

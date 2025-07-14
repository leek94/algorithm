package org.example.algorithm.programers.level1.배열;

public class 공원산책 {
    class Solution {
        public int[] solution(String[] park, String[] routes) {
            int[] now = {0, 0};
            findStartPoint(park, now);
            for(String route : routes){
                moveRobot(park, route, now);
            }
            return now;
        }

        private void findStartPoint(String[] park, int[] now){
            for(int i = 0; i < park.length; i++){
                int len = park[i].length();

                for(int j = 0; j < len; j++){
                    char square = park[i].charAt(j);

                    if(square == 'S'){
                        now[0] = i;
                        now[1] = j;
                        return;
                    }
                }
            }
        }

        private void moveRobot(String[] park, String route, int[] now){
            String[] direction = {"N", "S", "W", "E"};
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, +1, 0, 0};

            String[] move = route.split(" ");
            int quantity = Integer.parseInt(move[1]);

            for(int i = 0; i < direction.length; i++){
                if(move[0].equals(direction[i])){
                    checkMove(park, now, dx[i] * quantity, dy[i] * quantity);
                    break;
                }
            }
        }

        private void checkMove(String[] park,int[] now, int dx, int dy){
            if(now[0] + dy >= park.length || now[0] + dy < 0 || now[1] + dx >= park[0].length() || now[1] + dx < 0 ){
                return;
            }

            int pmY = dy == 0 ? 0 : dy /  Math.abs(dy);
            int pmX = dx == 0 ? 0 : dx / Math.abs(dx);
            for(int i = 1; i <= Math.max(Math.abs(dy), Math.abs(dx)); i++){
                int checkingY = now[0] + i * pmY;
                int checkingX = now[1] + i * pmX;
                char square = park[checkingY].charAt(checkingX);
                if(square == 'X'){
                    return;
                }
            }

            now[0] += dy;
            now[1] += dx;
        }

    }
}

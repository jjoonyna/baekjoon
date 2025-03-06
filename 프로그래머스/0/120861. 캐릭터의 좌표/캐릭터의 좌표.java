import java.lang.Math;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xLimit = (board[0] - 1) / 2;
        int yLimit = (board[1] - 1) / 2;
        int x = 0;
        int y = 0;
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "left" : x -= 1; break;
                case "right" : x += 1; break;
                case "up" : y += 1; break;
                case "down" : y -= 1; break;
            }
            
            if (x < -xLimit) x = -xLimit;
            if (x > xLimit) x = xLimit;
            if (y < -yLimit) y = -yLimit;
            if (y > yLimit) y = yLimit;
            
        }
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
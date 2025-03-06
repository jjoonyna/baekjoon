import java.lang.Math;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        
        for(int i=1; i<dots.length; i++){
            if(dots[i][0]!=dots[i-1][0]){
                x = dots[i][0]-dots[i-1][0];
            }else if(dots[i][1]!=dots[i-1][1]){
                y = dots[i][1]-dots[i-1][1];
            }
        }
        
        answer = Math.abs(x*y);
        return answer;
    }
}
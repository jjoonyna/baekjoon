import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1]+1;
        int min = 1;
        
        while(min<=sides[1]){
            if(min+sides[0]>sides[1]){
                answer++;
            }
            min++;
        }
        while(max<sides[0]+sides[1]){
            answer++;
            max++;
        }
        
        return answer;
    }
}
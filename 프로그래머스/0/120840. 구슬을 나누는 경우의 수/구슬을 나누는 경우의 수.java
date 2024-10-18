class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double result = 1;
        for (int i=share+1; i<=balls; i++) {
            result *= i;
        }
        for(int i=1; i<=balls-share;i++){
            result /=i;
        }
        answer = (int)Math.round(result);
        return answer;
    }
}
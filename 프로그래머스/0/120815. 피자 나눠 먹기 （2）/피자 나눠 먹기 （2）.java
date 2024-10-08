class Solution {
    public int solution(int n) {
        int answer = 0;
        int piece = 6;
        answer=n*piece;
        if(answer%6 == 0){
            answer = answer/6;
        }
        if(answer%3 == 0){
            answer = answer/3;
        }
        if(answer%2 == 0){
            answer = answer/2;
        }
        return answer;
    }
}
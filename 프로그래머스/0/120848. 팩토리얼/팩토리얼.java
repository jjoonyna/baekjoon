class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        while(n>0){
            n = n/i;
            i++;
        }
        answer = i-2;
        return answer;
    }
}
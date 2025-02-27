class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        int index = 0;
        long i=x;
        
        while(index<answer.length){    
            answer[index++] = i;
            i += x;
        }
        return answer;
    }
}
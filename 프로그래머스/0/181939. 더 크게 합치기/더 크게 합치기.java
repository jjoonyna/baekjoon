class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a)+Integer.toString(b);
        String ba = Integer.toString(b)+Integer.toString(a);
        int sum1 = Integer.parseInt(ab);
        int sum2 = Integer.parseInt(ba);
        
        if(sum1>sum2){
            answer = sum1;
        }else{
            answer = sum2;
        }
        
        return answer;
    }
}
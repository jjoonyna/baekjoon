class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strab = Integer.toString(a)+Integer.toString(b);
        int ab = Integer.parseInt(strab);
        int sum = 2*a*b;
        if(ab>sum){
            answer = ab;
        }else{
            answer = sum;
        }
        return answer;
    }
}
class Solution {
    public int solution(int order) {
        int answer = 0;
        int n=0;
        while(order>0){
            n = order%10;
            if(n==3||n==6||n==9){
                answer++;
            }
            order = order/10;
        }
        return answer;
    }
}
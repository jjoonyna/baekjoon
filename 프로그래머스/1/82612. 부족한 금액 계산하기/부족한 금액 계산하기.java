class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        while(count>0){
            answer += price*count;
            count--;
        }
        if(answer-money<=0){
            answer = 0;
        }else{
            answer = answer - money;
        }
        return answer;
    }
}
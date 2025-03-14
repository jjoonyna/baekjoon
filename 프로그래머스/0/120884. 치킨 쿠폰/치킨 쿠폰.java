class Solution {
    public int solution(int coupon) {
        int answer = 0;
        int chicken = 0;
        
        while(coupon>=10){
            chicken = coupon/10;
            coupon = coupon/10+coupon%10;
            answer += chicken;
        }
        return answer;
    }
}
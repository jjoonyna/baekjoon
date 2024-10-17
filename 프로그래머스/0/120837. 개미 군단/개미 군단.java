class Solution {
    public int solution(int hp) {
        int answer = 0;
        int i=0;
        while(hp>0){
            answer+=hp/5;
            hp=hp%5;
            answer+=hp/3;
            hp=hp%3;
            answer+=hp;
            if(hp==1){
                hp= hp-1;
            }
            if(hp==2){
                hp= hp-2;
            }
        }
        return answer;
    }
}
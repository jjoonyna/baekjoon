import java.lang.Math;
class Solution {
    public long solution(long n) {
        long answer = -1;
        int num = 1;
        while(true){
            if(Math.pow(num,2)==n){
                answer = (long)Math.pow(num+1,2);
                break;
            }else if(Math.sqrt(n)<num){
                break;
            }
            num++;
        }
        return answer;
    }
}
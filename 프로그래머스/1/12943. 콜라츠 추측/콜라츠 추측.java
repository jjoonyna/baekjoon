class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num == 1){
            answer = 0;
            return answer;
        }
        while(num != 1){
            if(num % 2 == 0){
                num = num/2;
                answer++;
            }else{
                num = num*3+1;
                answer++;
            }
            if(num<0){
                answer = -1;
                break;
            }
            if(answer >= 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
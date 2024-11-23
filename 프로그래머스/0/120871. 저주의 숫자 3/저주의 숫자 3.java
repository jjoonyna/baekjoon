class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for(int i=1; i<=n; i++) {
            num++;
            while(num%3 == 0 || num%10 == 3 || num/10==3){
                num++;
            }
            if(num>100){
                answer = num;
                answer = answer/10;
                if(answer%10==3){
                    num+=10;
                }
            }
        }
        answer = num;
        return answer;
    }
}

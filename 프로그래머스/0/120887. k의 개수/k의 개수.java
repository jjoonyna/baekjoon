class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while(i<=j) {
        	int num = i;
            while(num>0){
                if(num%10==k){
                    answer++;
                }
                num=num/10;
            }
            i++;
        }
        return answer;
    }
}
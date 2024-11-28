class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for(int i=0-num; i<=total; i++){
            int sum = 0;
            for(int j=0; j<num; j++){
                int number = i+j;
                sum += number;
                answer[j] = number;
            }
            if(sum == total){
                break;
            }
        }
        
        return answer;
    }
}
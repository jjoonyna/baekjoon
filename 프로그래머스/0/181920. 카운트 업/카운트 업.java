class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int i = 0;
        int num = start_num;
        while(num<=end_num){
            answer[i] = num;
            i++;
            num++;
        }
        return answer;
    }
}
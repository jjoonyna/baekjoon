class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int min = 1;
        int max = 0;
        for(int i=0; i<num_list.length; i++){
            min *= num_list[i];
            max += num_list[i];
        }
        max = max*max;
        
        if(min<max){
            answer = 1;
        }else if(min>max){
            answer = 0;
        }
        return answer;
    }
}
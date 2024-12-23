class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last = num_list[num_list.length-1];
        int before = num_list[num_list.length-2];
        for(int i=0; i<answer.length; i++){
            
            if(i==answer.length-1){
                if(last>before){
                    answer[i] = last - before;
                }else{
                    answer[i] = last*2;
                }
            }else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}
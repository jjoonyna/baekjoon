class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] front = new int[n];
        int[] back = new int[num_list.length-n];
        int index = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i<n){
                front[i] = num_list[i];
            }else if(i>=n){
                back[index++] = num_list[i];
            }
        }
        
        int findex = 0;
        int bindex = 0;;
        
        for(int i=0; i<answer.length; i++){
            if(i<num_list.length-n){
                answer[i] = back[bindex++];
            }else{
                answer[i] = front[findex++];
            }
        }
        return answer;
    }
}
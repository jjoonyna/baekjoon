class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            for(int j=i+1;j<num_list.length; j++){
                int temp=0;
                temp=num_list[i];
                num_list[i]=num_list[j];
                num_list[j]=temp;
            }
        }
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}
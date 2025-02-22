class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i=0;
        while(i<num_list.length){
            if(num_list[i]%2==0){
                num_list[i] = num_list[i]/2;
                answer++;
            }else if(num_list[i]==1){
                num_list[i] = 1;
            }else{
                num_list[i] = (num_list[i]-1)/2;
                answer++;
            }
            if(num_list[i]==1){
                i++;
            }else{
                continue;
            }
            if(i==num_list.length-1 && num_list[i]==1){
                break;
            }
        }
        return answer;
    }
}
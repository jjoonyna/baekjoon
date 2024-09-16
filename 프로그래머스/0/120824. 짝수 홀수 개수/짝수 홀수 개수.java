class Solution {
    public int[] solution(int[] list) {
        int[] answer = new int[2];
        for(int i=0; i<list.length; i++){
            if(list[i]%2==0){
                answer[0]+=1;
            }else{
                answer[1]+=1;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int n = arr.length;
        while(true){
            if((n&(n-1)) == 0){
                break;
            }
            n++;
        }
        answer = new int[n];
        for(int i=0; i<answer.length; i++){
            if(i<arr.length){
                answer[i] = arr[i];
            }else{
                answer[i] = 0;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                count++;
                if(count==1){
                    start = i;
                }
                end = i;
            }
        }
        
        if(count==0){
            answer = new int[1];
            answer[0] = -1;
        }else if(count==1){
            answer = new int[1];
            answer[0] = 2;
        }else{
            int index = 0;
            answer = new int[end-start+1];
            for(int i=start; i<=end; i++){
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}
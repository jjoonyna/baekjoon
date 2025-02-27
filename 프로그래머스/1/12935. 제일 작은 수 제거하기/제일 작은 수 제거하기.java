class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int[] answer = {};
        
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            int index = 0;
            for(int i=0; i<arr.length; i++){
                if(min>arr[i]){
                    min = arr[i];
                }
            }
            for(int i=0; i<arr.length; i++){
                if(min!=arr[i]){
                    answer[index++] = arr[i];
                }
            }
        }
        return answer;
    }
}
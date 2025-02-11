class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        int len = b1-a1+1 + b2-a2+1;
        
        int[] answer = new int[len];
        int index = 0;
        
        for(int i=a1; i<b1+1; i++){
            answer[index++] = arr[i]; 
        }
        for(int i=a2; i<b2+1; i++){
            answer[index++] = arr[i];
        }
        return answer;
    }
}
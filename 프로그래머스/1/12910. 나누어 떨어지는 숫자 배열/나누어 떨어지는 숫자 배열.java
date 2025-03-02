import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
        
        answer = new int[count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[index++] = arr[i];
            }
        }
        
        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int index=0; index<commands.length; index++){
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];
            
            int[] arr = new int[j-i+1];
            int b = 0;
            for(int a=i-1; a<j; a++){
                arr[b++] = array[a];
            }
            Arrays.sort(arr);
            answer[index] = arr[k-1];
        }
        
        return answer;
    }
}
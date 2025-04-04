import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack();
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.add(arr[i]);
            }else if(stack.peek().equals(arr[i])){
                continue;
            }else{
                stack.add(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}
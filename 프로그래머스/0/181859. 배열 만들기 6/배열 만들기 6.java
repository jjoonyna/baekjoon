import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.push(arr[i]);
                i++;
            }else{
                if(stk.peek()==arr[i]){
                    stk.pop();
                    i++;
                }else{
                    stk.push(arr[i]);
                    i++;
                }
            }
        }
        
        answer = new int[stk.size()];
        int index = 0;
        
        for(int n : stk){
            answer[index++] = n;
        }
        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}
import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        String[] str = s.split("");
        Stack<String> stack = new Stack();
        
        for(String c : str) {
        	if(!stack.isEmpty() && stack.peek().equals(c)) {
        		stack.pop();
        	}else {
        		stack.add(c);
        	}
        }
        
        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        String[] arr = A.split("");
        
        
        for(String s : arr){
            list.add(s);
        }
        
        while(true){
            String str = "";
            for(String s: list){
                str += s;
            }
            
            if(str.equals(B)){
                break;
            }
            if(answer>B.length()+1){
                answer = -1;
                break;
            }
            Collections.rotate(list, 1);
            
            answer++;
        }

        return answer;
    }
}
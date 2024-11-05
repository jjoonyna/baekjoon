import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for(int i=0; i<str.length; i++) {
        	count.put(str[i], count.getOrDefault(str[i], 0)+1);
        }
        for(int i=0; i<str.length; i++) {
        	if(count.get(str[i])==1){
                answer += str[i];   
            }
        }
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
		HashMap<String, Integer> map = new HashMap<>();
        
		for(int i=1; i<=words.length; i++) {
			int person = 0;
			int count = 0;
			String pre = "";
			String now = "";
			if(i>1) {
				pre = words[i-2].substring(words[i-2].length()-1);
				now = words[i-1].substring(0,1);
			}
			
			
			if(i%n==0) {
				person = n;
				count = i/n;
			}else {
				person = i%n;
				count = i/n+1;
			}
			
			if(!map.containsKey(words[i-1])) {
				map.put(words[i-1], person);
			}else {
				answer[0] = person;
				answer[1] = count;
                break;
			}
			
			if(i>1 && !pre.equals(now)) {
				answer[0] = person;
				answer[1] = count;
				break;
			}
        }

        return answer;
    }
}
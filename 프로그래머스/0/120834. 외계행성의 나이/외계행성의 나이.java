import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(int age) {
        String answer = "";
        String reverse= "";
        HashMap<Integer, String> map = new HashMap<Integer, String>();
		String abc = "abcdefghij";
		for(int i=0; i<abc.length();i++) {
			map.put(i, abc.substring(i, i+1));
		}
		while(age>0) {
			int first = age%10;
			age= age/10;
			reverse += map.get(first);
		}
        for(int i=reverse.length()-1; i>=0; i--) {
			answer += reverse.charAt(i);
		}
        return answer;
    }
}
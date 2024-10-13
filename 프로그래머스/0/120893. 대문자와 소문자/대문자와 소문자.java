class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>96) {
				String word ="";
				word += my_string.charAt(i);
				word = word.toUpperCase();
				answer += word;
			}else if(97>my_string.charAt(i)){
				String word ="";
				word += my_string.charAt(i);
				word = word.toLowerCase();
				answer += word;
			}
        }
        return answer;
    }
}
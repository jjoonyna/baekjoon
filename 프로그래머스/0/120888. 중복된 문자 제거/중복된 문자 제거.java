class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
			for(int j=0; j<my_string.length(); j++) {
				if(answer.contains(my_string.substring(j,j+1))) {
					answer += "";
				}else {
					answer += my_string.substring(j,j+1);
				}
			}
        }
        return answer;
    }
}
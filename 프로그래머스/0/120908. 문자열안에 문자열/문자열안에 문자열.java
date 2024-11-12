class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        for(int i=0; i<str1.length(); i++) {
			if(str1.length()-i>=str2.length()) {
				if (str1.substring(i, i + str2.length()).equals(str2)) {
					answer = 1;
					break;
				} else {
					answer = 2;
				}
			}else{
                answer = 2;
            }
		}
        return answer;
    }
}
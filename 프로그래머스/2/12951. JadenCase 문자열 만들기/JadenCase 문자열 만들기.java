class Solution {
    public String solution(String s) {
        String answer = "";
        s = " "+s;
        for (int i=1; i<s.length(); i++){
            if (s.charAt(i-1) == ' '){
                answer += Character.toUpperCase(s.charAt(i));
            }else {
                answer += Character.toLowerCase(s.charAt(i));
            }
        }
        return answer;
    }
}
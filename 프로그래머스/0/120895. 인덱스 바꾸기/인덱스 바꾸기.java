class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] string = my_string.toCharArray();
        char temp = string[num1];
        string[num1] = string[num2];
        string[num2] = temp;
        for(int i=0; i<string.length; i++){
            answer += string[i];
        }
        return answer;
    }
}
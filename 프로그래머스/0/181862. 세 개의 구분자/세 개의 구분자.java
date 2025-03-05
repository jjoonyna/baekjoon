class Solution {
    public String[] solution(String myStr) {
        String[] answer = {}; 
        String[] arr = myStr.split("[a-c]");
        int count = 0;
        for (String s : arr) {
            if (!s.equals("")) {
                count++;
            }
        }
        
        answer = new String[count];
        int index = 0;
        for (String s : arr) {
            if (!s.equals("")) {
                answer[index++] = s;
            }
        }
        
        if(answer.length==0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        return answer;
    }
}
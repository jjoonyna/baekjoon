class Solution {
    public String[] solution(String[] quizs) {
        String[] answer = new String[quizs.length];
		for(int i=0; i<quizs.length; i++){
            String[] cal = quizs[i].split(" ");
            if(cal[1].equals("+")){
                if(Integer.parseInt(cal[0]) + Integer.parseInt(cal[2]) == Integer.parseInt(cal[4])){
                	answer[i] = "O";
                }else {
                	answer[i] = "X";
                }
            }else if(cal[1].equals("-")){
                if(Integer.parseInt(cal[0]) - Integer.parseInt(cal[2]) == Integer.parseInt(cal[4])){
                	answer[i] = "O";
                }else {
                	answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
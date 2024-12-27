class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int start = numLog[0];
        for(int i=1; i<numLog.length; i++){
            int num = numLog[i]-start;
            switch(num){
                case 1 : answer +="w"; break;
                case -1 : answer +="s"; break;
                case 10 : answer +="d"; break;
                case -10 : answer +="a"; break;
            }
            start = numLog[i];
        }
        return answer;
    }
}
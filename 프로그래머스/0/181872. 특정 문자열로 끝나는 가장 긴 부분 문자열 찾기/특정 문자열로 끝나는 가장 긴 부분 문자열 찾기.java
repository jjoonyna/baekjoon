class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String str = "";
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            str = myString.substring(i,pat.length()+i);
            if(str.equals(pat)){
                answer = myString.substring(0,i+pat.length());
            }
            
        }
        return answer;
    }
}
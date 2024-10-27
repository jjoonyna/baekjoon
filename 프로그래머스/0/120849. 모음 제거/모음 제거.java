class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.substring(i,i+1).equals("a")){
                answer += "";
                continue;
            }else if(my_string.substring(i,i+1).equals("e")){
                answer += "";
                continue;
            }else if(my_string.substring(i,i+1).equals("i")){
                answer += "";
                continue;
            }else if(my_string.substring(i,i+1).equals("o")){
                answer += "";
                continue;
            }else if(my_string.substring(i,i+1).equals("u")){
                answer += "";
                continue;
            }
            answer += my_string.substring(i,i+1); 
        }
        
        return answer;
    }
}
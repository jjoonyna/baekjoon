class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            boolean add = false;
            for(int index : indices){
                if(i == index){
                    add = false;
                    break;
                }else{
                    add = true;
                }
            }
            if(add){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}
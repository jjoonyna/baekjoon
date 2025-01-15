class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0; i<str_list.length; i++){
            String str = str_list[i];
            str_list[i] = str_list[i].replaceAll(ex,"");
            if(str.equals(str_list[i])){
                answer += str_list[i];
            }
            
        }
        return answer;
    }
}
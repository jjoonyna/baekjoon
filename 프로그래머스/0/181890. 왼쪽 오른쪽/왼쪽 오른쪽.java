class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        boolean ltrue = false;
        int size = 0;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                ltrue = true;
                size = i;
                break;
            }else if(str_list[i].equals("r")){
                ltrue = false;
                size = i;
                break;
            }
            if(i==str_list.length-1){
                return answer;
            }
        }
        
        int index = 0;
        if(ltrue){
            answer = new String[size];
            for(int i=0; i<size; i++){
                answer[index++] = str_list[i];
            }
        }else{
            answer = new String[str_list.length-size-1];
            for(int i=size+1; i<str_list.length; i++){
                answer[index++] = str_list[i];
            }
        }
        return answer;
    }
}
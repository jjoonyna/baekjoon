class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int size = 0;
        
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                size++;
            }
        }
        answer = new String[size];
        int index = 0;
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        my_string = my_string.trim();
        String[] arr = my_string.split(" ");
        int size = 0;
        for(String str : arr){
            if(!str.equals("")){
                size++;
            }
        }
        
        answer = new String[size];
        int index = 0;
        for(String str : arr){
            if(!str.equals("")){
                answer[index++] = str;
            }
        }
        
        return answer;
    }
}
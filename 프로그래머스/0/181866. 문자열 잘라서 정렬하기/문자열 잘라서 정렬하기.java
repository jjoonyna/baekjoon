import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        String[] answer = {};
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
        Arrays.sort(answer);
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        
        String[] number = {"0","1","2","3","4","5","6","7","8","9"};
        int i=0;
        int j=0;
        int len = 0;
        while(j<my_string.length()){
            if(my_string.substring(j,j+1).equals(number[i])){
            	len++;
                j++;
                i=0;
                continue;
            }
            i++;
            if(i>9){
                j++;
                i=0;
            }
        }
        int[] answer = new int[len];
        i=0;
        j=0;
        len=0;
        while(j<my_string.length()){
            if(my_string.substring(j,j+1).equals(number[i])){
                answer[len] = Integer.parseInt(number[i]);
                len++;
                j++;
                i=0;
                continue;
            }
            i++;
            if(i>9){
                j++;
                i=0;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
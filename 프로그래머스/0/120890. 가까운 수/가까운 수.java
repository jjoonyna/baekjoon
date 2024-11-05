import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(n<array[0]){
                answer = array[0];
            }
            if(n>array[i]){
                answer = array[i];
                continue;
            }else if(n<array[i]){
                if(n-answer>array[i]-n){
                    answer = array[i];
                }else{
                    break;
                }
                break;
            }else{
                answer = array[i];
            }
        }
        return answer;
    }
}
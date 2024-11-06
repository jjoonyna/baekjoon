import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        ArrayList<Integer> number = new ArrayList();
        while(num>0){
            number.add(num%10);
            num=num/10;
        }
        Collections.reverse(number);
        for(int i=0; i<number.size(); i++){
            if(number.get(i)==k) {
            	answer = i+1;
                break;
            }
            answer = -1;
        }
        return answer;
    }
}
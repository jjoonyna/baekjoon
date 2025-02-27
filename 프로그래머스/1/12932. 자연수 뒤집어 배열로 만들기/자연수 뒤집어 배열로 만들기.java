import java.util.*;
class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n>0){
            int num = (int)(n%10);
            n = n/10;
            list.add(num);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(n>0){
            int num = (int)(n%10);
            list.add(num);
            n = n/10;
        }
        
        Collections.sort(list);
        long count = 1L;
        
        for(int i=0; i<list.size(); i++){
            answer += list.get(i)*count;
            count *= 10;
            
        }
        return answer;
    }
}
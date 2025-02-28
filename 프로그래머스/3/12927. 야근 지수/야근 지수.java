import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		for(int value : works) {
			que.add(value);
		}
		while(n>0) {
            int value = que.poll();
            if(value==0) {
            	que.add(value);
            }else if(value>=que.peek()) {
            	value = value-1;
            	que.add(value);
            }else {
            	que.add(value);
            }

            n--;
        }
        for(int i : que){
            answer += Math.pow(i,2);
        }
        return answer;
    }
}
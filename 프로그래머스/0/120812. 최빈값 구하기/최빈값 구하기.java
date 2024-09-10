import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		int max = 0;
        for(int i=0; i<array.length; i++){
        	if(map.containsKey(array[i])) {
        		count++;
        		map.put(array[i], count);
        	}else if(!map.containsKey(array[i])){
        		count = 0;
        		map.put(array[i], count);
        	}
        	if(max<map.get(array[i])) {
        		max = map.get(array[i]);
        	}else if(max <=map.get(array[i])) {
        		answer = array[i];
        	}
        }
        int cnt = 0;
        for(int i=0; i<array.length; i++) {
        	if(map.get(array[i])!=null) {
        		if(max==map.get(array[i])) {
        			cnt++;
        			map.remove(array[i]);
        		}
        		if(cnt>1) {
        			answer = -1;
        		}
        	}
        }
       
        
        return answer;
    }
}
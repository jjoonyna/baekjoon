import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        Iterator<Integer> it = set.iterator();
         for (int i = 0; i < k; i++) {
            if (it.hasNext()) {
                answer[i] = it.next();
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
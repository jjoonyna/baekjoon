import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            answer[i] = -1;
            
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(queries[i][2]<arr[j]){
                    list.add(arr[j]);
                }
            }
            Collections.sort(list);
            if(list.size()>0){
                answer[i] = list.get(0);
            }else{
                answer[i] = -1;
            }
            
        }
        return answer;
    }
}
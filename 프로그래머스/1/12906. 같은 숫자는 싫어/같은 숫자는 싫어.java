import java.util.*;

import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        int index = 0;
        
        for(int n : list){
            answer[index++] = n;
        }
        
        return answer;
    }
}
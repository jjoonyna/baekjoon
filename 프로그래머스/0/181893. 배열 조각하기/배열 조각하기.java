import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        for(int num : arr){
            list.add(num);
        }
        
        for(int i=0; i<query.length; i++){
            if(i%2==0){
                list = list.subList(0, query[i]+1);
            }else{
                list = list.subList(query[i], list.size());
            }
        }
        
        answer = new int[list.size()];
        int index = 0;
        
        for(int num : list){
            answer[index] = list.get(index++);
        }
        return answer;
    }
}
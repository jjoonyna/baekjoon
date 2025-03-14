import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i],i);
            }
        }
        int index = 0;
        int[] result = new int[3];
        for(int i=0; i<rank.length; i++){
            if(map.containsKey(i+1)){
                result[index++] = map.get(i+1);
            }
            if(index==3){
                break;
            }
        }
        answer = 10000*result[0]+100*result[1]+result[2];
        return answer;
    }
}
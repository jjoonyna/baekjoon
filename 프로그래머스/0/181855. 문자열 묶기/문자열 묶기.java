import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<strArr.length; i++){
            if(map.get(strArr[i].length())==null){
                map.put(strArr[i].length(),1);
            }else{
                map.put(strArr[i].length(),map.get(strArr[i].length())+1);
            }
        }
        
        for(Integer key :  map.keySet()){
            if(map.get(key)>answer){
                answer = map.get(key);
            }
        }
        return answer;
    }
}
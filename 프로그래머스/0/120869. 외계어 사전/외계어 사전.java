import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String str1 = "";
        
        for(String s : spell){
                str1 += s;
            }
        
        for(int i=0; i<dic.length; i++){
            String str = dic[i];
            String[] arr = str.split("");
            Arrays.sort(arr);
            String str2 = "";
            
            if(spell.length == arr.length){
                for(String s : arr){
                    str2 += s;
                }
            }else{
                continue;
            }
            
            if(str1.equals(str2)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        for(int i=1; i<numlist.length; i++){
            for(int j=0; j<numlist.length; j++){
                if(Math.abs(numlist[i]-n)<Math.abs(numlist[j]-n)){
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
                if(Math.abs(numlist[i]-n)==Math.abs(numlist[j]-n)){
                    if(numlist[i]>numlist[j]){
                        int temp = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = temp;
                    }
                }
            }
            
        }
        
        int[] answer = numlist;
        return answer;
    }
}
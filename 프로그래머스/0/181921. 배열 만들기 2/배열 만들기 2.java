import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=l; i<=r; i++){
            int num = i;
            while(num>0){
                if(num%10==5||num%10==0){
                    num = num/10;
                }else{
                    break;
                }    
            }
            if(num==0){
                count++;
                list.add(i);
            }
        }
        
        int[] answer;
        if(list.size()>0){
            answer = new int[count];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
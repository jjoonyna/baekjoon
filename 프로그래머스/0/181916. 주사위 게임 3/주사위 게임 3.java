import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] list = {a, b, c, d};
        Arrays.sort(list);
        boolean forth = list[0]==list[3];
        boolean triple = list[0]==list[2] || list[1]==list[3];
        boolean multiple1 = list[0]==list[1] && list[2]==list[3];
        boolean multiple2 = (list[0]==list[1] && list[2]!=list[3])
            || (list[0]!=list[1] && list[2]==list[3]);
        boolean multiple3 = list[1]==list[2];
        boolean one = list[0]!=list[1] && list[1]!=list[2] && list[2]!=list[3];
        
        if(forth){
            answer = 1111*list[0];
        } else if(triple){
            answer = list[0]==list[2] ? (10*list[0]+list[3])*(10*list[0]+list[3])
                : (10*list[3]+list[0])*(10*list[3]+list[0]);
        }else if(multiple1){
            answer = (list[0]+list[2]) * (list[2]-list[0]);
        }else if(multiple2){
            answer = list[0]==list[1] ? list[2]*list[3] : list[0]*list[1]; 
        }else if(multiple3){
            answer = list[0]*list[3];
        }else if(one){
            answer = list[0];
        }
        
        return answer;
    }
}
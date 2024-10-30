import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int i = 2;
        while(n>1){
            if(n%i==0){
                n = n/i;
                answer.add(i);
                i=2;
            }else{
                i++;
            }
        }
        int rm=0;
	    i=1;
        
	    while(rm<answer.size()&&answer.size()!=1) {
	        if(i!=rm) {
		        if(answer.get(i)==answer.get(rm)) {
		        	answer.remove(i);
		        	i=1;
		        }else {
		        	rm++;
		        }
	        }else {
	        	rm++;
	        }
	    }
        return answer;
    }
}
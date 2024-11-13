class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length()%n==0){
            answer = new String[my_str.length()/n];
        }else{
            answer = new String[my_str.length()/n+1]; 
        }
        
        int j=0;
        for(int i=0; i<my_str.length(); i++){
        	answer[j] = answer[j] == null ? "" : answer[j];
            answer[j] += my_str.substring(i,i+1);
            if(i!=0 && (i+1)%n==0 || n==1){
                j++;
            }
        }
        return answer;
    }
}
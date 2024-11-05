class Solution {
    public int[] solution(int n) {
        
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        int[] answer = new int[count];
        int j=1;
        int i=0;
        while(i<answer.length){
            if(n%j==0){
                answer[i] = j;
                i++;
            }
            j++;
        }
        return answer;
    }
}
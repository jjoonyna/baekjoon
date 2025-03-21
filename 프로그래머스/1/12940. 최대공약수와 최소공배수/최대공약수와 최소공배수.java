class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        
        if(n>m){
            int temp = n;
            n = m;
            m = temp;
        }
        
        for(int i=1; i<=m; i++){
            if(n%i==0 && m%i==0){
                max = i;
            }
        }
        
        min = (m*n)/max;
        
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}
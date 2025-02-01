class Solution {
    public int[] solution(int n, int k) {
        int a = n/k;
        int[] answer = new int[a];
        int i = 0;
        int j = 1;
        while(j<=n){
            if(j%k==0){
                answer[i++] = j;
            }
            j++;
        }
        
        return answer;
    }
}
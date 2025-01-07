class Solution {
    public int[] solution(int n) {
        int count = 1;
        int m = n;
        while(m!=1){
            if(m%2==0){
                m = m/2;
                count++;
            }else{
                m = 3*m+1;
                count++;
            }
        }
        int[] answer = new int[count];
        int i = 0;
        answer[i] = n;
        while(n!=1){
            i++;
            if(n%2==0){
                n = n/2;
                answer[i] = n;
            }else{
                n = 3*n+1;
                answer[i] = n;
            }
            
        }
        return answer;
    }
}
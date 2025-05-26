class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        arr[0] = arr[1] = false;

        for(int i=2; i<=n; i++){
            arr[i] = true;
        }
        
        for (int i=2; i<=Math.sqrt(n); i++) {
            for (int j=i*i; j<=n; j+=i) {
                arr[j] = false;
            }
        }
        
        for(int i=0; i<=n; i++){
            if(arr[i]==true){
                answer++;
            }
        }
        return answer;
    }
}
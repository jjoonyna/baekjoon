class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0.0;
        for(int i=0; i<arr.length; i++){
            sum += (double)arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
}
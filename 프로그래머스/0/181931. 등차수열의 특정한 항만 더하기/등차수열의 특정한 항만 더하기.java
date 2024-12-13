class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] inc = new int[included.length];
        for(int i=0; i<included.length; i++){
            if(i==0){
                inc[i] = a;
            }else{
                inc[i] = inc[i-1]+d;
            }
            if(included[i]){
                answer +=inc[i];
            }
        }
        return answer;
    }
}
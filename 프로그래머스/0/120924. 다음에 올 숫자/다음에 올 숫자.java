class Solution {
    public int solution(int[] common) {
        int answer = 0;
            if(common[1]-common[0]==common[2]-common[1]){
                int n = common[1]-common[0];
                answer = common[common.length-1]+n;
            }else if(common[1]/common[0]==common[2]/common[1]){
                int n = common[1]/common[0];
                answer = common[common.length-1]*n;
            }
        return answer;
    }
}
class Solution {
    public int solution(int[] dot) {
        int answer = 1;
        int i = 0;
        while(i<2){
            if(dot[i]<0){
                answer += 1;
            }
            i++;
        }
        if(dot[0]>0&&dot[1]<0){
            answer = 4;
        }
        return answer;
    }
}
class Solution {
    public int solution(String number) {
        int answer = 0;
        int num = 0;
        for(int i=0; i<number.length(); i++){
            num += Integer.parseInt(number.substring(i,i+1));
        }
        answer = num%9;
        
        return answer;
    }
}
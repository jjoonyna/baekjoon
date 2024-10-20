class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num = 0;
        while(k>0){
            answer = numbers[num];
            k--;
            num +=2;
            if(num>=numbers.length){
                num = num-numbers.length;
            }
        }
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int min = 0;
        int max = 0;
        Arrays.sort(numbers);
        max = numbers[numbers.length-1]*numbers[numbers.length-2];
        min = numbers[0]*numbers[1];
        answer = max>=min? max : min;
        return answer;
    }
}
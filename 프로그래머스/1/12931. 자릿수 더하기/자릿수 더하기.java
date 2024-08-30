import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            int i = 10;
            answer += n%i;
            n = n/i;
            i = i*10;
        }

        return answer;
    }
}
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int a = 0;
        int b = 1;
        int c = 2;
        
        while(true){
            if(number[a]+number[b]+number[c]==0){
                answer++;
            }
            
            if (c < number.length - 1) {
                c++;
            } else if (b < number.length - 2) {
                b++;
                c = b + 1;
            } else if (a < number.length - 3) {
                a++;
                b = a + 1;
                c = b + 1;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
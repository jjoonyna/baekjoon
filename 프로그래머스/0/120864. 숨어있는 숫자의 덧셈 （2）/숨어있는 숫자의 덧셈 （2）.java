class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numbers = my_string.split("[^0-9]+");
        for(String number : numbers){
        	number = number.equals("") ? "0" : number;
            answer += Integer.parseInt(number);
        }
        return answer;
    }
}
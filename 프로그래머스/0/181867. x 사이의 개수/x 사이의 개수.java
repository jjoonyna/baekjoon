class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int size = str.length;
        if(myString.charAt(myString.length()-1) == 'x'){
            size += 1;
        }
        int[] answer = new int[size];
        for(int i=0;i<str.length; i++){
            answer[i] = str[i].length();
        }
        return answer;
    }
}
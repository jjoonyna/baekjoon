class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char[] array = rny_string.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i]==('m')){
                answer += "rn";
            }else{
                answer += array[i];
            }
        }
        return answer;
    }
}
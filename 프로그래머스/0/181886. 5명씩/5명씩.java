class Solution {
    public String[] solution(String[] names) {
        int size = 0;
        if(names.length%5==0){
            size = names.length/5;
        }else{
            size = names.length/5+1;
        }
        
        String[] answer = new String[size];
        int index = 0;
        
        for(int i=0; i<names.length; i+=5){
            answer[index++] = names[i];
        }
        return answer;
    }
}
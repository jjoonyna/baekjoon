class Solution {
    static int count = 0;
    static int zeroCount = 0;
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        deleteZero(s);
        answer[0] = count;
        answer[1] = zeroCount;
        return answer;
    }
        
    public static String deleteZero(String s){
        if(s.equals("1")){
            return "";
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zeroCount++;
            }
        }
        s = s.replaceAll("0","");
        count++;
        int len = s.length();
        s = "";
        while(len>0){
            if(len%2==0){
                s = "0"+s;    
            }else{
                s = "1"+s;
            }
            len /= 2;
        }
        return deleteZero(s);
    }
}
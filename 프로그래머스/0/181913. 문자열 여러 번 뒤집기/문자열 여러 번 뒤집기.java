class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            String r_string = "";
            for(int j=e; j>=s; j--){
                r_string += my_string.charAt(j);
            }
            String s_string = my_string.substring(0,s);
            String e_string = my_string.substring(e+1);
            my_string = s_string + r_string + e_string;
        }
        
        answer = my_string;
        return answer;
    }
}
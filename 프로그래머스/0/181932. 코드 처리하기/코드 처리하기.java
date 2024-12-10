class Solution {
    public String solution(String code) {
        String answer = "";
        char[] arr = code.toCharArray();
        String ret = "";
        int mode = 0;
        for(int i=0; i<arr.length; i++){
            if(mode == 0){
                if(arr[i]=='1'){
                    mode = 1;
                }else{
                    if(i%2==0){
                        ret += arr[i];
                    }
                }
            } else{
                if(arr[i]=='1'){
                    mode = 0;
                }else{
                    if(i%2==1){
                        ret += arr[i];
                    }
                }
            }
            if(ret==""){
                answer = "EMPTY";
            }else{
                answer = ret;
            }
        }
        return answer;
    }
}
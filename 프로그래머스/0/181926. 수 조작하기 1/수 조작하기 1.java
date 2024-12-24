class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] arr = control.toCharArray();
        for(int i=0; i<arr.length; i++){
            switch(arr[i]){
                case 'w' : n++; break;
                case 's' : n--; break;
                case 'd' : n= n+10; break;
                case 'a' : n= n-10; break;
            }
        }
        answer = n;
        return answer;
    }
}
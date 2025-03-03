class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = 0;
        int num = n+1;
        
        while(n>0){
            if(n%2 != 0){
            	nCount++;
            }
            n /= 2;
        }
        while(true) {
        	if(nCount==oneCount(num)) {
        		answer = num;
        		break;
        	}
        	num++;
        }
        return answer;
    }
	public static int oneCount(int n) {
		int nCount = 0;
		while(n>0){
            if(n%2 != 0){
            	nCount++;
            }
            n /= 2;
        }
		return nCount;
	}
}
import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] list = new int[arr.length];
        
        while(true){
            list = arr.clone();
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] = arr[i]/2;
                }else if(arr[i]<=50 && arr[i]%2==1){
                    arr[i] = arr[i]*2+1;
                }
            }
            answer++;
            if(Arrays.equals(list, arr)){
                answer--;
                break;
            }
        }
        
        return answer;
    }
}
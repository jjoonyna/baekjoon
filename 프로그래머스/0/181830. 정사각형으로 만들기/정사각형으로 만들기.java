class Solution {
    public int[][] solution(int[][] arr) {

        int x = arr.length;
        int y = arr[0].length;
        int[][] answer;
        
        if(x>y){
            answer = new int[x][x];
        }else if(x<y){
            answer = new int[y][y];
        }else{
            answer = arr;
        }
        
        int index1 = 0;
        
        for(int i=0; i<arr.length; i++){
            int index2 = 0;
            for(int j=0; j<arr[i].length; j++){
                answer[index1][index2] = arr[i][j];
                index2++;
            }
            index1++;
        }
        
        return answer;
    }
}
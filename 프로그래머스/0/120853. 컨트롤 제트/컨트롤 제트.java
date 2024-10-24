import java.util.ArrayList;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
        for(String str : s.split(" ")) {
			if(str.equals("Z")){
				answer -= arr.get(index-1);
                index--;
			}else{
				arr.add(Integer.parseInt(str));
                answer += Integer.parseInt(str);
            }
			index++;
		}
        return answer;
    }
}
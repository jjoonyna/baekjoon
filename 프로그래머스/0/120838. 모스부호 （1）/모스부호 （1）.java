import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String answer = "";
        HashMap<String, String> map = new HashMap<String, String>();

        map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");
        String[] arr = new String[letter.length()];
        for(int i=0; i<arr.length;i++) {
			arr = letter.split(" ");
			answer += map.get(arr[i]);
		}
        return answer;
    }
}
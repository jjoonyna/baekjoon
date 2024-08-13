
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String word = st.nextToken();
		char[] words = word.toCharArray();
		
		for(int i=0; i<words.length; i++) {
			if(words[i]<=90) {
				words[i]+=32;
			}else if(words[i]>=97) {
				words[i]-=32;
			}
			bw.write(words[i]);
		}
		
		
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}

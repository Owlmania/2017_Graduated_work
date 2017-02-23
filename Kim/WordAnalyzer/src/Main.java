import java.util.Iterator;
import java.util.Vector;


/*
 * 
 * @author Kyeong Hwan Kim
 * @date 2017-02-23
 * 
 * */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeechTokenizer s = new SpeechTokenizer("도쿄에서 신주쿠까지 가는 방법은");
		Vector<String> x = s.getTokens();
		
		WordAnalyzer w = new WordAnalyzer(x);
		w.parsePosition();
		
		Vector<String> answer = w.getAnalyzed();
		
		for(String a : answer)
		{
			System.out.println(a);
			
		}
	
	}
}

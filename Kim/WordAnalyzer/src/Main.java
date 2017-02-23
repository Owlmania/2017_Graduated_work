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
		SpeechTokenizer s = new SpeechTokenizer("���쿡�� ��������� ���� �����");
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

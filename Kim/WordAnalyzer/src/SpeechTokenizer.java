import java.util.StringTokenizer;
import java.util.Vector;

/*
 * input  : String ( 입력 대화 문자열 )
 * output : Vector ( 분류된 문자열 )
 * */
public class SpeechTokenizer {

	private Vector<String> tokens;
	
	public SpeechTokenizer(String str)
	{
		tokens = new Vector<String>();
		StringTokenizer tokenizer = new StringTokenizer(str);
		
		while(tokenizer.hasMoreTokens())
			tokens.add(tokenizer.nextToken());
	}
	
	public Vector<String> getTokens()
	{
		return tokens;
	}
	
}

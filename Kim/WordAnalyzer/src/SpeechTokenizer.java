import java.util.StringTokenizer;
import java.util.Vector;

/*
 * input  : String ( �Է� ��ȭ ���ڿ� )
 * output : Vector ( �з��� ���ڿ� )
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

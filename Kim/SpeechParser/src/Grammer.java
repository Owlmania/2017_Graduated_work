import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;


/*
 * Grammer File 을 통한 어휘 분석 스트림 제공
 * 
 * 
 * */
public class Grammer {

	private Vector<String> v;
	public static final String FILE_NAME = "";
	// Node (Head)
	
	
	/*
	 * setting Vector Speech Tokens
	 * */
	public boolean setWords(Vector<String> vref)
	{
		if(vref == null)
		{
			return false;
		}
		else
		{
			v = vref;
			return true;
		}
	}
	
	public Grammer()
	{
		// initialize Data ( connect database )
	}
	
	public void checkPartOfSpeech()
	{
		// use Dictionary to check 조사, 체언, 용언, 어미, 관형사, 부사
		// make Node Class of Word
	}
	
	public void makeParseTree()
	{
		// check dependency between nodes & make Tree
	}
	
	public void traverseParseTree()
	{
		// decode Parse Tree and return Action and Datas...
	}
	
	
}

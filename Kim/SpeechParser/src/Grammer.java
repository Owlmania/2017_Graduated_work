import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;


/*
 * Grammer File �� ���� ���� �м� ��Ʈ�� ����
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
		// use Dictionary to check ����, ü��, ���, ���, ������, �λ�
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

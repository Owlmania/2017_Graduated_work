import java.util.Vector;

/*
 * input  : Tokenized String Vector
 * output : Word Class Vector
 * */
public class WordAnalyzer {
	
	Vector<String> inputWords;
	Vector<String> outputWords;
	
	//@param : Tonkenized input String
	public WordAnalyzer(Vector<String> input)
	{
		inputWords = input;
		outputWords = new Vector<String>();
	}
	
	public void parsePosition()
	{
		String[] curSuffix = null;
		
		for (Suffix suffix : Suffix.values()){
		
			curSuffix = suffix.getSuffix();
			
			for(int i = 0 ; i < curSuffix.length  ; i++)
			for(int j = 0 ; j < inputWords.size() ; j++)
			{
				String curWord = inputWords.get(j);
				
				if(curWord.endsWith(curSuffix[i]))
				{
					// 해당 단어가 특정 Suffix로 끝날 경우...
					String[] temp = curWord.split(curSuffix[i]);
					
					outputWords.add(temp[0] + suffix.getIdentity() + " " + curSuffix[i] + "S" );

				}		
				
			}
		}
	}
	
	public Vector<String> getAnalyzed()
	{
		return outputWords;
	}
	
}

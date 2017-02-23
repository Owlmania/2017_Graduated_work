
public enum Suffix {

	NOUN('N'),VERB('V');
	
	private char identity;
	
	public String[] NOUN_SUFFIX = {"����","����","��","����","��","��","��","��"};
	public String[] VERB_SUFFIX = {"�̴�","��","��","��","��",};
	
	Suffix(char c)
	{
		identity = c;
	}
	
	public String[] getSuffix()
	{
		switch(identity)
		{
		case 'N': return NOUN_SUFFIX;
		case 'V': return VERB_SUFFIX;
		}
		return null;
	}
	
	public char getIdentity()
	{
		return identity;
	}
	
	public void setSuffix()
	{
		
	}
	
}

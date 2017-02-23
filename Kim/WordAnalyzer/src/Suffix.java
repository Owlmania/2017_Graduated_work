
public enum Suffix {

	NOUN('N'),VERB('V');
	
	private char identity;
	
	public String[] NOUN_SUFFIX = {"에서","으로","로","까지","을","에","은","이"};
	public String[] VERB_SUFFIX = {"이다","자","는","다","까",};
	
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

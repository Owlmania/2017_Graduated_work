import java.util.StringTokenizer;
import java.util.Vector;

/*
 * @author 		Kyeong Hwan Kim
 * @version 	1.0.0
 * @since		2017-02-15
 * */

public class ReturnToken {

	private Vector<String> s;
	
	public Vector<String> getTokenVector(String str)
	{
		StringTokenizer st = new StringTokenizer(str," ");
		s = new Vector<String>(20);
		
		while(st.hasMoreTokens())
			s.add(st.nextToken());
		
		return s;
	}
	
}

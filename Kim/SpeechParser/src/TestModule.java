import java.util.Iterator;
import java.util.Vector;

public class TestModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnToken r = new ReturnToken();
		Vector<String> v =  r.getTokenVector("���� ������� �� �ξ��� �Դϴ�");
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

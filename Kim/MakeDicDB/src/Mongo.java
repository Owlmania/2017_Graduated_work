import java.util.Vector;

import javax.swing.JOptionPane;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo {

	// use settings
	public static final String USER = "localhost";
	public static final int PERMIT_OF_WRITERS = 1;
	public static final int CONNECTION_TIME = 2000;
	public static final int DB_PORT = 27017;
	public static final int NUMOFPOSITION = 6;
	
	
	public enum Position 
	{
		NOUN("NOUN",0),
		VERB("VERB",1),
		ADVERB("ADVERB",2),
		ADJECT("ADJECT",3),
		POSTPOSITION("POSTPOSITION",4),
		SUFFIX("SUFFIX",5);
		
		private String DATA;
		private int	ID;
		
		
		Position(String DATA,int num)
		{
			this.DATA = DATA;
			this.ID = num;
		}
		
		public String getCollectionName()
		{
			return DATA;
		}
		
		public int getCollectionNum()
		{
			return ID;
		}
		
	};
	
	// DB infos
	public static final String DB_NAME = "dictionary";
	
	// members
	private MongoClient mongoClient = null;
	
	private Vector<MongoCollection<Document>> position;
	private MongoDatabase db;
	private WriteConcern w;
	
	
	private void getDataCollection()
	{
		for(Position p : Position.values())
		{	
			position.add(db.getCollection(p.getCollectionName()));
		}
	}
	
	public Mongo()
	{
		position = new Vector<MongoCollection<Document>>();
		
		Connect();
		getDBinfo();
	}
	
	private void Connect()
	{
		mongoClient = new MongoClient("localhost" , DB_PORT);
		w = new WriteConcern(PERMIT_OF_WRITERS , CONNECTION_TIME);//쓰게 락 갯수, 연결 시간 2000 //쓰레드 쓰게되면 2개 동시에 쓸 경우도 생기니까
        mongoClient.setWriteConcern(w);
	}
	
	private void getDBinfo()
	{
		db = mongoClient.getDatabase(DB_NAME);
		getDataCollection();
	}
	
	public void Write(String word,String Pos)
	{
		int dbpos = -1;
		
		for(Position p : Position.values())
		{
			if( p.getCollectionName().equals(Pos))
			{
				JOptionPane.showMessageDialog(null,"Collection 으로 접근합니다" );
				dbpos = p.getCollectionNum();
			}
		}
        
        Document doc = new Document();
        doc.put("단어",word);
        JOptionPane.showMessageDialog(null, dbpos );
        position.get(dbpos).insertOne(doc);
	}
}

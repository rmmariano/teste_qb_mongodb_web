import java.net.UnknownHostException;

import org.esfinge.querybuilder.annotation.ServicePriority;
import org.esfinge.querybuilder.mongodb.DatastoreProvider;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;

import com.mongodb.Mongo;
import com.mongodb.MongoException;

@ServicePriority(1)
public class TestMongoDBDatastoreProvider extends DatastoreProvider {
	
	private Mongo mongo;
	
	public TestMongoDBDatastoreProvider(){
		try{
			mongo = new Mongo("localhost", 27017);
		}catch(UnknownHostException e){
			e.printStackTrace();			
		}catch(MongoException e){
			e.printStackTrace();			
		}
		
		getMorphia().map(Person.class);
		getMorphia().map(Address.class);	
	}
	
	@Override
	public Datastore getDatastore(){
		return getMorphia().createDatastore(mongo, "testdb");
	}

}

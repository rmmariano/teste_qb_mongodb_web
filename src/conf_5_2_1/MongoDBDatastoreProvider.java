package conf_5_2_1;

import java.net.UnknownHostException;

import org.esfinge.querybuilder.annotation.ServicePriority;
import org.esfinge.querybuilder.mongodb.DatastoreProvider;

import com.google.code.morphia.Datastore;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

@ServicePriority(1)
public class MongoDBDatastoreProvider extends DatastoreProvider{
	
	public MongoDBDatastoreProvider() {
		try{
			mongo = new Mongo("localhost", 27017);
		}catch(UnknownHostException e){
			e.printStackTrace();			
		}catch(MongoException e){
			e.printStackTrace();			
		}
		
		getMorphia().map(Cachorro.class);
		getMorphia().map(Cliente.class);
		getMorphia().map(Pagamento.class);
	}

	@Override
	public Datastore getDatastore() {
		return getMorphia().createDatastore(mongo, "testdb");
	}

}

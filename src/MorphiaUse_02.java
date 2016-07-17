import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.query.Query;
import com.mongodb.Mongo;

public class MorphiaUse_02 {
	
	Morphia morphia = new Morphia();
	
	morphia.map(Vendedor.class);
	
	Mongo mongo = new Mongo("localhost", 27017);
//	MongoClient mongo = new MongoClient("localhost", 27017);
	
	Datastore ds = morphia.createDatastore(mongo, "testDatabase");
	
	Query query = ds.createQuery(Vendedor.class).order("-valor_vendas").limit(10);
	
	List<Vendedor> list = query.asList();

}



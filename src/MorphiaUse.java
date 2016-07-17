import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;

import com.mongodb.Mongo;

public class MorphiaUse {
	
	Morphia morphia = new Morphia();
	
	Datastore ds = morphia.createDatastore(new Mongo("localhost", 27017), "testDB");
//	Datastore ds = morphia.createDatastore(new MongoClient("localhost", 27017), "testDB");
	
	morphia.
	
	morphia.map(Employee.class);
	
	ds.save(new Employee("John"));
	
	Employee_01 boss = ds.find(Employee_01.class).field("manager").equal(null).get();

}



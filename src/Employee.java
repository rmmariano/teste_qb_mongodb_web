import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.Key;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;
import com.google.code.morphia.annotations.NotSaved;
import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.annotations.Reference;
import com.google.code.morphia.annotations.Transient;

@Entity("employees")
public class Employee {
	
	@Id ObjectId id;
	String firstName, lastName;
	Long salary = null;
	
	Address address;
	
	Key<Employee> manager;
	@Reference List<Employee> underlings = new ArrayList<Employee>();
	
	@Property("started") Date startDate;
	@Property("left") Date endDate;
	
	@Indexed boolean active = false;
	@NotSaved String readButNotStored;
	@Transient int notStored;
	


}

import java.util.List;

import org.esfinge.querybuilder.Repository;

public interface PersonDAO extends Repository<Person>{
    public List<Person> getPersonByLastName(String lastname);
    public List<Person> getPersonByAddressCity(String city);
    public List<Person> getPersonByAgeGreater(Integer age);
}

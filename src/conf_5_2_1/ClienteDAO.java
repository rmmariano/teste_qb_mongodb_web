package conf_5_2_1;

import java.util.List;

import org.esfinge.querybuilder.Repository;

public interface ClienteDAO extends Repository<Cliente>{
	
//	public List<Cliente> getClienteBy_id(int _id);
//	public List<Cliente> getClienteById(int _id);
	
	public List<Cliente> getClienteByMatricula(int matricula);	
	
    public List<Cliente> getClienteByNome(String nome);

}


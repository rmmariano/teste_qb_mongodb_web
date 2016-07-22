package conf_5_2_1;

import java.util.List;
import java.util.Set;

import org.esfinge.querybuilder.QueryBuilder;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;

public class Main {
	
	public static void main(String[] args) {
		
		MongoDBDatastoreProvider db = new MongoDBDatastoreProvider();		
		Datastore ds = db.getDatastore();
		
		Cliente cliente = new Cliente();
		cliente.matricula = 0; cliente.nome = "Maril";		
		Cliente cliente02 = new Cliente();
		cliente02.matricula = 1; cliente02.nome = "Abys";
		Cliente cliente03 = new Cliente();
		cliente03.matricula = 2; cliente03.nome = "Maril";	
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Hau"; cachorro.raca = "pastor";
		
		Pagamento pagamento = new Pagamento();
		pagamento.id = 0; pagamento.valor = 300.00f; pagamento.data = "30/06/2016";
		
		cliente.cachorros.add(cachorro);
		cliente.pagamentos.add(pagamento);
		
		ds.save(cliente);
		ds.save(cliente02);
		ds.save(cliente03);		
		
		Query<Cliente> query_cliente = ds.find(Cliente.class);		
		List<Cliente> lista_clientes = query_cliente.asList();
		
		for(Cliente c: lista_clientes){
			System.out.println("Matricula: " + c.matricula);
			System.out.println("Nome: " + c.nome);
			
			System.out.println("Cachorros: ");			
			Set<Cachorro> set_cachorros = c.cachorros;				
			for(Cachorro dog: set_cachorros){
				System.out.println(" Nome: " + dog.nome);				
				System.out.println(" Raca: " + dog.raca);
			}
			
			System.out.println("Pagamentos: ");			
			Set<Pagamento> set_pags = c.pagamentos;			
			for(Pagamento pag: set_pags){
				System.out.println(" ID: " + pag.id);				
				System.out.println(" Valor: " + pag.valor);
				System.out.println(" Data: " + pag.data);
			}
			
			System.out.println("\n");			
		}
		
		
		System.out.println("\n*************\nConsultas pelo Query Builder: ");
		
		ClienteDAO dao = QueryBuilder.create(ClienteDAO.class);
		
		System.out.println("Consultar por ID do cliente: ");
		List<Cliente> lista_de_clientes = dao.getClienteByMatricula(0);
		
		for(Cliente c: lista_de_clientes){
			System.out.println("Matricula: " + c.matricula);
			System.out.println("Nome: " + c.nome);
			
			System.out.println("Cachorros: ");			
			Set<Cachorro> set_cachorros = c.cachorros;				
			for(Cachorro dog: set_cachorros){
				System.out.println(" Nome: " + dog.nome);				
				System.out.println(" Raca: " + dog.raca);
			}
			
			System.out.println("Pagamentos: ");			
			Set<Pagamento> set_pags = c.pagamentos;			
			for(Pagamento pag: set_pags){
				System.out.println(" ID: " + pag.id);				
				System.out.println(" Valor: " + pag.valor);
				System.out.println(" Data: " + pag.data);
			}
			
			System.out.println("\n");			
		}
		
		
		System.out.println("Consultar pelo nome do cliente: ");
		lista_de_clientes = dao.getClienteByNome("Maril");
		
		for(Cliente c: lista_de_clientes){
			System.out.println("Matricula: " + c.matricula);
			System.out.println("Nome: " + c.nome);
			
			System.out.println("Cachorros: ");			
			Set<Cachorro> set_cachorros = c.cachorros;				
			for(Cachorro dog: set_cachorros){
				System.out.println(" Nome: " + dog.nome);				
				System.out.println(" Raca: " + dog.raca);
			}
			
			System.out.println("Pagamentos: ");			
			Set<Pagamento> set_pags = c.pagamentos;			
			for(Pagamento pag: set_pags){
				System.out.println(" ID: " + pag.id);				
				System.out.println(" Valor: " + pag.valor);
				System.out.println(" Data: " + pag.data);
			}
			
			System.out.println("\n");			
		}
		
		

		
	}

}

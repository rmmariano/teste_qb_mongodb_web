package conf_5_2_1;

import java.util.List;
import java.util.Set;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;

public class Main {
	
	public static void main(String[] args) {
		
		MongoDBDatastoreProvider db = new MongoDBDatastoreProvider();		
		Datastore ds = db.getDatastore();
		
//		Cliente cliente = new Cliente(0, "Maril", null, null);	
		Cliente cliente = new Cliente();
		cliente.matricula = 0;
		cliente.nome = "Maril";
		
		Cliente cliente02 = new Cliente();
		cliente02.matricula = 1;
		cliente02.nome = "Abys";
		
//		Cachorro cachorro = new Cachorro("Hau", "pastor");
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Hau";
		cachorro.raca = "pastor";
		
//		Pagamento pagamento = new Pagamento(0, 300.00f, "30/06/2016");
		Pagamento pagamento = new Pagamento();
		pagamento.id = 0;
		pagamento.valor = 300.00f;
		pagamento.data = "30/06/2016";
		
		
//		cliente.addCachorro(cachorro);
//		cliente.cachorros.add(cachorro);
//		cliente.addPagamento(pagamento);
//		cliente.pagamentos.add(pagamento);
		
		ds.save(cliente);
		ds.save(cliente02);
		
		Query<Cliente> query_cliente = ds.find(Cliente.class);		
		List<Cliente> lista_clientes = query_cliente.asList();
		
		for(Cliente c: lista_clientes){
			System.out.println("Matrícula: " + c.matricula);
			System.out.println("Nome: " + c.nome);
			
//			System.out.println("Cachorros: ");			
//			List<Cachorro> set_cachorros = c.cachorros;	
//			
//			for(Cachorro dog: set_cachorros){
//				System.out.println(" Nome: " + dog.nome);				
//				System.out.println(" Raça: " + dog.raca);
//			}
//			
//			System.out.println("Pagamentos: ");			
//			List<Pagamento> set_pags = c.pagamentos;			
//			for(Pagamento pag: set_pags){
//				System.out.println(" ID: " + pag.id);				
//				System.out.println(" Valor: " + pag.valor);
//				System.out.println(" Data: " + pag.data);
//			}
			
			System.out.println("\n");			
		}
		
//		for(Cliente c: lista_clientes){
//			System.out.println("Matrícula: " + c.getMatricula());
//			System.out.println("Nome: " + c.getNome());
//			
//			System.out.println("Cachorros: ");			
//			Set<Cachorro> set_cachorros = c.getCachorros();			
//			for(Cachorro dog: set_cachorros){
//				System.out.println(" Nome: " + dog.getNome());				
//				System.out.println(" Raça: " + dog.getRaca());
//			}
//			
//			System.out.println("Pagamentos: ");			
//			Set<Pagamento> set_pags = c.getPagamentos();			
//			for(Pagamento pag: set_pags){
//				System.out.println(" ID: " + pag.getId());				
//				System.out.println(" Valor: " + pag.getValor());
//				System.out.println(" Data: " + pag.getData());
//			}
//			
//			System.out.println("\n");			
//		}
		
	}

}

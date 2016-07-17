package conf_5_2_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

public class Cliente {
	
	@Id
	public int matricula;
	
	public String nome;
	
	@Reference
//	private Set<Cachorro> cachorros;
//	private Set<Cachorro> cachorros = new HashSet<Cachorro>();
//	public Set<Cachorro> cachorros = new HashSet<Cachorro>();
	public List<Cachorro> cachorros = new ArrayList<Cachorro>();
	
	@Reference
//	private Set<Pagamento> pagamentos;
//	private Set<Pagamento> pagamentos = new HashSet<Pagamento>();
//	public Set<Pagamento> pagamentos = new HashSet<Pagamento>();
	public List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
//	public Cliente() {
//	}
	
//	public Cliente(int matricula, String nome, Set<Cachorro> cachorros, Set<Pagamento> pagamentos) {
//		this.matricula = matricula;
//		this.nome = nome;
//		
//		if(cachorros == null)
//			this.cachorros = new HashSet<Cachorro>();			
//		else
//			this.cachorros = cachorros;
//		
//		if(pagamentos == null)
//			this.pagamentos = new HashSet<Pagamento>();			
//		else
//			this.pagamentos = pagamentos;
//	}
	
//	public Cliente(int matricula, String nome) {
//		this.matricula = matricula;
//		this.nome = nome;
//	}
	
	
//	public Cliente(int matricula, String nome, Set<Cachorro> cachorros, Set<Pagamento> pagamentos) {
//		this.matricula = matricula;
//		this.nome = nome;
//		this.cachorros = cachorros;
//		this.pagamentos = pagamentos;
//	}


//
//	public void addCachorro(Cachorro cachorro) {
//		cachorros.add(cachorro);
//	}
//	
//	public void addPagamento(Pagamento pagamento) {
//		pagamentos.add(pagamento);
//	}
//	
//	
//	// Getters and setters
//
//	public int getMatricula() {
//		return matricula;
//	}
//
//	public void setMatricula(int matricula) {
//		this.matricula = matricula;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public Set<Cachorro> getCachorros() {
//		return cachorros;
//	}
//
//	public void setCachorros(Set<Cachorro> cachorros) {
//		this.cachorros = cachorros;
//	}
//
//	public Set<Pagamento> getPagamentos() {
//		return pagamentos;
//	}
//
//	public void setPagamentos(Set<Pagamento> pagamentos) {
//		this.pagamentos = pagamentos;
//	}

}

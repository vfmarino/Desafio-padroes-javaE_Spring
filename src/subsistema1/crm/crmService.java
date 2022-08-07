package subsistema1.crm;

public class crmService {
	
	private crmService() {
		super();
		//deixa o metodo privado
	}
	
	public static void gravarCliente(String nome, String Cep,String cidade, String estado) {
		System.out.println("Cliente Salvo no SISTEMA CRM");
		System.out.println(nome);
		System.out.println(Cep);
		System.out.println(cidade);
		System.out.println(estado);
	}

}

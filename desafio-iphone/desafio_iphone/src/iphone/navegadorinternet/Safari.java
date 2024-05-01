package iphone.navegadorinternet;

public class Safari implements NavegadorInternet{

	
	public void exibirPagina() {
		System.out.println("Exibindo pagina de internet");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando pagina de internet");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina de internet");
		
	}

}

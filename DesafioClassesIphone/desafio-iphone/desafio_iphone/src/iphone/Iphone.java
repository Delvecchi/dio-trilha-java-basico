package iphone;

import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.navegadorinternet.NavegadorInternet;
import iphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet , ReprodutorMusical{

	
	public void tocar() {
		System.out.println("Tocando musica via IPhone");
		
	}

	
	public void pausar() {
		System.out.println("Pausando musica via IPhone");
		
	}

	
	public void selecionarMusica() {
		System.out.println("Selecioando musica via IPhone");
		
	}

	
	public void exibirPagina() {
		System.out.println("Exibindo pagina de internet via IPhone");
		
	}

	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba de internet via IPhone");
		
	}
	public void atualizarPagina() {
		System.out.println("Atualizando pagina de internet via IPhone");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando via IPhone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação via IPhone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via IPhone");
		
	}

}

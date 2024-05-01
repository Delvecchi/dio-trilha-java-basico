package usuario;

import iphone.Iphone;
import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.navegadorinternet.NavegadorInternet;
import iphone.reprodutormusical.ReprodutorMusical;

public class Usuario {
	public static void main(String[] args) {
		AparelhoTelefonico aparelhoTelefonico = new Iphone();
		ReprodutorMusical reprodutorMusical = new Iphone();
		NavegadorInternet navegandoInternet = new Iphone();
		
		aparelhoTelefonico.ligar();
		reprodutorMusical.selecionarMusica();
		navegandoInternet.adicionarNovaAba();
	}
}

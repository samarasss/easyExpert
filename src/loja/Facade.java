package loja;

import java.util.Set;

import excecoes.StringInvalidaException;
import excecoes.ValorInvalidoException;
import jogo.Jogabilidade;
import jogo.Jogo;

public class Facade {
	
	private LojaController lojaController;
	
	public Facade(){
		
		lojaController = new LojaController();
		
	}
	
	public void vendeJogo(String jogoNome, double preco, String jogabilidades, String estiloJogo, String loginUser) throws Exception {
		
		try { lojaController.vendeJogo(jogoNome, preco, jogabilidades, estiloJogo, loginUser);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void adicionaCredito(String login, double credito) throws ValorInvalidoException {
		try {lojaController.adicionaCredito(login, credito);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void criaUsuario(String nome, String login, String tipo) throws StringInvalidaException {
		
		try {lojaController.adicionaUsuario(nome, login, tipo);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
	public double confereCredito(String login){
		try {
			return lojaController.confereCredito(login);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
			}
	
	public Jogo criaJogos(String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades, String estiloJogo){
		try {
			return lojaController.criaJogo(jogoNome, preco, tiposJogabilidades, estiloJogo);
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
		
		return null;
	}


}

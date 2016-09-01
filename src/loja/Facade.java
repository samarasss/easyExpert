package loja;

import java.util.Set;

import jogo.Jogabilidade;
import jogo.Jogo;
import usuario.Usuario;
import excecoes.StringInvalidaException;
import excecoes.ValorInvalidoException;

public class Facade {
	
	private LojaController lojaController;
	
	public Facade(){
		
		lojaController = new LojaController();
		
	}
	
	public void vendeJogo(String jogoNome, double preco, String jogabilidades, String estiloJogo, String loginUser) {
		
		try { lojaController.vendeJogo(jogoNome, preco, jogabilidades, estiloJogo, loginUser);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void adicionaCredito(String login, double credito) {
		try {lojaController.adicionaCredito(login, credito);
			
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void criaUsuario(String nome, String login, String tipo)  {
		
		try {lojaController.adicionaUsuario(nome, login, tipo);
			
		} catch (StringInvalidaException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
		
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
	
	public void registraJogada(String login, String nomeJogo, int score, boolean venceu){
		
		try {
			lojaController.registraJogada(login, nomeJogo, score, venceu);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());;
		}
	}
	
	public Usuario buscaUsuario(String login){
		
		try {
			lojaController.buscaUsuario(login);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public void upgrade(String login){
		
		try {
			lojaController.upgrade(login);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String informaçaoUsuarios(){
		
		try {
			lojaController.informacaoUsuarios();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public int getX2p(String login){
		
		try {
			 return lojaController.getX2p(login);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} return 0;
	}
}

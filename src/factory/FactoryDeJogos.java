package factory;

import java.util.Set;

import usuario.Usuario;
import excecoes.PrecoInvalidoException;
import excecoes.StringInvalidaException;
import jogo.Jogabilidade;
import jogo.Jogo;
import jogo.Luta;
import jogo.Plataforma;
import jogo.Rpg;

public class FactoryDeJogos {
	
	public Jogo criaJogoLuta(String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades, String estiloJogo) throws StringInvalidaException, PrecoInvalidoException{
		Jogo game = new Luta(jogoNome, preco, tiposJogabilidades);
		return game;
	}
	
	public Jogo criaJogoRpg(String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades, String estiloJogo) throws StringInvalidaException, PrecoInvalidoException{
		Jogo game = new Rpg(jogoNome, preco, tiposJogabilidades);
		return game;
	}
	
	public Jogo criaJogoPlataforma(String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades, String estiloJogo) throws StringInvalidaException, PrecoInvalidoException{
		Jogo game = new Plataforma(jogoNome, preco, tiposJogabilidades);
		return game;
	}
	
	public Jogo criaJogo(String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades, String estiloJogo) throws StringInvalidaException, PrecoInvalidoException{
		
		if(estiloJogo.equalsIgnoreCase("Luta")){
			
			return criaJogoLuta(jogoNome, preco, tiposJogabilidades, estiloJogo);
		}
		
		if(estiloJogo.equalsIgnoreCase("Rpg")){
		
			return criaJogoRpg(jogoNome, preco, tiposJogabilidades, estiloJogo);
		}
		
		if(estiloJogo.equalsIgnoreCase("Plataforma")){
			
			return criaJogoPlataforma(jogoNome, preco, tiposJogabilidades, estiloJogo);
		}
	
		return null;
	}

}
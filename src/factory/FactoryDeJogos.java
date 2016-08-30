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
	
	public Jogo criaJogoLuta(String nome, double preco, Set<Jogabilidade> jogabilidades) throws StringInvalidaException, PrecoInvalidoException{
		Jogo game = new Luta(nome, preco, jogabilidades);
		return game;
	}
	
	public Jogo criaJogoRpg(String nome, double preco, Set<Jogabilidade> jogabilidades) throws StringInvalidaException, PrecoInvalidoException{
		Jogo game = new Rpg(nome, preco, jogabilidades);
		return game;
	}
	
	public Jogo criaJogoPlataforma(String nome, double preco, Set<Jogabilidade> jogabilidades) throws StringInvalidaException, PrecoInvalidoException{
		Jogo game = new Plataforma(nome, preco, jogabilidades);
		return game;
	}
	
	public Jogo criaJogo(String nome, double preco, Set<Jogabilidade> jogabilidades) throws StringInvalidaException{
		if(jogabilidades.equ)){
			return criaJogoLuta(nome, preco, jogabilidades);
		}
		if(jogabilidades.equals("Rpg"))
	}

}


public Usuario criaUsuario(String nome, String login, String tipo) throws StringInvalidaException{
	if (tipo.equalsIgnoreCase("Noob")){
		return criaNoob(nome, login, tipo);
	}
	if(tipo.equalsIgnoreCase("Veterano")){
		return criaVeterano(nome, login, tipo);
	}
	return null;
	
}
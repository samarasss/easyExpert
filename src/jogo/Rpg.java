package jogo;

import java.util.Set;

import excecoes.PrecoInvalidoException;
import excecoes.StringInvalidaException;

public class Rpg extends Jogo{
	public final static int TAXA_XP2 = 10;
	
	public Rpg(String jogoNome, double preco) throws StringInvalidaException, PrecoInvalidoException {
		super(jogoNome, preco);
	}
	
	public Rpg (String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades) throws StringInvalidaException, PrecoInvalidoException {
		super(jogoNome, preco, tiposJogabilidades);
	}

	@Override
	public int registraJogada(int score, boolean venceu) {
		setVezesJogadas(getVezesJogadas()+ 1);
		if(score > this.getMaiorScore()){
			setMaiorScore(score);
		}
		if(venceu){
			setVezesConcluidas(getvezesConcluidas() + 1);
			
		}
		return TAXA_XP2;
	}
	
	public String toString() {
		String resultado = getNome() + " - RPG:" + FIM_DE_LINHA;
		resultado += super.toString();
		return resultado;
	}

}

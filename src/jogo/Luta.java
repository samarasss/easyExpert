package jogo;

import java.util.Set;

import excecoes.PrecoInvalidoException;
import excecoes.StringInvalidaException;

public class Luta extends Jogo{

	public Luta(String jogoNome, double preco) throws StringInvalidaException, PrecoInvalidoException {
		super(jogoNome, preco);
	}
	
	public Luta (String jogoNome, double preco, Set<Jogabilidade> tiposJogabilidades) throws StringInvalidaException, PrecoInvalidoException {
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
		return score/1000;
	}
	
	public String toString() {
		String resultado = getNome() + " - Luta:" + FIM_DE_LINHA;
		resultado += super.toString();
		return resultado;
	}
}

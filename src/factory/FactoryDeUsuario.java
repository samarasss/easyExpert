package factory;

import excecoes.StringInvalidaException;
import usuario.Noob;
import usuario.Usuario;
import usuario.Veterano;

public class FactoryDeUsuario {
	

	
	public Usuario criaNoob(String nome, String login, String tipo) throws StringInvalidaException{
		Noob user = new Noob(nome, login);
		return user;
	}

	public Usuario criaVeterano(String nome, String login, String tipo) throws StringInvalidaException{
		Veterano user = new Veterano(nome, login);
		return user;
		
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
}

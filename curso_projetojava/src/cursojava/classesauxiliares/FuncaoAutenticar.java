package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticar {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autentitar() {
		return permitirAcesso.autenticar();
	}	
	
	public FuncaoAutenticar(PermitirAcesso acesso) {
		this.permitirAcesso = acesso ;
	}
	
	
}

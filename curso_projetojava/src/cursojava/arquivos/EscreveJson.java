package cursojava.arquivos;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class EscreveJson {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("23424234234");
		usuario1.setLogin("Bruno");
		usuario1.setSenha("1234124");
		usuario1.setNome("Bruno Fernandes");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("11111");
		usuario2.setLogin("nome1");
		usuario2.setSenha("1234ase124");
		usuario2.setNome("Outra nome");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		String jsonUser = new Gson().toJson(usuarios);
		
		System.out.println(jsonUser);


	}

}

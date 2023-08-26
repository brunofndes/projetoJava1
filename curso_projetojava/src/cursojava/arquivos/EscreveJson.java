package cursojava.arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJson {

	public static void main(String[] args) throws IOException {
		
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
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\bruno\\git\\repository\\curso_projetojava\\src\\cursojava\\arquivos\\filejson.json");

		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		/********************************************LEITURA DE JSON***********************/
		
		FileReader fileReader = new FileReader("C:\\Users\\bruno\\git\\repository\\curso_projetojava\\src\\cursojava\\arquivos\\filejson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> usuarioList = new ArrayList<Usuario>();	
		
		for (JsonElement jsonElement : jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			usuarioList.add(usuario);
			
		}
		
		System.out.println("Leitura do arquivo JSON "+ usuarioList);
	}

}

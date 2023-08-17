package cursojava.executavel;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "bruno., fernandes., alves., de., andrade., 27.,07.,1995";
		
		String[] arrayTexto = texto.split(",");
		
		
		
		for(int pos = 0; pos < arrayTexto.length; pos++) {
			System.out.println("Pedaço do array: " + arrayTexto[pos]);
		}
		

	}

}

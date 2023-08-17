package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 60;
		
		notas[1][0] = 55;
		notas[1][1] = 65;
		notas[1][2] = 75;
				
		
		for(int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("===============================================");
			
			for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println("Valor da matriz" + "[" + poslinha + "]" + "[" + poscoluna + "]: "
						+ notas[poslinha][poscoluna]);
			}
			
		}
		
		

	}

}

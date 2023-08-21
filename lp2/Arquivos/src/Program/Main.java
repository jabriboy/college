package Program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// manipulação de arquivo com FILE e SCANNER
		
		File arquivo = new File("C:\\Users\\jabri\\Documents\\faculdade\\lp2\\Arquivos\\src\\Files\\arquivo1");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch(IOException e){
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
		
		

	}

}

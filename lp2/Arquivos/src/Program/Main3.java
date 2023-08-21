package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		// manipulando arquivo com BUFFEREDREADER e FILEREADER
		
		String path = "C:\\Users\\jabri\\Documents\\faculdade\\lp2\\Arquivos\\src\\Files\\arquivo1";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path));){
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}

	}

}

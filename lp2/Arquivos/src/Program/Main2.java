package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		// manipulando arquivo com BUFFEREDREADER e FILEREADER
		
		String path = "C:\\Users\\jabri\\Documents\\faculdade\\lp2\\Arquivos\\src\\Files\\arquivo1";
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}

package Project;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira o nome do departamento: ");
		String dep = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Nivel: ");
		String nivel = sc.nextLine();
		
		System.out.println("Salário Base: ");
		Double salarioBase = sc.nextDouble();
		
		System.out.println("quantos contratos para este trabalhador?");
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			
		}
		
	}

}

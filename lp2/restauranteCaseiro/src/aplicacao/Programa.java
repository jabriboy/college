package aplicacao;

import entidades.RestauranteCaseiro;

public class Programa {

	public static void main(String[] args) {
		RestauranteCaseiro restaurante = new RestauranteCaseiro();
		
		double total;
		
		restaurante.setMesa(1);
		
		restaurante.addCerveja(5);
		restaurante.addRefrigerente(2);
		restaurante.addSobremesa(1);
		restaurante.addPessoa(2);
		restaurante.addKg(529);
		restaurante.addKg(340);
		
		restaurante.calcTotal();
		
		total = restaurante.totalPessoas();
		System.out.println(total);
	}

}

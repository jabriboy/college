package colections;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("mateus");
		list.add("alex");
		list.add("gabriel");
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}

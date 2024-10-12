package Entities;

import java.util.Random;

public class Cheap {
	Random rand = new Random();
	
	public Lista cheap = new Lista();
	
	
	public void addCards(int num) {
		
		for(int i =0;i<num;i++) {
			this.cheap.addElemento(rand.nextInt(200));
		}
	}
	
	
	

}

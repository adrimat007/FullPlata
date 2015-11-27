import acm.graphics.*;

public class Sombrero extends GCompound {

	public Sombrero() {		
		
		GRect rectangulo1 = new GRect(300, 100);
		GRect rectangulo2 = new GRect(400, 10);
		
		add(rectangulo1, 100, 50);
		add(rectangulo2, 50, 150);
		
	}
	
}

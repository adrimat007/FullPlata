import acm.graphics.*;

public class Cara extends GCompound {

	public Cara(){
		GRect cuadrado = new GRect(120,100);
		GOval circulo = new GOval(40,40);
		GOval circulo2 = new GOval(40,40);
		GRect rectangulo = new GRect(60,20);
		
		add(cuadrado);
		add(circulo, 70, 10);
		add(circulo2, 10, 10);
		add(rectangulo, 30, 70);

	}

}

import acm.graphics.*;

public class Cara extends acm.program.GraphicsProgram {

	GRect cuadrado;
	GOval circulo;
	GOval circulo2;
	GRect rectangulo;
public void run(){
	cuadrado = new GRect (120,100);
	add(cuadrado);
	circulo=new GOval (40,40);
	add(circulo, 70, 10);
	circulo2=new GOval(40,40);
	add(circulo2, 10, 10);
	rectangulo=new GRect(60,20);
	add(rectangulo, 30, 70);
	
	
}
	
}

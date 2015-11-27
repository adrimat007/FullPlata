import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.graphics.*;


public class Torso  extends GraphicsProgram{
		
	GRect rectangulo;
	GRect brazos;
	GRect brazos2;
	GRect tronco;

	public void init(){
		setSize(800,600);
		
	}
	
	


	public void run(){
		rectangulo = new GRect (400,400);
		brazos = new GRect (100,450);
		brazos2 = new GRect (100,450);
		tronco = new GRect (100,20);
		
		add(rectangulo,400/2 , 200/2);
		add (brazos,100,100);
		add (brazos2,600,100);
		add(tronco,350,80);

	}

}
;
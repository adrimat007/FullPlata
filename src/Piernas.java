import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Piernas extends GraphicsProgram {

	
	
	GRect pierna1;
	GRect pierna2;
	GRect pie1;
	GRect pie2;
	
	public void init(){
		
		setSize(800, 600);
	}
	
	public void run(){
		
		pierna1 = new GRect(200, 400);
		pierna2 = new GRect(200, 400);
		pie1 = new GRect(250, 200);
		pie2 = new GRect(250, 200);
		
		add(pierna1, 100, 0);
		add(pierna2, 300, 0);
		add(pie1, 50, 400);
		add(pie2, 300, 400);
		
	}
	
}

import acm.graphics.*;

public class Torso extends GCompound{
		
	public Torso(){
		
		GRect rectangulo = new GRect (400,400);
		GRect brazos = new GRect (100,450);
		GRect brazos2 = new GRect (100,450);
		GRect tronco = new GRect (100,20);
		
		add(rectangulo,400/2 , 200/2);
		add (brazos,100,100);
		add (brazos2,600,100);
		add(tronco,350,80);

	}

}
;
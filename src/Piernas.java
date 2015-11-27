import acm.graphics.*;

public class Piernas extends GCompound {

	public Piernas(){

		GRect pierna1 = new GRect(200, 400);
		GRect pierna2 = new GRect(200, 400);
		GRect pie1 = new GRect(250, 200);
		GRect pie2 = new GRect(250, 200);

		add(pierna1, 100, 0);
		add(pierna2, 300, 0);
		add(pie1, 50, 400);
		add(pie2, 300, 400);

	}

}

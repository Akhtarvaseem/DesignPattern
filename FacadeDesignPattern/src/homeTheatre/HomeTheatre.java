package homeTheatre;

import ourWorkSpace.RoomLight;
import ourWorkSpace.Sound;
import ourWorkSpace.Tv;

public class HomeTheatre {

	RoomLight light=new RoomLight();
	Sound sound=new Sound();
	Tv tv=new Tv();
	
	
	public void onTheatre() {
		light.turnOffLight();
		sound.turnOnValume();
		tv.getTvOn();
	}
	
	
	public void offTheathre() {
		light.turnOnLight();
		sound.turnOffValume();
		tv.getOffTv();
	}
}

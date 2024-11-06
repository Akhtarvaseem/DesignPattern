package baseDesignForCar.engine;

import baseDesignForCar.Engine;

public class Petrol implements Engine{

	@Override
	public void getPower() {
		
		System.out.println("High power consuming ");
	}

	@Override
	public void getMilese() {
	
		System.out.println("Milese is not good for electric comparesion");
	}

}

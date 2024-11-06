package baseDesignForCar.company;

import baseDesignForCar.Car;
import baseDesignForCar.Engine;

public class BMW implements Car{
	
	Engine engine;
	
	public BMW(Engine engine) {
		this.engine=engine;
	}

	@Override
	public void getPrices() {
		System.out.println("car price is: "+3.5+" cr");
		engine.getMilese();
		engine.getPower();
	}

	@Override
	public void getColor() {
		
		System.out.println("color white..");
		
	}

	@Override
	public void getDescription() {
		System.out.println("write some description ...");
	}

}

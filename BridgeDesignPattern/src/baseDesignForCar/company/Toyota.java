package baseDesignForCar.company;

import baseDesignForCar.Car;
import baseDesignForCar.Engine;

public class Toyota implements Car{
	
	Engine engine;
	public Toyota(Engine engine) {
		this.engine=engine;
	}
	
	

	@Override
	public void getPrices() {
	
		System.out.println("car price is: "+4.5+" cr");
	}

	@Override
	public void getColor() {
	
		System.out.println("color is black");
	}

	@Override
	public void getDescription() {
		
		System.out.println("write some description ");
	}

}

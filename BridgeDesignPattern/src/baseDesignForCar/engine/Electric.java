package baseDesignForCar.engine;

import baseDesignForCar.Engine;

public class Electric implements Engine{

	@Override
	public void getPower() {
	
		System.out.println("Low power ");
		
	}

	@Override
	public void getMilese() {
	System.out.println("good milese");
	}

}

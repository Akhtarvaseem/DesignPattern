package mainClient;

import baseDesignForCar.Car;
import baseDesignForCar.Engine;
import baseDesignForCar.company.BMW;
import baseDesignForCar.company.Toyota;
import baseDesignForCar.engine.Electric;
import baseDesignForCar.engine.Petrol;

public class Test {


	
	public static void main(String[] args) {
		Engine engine=new Petrol();
		Car car1=new BMW(engine);
		
		car1.getPrices();
		
		
		Engine engine2=new Electric();
		Car car2=new Toyota(engine2);
		car2.getPrices();
	}
}

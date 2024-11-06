package mainClient;

import myDecorator.DecoratorPizza;
import myDecorator.ExtraCheese;
import myDecorator.ExtraCorn;
import myShop.BasicPrice;
import myShop.Pizza;

public class Test {

	
	public static void main(String[] args) {
		
		Pizza pizza=new BasicPrice();
		
		System.out.println("Basic pizza price is:  "+pizza.getPrice());
		
		pizza=new DecoratorPizza(new ExtraCheese(new ExtraCorn(pizza)));
		
		System.out.println("after adding some extra things then price increse :"+pizza.getPrice());
	}
}

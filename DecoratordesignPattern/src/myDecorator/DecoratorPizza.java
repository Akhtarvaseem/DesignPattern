package myDecorator;

import myShop.BasicPrice;
import myShop.Pizza;

public class DecoratorPizza implements Pizza{

	
     Pizza pizza;
     
     public DecoratorPizza( Pizza pizza) {
    	 this.pizza=pizza;
	}
	
	@Override
	public int getPrice() {
		return pizza.getPrice();
			
	}

}

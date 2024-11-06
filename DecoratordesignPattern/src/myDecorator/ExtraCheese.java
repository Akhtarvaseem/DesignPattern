package myDecorator;

import myShop.Pizza;

public class ExtraCheese extends DecoratorPizza{

	public ExtraCheese(Pizza pizza) {
		super(pizza);
	}

	
	@Override
	public int getPrice() {
		return super.getPrice()+20;
	}
	
}

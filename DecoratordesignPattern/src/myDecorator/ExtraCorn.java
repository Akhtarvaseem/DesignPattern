package myDecorator;

import myShop.Pizza;

public class ExtraCorn extends DecoratorPizza{

	public ExtraCorn(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int getPrice() {
	
		return super.getPrice()+50;
	}

}

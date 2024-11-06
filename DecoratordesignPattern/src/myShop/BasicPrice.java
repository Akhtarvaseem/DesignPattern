package myShop;

public class BasicPrice implements Pizza{

	int price=200;
	
	@Override
	public int getPrice() {
		return price;
	}

}

package myImplementationForApple;

public class Iphone13 {
	
	IphoneCharger charger;

	public Iphone13(IphoneCharger charger) {
	this.charger=charger;
	charger.getCharger();
	}
	
	
//	public void getIphoneCharger() {	
//		System.out.println("connected to Iphone charger ..");
//		charger.getCharger();
//	}
//	
	
 public	 void iPhonePhonecharged() {
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		 System.out.println("iPhone charged successfull...");
	 }
	
}

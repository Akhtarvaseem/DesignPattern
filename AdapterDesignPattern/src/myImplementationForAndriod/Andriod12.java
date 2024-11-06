package myImplementationForAndriod;

public class Andriod12 {

	AndroidCharger androidCharger;
	
	public Andriod12(AndroidCharger androidCharger) {
	this.androidCharger=androidCharger;
	
	androidCharger.getCharger();
		
	}
	
	
	
	public void andriodCharged() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("successfully charged your andriod phone...");
	}
}

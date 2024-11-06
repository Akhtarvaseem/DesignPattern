package mainMethod;

import myImplementationForAdapter.AdapterCharger;
import myImplementationForAndriod.Andriod12;
import myImplementationForAndriod.AndroidCharger;
import myImplementationForAndriod.MiCharger;
import myImplementationForApple.Company1Charger;
import myImplementationForApple.Iphone13;
import myImplementationForApple.IphoneCharger;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("start...");
		// Iphone with their won charger 
		
		/*IphoneCharger charger=new Company1Charger();
		Iphone13 iphone=new Iphone13(charger);
		iphone.iPhonePhonecharged();*/
		
		
		// Android with won charger
		
		/*
		AndroidCharger androidCharger=new MiCharger();
		Andriod12 andriod=new Andriod12(androidCharger);
		andriod.andriodCharged();
		*/
		
		
		
		// iPhone with android charger 
		AndroidCharger androidCharger=new MiCharger();
		IphoneCharger charger=new AdapterCharger(androidCharger);
		Iphone13 iphone13=new Iphone13(charger);
		iphone13.iPhonePhonecharged();
	}
}

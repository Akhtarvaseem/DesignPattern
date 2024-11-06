package myImplementationForAdapter;

import myImplementationForAndriod.AndroidCharger;
import myImplementationForApple.IphoneCharger;

public class AdapterCharger implements IphoneCharger {

	AndroidCharger androidCharger;

	public AdapterCharger(AndroidCharger androidCharger) {
		this.androidCharger=androidCharger;
	}

	@Override
	public void getCharger() {
		androidCharger.getCharger();
	}

}

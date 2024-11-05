package oprationOnModel;

public class Mangager implements Employee{

	@Override
	public int salary() {

		return 50000;
	}

	@Override
	public String name() {
	
		return "Manager of this company";
	}

}

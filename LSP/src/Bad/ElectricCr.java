package Bad;

public class ElectricCr implements Car {

	@Override
	public String maxSpped() {
		// TODO Auto-generated method stub
		return "400";
	}

	@Override
	public String oilCapacity() {
		// no tank
		return "Error";
	}

	@Override
	public String pistonSize() {
		//has a motor
		return "Error";
	}

}

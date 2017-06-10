//Concrete Adaptee
public class EnemyTank implements EnemyAttackerInterface{

	@Override
	public void driveForward() {
		System.out.println("Tank has driven forward");
		
	}

	@Override
	public void fireWeapon() {
		System.out.println("Tank has fired Weapon");
		
	}

	@Override
	public void assignDriver(String driver) {
		
		System.out.println(driver + " is driving the tank");
	}
	
	

}

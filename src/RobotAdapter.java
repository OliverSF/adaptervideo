
public class RobotAdapter implements EnemyAttackerInterface{
	
	private EnemyRobot rob;
	
	public RobotAdapter(EnemyRobot robo){
		
		this.rob = robo;
	}
	@Override
	public void driveForward() {

		rob.walk();
		
	}

	@Override
	public void fireWeapon() {

		rob.smashWithHands();
		
	}

	@Override
	public void assignDriver(String driver) {
		
		rob.reactToHuman(driver);
		
	}
	
	

}

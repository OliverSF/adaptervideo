
public class EnemyMain {

	public static void main(String[] args) {

		EnemyTank tanky = new EnemyTank();
		
		tanky.assignDriver("Mark");
		tanky.driveForward();
		tanky.fireWeapon();
		
		EnemyRobot robot = new EnemyRobot();
		EnemyAttackerInterface robbo = new RobotAdapter(robot);
				
		
		robbo.driveForward();
		robbo.fireWeapon();
		robbo.assignDriver("Mark");

	}

}

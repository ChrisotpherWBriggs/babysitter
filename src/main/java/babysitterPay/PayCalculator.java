package babysitterPay;

public class PayCalculator {
	 //Variable Declarations
	static int regHours;
	static int bedHours;
	static int overHours;
	
	static int regRate = 12;
	static int bedRate = 8;
	static int overRate = 16;
	
	int startTime;
	int endTime;
	
	//Methods
	
	//regular hours calculation
	
	public static int regHoursCalc(int startTime, int endTime) {
		int x;
		
		if (endTime >= 21 || endTime < 5) {
			x = 4;
		}else if(endTime >= 21) {
			x = 4;
		}else {
			x = endTime - startTime;
		}
		
		return regHours = x;
	}
	
	//bedtime hours calculation
	
	public static int bedHoursCalc(int endTime) {
		int y;
		
		if(endTime < 5 ) {
			y = 3;
		}else if (endTime > 21){
			y = endTime - 21;
		}else {
			y = 0;
		}
		return bedHours = y;
	}
	
	//overnight hours calculation
	
	public static int overHoursCalc(int endTime) {
		int z;
		
		if (endTime <= 4) {
			z = endTime;
		}else {
			z = 0;
		}
		return overHours = z;
	}
	
	//Calculate Pay
	public static int payCalc(int regHours, int bedHours, int overHours) {
		
		return ((regHours * regRate) + (bedHours * bedRate) + (overHours * overRate));
		
	}
}

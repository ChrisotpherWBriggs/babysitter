package babysitterPay;

import java.util.Scanner;

public class application {
	public static void main(String[] args) {
		Scanner start = new Scanner(System.in);
		System.out.println("Enter your start hour in 24 hour format (I.E. 17 for 5 pm)");
		int startTime = start.nextInt();
		
		Scanner end = new Scanner(System.in);
		System.out.println("Enter your end hour in 24 hour format (I.E. 23 for 11pm)");
		int endTime = end.nextInt();
		
		int regHours = PayCalculator.regHoursCalc(startTime, endTime);
		int bedHours = PayCalculator.bedHoursCalc(endTime);
		int overHours = PayCalculator.overHoursCalc(endTime);
		
		
		int pay = PayCalculator.payCalc(regHours, bedHours, overHours);
		
		
		System.out.println("Your total hours worked is " + (regHours + bedHours + overHours) + " and your total pay for the night comes to $" + pay);
	}
}

package oop.polymorphism;

public class MeasureLand {

	public static void main(String[] args) {
		LandCalculator cal1 = new LandCalculator();
		int resultOfTwoPoint = cal1.areaOfLand(15, 20);
		System.out.println(resultOfTwoPoint);
		int resultOfThreePoint = cal1.areaOfLand(10, 20, 30);
		System.out.println(resultOfThreePoint);
		int resultOfFourPoint = cal1.areaOfLand(10, 30, 60, 90);
		System.out.println(resultOfThreePoint);
		
		ModernCalc cal2 = new ModernCalc();
		int newresult = cal2.areaOfLand(20, 30);
		System.out.println(newresult);
		
		

	}

}

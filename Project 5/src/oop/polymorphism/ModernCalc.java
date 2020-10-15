package oop.polymorphism;

public class ModernCalc extends LandCalculator {
	
	public int areaOfLand(int pointA, int pointB) {
		int total = pointA + pointB + 1;
		return total;
	}

}

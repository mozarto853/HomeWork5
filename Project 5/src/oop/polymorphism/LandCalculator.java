package oop.polymorphism;

public class LandCalculator {
	
	public int areaOfLand(int pointA, int pointB) {
		int total = pointA + pointB;
		return total;
	}
	
	public int areaOfLand(int pointA, int pointB, int pointC) {
		int total = pointA + pointB + pointC;
		return total;
	}
	
	public int areaOfLand(int pointA, int pointB, int pointC, int pointD) {
		int total = pointA + pointB + pointC + pointD;
		return total;
	}
	
	public int areaOfLand(String pointName, int pointB) {
		System.out.println(pointName);
		int total = pointB;
		return total;
	}

		
	

}

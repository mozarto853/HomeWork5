package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.carShape();
		car.start();
		car.stop();
		
		System.out.println("..........Below are bmw car model......");
		Car series7 = new BMW();
		series7.carShape();
		series7.start();
		series7.stop();

	}

}

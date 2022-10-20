package oopconcepts;

public class Car2 {
	private String make;
	int speed;
	int gear;
	
	public Car2() {
		this(10, 2);
		this.speed = 120;
		this.gear = 8;
		System.out.println("Ejecutando constructor sin argumentos");
	}
	
	public Car2(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Ejecutando constructor con argumentos");
	}
	
	// "this" refers to the instance of the class (object)
	public void setMake(String make) {//Set -> establecer
		this.make = make;
	}
	
	public String getMake() {//Get -> obtener
		return make;
	}

}

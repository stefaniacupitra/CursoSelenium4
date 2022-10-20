package oopconcepts;

public class Car {
	// color
	private String color;
	// make
	private String make;
	// model
	private String model;
	// year
	private int year;
	

	public void increaseSpeed() {
		System.out.println("Aumentando la velocidad");
	}
	
	public String getMake() { //Get -> obtener
		return this.make;
	}
	
	public void setMake(String make) {//Set -> establecer
		this.make = make;
	}

	public String getColor() { //Get -> obtener
		return color;
	}

	public void setColor(String color) {//Set -> establecer
		this.color = color;
	}

	public String getModel() { //Get -> obtener
		return model;
	}

	public void setModel(String model) {//Set -> establecer
		this.model = model;
	}

	public int getYear() { //Get -> obtener
		return year;
	}

	public void setYear(int year) {//Set -> establecer
		if (year > 1900) {
			this.year = year;
		} else {
			System.out.println("Este año no es válido");
		}
	}

}

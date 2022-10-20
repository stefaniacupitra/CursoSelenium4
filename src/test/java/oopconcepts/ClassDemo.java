package oopconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		Car bmw = new Car(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println("Marca de BMW es: " + bmw.getMake());
		
		System.out.println("El modelo de BMW es: " + bmw.getModel());
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println("Marca de Benz es: " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("El modelo de Benz es: " + benz.getModel());
		
		benz.setYear(1800);
		System.out.println("El año de Benz es: " + benz.getYear());
	}

}

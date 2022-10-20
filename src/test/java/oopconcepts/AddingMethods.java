package oopconcepts;

public class AddingMethods {
	
	public static void main(String[] args) {
		findGrades("Cleopatra", 95);
		findGrades("Nefertiti", 85);
		findGrades("Lazy Golondrina", 75);
		findGrades("Manchas", 65);
	}
	
	public static void findGrades(String studentName, int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("Grado de " + studentName + " es: " + grade);
	}

}

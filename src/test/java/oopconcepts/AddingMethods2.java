package oopconcepts;

public class AddingMethods2 {
	
	public static void main(String[] args) {
		String grade;
		String studentName;
		
		studentName = "Cleopatra";
		grade = findGrades(95);
		displayGrades(studentName, grade);
		
		studentName = "Nefertiti";
		grade = findGrades(85);
		displayGrades(studentName, grade);
		
		studentName = "Lazy Golondrina";
		grade = findGrades(75);
		displayGrades(studentName, grade);
		
		studentName = "Manchas";
		grade = findGrades(65);
		displayGrades(studentName, grade);
	}
	
	public static String findGrades(int score) {
		String grades;
		if (score >= 90 && score <= 100) {
			grades = "A";
		} else if (score >= 80 && score < 90) {
			grades = "B";
		} else if (score >= 70 && score < 80) {
			grades = "C";
		} else {
			grades = "D";
		}
		return grades;
	}
	
	public static void displayGrades(String studentName, String grade) {
		System.out.println("*******************************");
		System.out.println("Grado de " + studentName + " es: " + grade);
		System.out.println("*******************************");
	}

}

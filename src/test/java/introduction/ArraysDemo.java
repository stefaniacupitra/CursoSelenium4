package introduction;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] myIntArray1 = { 100, 90, 80, 70 };
		/*
		 * myIntArray1 = new int[10];
		 * 
		 * myIntArray1[0] = 100; myIntArray1[1] = 90;
		 */

		System.out.println("0 índice: " + myIntArray1[0]);
		System.out.println("1er índice: " + myIntArray1[1]);
		// System.out.println("2do índice: " + myIntArray1[2]);

		String[] myStringArray1 = { "Stefania", "Cleopatra", "Nefertiti", "Lazy Golondrina", "Manchas" };
		System.out.println("0 índice: " + myStringArray1[0]);
		System.out.println("1er índice: " + myStringArray1[1]);
		System.out.println("2do índice: " + myStringArray1[2]);
		System.out.println("3er índice: " + myStringArray1[3]);
		System.out.println("4to índice: " + myStringArray1[4]);

		int len1 = myIntArray1.length;
		int len2 = myStringArray1.length;

		System.out.println("Longitud de matriz interna: " + len1);
		System.out.println("Longitud de la matriz de cadenas: " + len2);

		for (int i = 0; i < len1; i++) {
			System.out.println(myIntArray1[i]);
		}

		Arrays.sort(myIntArray1);

		for (int i = 0; i < len1; i++) {
			System.out.println(myIntArray1[i]);
		}

		// System.arraycopy(src, srcPos, dest, destPos, length);

		for (int i = 0; i < len2; i++) {
			System.out.println(myStringArray1[i]);
		}

	}

}

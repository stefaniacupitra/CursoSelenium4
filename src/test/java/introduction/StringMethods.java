package introduction;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Esta es la cadena de prueba";
		
		String str1 = "Hola";
		String str2 = "Hola";
		String str3 = "Bienvenida";
		String str4 = "";
		String str5 = "            Espacios por todas partes     ";
		String str6 = "Hola";
		
		System.out.println("La longitud de la cadena es: " + str.length());
		System.out.println("El carácter en el índice 2 es: " + str.charAt(2));
		System.out.println(str.concat(" Esta es la cadena adjunta"));
		System.out.println("Contiene 1: " + str.contains("es"));
		System.out.println("Contiene 2: " + str.contains("si"));
		System.out.println("Comienza con 1: " + str.startsWith("Esta"));
		System.out.println("Comienza con 2: " + str.startsWith("es"));
		System.out.println("Termina con 1: " + str.endsWith("prueba"));
		System.out.println("Termina con 2: " + str.endsWith("es"));
		System.out.println("Compruebe que los contenidos son iguales: " + str1.equals(str2));
		System.out.println("Compruebe que los contenidos son iguales: " + str1.equals(str3));		
		System.out.println("El índice de 't' es: " + str.indexOf('t'));
		System.out.println("Comprobar si la cadena está vacía 1: " + str.isEmpty());
		System.out.println("Comprobar si la cadena está vacía 2: " + str4.isEmpty());
		System.out.println("Recorte los espacios iniciales y finales: " + str5.trim());
		System.out.println("Ejemplo de reemplazo: " + str6.replace('o', 'a'));
		
		System.out.println("Subcadena Ejemplo 1: " + str.substring(11));
		System.out.println("Subcadena Ejemplo 2: " + str.substring(21, 27));
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Índice " + i + " es: " + charArray[i]);
		}
		
		System.out.println("Minúscula: " + str.toLowerCase());
		System.out.println("Mayúsculas: " + str.toUpperCase());
	}

}

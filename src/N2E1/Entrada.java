package N2E1;

import java.util.Scanner;

public class Entrada {
	private static Scanner entrada = new Scanner(System.in);




	public static byte llegirByte (String missatge) {
		boolean seguir = false;
		byte num = 0;

		System.out.println(missatge);

		do {
			seguir = false;
			try {

				num = entrada.nextByte();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error de format");
				seguir = true;
				entrada.next();
			}
		} while (seguir);
		return num;
	}

	public static int llegirInt (String missatge) {
		boolean seguir = false;
		int num = 0;

		System.out.println(missatge);

		do {
			seguir = false;
			try {
				num = entrada.nextByte();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error de format");
				seguir = true;
				entrada.next();
			}
		} while (seguir);
		return num;
	}

	public static float llegirFloat (String missatge) {
		boolean seguir = false;
		float num = 0;

		System.out.println(missatge);

		do {
			seguir = false;
			try {
				num = entrada.nextFloat();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error de format");
				seguir = true;
				entrada.next();
			}
		} while (seguir);
		return num;
	}

	public static double llegirDouble (String missatge) {
		boolean seguir = true;
		double num = 0;

		System.out.println(missatge);

		do {
			
			try {
				num = 0;
				num = entrada.nextDouble();
				seguir = false;
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error de format");
				entrada.next();
			}
		} while (seguir);
		return num;
	}




	//Exception



	public static char llegirChar(String missatge) {
		boolean seguir = false;
		String car;
		char caracter = ' ';

		System.out.println(missatge);

		do {
			
			try {
				seguir = false;
				car = entrada.next();
				if (car.length()==1) {
					caracter = car.charAt(0);
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.err.println("Error de format");
				seguir = true;
			} 
		} while (seguir);

		return caracter;
	}




	public static String llegirString(String missatge) {
		String str = "";
		boolean seguir = false;
		int i = 0;

		System.out.println(missatge);

		do {
			seguir = false;
			try {
				str = entrada.next();//estic fart del buffer
				while (i<str.length()) {
					if (Character.isDigit(str.charAt(i))){
						throw new Exception();
					}
					i++;
				}
			} catch (Exception e) {
				System.err.println("Error de format");
				seguir = true;
			}
		} while (seguir);


		return str;

	}


	public static boolean llegirSiNo(String missatge) {
		boolean si = true, seguir = false;
		String no;

		System.out.println(missatge);

		do {
			try {
				no = entrada.next();
				if (no.equalsIgnoreCase("n")) {
					si = false;
				} else if (!no.equalsIgnoreCase("s")) {
					throw new Exception();
				} 
				seguir = false;
			} catch (Exception e) {
				System.err.println("Error de format");
				seguir = true;
			}
		} while (seguir);



		return si;
	}











}






































import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String solution = "";
		int code = ThreadLocalRandom.current().nextInt(1111, 8888 + 1);
		solution += code;
		String devine = "0";
		int essai = 5;
		System.out.println("\nWelcome to MASTERVOX !");
		System.out.println("\nDevinez le nombre mystère. Il est de 4 chiffres, compris entre 1111 et 8888");
		System.out.println("\nV : Chiffre valide et placé au bon endroit");
		System.out.println("O : Chiffre valide mais pas à la bonne place");
		System.out.println("X : Chiffre inexistant");

		while (!devine.equals(solution) && essai > 0) {

			System.out.println("\nNombre d'essai restant : " + essai);
			System.out.println("Entrez un nombre : ");
			devine = sc.nextLine();

			if (devine.length() == 4) {

//				System.out.println("(SOLUTION)=>" + solution
//						+ ",\nVous avez mis : " + devine + ".");
				int bon = 0;
				int mauvais = 0;

				for (int i = 0; i <= 3; i++) {

					if (devine.charAt(i) == solution.charAt(i)) {
						bon++;
						System.out.print("V");
					} else {
						if (isIn(solution, devine.charAt(i))) {
							++mauvais;
							System.out.print("O");
						} else {
							System.out.print("X");
						}
					}

				}

				essai--;
			}

			else {
				System.out.print("Il faut un chiffre de 4");
			}

		}
		if (devine.equals(solution)) {
			System.out.print("\nBRAVO ! Vous êtes le grand vainqueur du MASTERVOOOOOXXXX !");
		} else {
			System.out.print("\nHo non ! PERDU ! Le chiffre était " + solution);
		}
		// System.out.println("\nnombre de bon : " + bon);
		// System.out.println("\nn'est pas dans l'ordre : " + mauvais);
		// System.out.println("bon save : " + bon_save);

	}

	private static boolean isIn(String str, char car) { // fonction qui te retourne true si le carac est dans la string
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == car) {
				return true;
			}
		}
		return false;
	}
}

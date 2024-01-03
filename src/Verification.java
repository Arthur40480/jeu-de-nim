import java.util.Scanner;
import java.util.ArrayList;

public class Verification {
	// Méthode qui viens vérifier la saisie du joueur pour le menu :
	public static int verifyUserChoice(Scanner scanner, ArrayList<String> optionsMenu) {
		int userChoice;
		while(true) {
			if(scanner.hasNextInt()) {
				userChoice = scanner.nextInt();
				if( userChoice < 1 || userChoice > optionsMenu.size()) {
					System.out.println("Veuillez saisir un choix correct (1 - " + optionsMenu.size() + ") :");
				}else {
					break;
				}
			} else {
				System.out.println("Veuillez saisir un choix correct (1 - " + optionsMenu.size() + ") :");
				scanner.next();
			}
		}
		return userChoice;
	}
}

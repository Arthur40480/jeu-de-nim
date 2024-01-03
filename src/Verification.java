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
					break; // On sort de la boucle while
				}
			} else {
				System.out.println("Veuillez saisir un choix correct (1 - " + optionsMenu.size() + ") :");
				scanner.next();
			}
		}
		return userChoice;
	}
	// Méthode qui viens vérifier la saisie du joueur pour savoir quel joueur vas jouer en premier :
	public static int verifyWhoPlayFirst(Scanner scanner) {
		int userChoice;
		while(true) {
			if(scanner.hasNextInt()) {
				userChoice = scanner.nextInt();
				if( userChoice < 1 || userChoice > 2) {
					System.out.println("Veuillez saisir un choix correct (1 - 2) :");
				}else {
					break; // On sort de la boucle while
				}
			} else {
				System.out.println("Veuillez saisir un choix correct (1 - 2) :");
				scanner.next();
			}
		}
		return userChoice;
	}
	
	// Méthode qui viens vérifier la saisie du joueur pour savoir combien d'allumettes il y à a soustraire :
	public static int verifyNumberMatchesToSubstract(Scanner scanner, int pileMatches) {
		int userChoice;
		while(true) {
			if(scanner.hasNextInt()) {
				userChoice = scanner.nextInt();
				// Si il reste plus de 4 allumettes :
				if(pileMatches > 4) {
					if(userChoice < 1 || userChoice > 4) {
						System.out.println("Veuillez saisir un choix correct (1 - 4) :");
					}else {
						break;
					}
				// Si il reste 4 allumettes ou moins :
				}else {
					if(userChoice < 1 || userChoice > pileMatches) {
						System.out.println("Veuillez saisir un choix correct (1 - " + pileMatches + ")");
					}else {
						break;
					}
				}
			}else {
				System.out.println("Veuillez saisir un choix correct (1 - 4) :");
				scanner.next();
			}
		}
		return userChoice;
	}
}

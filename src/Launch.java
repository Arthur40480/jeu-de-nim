import java.util.Scanner;

public class Launch {
	// Méthode qui lance le jeu de Nim en Joueur contre Joueur :
	public static void playerVsPlayer(String[] playerList, int firstPlayerIndex, int secondPlayerIndex, Scanner scanner) {
		int pileMatches = 21;
		int matchToSubstract;
		System.out.println("------- DEBUT DE LA PARTIE ------- ");
		System.out.println("C'est le joueur : " + playerList[firstPlayerIndex - 1] + " qui commence !");
		System.out.println("----------------------------------");
		
		while(true) {
			System.out.println("***!*** ALLUMETTE RESTANTE : " + pileMatches +  " ***!***");
			if(pileMatches == 1) {
				System.out.println("Il ne reste plus qu'une allumette, le joueur : " + playerList[firstPlayerIndex - 1] + " à perdu !");
				break;
			}
			System.out.println("(" + playerList[firstPlayerIndex - 1] + ") - " + "Combien d'allumette voulez vous enlever ? (1 - 4) : ");
			matchToSubstract = scanner.nextInt();
			pileMatches = pileMatches - matchToSubstract;
			if(pileMatches == 0) {
				System.out.println("Le joueur : " + playerList[firstPlayerIndex - 1] + " à perdu !");
				break;
			}
			System.out.println("----------------------------------");
			System.out.println("!!!!! ALLUMETTE RESTANTE : " + pileMatches +  " !!!!!");
			if(pileMatches == 1) {
				System.out.println("Il ne reste plus qu'une allumette, le joueur : " + playerList[secondPlayerIndex - 1] + " à perdu !");
				break;
			}
			System.out.println("(" + playerList[secondPlayerIndex - 1] + ") - " + "Combien d'allumette voulez vous enlever ? (1 - 4) : ");
			matchToSubstract = scanner.nextInt();
			pileMatches = pileMatches - matchToSubstract;
			if(pileMatches == 0) {
				System.out.println("Le joueur : " + playerList[secondPlayerIndex - 1] + " à perdu !");
				break;
			}
			System.out.println("----------------------------------");
		}
	}
}

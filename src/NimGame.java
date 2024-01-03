import java.util.Scanner;
import java.util.ArrayList;

public class NimGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> optionsMenu = new ArrayList<>();
		optionsMenu.add("1 - Joueur vs Joueur");
		optionsMenu.add("2 - Joueur vs IA ");

		System.out.println("Bonjour, bienvenue dans le jeu de Nim, veuillez choisir un mode de jeu : ");
		for(String option : optionsMenu) {
			System.out.println(option);
		}
		
//		int userChoice = Verification.verifyUserChoice(scanner, optionsMenu);
		Player.playerInformation(scanner);
		scanner.close();
	}

}

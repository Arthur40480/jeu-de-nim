import java.util.Scanner;

public class Player {
	// Méthode permettant de récupérer les noms des joueurs, ainsi que celui qui vas jouer en premier :
	public static void playerInformation(Scanner scanner) {
		// Tableau qui vas contenir les joueurs :
		String[] playerList = new String[2];
		
		System.out.println();
		System.out.print("Nom du Joueur 1 : ");
		String firstPlayer = scanner.next();	
		System.out.print("Nom du Joueur 2 : ");
		String SecondPlayer = scanner.next();
		
		// On assigner les joueurs au tableau :
		playerList[0] = firstPlayer;
		playerList[1] = SecondPlayer;
		
		System.out.println();
		System.out.println("Quel joueur vas commencer en premier ? (1 - 2) :");
		for( int i = 0; i < playerList.length; i++) {
			System.out.println((i + 1) + " - " + playerList[i]);
		}
		// Variable qui contiendra l'indice du joueur qui commencera la partie, et du deuxième :
		int firstPlayerIndex = Verification.verifyWhoPlayFirst(scanner);
		int secondPlayerIndex;
		
		// On assigne à notre variable secondPlayerIndex l'indice restant entre les deux joueurs :
		if(firstPlayerIndex == 1) {
			secondPlayerIndex = 2;
		} else {
			secondPlayerIndex = 1;
		}
		
		Launch.playerVsPlayer(playerList, firstPlayerIndex, secondPlayerIndex, scanner);
	}
}

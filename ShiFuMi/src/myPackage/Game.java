/*
 * Le programme demande à l'utilisateur de choisir entre Pierre Feuille et Ciseau
 * le programme choisit entre Pierre Feuille Ciseau de manière aléatoire 
 * le programme compare les résultats
 * en fonction des résultats l'utilisateur ou le programme gagne
 */
package myPackage;
import java.util.Scanner;
import java.util.Random;


public class Game {
	String rock = "Pierre";
	String paper = "Feuille";
	String scissor = "Ciseau";
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	boolean gameOn = true;


	void partieEnCours() {
		while(gameOn) {
			// Le programme demande à l'utilisateur de choisir entre Pierre Feuille et Ciseau
			System.out.println("Bonjour, bienvenu dans mon jeu du Shi, fu, mi(Pierre, Feuille, Ciseau)");
			System.out.println("********");
			System.out.println("Tapez 1 pour jouer: " + rock + ", 2 pour : " + paper + " ou 3 pour : " + scissor );
			int user = input.nextInt();
			String userAnswer = "";
			if(user == 1) {
				userAnswer = "Pierre";
			} else if(user == 2) {
				userAnswer = "Feuille";
			} else if(user == 3) {
				userAnswer = "Ciseau";
			}
			System.out.println("Vous avez choisi :" + userAnswer );



			// le programme choisit entre Pierre Feuille Ciseau de manière aléatoire 
			int progNumber = rand.nextInt((3 - 1) + 1) + 1;
			String progAnswer= "";

			if(progNumber == 1) {
				progAnswer = "Pierre";
			} else if(progNumber == 2) {
				progAnswer = "Feuille";
			} else if(progNumber == 3) {
				progAnswer = "Ciseau";
			} 
			System.out.println("L'ordinateur a choisi : " + progAnswer);
			if(user == progNumber) {
				System.out.println("Egalité !");
				gameOn = false;
			}
			
			
			//fin boucle gameOn
		}
		
		



	}

}

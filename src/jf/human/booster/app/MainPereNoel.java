package jf.human.booster.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.human.booster.App.Jouet;

public class MainPereNoel {

	static List<Jouet> jouet = new ArrayList<>();
	static List<Cadeau> cadeau = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 0;  //enfants
		int b =0;  //scanner
		int c =0;  //affichage principale choix 2
		afficherMessage();
		System.out.println("Le resultat de b est :" + scanner(b,a));
	

}

	


// TODO Auto-generated method stub
	
    //Cette méthode permet d'afficher un choix:
//==========================================================================================
public static Integer scanner (Integer c, Integer a) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bienvenu");
	System.out.println("Veuillez saisir votre choix");
	c = scanner.nextInt();
	scanner.close();
	if ( c == 1) {
	afficherMessageS1(c);
	}else {
		afficheListeEnfants(a);
		
	
	
}
	return b;
}

//Cette méthode permet d'afficher Le sous menu du choix 1 :
//==========================================================================================
public static int afficherMessageS1(int c) {
System.out.println("----------------------------------------------------------");
System.out.println("----Voici la liste des jouets :         ");
System.out.println("    Quelle cadeau voulez-vous :        Choix 1:");
System.out.println("--------------------------------------------------------");
//System.out.println( scanner(c));
return c;
}


public static int afficheListeEnfants(int a) {
System.out.println("----------------------------------------------------------");
System.out.println("----Voici la liste des enfants :         ");
System.out.println("    Quelle Enfants voulez-vous choisir:  ");
System.out.println("--------------------------------------------------------");
//System.out.println( scanner(c));
return a;
}



              //Cette méthode permet d'afficher Le menu principal :
//==========================================================================================
public static void afficherMessage() {
System.out.println("----------------------------------------------------------");
System.out.println("----Veulliez sélectioner votre choix :         ");
System.out.println("              Commander Jouer :        Choix 1:");
System.out.println("              Livrer    jouer :        Choix 2:");
System.out.println("--------------------------------------------------------");
}
}
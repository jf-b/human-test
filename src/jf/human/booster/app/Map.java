package jf.human.booster.app;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String, String> dictionary = new HashMap<String, String>();
  dictionary.put ("Jouet", "Enfants");
  dictionary.put ("voiture", "telecommander"); 
 // System.out.println("\n cl� du dictionnaire \n");
//  for (String Jouer : dictionary.values()) {
//	  System.out.println(Jouer);
	  
  System.out.println("\ncl�/vleurs du dictionnaire \n");
  for(Entry<String, String> entry : dictionary.entrySet()) {
	  System.out.println("cl� :"+entry.getKey() + "valeur :"+entry.getValue());
  }
  }
	}



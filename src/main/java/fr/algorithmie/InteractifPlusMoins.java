package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
  public static void main(String[] args) {
    System.out.println("devinez le nombre !!! ");

    int counter = 0;
    int playerNumber = 0;
    int nbMystery = 1 + (int) ( Math.random() * 100 );


    Scanner sc = new Scanner(System.in);


    while (playerNumber != nbMystery) {
      System.out.println("entrez un nombre : ");
      int n = sc.nextInt();
      playerNumber = n;

      if (n < nbMystery) {
        System.out.println("Trop petit !");
      } else if (n > nbMystery) {
        System.out.println("Trop grand !");
      } else {
        System.out.println("Bravo, trouvé en "+counter+" coups");
      }
      counter++;
    }

    sc.close();

  }
}

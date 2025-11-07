package fr.tableaux;

import org.w3c.dom.ls.LSOutput;

public class ExerciceTableauChaines {

  public static void main(String[] args) {

    String[] villes = {"Rennes", "Lyon", "Marseille", "Toulouse", "Nice"};

    System.out.println("Villes initiales :");
    System.out.println(villes[0]);
    System.out.println(villes[1]);
    System.out.println(villes[2]);
    System.out.println(villes[3]);
    System.out.println(villes[4]);

    System.out.println("\nLongueur du tableau : " + villes.length);

    villes[3] = "Reims";

    for (int i = 0; i < villes.length; i++) {
      System.out.println(villes[i]);
    }




  }

}

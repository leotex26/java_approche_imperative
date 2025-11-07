package fr.algorithmie;


/*
EXO
 */
public class AffichageInverse {
  public static void main(String[] args) {

    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;


    //  Afficher l’ensemble des éléments du tableau grâce à une boucle
    for (int i : array) {
      System.out.print(i + " ");
    }

    System.out.println("\n");

    // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
    for ( int inverseCounter = array.length-1 ; inverseCounter > 0 ; inverseCounter-- ) {
      System.out.print(array[inverseCounter] + " ");
    }

    System.out.println("\n");

    //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
    int[] arrayCopy = array.clone();

  }
}

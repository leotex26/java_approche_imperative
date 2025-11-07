package fr.algorithmie;

public class AffichageSuite {
  public static void main(String[] args) {

    // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
    System.out.println("nb 1 à 10:");
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\n");


    // Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
    System.out.println("pairs :");
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println("\n");


    // Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
    System.out.println("impairs :");
    for(int i = 0; i<=9; i++){
      if(i % 2 != 0){
        System.out.print(i + " ");
      }
    }
    System.out.println("\n");


    // Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
    System.out.println("while: \nnb de 1 à 10 :");
    int whileTest = 1;

    while (whileTest < 10){
      System.out.print(whileTest + " ");
      whileTest++;
    }
    System.out.println("\n");


    // Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
    System.out.println("Nombres pairs :");
    int whileTest2 = 0;
    while (whileTest2 <= 10) {
      if (whileTest2 % 2 == 0) {
        System.out.print(whileTest2 + " ");
      }
      whileTest2++;
    }
    System.out.println("\n");

    //  Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
    System.out.println("Nombres impairs :");
    int l = 0;
    while (l < 10) {
      if (l % 2 != 0) {
        System.out.print(l + " ");
      }
      l++;
    }
    System.out.println();
  }
}

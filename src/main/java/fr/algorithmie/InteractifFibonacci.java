package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifFibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = -1;

    while (n < 0) {
      try {
        System.out.print("Entrez le rang N de la suite de Fibonacci : ");
        n = sc.nextInt();
        if (n < 0) {
          System.out.println("Veuillez entrer un nombre positif !");
        }
      } catch (InputMismatchException e) {
        System.out.println("Erreur : veuillez saisir un entier !");
        sc.nextLine();
      }
    }

    int resultat = fibonacci(n);

    System.out.println("Le nombre de rang " + n + " dans la suite de Fibonacci est : " + resultat);

    sc.close();




  }


  // 0 1 1 2 3 5 8 13 ... SUM
  // 0 1 2 3 4 5 6  7 ... RANG
  public static int fibonacci(int n) {
    int temp1 = 0;
    int temp2 = 1;

    int tempMain = 1;

    int resultat = 0;


    //***

    if (n == 0) return 0;
    if (n == 1) return 1;

    for (int i = 2; i <= n; i++) {
      tempMain = temp1 + temp2;
      resultat = tempMain;
      //System.out.println(temp1+" + "+temp2+" = "+resultat);
      temp1 = temp2;
      temp2 = tempMain;
    }

    return resultat;
  }


}

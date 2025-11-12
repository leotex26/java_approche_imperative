package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.println("entrez un nombre : ");
    int n = sc.nextInt();


    int somme = 0;

    for (int i = 1; i <= n; i++) {
      somme += i;
    }

    System.out.println("La somme des entiers de 1 à " + n + " est : " + somme);

    sc.close();



  }
}

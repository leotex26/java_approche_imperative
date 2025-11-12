package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifStockageNombre {


  static int[] tab = new int[0];
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    boolean quit = false;

    while (!quit) {
      int n = 0;
      boolean saisieValide = false;

      while (!saisieValide) {
        System.out.println("\nChoisissez une option :");
        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants");
        System.out.println("3. Quitter");

        try {
          n = sc.nextInt();
          if (n > 0 && n < 4) {
            saisieValide = true;
          } else {
            System.out.println(" Le choix doit être 1 ou 3.");
          }
        } catch (InputMismatchException e) {
          System.out.println(" Erreur : veuillez saisir un nombre entier !");
          sc.nextLine();
        }
      }

      // OPTIONS
      switch (n) {
        case 1:
          firstChoice();
          break;
        case 2:
          secondChoice();
          break;
        case 3:
          quit = true;
          break;
        default:
          System.out.println("Le choix est compris entre 1 et 3");
      }


    }

    sc.close();
  }

/*
* premier choix du menu
* */
  public static void firstChoice() {
    System.out.print(" Entrez un nombre à ajouter : ");
    int num = sc.nextInt();
    addNumberToTab(num);
    System.out.println(" Nombre ajouté avec succès !");
  }

  /*
   * deuxieme choix du menu
   * */
  public static void secondChoice() {
    if (tab.length == 0) {
      System.out.println("Le tableau est vide.");
    } else {
      System.out.println(" Nombres stockés :");
      for (int n : tab) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
  }


  public static void addNumberToTab(int number) {
    int[] newTab = new int[tab.length + 1];
    for (int i = 0; i < tab.length; i++) {
      newTab[i] = tab[i];
    }
    newTab[newTab.length - 1] = number;
    tab = newTab;
  }
}

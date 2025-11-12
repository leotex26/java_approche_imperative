package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


  int[] tab = new int[10];
  for (int i = 0; i < 10; i++) {
    System.out.println("entrez dix nombre ("+i+"/10) : ");
    tab[i] = sc.nextInt();
  }


    int max = tab[0];


    for (int i = 1; i < tab.length; i++) {
      max = Math.max(max, tab[i]);
    }

    System.out.println("le plus grand nombre de votre selection est : "+max);
    sc.close();




  }
}

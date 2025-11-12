package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
  public static void main(String[] args) {
    /*Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
compris entre 1 et 10 :
-  Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
nombre à l’utilisateur.
-  Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
*/


    Scanner sc = new Scanner(System.in);

    int n = 0;
    while(n<1 || n>10){
    System.out.println("entrez un nombre qui doit être obligatoirement\n" +
      "compris entre 1 et 10 : ");

     n = sc.nextInt();

    }

    System.out.println("Vous avez entré :" + n);


  }
}

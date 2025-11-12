package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
  public static void main(String[] args) {
    /*Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
multiplication de ce nombre.
*/

    Scanner sc = new Scanner(System.in);

    int n = 0;
    while(n<1 || n>10){
      System.out.println("entrez un nombre qui doit être obligatoirement\n" +
        "compris entre 1 et 10 : ");

      n = sc.nextInt();

    }

    for(int i=1; i<=10; i++){
      System.out.println(n + "*" + i + "=" +i*n);
    };


  }
}

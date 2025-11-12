package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int n = 0;
    System.out.println("entrez un nombre : ");
    n = sc.nextInt();


    for(int i=1; i<=15; i++){
      System.out.println(n+i);
    };

    sc.close();
  }
}

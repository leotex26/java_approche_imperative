package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

  static int batons = 21;
  static final String firstPlayer = (Math.random() < 0.5) ? "joueur" : "bot";
  static Scanner sc = new Scanner(System.in);
  static boolean quit = false;
  static String winner = "";

  public static void main(String[] args) {


    String player = firstPlayer;

    while(!quit){
      System.out.println("il y a "+ batons + " batons");

      if (player.equals("joueur")) {
        userChoice();
        player = "bot";
      } else {
        botChoice();
        player = "joueur";
      }

    }

    System.out.println("Le "+ winner +" a gagné !!!");

    sc.close();

  }



  public static void botChoice(){
    System.out.println("Le bot joue");
    int choix = 1;
    switch(batons){
      case 3:
        choix = 3;
        break;
      case 2:
        choix = 2;
        break;
      case 1:
          choix = 1;
          break;
      default: choix = (int) (Math.random() * 3) + 1;
    }
    numberChoosen(choix, "bot");
    System.out.println("Le bot a pris "+choix+" batons, il en reste donc "+ batons);
  }

  public static void userChoice(){
    System.out.println("Combien de batons voulez vous prendre :\n 1 2 ou 3 ?");
    int choix = sc.nextInt();
    if(choix > 3){
      System.out.println("désolé mais vous êtes limité à 1,2 ou 3");
      return;
    }
    numberChoosen(choix, "joueur");
    System.out.println("vous avez pris "+choix+" batons, il en reste donc "+ batons);
  }

  public static void numberChoosen(int choix, String perso){
    if(choix < batons){
      batons -= choix;
    }else if(choix == batons){
      winner = perso;
      quit = true;
    }else{
      System.out.println("probleme : choix dépassant le nombre de batons, veuillez saisir un nombre cohérent");
    }
  }

}

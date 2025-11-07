package fr.algorithmie;

public class AffichageIdentite {

  String nom="Texier";
  String prenom="Léo";
  String age="26";


  public static void main(String[] args) {

    AffichageIdentite a = new AffichageIdentite();


    for (int i = 1; i <= 10; i++) {
      System.out.println("Je m'appelle "+a.prenom+" "+a.nom);
    }





  }
}

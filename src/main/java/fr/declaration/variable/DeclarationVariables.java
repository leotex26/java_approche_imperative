package fr.declaration.variable;

public class DeclarationVariables {

  byte v1 = 1;
  short v2 = 128;
  int v3 = 300000;
  long v4 = 4000000000000L;
  float v5 = 5F;
  double v6 = 6.222;

  char v7 = 'c';
  boolean v8 = true;
  String v9 = "v9";

  String randomString = "Voici le résultat d’un calcul :\n1+5=6";



  public static void main(String[] args) {

    DeclarationVariables dv = new DeclarationVariables();

    System.out.println(dv.randomString);
  }

}

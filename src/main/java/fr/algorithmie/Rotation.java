package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
  public static void main(String[] args) {
    int[] array2 = {8, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

    // Stocker le dernier élément
    int last = array2[array2.length - 1];

    // Parcourir le tableau de droite à gauche
    for (int i = array2.length - 1; i > 0; i--) {
      array2[i] = array2[i - 1];
    }

    // Mettre le dernier élément à la première position
    array2[0] = last;

    // Affichage du tableau après rotation
    System.out.println(Arrays.toString(array2));
  }
}


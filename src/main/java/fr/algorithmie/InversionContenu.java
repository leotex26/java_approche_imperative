package fr.algorithmie;

import java.lang.reflect.Array;

public class InversionContenu {
  public static void main(String[] args) {
    int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
    int[] arrayCopy = new int[array.length];

    System.out.println("arrayCopy : ");


    int arrayCount = 0;
    for ( int inverseCounter = array.length-1 ; inverseCounter > 0 ; inverseCounter-- ) {
      arrayCopy[arrayCount] = array[inverseCounter];
      System.out.println(arrayCopy[arrayCount]);
      arrayCount++;
    }

    System.out.println("\n");

    System.out.println("array : ");

    for (int element : array) {
      System.out.println(element);
    }


  }
}

package fr.algorithmie;

public class FirstLast6 {
  public static void main(String[] args) {

    int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

    boolean test = array2.length > 0 && (array2[0] == 6 || array2[array2.length - 1] == 6);

    System.out.println(test);
  }
}

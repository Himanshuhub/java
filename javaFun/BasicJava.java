import java.util.*;

class BasicJava {
  public static void main(String[] args) {
    iterateArray();
  }
  public static void print1255() {
    for (int i = 1; i<=255; i++) {
      System.out.print(i + "\n");
    }
  }
  public static void printOdd() {
    for (int i = 1; i<=255; i++) {
      if (i%2 != 0) {
        System.out.print(i + "\n");
      }
    }
  }
  public static void printSum() {
    int j = 0;
    for (int i = 0; i<255; i++) {
      j = j+i;
        System.out.print("New number: "+ i+ " Sum: "+j +"\n");
    }
  }
  public static void iterateArray() {
    int[] myArray = {1,3,5,7,9,13};
    for (int i=0; i < myArray.length; i++ ) {
      System.out.print(myArray[i]+"\n");
    }
  }
  void static max() {

  }

}

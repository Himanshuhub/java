class BasicJava {
  public static void main(String[] args) {
    printSum();
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
}

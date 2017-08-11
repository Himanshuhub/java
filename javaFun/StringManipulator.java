import java.util.*;

public class StringManipulator {
  // public void stringManipulatorMethod() {
  //
  // }
  public String trimAndConcat(String s1, String s2){
    s1 = s1.trim();
    s2 = s2.trim();
    String s = s1 +" "+ s2;
    return s;
  }
  public Integer getIndexOrNull(String s3, char c1) {
    int a = s3.indexOf(c1);
    if (a == -1) {
      return null;
    }
    else {
      return a;
    }
  }
  public Integer getIndexOrNull(String s4, String s5){
    int b = s4.indexOf(s5);
    if (b == -1) {
      return null;
    }
    else {
      return b;
    }
  }
  public String concatSubstring(String s6, int i1, int i2, String s7){
    String r = s6.substring(i1,i2);
    r = r + s7;

    int i = 0;
    while(i < 7)
    {
        System.out.println("foo");
        i++;
    }

    for (int j = 0; j < 7; j++){
        System.out.println("bar");
    }

    // for (initialization; termination; increment){
    //     body statements
    // }

    int k = 0;
    while(k < 7)
    {
        System.out.println("bar");
        k++;
    }

    ArrayList<String> dynamicArray = new ArrayList<String>();
    dynamicArray.add("hello");
    dynamicArray.add("world");
    dynamicArray.add("etc");

    for (int l = 0; l < dynamicArray.size(); l++){
        System.out.println(dynamicArray.get(l));
    }



    return r;

  }
  // /* Arrays */
  // int[] myArray; //datatype[Array box] Array_name
  // myArray = new int[5];    // Initialization, new keyword does the Initialization, only 5 values array, cannot have more than 5 values
  // myArray[0] = 4;
  // myArray[1] = 8;
  // myArray[2] = 8;
  // myArray[3] = 5;
  // myArray[4] = 9;
  //
  //
  // // All at once:
  //
  // int[] myArray3 = {4, 8, 8, 5, 9}; //all at once, Declaration, Initialization, assignment
  //
  // import java.util.ArrayList;
  // ArrayList<Integer> myArray2 = new ArrayList<Integer>();
  //
  // myArray2.add(10);
  // int num = myArray2.get(0);




}

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
    return r;
  }
}

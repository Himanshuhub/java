public class FizzBuzz {
  FizzBuzz(){};
  public String fizzBuzzMethod(int number){
    String a;
    if (number%5 == 0 && number%3 == 0) {
      a = "FizzBuzz";
    }
    else if (number%3 == 0) {
      a = "Fizz";
    }
    else if (number%5 == 0) {
      a = "Buzz";
    }
    else{
      a = Integer.toString(number);
    }
    return a;
  }
}

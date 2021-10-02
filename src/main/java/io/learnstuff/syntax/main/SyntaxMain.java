package io.learnstuff.syntax.main;

import io.learnstuff.syntax.examples.StaticExample;

public class SyntaxMain {

  /**
   * <p>
   * The /* ... symbols indicates a multi-line comment.
   * </p>
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Hello world!");
    sayHello();
    introduceYourself("Vlad");
    // this indicates an in-line comment
    // without the use of other classes(!) all operations go here
    // with classes(!) class instantiation and method calls go here

    int a = 0;
    // variable are type safe and assigned value needs to match the property type
    a = 5;
    // not permitted due to type safety
    // a = "text";
    displayNumber(a);
    System.out.println(a);
    int result = StaticExample.addNumbers(a, 4);
    System.out.println("Result is:" + result);
  }

  public static void sayHello() {
    System.out.println("Hello!");
  }
  
  public static void displayNumber(Integer myValue) {
    System.out.println(myValue);
  }

  public static void introduceYourself(String name) {
    System.out.println("Hi, my name is " + name);
  }

}

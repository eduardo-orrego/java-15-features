package org.duna.jep375;

public class NewInstanceofDemo01 {
  public static void main(String[] args) {

    Object object1 = "Before of Pattern Matching for instanceof";

    if (object1 instanceof String) {
      String string = (String) object1;
      int length = string.length();
      System.out.println("result 1" + length);
    }

    Object object2 = "Now with Pattern Matching for instanceof";

    if (object2 instanceof String string2) {
      int length2 = string2.length();
      System.out.println("result 2" + length2);
    }
  }
}

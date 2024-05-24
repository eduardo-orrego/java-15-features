package org.duna.jep378;

public class NewTextBlocksDemo01 {
  public static void main(String[] args) {

    String multiline = "Java 15 Features - New Text Blocks.";

    System.out.println(multiline);

        /*
            \s: to indicate a single space
            \: to indicate the end of the line, so that a new line character is not introduced
         */
    String multiline2 = """
      Java 15 Features \
      - New Text Blocks.""";

    System.out.println(multiline2);

  }
}

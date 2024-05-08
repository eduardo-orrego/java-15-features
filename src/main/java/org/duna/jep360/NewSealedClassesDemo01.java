package org.duna.jep360;

public class NewSealedClassesDemo01 {
  public static void main(String[] args) {

  }
}

abstract sealed class Shape permits Circle, Rectangle, Square {
  // Define métodos y atributos comunes para todas las formas
  public abstract double calculateArea();
}

final class Circle extends Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

sealed class Rectangle extends Shape permits TransparentRectangle, FilledRectangle {
  private final double width;
  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}

final class TransparentRectangle extends Rectangle {
  public TransparentRectangle(double width, double height) {
    super(width, height);
  }
  // Puedes agregar métodos específicos para TransparentRectangle
}

final class FilledRectangle extends Rectangle {
  public FilledRectangle(double width, double height) {
    super(width, height);
  }
  // Puedes agregar métodos específicos para FilledRectangle
}

non-sealed class Square extends Shape {
  private final double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return side * side;
  }
  // Puedes agregar métodos específicos para Square
}

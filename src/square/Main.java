package square;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {

    Shape circle = new Circle(100);
    Shape square = new Square(200);

    ArrayList<Shape> list = new ArrayList<>();

    list.add(circle);
    list.add(square);

    for (Shape shape : list) {
      System.out.printf("%.0f %n", shape.getArea());
    }




  }


}

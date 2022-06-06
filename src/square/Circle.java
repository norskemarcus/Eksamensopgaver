package square;

public class Circle implements Shape {

  private int radius;


  public Circle(int radius) {
    this.radius = radius;
  }

  // circle = Math.PI * r * r
  @Override
  public double getArea() {
    double circle = Math.PI * radius * radius;
    return circle;
  }
}

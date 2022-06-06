package square;

public class Square implements Shape {

  private int width;

  // square = w * w
  public Square(int width) {
    this.width = width;
  }

  @Override
  public double getArea() {
  double area = width * width;
  return area;
  }
}

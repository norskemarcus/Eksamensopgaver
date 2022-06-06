package motherboard;

public class SataDrive {

  private String name;
  private int number;

  public SataDrive(String name, int number) {
    this.name = name;
    this.number = number;
  }


  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "SataDrive{" +
        "name='" + name + '\'' +
        ", number=" + number +
        '}';
  }
}

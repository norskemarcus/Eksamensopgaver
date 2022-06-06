package film;

public class Producer {

  private String name;

  public Producer(String name){
    this.name = name;
  }


  @Override
  public String toString() {
    return name;
  }
}

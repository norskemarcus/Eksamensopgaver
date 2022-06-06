package eksamenstræning_codelab;

public class Dog extends Animal{

  public Dog(String name) {
    super(name);
  }

  @Override
  public String makeSound() {
    String s = "Voff voff";
    return s;
  }
}

package eksamenstræning_codelab;

public class Cat extends Animal{

  public Cat(String name) {
    super(name);
  }

  @Override
  public String makeSound() {
    String s = "Mjaaaau";
    return s;
  }



}

package eksamenstræning_codelab;

public abstract class Animal {

  protected String name;

  public Animal(String name){
    this.name = name;
  }

  public abstract String makeSound();

  @Override
  public String toString() {
    return name;
  }
}

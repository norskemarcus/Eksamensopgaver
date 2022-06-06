package animal;

interface FirstInterface{
  void myMethod();
}


// En klasse kan godt implementere flere interfaces!
public class Cat implements Animal, FirstInterface {


  @Override
  public void animalSound() {
    System.out.println("Katten siger mjau");
  }

  @Override
  public void sleep() {
    System.out.println("Katten sover meget om dagen");
  }

  @Override
  public void myMethod() {
    System.out.println("Dette er min metode hvor jeg viser at man faktisk kan lave et interface ovenover klassen!");
  }
}

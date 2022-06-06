package eksamenstræning_codelab;

import java.util.ArrayList;

public class MainAnimal {


  public static void main (String[] args){

    ArrayList<Animal> dyrTilAdoption = new ArrayList<>();

    Dog rollo = new Dog("Rollo");
    Dog lisa = new Dog("Lisa");
    Dog edward = new Dog("Edward");
    Cat cat = new Cat("Elsa");
    Cat cat2 = new Cat("Tuborg");
    Cat cat3 = new Cat("Lizzie");

    dyrTilAdoption.add(rollo);
    dyrTilAdoption.add(lisa);
    dyrTilAdoption.add(edward);

    dyrTilAdoption.add(cat);
    dyrTilAdoption.add(cat2);
    dyrTilAdoption.add(cat3);

    for (int i = 0; i < dyrTilAdoption.size(); i++) {
      System.out.println(dyrTilAdoption.get(i) + " siger " + dyrTilAdoption.get(i).makeSound());
    }


  }


}

package personfilehandler;

import animal.Cat;
import lister.ArrayOgArrayList;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

  public void runPerson(){

  Person person = new Person("Marcus Sebastian Holje", 37);
  Person person2 = new Person("Tommy Jensen", 30);
  Person person3 = new Person ("Eva Marie Vestergård Møller", 37);

  System.out.println(person);
  System.out.println(person2);
  System.out.println(person3);
  System.out.println(person3.getFornavn());

    System.out.println(Person.counter);

  // Split name
   person.splitName("Marcus Sebastian Holje");
    System.out.println(person.getFornavn());
    System.out.println(person.getMellemnavn());
    System.out.println(person.getEfternavn());



  }

  public void runArray(){
    ArrayOgArrayList ar = new ArrayOgArrayList();
    ar.printAnArray();
  }

  public void formatereOrd(){
    var doubleValue = 10_000_000.53;

    var numF = NumberFormat.getNumberInstance();
    System.out.println("Number: " + numF.format(doubleValue));

    var intF = NumberFormat.getIntegerInstance();
    System.out.println("Integer: " + (intF.format(doubleValue)));

    intF.setGroupingUsed(false);
    System.out.println("Number: " + numF.format(doubleValue));

    // Locale
    var locale = new Locale("da", "DK");
    var localeFormatter = NumberFormat.getNumberInstance(locale);
    System.out.println("DK nummer: " + localeFormatter.format(doubleValue));

    // Currency
    var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    System.out.println(currencyFormatter.format(doubleValue));

    // DecimalFormat
    var df = new DecimalFormat("$00.00");
    System.out.println(df.format(1));
  }

  public void makeAnInterface(){
    Cat cat = new Cat();
    cat.animalSound();
    cat.sleep();
    cat.myMethod();
  }

  public void printToFile(){ // = save

    Person person = new Person("Marcus Sebastian Holje", 37);
    Person person2 = new Person("Tommy Jensen", 30);
    Person person3 = new Person ("Eva Marie Vestergård Møller", 37);

    try{
      FileHandler fileHandler = new FileHandler();
      fileHandler.saveToFile(person);
    } catch (FileNotFoundException fileNotFoundException){
      System.err.println("Filen blev ikke fundet");
    }
  }


  public void loadFromFile(){

    try{
      FileHandler fileHandler = new FileHandler();
      System.out.println(fileHandler.loadFromFile());
    } catch (FileNotFoundException fnfe){
      System.err.println("Filen er ikke fundet");
    }
    System.out.println();
  }

  public static void main (String[] args){

    Main main = new Main();
    //main.runPerson();
    //main.runArray();
    //main.formatereOrd();
    //main.makeAnInterface();
    //main.printToFile();
    main.loadFromFile();


    //Capitalization capitalization = new Capitalization();
    //capitalization.capitalizeName("Marcus");


  }




}

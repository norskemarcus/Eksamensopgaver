package printf_examples;

public class PrintFExamples {

/*
  public void printMenu(Menucard menuCard) {
    String dot = ".";

    for (Pizza pizza : menuCard.getMenuCard()) {
      System.out.printf("""
          %d. %s %s %d kr
          """, pizza.getMenuNumber(), pizza.getName(), dot.repeat(60 - (pizza.getName().length())), pizza.getPrice());
      System.out.println(pizza.getToppings() + "\n");
    }
  }


 */



  public static void main(String[] args) {

    String vare = "Ost";
    int mængde = 10;
    String enhed = "kr";
    String vare2 = "Hindbærmarmelade";
    int mængde2 = 205;
    String dot = ".";

    System.out.printf("""
       %s %s %d kr
        """, vare,dot.repeat(30- (vare.length())), mængde);

    // Printer pent højrestillet kr!
    System.out.printf("%-20s %15d %s %n", vare, mængde, enhed);
    System.out.printf("%-20s %15d %s %n", vare2, mængde2, enhed);


  }

}

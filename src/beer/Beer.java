package beer;

import java.util.ArrayList;

public class Beer {

  private String name;
  private double alcoholPercentage;
  private double price;

  public Beer(String name, double alcoholPercentage,double price) {
    this.name = name;
    this.alcoholPercentage = alcoholPercentage;
    this.price = price;
    setAlcoholPercentage(alcoholPercentage);
    setPrice(price);
  }

  public void setAlcoholPercentage(double alcoholPercentage) throws IllegalArgumentException{
    if(alcoholPercentage > 0 && alcoholPercentage <100){
      this.alcoholPercentage = alcoholPercentage;
    } else throw new IllegalArgumentException("Alkoholprocenten kan ikke være over 100 %");

  }

  public void setPrice(double price) throws NegativeNumberException{
    if(price > 0){
      this.price = price;
    } else throw new NegativeNumberException("Prisen kan ikke være negativ");
  }

  public double getPrice() {
    return price;
  }

  public String toString(){
    return name + " " + alcoholPercentage + " " + price;
  }


  public static void main(String[] args) {

    try{
      Beer beer = new Beer("Corona", 6.0, 40);
      Beer beer2 = new Beer("Tuborg", 4.0, 20);

      ArrayList<Beer> beers = new ArrayList<>();
      beers.add(beer);
      beers.add(beer2);

      double priceAverage = 0;

      for (int i = 0; i < beers.size(); i++) {
        priceAverage += beers.get(i).getPrice();
      }

      priceAverage = priceAverage / beers.size();
      System.out.println("Price average: " + priceAverage);

      System.out.println(beer);

    } catch (IllegalArgumentException | NegativeNumberException e){
      System.err.println(e.getMessage());

    }
  }

}

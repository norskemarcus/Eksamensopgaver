package dateAgeCalculator;


public class DateAgeCalculator {

  private int yourAge = 30;
  private int dateAge;


  public int calculateDateAgeLimit(){
    int lowest = (yourAge / 2)+7;
    return lowest;
  }


  public boolean isDateOldEnough(int dateAge){
    return dateAge > calculateDateAgeLimit();
  }


  public static void main(String[] args) {
    DateAgeCalculator dateAgeCalculator = new DateAgeCalculator();
    System.out.println("Er din date gammel nok? " + dateAgeCalculator.isDateOldEnough(23));
    System.out.println("Er din date gammel nok? " + dateAgeCalculator.isDateOldEnough(22));
    System.out.println("Er din date gammel nok? " + dateAgeCalculator.isDateOldEnough(21));


  }


}

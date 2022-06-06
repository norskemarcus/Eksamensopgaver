package mathfunctions;

public class MathFunctions {

  // HUSK højden skal være i meter!
  public double calculateWithPow(double weight, double height){
    int eksponent = 2;
    double bmi = weight / Math.pow(height, eksponent);
    return bmi;
  }


  public static void main (String[] args){

    MathFunctions mathFunctions = new MathFunctions();

    System.out.printf("%.1f", mathFunctions.calculateWithPow(74.5, 1.795));


  }
}

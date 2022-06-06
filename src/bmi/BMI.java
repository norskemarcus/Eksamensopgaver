package bmi;

public class BMI {

  private double height;
  private double weight;

  public BMI(double height, double weight){
    this.height = height;
    this.weight = weight;
  }


  public double calculateBmi(){
    double bmi =  weight/ Math.pow(height, 2);
    return bmi;
  }

  public boolean isUnderWeight(){
    return calculateBmi() < 18.5;
  }

  public boolean isOverWeight(){
    return calculateBmi() > 25;
  }

  private boolean isNormalWeight() {
    return (calculateBmi() >= 18.5 || calculateBmi() < 25);
  }

  public static void main(String[] args) {
    BMI bmi = new BMI(1.80, 75);

    System.out.printf("%.0f ", bmi.calculateBmi());

    System.out.println("Undervægtig? " + bmi.isUnderWeight());
    System.out.println("Overvægtig? " + bmi.isOverWeight());
    System.out.println("Normalvægtig? " + bmi.isNormalWeight());


  }
}

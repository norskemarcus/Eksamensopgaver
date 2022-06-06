package codemessage_ciphering;

public class CodeMessageExam {

  private String plainText = "abcdef";
  private int[] ciphers = new int[plainText.length()];
  private int shiftValue;


  public int ciphering(char sign){

    String alphabet = " abcdefghijklmnopqrstuvwxyz";

    // int number = alphabet.trim().toLowerCase().indexOf(sign);

    return alphabet.indexOf(sign);
  }

  public void encrypt(){

    for (int i = 0; i < ciphers.length; i++) {

      char[] charArray = plainText.toCharArray();
      ciphers[i] = ciphering(charArray[i]);
      System.out.print(ciphers[i]);
    }

  }

  public static void main(String[] args) {
    CodeMessageExam code = new CodeMessageExam();

    code.encrypt();

  }



}

package codemessage_ciphering;
/*
Lav en klasse CodeMessage med attributterne plainText, ciphers (et array af ints) og shiftValue.
Tilføj en metode der kan konvertere et enkelt tegn til et tal, hvor ‘A’=1, ‘B’=2, ‘C’=3, osv.
Tilføj en anden metode der læser igennem plainText, og konverterer hver enkelt tegn ved hjælp af den foregående metode, og gemmer listen af tal i ciphers.

For at kryptere din tekst skal du vælge en shift-værdi, som er udgangspunktet for en Cæsar-cipher-kryptering.
Se Enigma projektet for fuld kryptering!

 */
public class CodeMessage {

  private String plainText = "defff";
  private int[] ciphers = new int[plainText.length()];
  private int shiftValue; // Shift-værdien er en forskydning af hver enkelt bogstav det givne antal pladser.

  // Konvertere et enkelt tegn til et tal
  public int ciphering(char c) {
    String alphabet = " abcdefghijklmnopqrstuvwxyz";
    alphabet.trim().toLowerCase().indexOf(c);
    return alphabet.indexOf(c);
  }

  public void encrypt(){

    for (int i = 0; i < plainText.length() ; i++) {

      char[] charArray = plainText.toCharArray();
      ciphers[i] = ciphering(charArray[i]);
      System.out.println(ciphers[i]);
    }
  }

  public static void main(String[] args) {

    CodeMessage codeMessage = new CodeMessage();
    codeMessage.encrypt();


  }

}

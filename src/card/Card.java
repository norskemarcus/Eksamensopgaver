package card;

public class Card {

  enum Suit{
    HEARTS, DIAMONDS, CLUBS, SPADES
  }

  private Suit suit;
  private int value;


  public Card(Suit suit, int value) {
  this.suit = suit;
  this.value = value;
  }


  // modtager et andet Card og fortæller om dette korts værdi slår det andets værdi
  public boolean beats(Card anotherCard) {

    if (this.value > anotherCard.value) {
      return true;
    } else if (this.value == anotherCard.value) {

      // Suit: hearts slår diamonds, som slår clubs, som slår spades
      // OBS: Husk at parenteser skal være på det rigtige sted!!

      if (this.suit == Suit.HEARTS) {
        return true;
      } else if (this.suit == Suit.DIAMONDS && (anotherCard.suit == Suit.SPADES || anotherCard.suit == Suit.CLUBS)) {
        return true;
      } else if (this.suit == Suit.CLUBS && anotherCard.suit == Suit.SPADES) {
        return true;
      } else if (this.suit == Suit.SPADES && (anotherCard.suit == Suit.HEARTS || anotherCard.suit == Suit.DIAMONDS || anotherCard.suit == Suit.CLUBS)){
        return false;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return suit + " " + value;
  }

  // Suit: hearts slår diamonds, som slår clubs, som slår spades
  public static void main(String[] args) {
    System.out.println("Diamonds slår spades, så den burde være true: ");
    Card card = new Card(Suit.DIAMONDS, 8);
    Card cardToCompare = new Card(Suit.SPADES, 8);
    System.out.println(card.beats(cardToCompare));

    System.out.println("Clubs slår spades, så den burde være false: ");
    Card card2 = new Card(Suit.SPADES, 8);
    Card cardToCompare2 = new Card(Suit.CLUBS, 8);
    System.out.println(card2.beats(cardToCompare2));

    System.out.println("Burde være true: ");
    Card card3 = new Card(Suit.CLUBS, 8);
    Card cardToCompare3 = new Card(Suit.SPADES, 8);
    System.out.println(card3.beats(cardToCompare3));


  }

}
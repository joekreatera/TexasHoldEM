/**
* Description: Class used to model a Card according to the following table
* Card     Value
* 2-10      Explicit Value
* ACE       1 or 14
* King      13
* Queen     12
* Jack      11
*/
public class Card{

  public enum SUIT{
    SPADES,
    CLUBS,
    DIAMONDS,
    HEARTS
  }
  private int value;
  private SUIT suit;

  public Card(int value, SUIT suit){
    this.value = value;
    this.suit = suit;
  }
  public int getValue(){
    return value;
  }
  public SUIT getSuit(){
    return suit;
  }
}

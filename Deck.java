import java.util.*;

public class Deck{

  private List<Card> cards;
  public Deck(){
      // create all cards
      cards = new ArrayList<Card>();
      for( int  i = 1; i < 14; i++){
        cards.add( new Card(i, Card.SUIT.SPADES ) );
        cards.add( new Card(i, Card.SUIT.CLUBS ) );
        cards.add( new Card(i, Card.SUIT.DIAMONDS ) );
        cards.add( new Card(i, Card.SUIT.HEARTS ) );
      }

  }
  public Card popCard(){
    try{
      return cards.remove(0);
    }catch(IndexOutOfBoundsException ioe){

    }
    return null;
  }
  public void shuffle(){
      for( int i = 0; i < cards.size()*cards.size()*cards.size()*cards.size() ; i++){
        // -> your implementation
          int rand0= (int)((cards.size()-1)*Math.abs(PerlinNoise.noise(Math.random()*255,Math.random()*255,Math.random()*255)));
          int rand1= (int)((cards.size()-1)*Math.abs(PerlinNoise.noise(Math.random()*255,Math.random()*255,Math.random()*255)));
          Card a = cards.get(rand0);
          Card b = cards.get(rand1);
          cards.set(rand0,b);
          cards.set(rand1,a);
      }
  }
  @Override
  public String toString(){
    String result= "";
    for(Card c:cards){
      result += c;
    }
    return result;
  }


}

import java.util.List;
import java.util.ArrayList;

public abstract class Player{

    private PlayerDecision decision;
    protected List<Card> myHand;
    private int chips;
    public Player(){
      decision = new PlayerDecision();
      myHand = new ArrayList<Card>(2);
    }

    public int getChips(){
      return chips;
    }
    private void setChips(int c){
      chips = c;
    }
    public boolean payChips(int c){
      if( chips >= c){
        chips -= c;
        return true;
      }
      return false;
    }
    public void receiveChips(int c){
      chips += c;
    }
    public void addCard(Card c){
      myHand.add(c);
    }

    public void fold(){
      decision.setDecision(PlayerDecision.DECISION.FOLD);
    }
    public void raise(int bet){
      decision.setDecision(PlayerDecision.DECISION.RAISE);
    }
    public  void check(){
      decision.setDecision(PlayerDecision.DECISION.CHECK);
    }
    public abstract void doTurn();

    public PlayerDecision getDecision(){
      return decision;
    }
    public void endParticipation(){}
    public void receiveWinnersResult(){}

    @Override
    public String toString(){
      return  this.getClass() + " {" + myHand + "}";
    }
}

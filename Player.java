import java.util.List;
import java.util.ArrayList;

public abstract class Player{

    private PlayerDecision decision;
    protected List<Card> myHand;
    public Player(){
      decision = new PlayerDecision();
      myHand = new ArrayList<Card>(2);
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
}

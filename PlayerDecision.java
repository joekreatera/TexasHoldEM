public class PlayerDecision{

  public enum DECISION{
    FOLD,CHECK,RAISE, NONE
  }
  private DECISION decision;
  private int bet;

  public PlayerDecision(){
    decision = DECISION.NONE;
  }
  public void setDecision(DECISION dec){ decision=dec;}
  public void setBet(int b){bet = b;}
  public DECISION getDecision(){ return decision;}
  public int getBet(){return bet;}

}

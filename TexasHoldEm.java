public class TexasHoldEm{
    Player human1;
    Deck deck;
    public TexasHoldEm(){
        SystemVariables.getInstance().setUserInterface(
                                              new TextUserInterface()
                                              );
        human1 = new HumanPlayer();
    }
    public void initializeRound(){
        // deal cards
        deck = new Deck();
        SystemVariables.getInstance().getUserInterface().printData(""+deck);
    }
    public void playRound(){
      human1.doTurn();
    }
    public static void main(String args[]){
      TexasHoldEm game = new TexasHoldEm();
      game.initializeRound();
      game.playRound();
    }
}

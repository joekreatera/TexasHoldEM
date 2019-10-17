import java.util.*;

public class TexasHoldEm{
    List <Player>players;
    Deck deck;
    List<Card> centerHand;
    int pot= 0;
    public TexasHoldEm(){
        SystemVariables.getInstance().setUserInterface(
                                              new TextUserInterface()
                                              );
        players = new ArrayList<Player>();
        players.add( new HumanPlayer() );
        players.add( new CPUPlayer() );
        centerHand = new ArrayList<Card>();
        for(Player p: players){
          p.receiveChips(1000);
        }
    }
    public void initializeRound(int ante){
        // deal cards
        deck = new Deck();
        deck.shuffle();
        for(int i=0; i < players.size() ; i++){
          if( players.get(i).payChips(ante) ){
            pot += ante;
            players.get(i).addCard(deck.popCard());
            players.get(i).addCard(deck.popCard());
          }

        }
        centerHand.add(deck.popCard());
        centerHand.add(deck.popCard());
        centerHand.add(deck.popCard());

        SystemVariables.getInstance().getUserInterface().printData(""+deck);
        for(Player p:players)
          SystemVariables.getInstance().getUserInterface().printData(""+p);

        SystemVariables.getInstance().getUserInterface().printData(""+centerHand);


    }
    public void playRound(){
      //human1.doTurn();
    }
    public static void main(String args[]){
      TexasHoldEm game = new TexasHoldEm();
      game.initializeRound(30);
      game.playRound();
    }
}

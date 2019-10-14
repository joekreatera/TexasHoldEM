public class HumanPlayer extends Player{

  @Override
  public void doTurn(){
    SystemVariables.getInstance().getUserInterface().printData("Tu turno");
  }
}

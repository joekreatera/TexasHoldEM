public class CPUPlayer extends Player{

  @Override
  public void doTurn(){
      SystemVariables.getInstance().getUserInterface().printData("CPU turn");
  }

}

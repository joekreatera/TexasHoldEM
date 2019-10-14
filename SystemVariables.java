public class SystemVariables{
  private UserInterface userInterface;
  private static SystemVariables instance;
  public void setUserInterface(UserInterface userInterface){
    this.userInterface = userInterface;
  }
  public UserInterface getInterface(){
    return userInterface;
  }
  public SystemVariables(){
  }
  public static SystemVariables getInstance(){
    if( instance == null)
      instance = new SystemVariables();
    return instance;
  }
}

import java.io.*;
public class TextUserInterface implements UserInterface{
  BufferedReader reader;
  PrintWriter writer;
  public TextUserInterface(){
    reader =   new BufferedReader(new InputStreamReader(System.in));
    writer = new PrintWriter(new OutputStreamWriter(System.out), true);
  }
  public String getData(){
      try{
        return reader.readLine();
      }catch(IOException ioe){
        System.out.println("Error on TextUserInterface reading");
      }
      return "";
  }
  public void printData(String data){
      writer.println(data);
  }
}

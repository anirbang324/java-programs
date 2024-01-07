import java.awt.*;  
  
// class to construct a frame and containing main method    
public class Main   
{    
  // class constructor   
  public Main()    
  {    
  
    // creating a frame  
    Frame f = new Frame("Canvas Example");   
    // adding canvas to frame   
    f.add(new Canvas());    
  
    // setting layout, size and visibility of frame  
    f.setLayout(null);    
    f.setSize(400, 400);    
    f.setVisible(true);    
  }    
  
  // main method  
  public static void main(String args[])    
  {    
    new Main();    
  }    
}    
  
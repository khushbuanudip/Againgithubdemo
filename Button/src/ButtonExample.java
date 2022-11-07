
import java.awt.*;    
import java.awt.event.*;    
public class ButtonExample {    
public static void main(String[] args) { 
	System.out.println("Hello world");
    // create instance of frame with the label   
    Frame f = new Frame("Button Example"); 
    Panel panel=new Panel();
    panel.setBounds(40,80,200,200);
    panel.setBackground(Color.red);
    final TextField tf=new TextField();    
    tf.setBounds(50,50, 150,20);  
    // create instance of button with label  
    Button b=new Button("Click Here");   
    // set the position for the button in frame   
    b.setBounds(50,100,60,30);   
    b.addActionListener(new ActionListener() {    
    public void actionPerformed (ActionEvent e) {    
            tf.setText("Welcome everyone");    
        }    
    });  
// adding button the frame  
    panel.add(b);  
// adding textfield the frame  
    panel.add(tf);    
    f.add(panel);
// setting size, layout and visibility   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true); 
    
}    
}    
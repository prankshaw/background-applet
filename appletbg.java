//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class hello extends Frame implements ActionListener
{
    Button b1;
    Button b2;
    Button b3;
    
    hello()
    {
        b1=new Button("Red");
        b2=new Button("Blue");
        b3=new Button("Green");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        add(b1);
        add(b2);
        add(b3);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            setBackground(Color.red);
        }
        else if(e.getSource()==b2)
        {
            setBackground(Color.blue);
        }
        else
        {
            setBackground(Color.green);
        }
        
    }    
   public static void main(String[] args)
   {
       hello h=new hello();
   }   
}

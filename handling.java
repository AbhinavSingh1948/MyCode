import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class handling extends Applet implements ActionListener{
    Button b = new Button("Yahan clik kar..");
    String str="";
    public void init(){
        add(b);
        b.addActionListener(this);
    }
    public void paint (Graphics g ){
        g.drawString(str,20,40);
    }
    public void actionperformed(ActionEvent e){
        str=" hoo gya kaam";
        repaint();
    }
}
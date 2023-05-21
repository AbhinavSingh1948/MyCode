import java.applet.Applet;
import java.awt.*;


/*
 <applet code="MyPolygon" height="800" width="800">
 </applet>
 */

public class MyPolygon extends Applet {
   public void paint(Graphics g) {
      int x[] = {50, 100, 150, 200};
      int y[] = {100, 50, 100, 150};
      int n= 4;
      g.drawPolygon(x, y, n);
   }
}
 



import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GameView extends JPanel{
   Image back,move;
   int x=0;
   int y=460;
   public GameView()
   {
	   back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
       move=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\h.gif");
   }
   public void paint(Graphics g)
   {
	   g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	   g.drawImage(move, x, y, 200, 120, this);
   }
}

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameMainFrame extends JFrame implements KeyListener{
    GameView gv=new GameView();
    public GameMainFrame()
    {
    	add("Center",gv);
    	setSize(800, 600);
    	setVisible(true);
    	gv.setFocusable(true);
    	gv.addKeyListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new GameMainFrame();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==gv)
		{
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				gv.x-=5;
				if(gv.x<0)
					gv.x=800;
				gv.repaint();
			}
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				gv.x+=5;
				if(gv.x>800)
					gv.x=0;
				gv.repaint();
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

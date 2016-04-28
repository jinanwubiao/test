package test18;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BjPane extends JPanel{
	Image img;
	public BjPane() {
		img=Toolkit.getDefaultToolkit().getImage("pic/a1.png");
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int imgwidth=img.getWidth(this);
		int imgheight=img.getHeight(this);;
		int fwidth=getWidth();
		int fheight=getHeight();
		int x=(fwidth-imgwidth)/2;
		int y=(fheight-imgheight)/2;
		System.out.println("imgwidth:"+imgwidth+",imgheight:"+imgheight);
		System.out.println("fwidth:"+fwidth+",fheight:"+fheight);
		g.drawImage(img, x, y, null);
	}

}

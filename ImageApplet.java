import java.awt.*;
import java.applet.*;

/*
<applet code = "IApp" width=200, height = 100>
</applet>
*/

public class ImageApplet extends Applet{
	private Image anImage;
	
	public void init(){
		anImage = Toolkit.getDefaultToolkit().getImage("pic1.png");
	}
	public void paint(Graphics g){
		g.drawImage(anImage,50,25,this);
		showStatus("image loaded");	
	}
}
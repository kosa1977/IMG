import javax.swing.JApplet;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Img extends JApplet {
    
    Image img;
    //Image test[];
    
    public void init()  {
        img = getImage(getDocumentBase(), "Lighthouse.jpg");
    }
    
    public void paint(Graphics g)   {
        g.clearRect(0,0, getSize().width, getSize().height);
        g.drawImage(img, 20, 20, this);
    }
    
    public boolean imgUpd (Image img, int flags, int x, int y, int width, int height) {
        if((flags & ImageObserver.ALLBITS) == 0) {
            showStatus("Trwa ładowanie");
            return true;
        }
        else {
            showStatus("Gotowe");
            repaint();
            return false;
        }
    }
}

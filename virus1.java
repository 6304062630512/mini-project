/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusdefense;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
//import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class virus1 { 
    Image img;
    public int x, x1;
    public int y, y1;
    public int count = 0;
    int z;
    
    virus1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        String imageLocation = "v1.PNG";
        URL imageURL = this.getClass().getResource(imageLocation);
        img = Toolkit.getDefaultToolkit().getImage(imageURL);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (z == 1) {
                    x += 4;
                    y += 2;
                } else if (z == 2) {
                    y += 4;
                    x += 4;
                } else if (z == 3) {
                    y += 4;
                    x += 1;
                } else if (z == 4) {
                    y += 4;
                    x -= 1;
                } else if (z == 5) {
                    x -= 4;
                    y += 4;
                } else if (z == 6) {
                    x -= 4;
                    y += 2;
                }
                if (x >= 1100) {
                    img = null;
                    runner = null;
                    x = -500;
                    y = -500;
                }
                try {               
                    runner.sleep(30);
                } catch (InterruptedException e) {
                }
            }
        }
    });

    public Image getImage() {
        return img;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle2D getbound() {
        return (new Rectangle2D.Double(x, y, 45, 45));
    }     
}


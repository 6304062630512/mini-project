/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusdefense;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class spaceship {
    public ImageIcon[] sp = new ImageIcon[7];
    public int x;
    public int count = 4;
    
    spaceship() {
        for(int i=0;i<7;i++){
            sp[i] = new ImageIcon(this.getClass().getResource((i+1)+".png"));
	} 
    }
}

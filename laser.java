/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusdefense;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class laser extends JPanel{
     public ImageIcon[] ls = new ImageIcon[2];
    public int y;
    public int x,xy;
    public int count = 0;
    laser(int x,int y,int xy){
        this.xy = xy;
        for(int i=0; i<ls.length; i++){
            String imageLocation = "l"+(i+1)+".png";
            ls[i] = new ImageIcon(this.getClass().getResource(imageLocation));
	}
        if(xy == 1){
            this.x = x-13;
            this.y = y+26;
        }
        else if(xy == 2){
            this.x = x-8;
            this.y = y+3;
        }
        else if(xy == 3){
            this.x = x+5;
            this.y = y-5;
        }
        else if(xy == 4){
            this.x = x+30;
            this.y = y-25;
        }
        else if(xy == 5){
            this.x = x+67;
            this.y = y+6;
        }
        else if(xy == 6){
            this.x = x+77;
            this.y = y+20;
        }
        else if(xy == 7){
            this.x = x+80;
            this.y = y+38;
        }
    }
	
    public void move(){ 
        if(xy == 1){
            this.y -= 2;
            this.x -= 3;
        }
        else if(xy == 2){
            this.y -= 2;
            this.x -= 2;
        }
        else if(xy == 3){
            this.y -= 2;
            this.x  -= 1;
        }
        else if(xy == 4){
            this.y -= 2;
        }
        else if(xy == 5){
            this.y -= 3;
            this.x += 2;
        }
        else if(xy == 6){
            this.y -= 2;
            this.x += 3;
        }
        else if(xy == 7){
            this.y -= 1;
            this.x += 4;
        }
    }
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,y,25,25));
    }
}

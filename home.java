/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusdefense;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class home extends JPanel{
    private ImageIcon feild = new ImageIcon(this.getClass().getResource("homegame.jpg"));
    private ImageIcon quit = new ImageIcon (this.getClass().getResource("quit.jpg"));
    private ImageIcon start = new ImageIcon(this.getClass().getResource("start.jpg"));
    public JButton Start = new JButton(start);
    public JButton Exit  = new JButton(quit);
	home(){
            setLayout(null);
            Start.setBounds(750, 600, 120, 72);
            add(Start);
            Exit.setBounds(75, 600, 120, 72);
            add(Exit);
	}
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(feild.getImage(),0,0,1000,800,this);	
	}
}

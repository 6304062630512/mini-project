/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusdefense;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class state extends JPanel implements ActionListener{
    ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("state1.jpg"));
    ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("state2.jpg"));
    ImageIcon win = new ImageIcon(this.getClass().getResource("winner.jpg"));
    ImageIcon pause = new ImageIcon(this.getClass().getResource("restart.jpg"));
    ImageIcon back = new ImageIcon(this.getClass().getResource("exit.jpg"));
    spaceship ss = new spaceship();
    
    home hg = new home();
    ImageIcon feildover = new ImageIcon(this.getClass().getResource("gameover.jpg"));
    ImageIcon exitover = new ImageIcon(this.getClass().getResource("exit.jpg"));
    ImageIcon restart = new ImageIcon(this.getClass().getResource("restart.jpg"));
    JButton Startover = new JButton(restart);
    JButton Exitover = new JButton(exitover);

    private JLabel score = new JLabel();
    public JButton Pause = new JButton(pause);
    public JButton Exithome = new JButton(back);
    public ArrayList<laser> lsr = new ArrayList<laser>();
    public ArrayList<virus1> vr1 = new ArrayList<virus1>();
    public ArrayList<virus2> vr2 = new ArrayList<virus2>();
    public ArrayList<virus3> vr3 = new ArrayList<virus3>();

    public int times;
    public int HP = 3;
    public int s1 = 1;
    public int s2 = 2;
    boolean timestart = true;
    boolean startvr  = false;

    public int scor = 0;

    Thread time = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }

                if (timestart == false) {
                    repaint();
                }
            }
        }
    });

    Thread actor = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                repaint();
            }
        }
    });
    
    Thread birthvr1 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startvr  == false) {
                        Thread.sleep((long)(Math.random() *10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startvr  == false) {
                    int ran = (int)(Math.random() * 4);
                    if (ran == 1) {
                        vr1.add(new virus1(0, 350, 1));
                    } else if (ran == 2) {
                        vr2.add(new virus2(0, 350, 1));
                    } else if (ran == 3) {
                        vr3.add(new virus3(0, 350, 1));
                    }
                }
            }
        }
    });
    
    Thread birthvr2 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startvr  == false) {
                        Thread.sleep((long)(Math.random()*10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startvr  == false) {
                    int ran = (int)(Math.random() * 4);
                    if (ran == 1) {
                        vr1.add(new virus1(0, 150, 2));
                    } else if (ran == 2) {
                        vr2.add(new virus2(0, 150, 2));
                    } else if (ran == 3) {
                        vr3.add(new virus3(0, 150, 2));
                    }
                }
            }
        }
    });

    Thread birthvr3 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startvr  == false) {
                        Thread.sleep((long)(Math.random()* 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startvr  == false) {
                    int ran = (int)(Math.random() * 4);
                    if (ran == 1) {
                        vr1.add(new virus1(250, 0, 3));
                    } else if (ran == 2) {
                        vr2.add(new virus2(250, 0, 3));
                    } else if (ran == 3) {
                        vr3.add(new virus3(250, 0, 3));
                    }
                }
            }
        }
    });

    Thread birthvr4 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startvr  == false) {
                        Thread.sleep((long)(Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startvr  == false) {
                    int ran = (int)(Math.random() * 4);
                    if (ran == 1) {
                        vr1.add(new virus1(700, 0, 4));
                    } else if (ran == 2) {
                        vr2.add(new virus2(700, 0, 4));
                    } else if (ran == 3) {
                        vr3.add(new virus3(700, 0, 4));
                    }
                }
            }
        }
    });

    Thread birthvr5 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startvr  == false) {
                        Thread.sleep((long)(Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startvr  == false) {
                    int ran = (int)(Math.random() * 4);
                    if (ran == 1) {
                        vr1.add(new virus1(1000, 150, 5));
                    } else if (ran == 2) {
                        vr2.add(new virus2(1000, 150, 5));
                    } else if (ran == 3) {
                        vr3.add(new virus3(1000, 150, 5));
                    }
                }
            }
        }
    });

    Thread birthvr6 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startvr  == false) {
                        Thread.sleep((long)(Math.random() * 10000) + 2000);
                    }
                } catch (InterruptedException e) {

                }
                if (startvr  == false) {
                    int ran = (int)(Math.random() * 4);
                    if (ran == 1) {
                        vr1.add(new virus1(1100, 350, 6));
                    } else if (ran == 2) {
                        vr2.add(new virus2(1000, 350, 6));
                    } else if (ran == 3) {
                        vr3.add(new virus3(1000, 350, 6));
                    }
                }
            }
        }
    });

    Thread t = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestart == false) {
                    times = (times - 1);

                }
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {

                }
            }
        }
    });

    state() {
        this.setFocusable(true);
        this.setLayout(null);
        Pause.setBounds(850, 100, 40, 40);
        Exithome.setBounds(850, 30, 40, 40);
        Pause.addActionListener(this);
        Exithome.addActionListener(this);
        Exithome.addActionListener(this);
        this.add(Pause);
        this.add(Exithome);
        this.add(score);
        //spaceship
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int a = e.getKeyCode();

                if (a == KeyEvent.VK_A && ss.count > 1) {
                    ss.count--;
                } else if (a == KeyEvent.VK_D && ss.count < 7) {
                    ss.count++;
                }
                if (a == KeyEvent.VK_SPACE ) {
                    lsr.add(new laser(ss.x, 550, ss.count));
                }
            }
        });
        ss.x = 450;
        time.start();
        actor.start();
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (times <= 0 || HP <= 0) {
            //fail
            if (HP == 0) {
                Pause.setBounds(850, 650, 40, 40);
                Exithome.setBounds(750, 650, 40, 40);
                this.setLayout(null);
                g.drawImage(feildover.getImage(), 0, 0, 1000, 800, this);
                g.setColor(Color.RED);
                g.setFont(new Font("2005_iannnnnTKO",Font.ROMAN_BASELINE, 50));
                g.drawString("SCORE " + scor, 370, 200);

            //win
            } else if (times <= 0) {
                Pause.setBounds(850, 650, 40, 40);
                Exithome.setBounds(750, 650, 40, 40);
                this.setLayout(null);
                g.drawImage(win.getImage(), 0, 0, 1000, 800, this);
                g.setColor(Color.ORANGE);
                g.setFont(new Font("2005_iannnnnTKO",Font.ROMAN_BASELINE, 40));
                g.drawString("SCORE " + scor, 370, 350);


            }
        //state 2 
        } else if (times <= 60) {                                                 
            g.drawImage(imgstate2.getImage(), 0, 0, 1000, 800, this);

            g.drawImage(ss.sp[ss.count - 1].getImage(), ss.x, 550, 110, 160, this);

            for (int i = 0; i < lsr.size(); i++) {
                laser ba = lsr.get(i);
                g.drawImage(ba.ls[ba.count % 2].getImage(), ba.x, ba.y, 40, 40, null);
                ba.move();
                ba.count++;
                if (ba.y < 0) {
                    lsr.remove(i);
                }
            }
            //virus1
            for (int i = 0; i < vr1.size(); i++) {
                g.drawImage(vr1.get(i).getImage(), vr1.get(i).getX(), vr1.get(i).getY(), 100, 100, this);
                vr1.get(i).y1 = 1;
                if (vr1.get(i).y >= 550 && vr1.get(i).x < 600) {
                    HP--;
                    vr1.remove(i);
                }
            }
            for (int i = 0; i < lsr.size(); i++) {
                for (int j = 0; j < vr1.size(); j++) {
                    if (Intersect(lsr.get(i).getbound(), vr1.get(j).getbound()) && j - 1 < vr1.size() && i - 1 < lsr.size()) {
                        vr1.remove(j);
                        lsr.remove(i);
                        scor += 100;
                    }
                }
            }
            //virus2
            for (int i = 0; i < vr2.size(); i++) {
                g.drawImage(vr2.get(i).getImage(), vr2.get(i).x, vr2.get(i).y, 100, 100, this);
                if (vr2.get(i).y >= 550 && vr2.get(i).x < 600) {
                    HP--;
                    vr2.remove(i);
                }
            }
            for (int i = 0; i < lsr.size(); i++) {
                for (int j = 0; j < vr2.size(); j++) {
                    if (Intersect(lsr.get(i).getbound(), vr2.get(j).getbound()) && j < vr2.size() && i < lsr.size()) {
                        lsr.remove(i);
                        vr2.get(j).hp--;
                        if (vr2.get(j).hp <= 0) {
                            vr2.remove(j);
                            scor += 200;
                        }
                    }
                }
            }
            //virus3
            for (int i = 0; i < vr3.size(); i++) {
                g.drawImage(vr3.get(i).getImage(), vr3.get(i).x, vr3.get(i).y, 100, 100, this);
                if (vr3.get(i).y >= 700) {
                    vr3.remove(i);
                }
            }
            for (int i = 0; i < lsr.size(); i++) {
                for (int j = 0; j < vr3.size(); j++) {
                    if (Intersect(lsr.get(i).getbound(), vr3.get(j).getbound()) && j < vr3.size() && i < lsr.size()) {
                        vr3.remove(j);
                        lsr.remove(i);
                        scor -= 150;
                        g.drawString("-150", ss.x + 100, 650);
                    }
                }
            }
            
            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.setColor(Color.WHITE);
            g.drawString("SCORE =  " + scor, 75, 650);
            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.drawString("STATE " + s2, 400, 80);
            g.drawString("Time " + times, 800, 650);
            g.setColor(Color.RED);
            g.drawString("HP  " + HP, 75, 120);

        //state1
        } else {                                                              
            g.drawImage(imgstate1.getImage(), 0, 0, 1000, 800, this);
            g.drawImage(ss.sp[ss.count - 1].getImage(), ss.x, 550, 110, 160, this);

            for (int i = 0; i < lsr.size(); i++) {
                laser ba = lsr.get(i);
                g.drawImage(ba.ls[ba.count % 2].getImage(), ba.x, ba.y, 40, 40, null);
                ba.move();
                ba.count++;
                if (ba.y < 0) {
                    lsr.remove(i);
                }
            }

            //virus1
            for (int i = 0; i < vr1.size(); i++) {
                g.drawImage(vr1.get(i).getImage(), vr1.get(i).getX(), vr1.get(i).getY(), 100, 100, this);
                vr1.get(i).y1 = 2;          //ba1.get(i).yy=2;     
                if (vr1.get(i).y >= 550 && vr1.get(i).x < 600) {
                    HP--;
                    vr1.remove(i);
                }
                if (times % 3 == 1) {
                    vr1.get(i).y--;
                }                     
            }
            for (int i = 0; i < lsr.size(); i++) {
                for (int j = 0; j < vr1.size(); j++) {
                    if (Intersect(lsr.get(i).getbound(), vr1.get(j).getbound()) && j < vr1.size() && i < lsr.size()) {
                        vr1.remove(j);
                        lsr.remove(i);
                        scor += 50;
                    }
                }
            }
            //virus2
            for (int i = 0; i < vr2.size(); i++) {

                vr2.remove(i);
            }
            //virus3
            for (int i = 0; i < vr3.size(); i++) {
                g.drawImage(vr3.get(i).getImage(),vr3.get(i).x, vr3.get(i).y, 100, 100, this);
                if (vr3.get(i).y >= 700) {
                    vr3.remove(i);
                }

            }
            for (int i = 0; i < lsr.size(); i++) {
                for (int j = 0; j < vr3.size(); j++) {
                    if (Intersect(lsr.get(i).getbound(),vr3.get(j).getbound()) && j < vr3.size() && i < lsr.size()) {
                        vr3.remove(j);
                        lsr.remove(i);
                        scor -= 50;
                        g.drawString("-50", ss.x + 100, 580);
                    }
                }
            }

            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.setColor(Color.BLACK);
            g.drawString("SCORE =  " + scor, 75, 650);
            g.setFont(new Font("Hobo Std", Font.HANGING_BASELINE, 30));
            g.drawString("STATE " + s1, 400, 80);
            g.drawString("Time " + times, 800, 650);
            g.setColor(Color.RED);
            g.drawString("HP  " + HP, 75, 120);

        }
    }

    public boolean Intersect(Rectangle2D a, Rectangle2D b) {
        return (a.intersects(b));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Startover) {
            this.setSize(1000, 800);
            this.add(hg);
            this.setLocation(null);
            timestart = true;
            startvr = true;
        } else if (e.getSource() == Exitover) {
            System.exit(0);
        }
    }
}



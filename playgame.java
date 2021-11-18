/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusdefense;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class playgame extends JFrame implements ActionListener{
    home home = new home();
    state state = new state();

    public playgame() {
        this.setSize(1000, 800);
        this.add(home);
        home.Exit.addActionListener(this);
        home.Start.addActionListener(this);
        state.Exithome.addActionListener(this);
        state.Pause.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home.Start) {
            this.setLocationRelativeTo(null);
            this.remove(home);
            this.setSize(1000, 800);
            this.add(state);
            state.requestFocusInWindow();
            state.timestart = false;
            state.scor = 0;
            state.HP = 3;
            state.times = 100;
            state.startvr  = false;
            state.timestart = false;
            state.birthvr1.start();
            state.birthvr2.start();
            state.birthvr3.start();
            state.birthvr4.start();
            state.birthvr5.start();
            state.birthvr6.start();
        } else if (e.getSource() == state.Exithome) {
            System.exit(0);
        } else if (e.getSource() == home.Exit) {
            System.exit(0);
        } else if (e.getSource() == state.Pause) {
            dispose();
            JFrame jf = new playgame();
            jf.setSize(1000, 800);
            jf.setTitle("VIRUS DEFENSE");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);

        }
        this.validate();
        this.repaint();
    }

    public static void main(String[] args) {
        JFrame jf = new playgame();
        jf.setSize(1000, 800);
        jf.setTitle("VIRUS DEFENSE");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}



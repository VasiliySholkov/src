import Risunochek.JFrmaeGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Risunok {

    public static class JFrameGraphics extends JPanel {

        public void paint(Graphics g){
            g.drawString("Hello Text!", 5, 5);
        }

        public static void main(String[] args){

            JFrame frame= new JFrame("Hello");
            frame.getContentPane().add(new JFrmaeGraphics());
            frame.setSize(300, 300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
        }
    }
}

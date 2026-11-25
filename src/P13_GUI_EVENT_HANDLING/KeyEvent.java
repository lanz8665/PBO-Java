package P13_GUI_EVENT_HANDLING;

import java.awt.Color;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEvent extends JFrame implements KeyListener{

    JFrame f = new JFrame("Key Event");
    JLabel kotak = new JLabel();
    public KeyEvent(){
        
        kotak.setBounds(0, 0, 50, 50);
        kotak.setBackground(Color.blue);
        kotak.setOpaque(true);
        f.add(kotak);
        //register frame ke listener
        f.addKeyListener(this);
        //setting frame
        f.setSize(400, 500);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {

        int x = kotak.getX();
        int y = kotak.getY();
        
        switch(e.getKeyChar()){
            case 'a' -> {
                kotak.setLocation(x-10, y);
            }
            case 'w'->{
                kotak.setLocation(x, y-10);
            }
            case 'd'->{
                kotak.setLocation(x+10, y);
            }
            case 's'->{
                kotak.setLocation(x, y+10);
            }
        }
        
        System.out.println("you typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {        
//        System.out.println("Melepas karakter: " + e.getKeyChar());
//        System.out.println("Melepas tombol: " + e.getKeyCode());
    }
    
}

package P13_GUI_EVENT_HANDLING;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandling extends JFrame implements MouseListener{
    
    JFrame frame = new JFrame("Aplikasi Event Handling");
    JLabel kotak = new JLabel();
    public EventHandling(){
        
        kotak.setBounds(0, 0, 50, 50);
        kotak.setBackground(Color.red);
        kotak.setOpaque(true);
        kotak.addMouseListener(this);
        //frame.addMouseListener(this);
        frame.getContentPane().addMouseListener(this);        
        frame.add(kotak);
        
        //setting frame
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX() - kotak.getWidth()/2;
        int y = e.getY() - kotak.getHeight()/2;
        kotak.setBounds(x, y, 50, 50);

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==kotak){
            kotak.setBackground(Color.red);
            kotak.setOpaque(true);        
        }        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==kotak){
            kotak.setBackground(Color.yellow);
            kotak.setOpaque(true);        
        }
    }
    
}

package app.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class ButtonCustomApp extends JButton{

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public ButtonCustomApp(){
        setContentAreaFilled(false);    
    }
   
    private int radius = 0;
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //PAINT BORDER
        //g2.setColor(borderColor);
        //g2.fillRoundRect(0, 0, getWidth(),getHeight(),radius, radius);
        //g2.setColor(getBackground());
      
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}

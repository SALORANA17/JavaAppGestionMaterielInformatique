package app.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class TextFieldCustom extends JTextField{
    
    private boolean mouseOver = false;
    
    public TextFieldCustom(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me){
                mouseOver = true;
                repaint();
            }
            
            @Override
            public void mouseExited(MouseEvent me){
                mouseOver = false;
                repaint();
            }
        });
    }
    
    @Override
    public void paint(Graphics grphcs){
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        int width = getWidth();
        int height = getHeight();
        
        if(mouseOver){
            g2.setColor(new Color(153,204,255));
        }else{
            g2.setColor(new Color(0,51,102));
        }
        
        g2.fillRect(2, height - 1, width - 4, 1);
        g2.dispose();
    }
}

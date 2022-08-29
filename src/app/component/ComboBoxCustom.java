package app.component;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class ComboBoxCustom<E> extends JComboBox<E>{

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    
    private Color lineColor = new Color(3, 155, 216);
    private boolean mouseOver;
    
    public ComboBoxCustom(){
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(15, 3, 5, 3));
        setUI(new ComboUI(this));
        setRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean bln1){
                Component com = super. getListCellRendererComponent(jlist, o, i, bln, bln1);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                if(bln){
                    com.setBackground(new Color(240, 240, 240));
                }
                return com;
            }
        });
    }

    private class ComboUI extends BasicComboBoxUI {

        private ComboBoxCustom combo;
        
        public ComboUI(ComboBoxCustom combo) {
            this.combo = combo;
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
            addPopupMenuListener(new PopupMenuListener(){
                @Override
                public void popupMenuWillBecomeVisible(PopupMenuEvent pme) {
                    arrowButton.setBackground(new Color(200, 200, 200));
                }

                @Override
                public void popupMenuWillBecomeInvisible(PopupMenuEvent pme) {
                     arrowButton.setBackground(new Color(150, 150, 150));
                }

                @Override
                public void popupMenuCanceled(PopupMenuEvent pme) {
                    arrowButton.setBackground(new Color(150, 150, 150));
                }
                
            });
        }
        
        @Override
        public void paintCurrentValueBackground(Graphics grphcs, Rectangle rctngl, boolean bin){
            
        }
        
        @Override
        protected JButton createArrowButton(){
            return new ArrowButton();
        }
        
        @Override
        protected ComboPopup createPopup(){
            BasicComboPopup pop = new BasicComboPopup(comboBox){
                @Override
                protected JScrollPane createScroller(){
                    list.setFixedCellHeight(30);
                    JScrollPane scroll = new JScrollPane(list);
                    scroll.setBackground(Color.WHITE);
                    ScrollBarCustom sb = new ScrollBarCustom();
                    sb.setUnitIncrement(30);
                    sb.setForeground(new Color(180, 180, 180));
                    scroll.setVerticalScrollBar(sb);
                    return scroll;
                }
            };
            pop.setBorder(new LineBorder(new Color(200, 200, 200),1));
            return pop;
        }
        
        @Override
        public void paint(Graphics grphcs, JComponent jc){
            super.paint(grphcs, jc);
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            int width = getWidth();
            int height = getHeight();

            if(mouseOver){
                g2.setColor(new Color(153,204,255));
            }else{
                g2.setColor(new Color(150,150,150));
            }

            g2.fillRect(2, height - 1, width - 4, 1);
            g2.dispose();
        }
        
        public class ArrowButton extends JButton{
            public ArrowButton(){
                setContentAreaFilled(false);
                setBorder(new EmptyBorder(5, 5, 5, 5));
                setBackground(new Color(150, 150, 150));
            }
            
            @Override
            public void paint(Graphics grphcs){
                super.paint(grphcs);
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                int width = getWidth();
                int height = getHeight();
                int size = 10;
                int x = (width - size)/2;
                int y = (height - size)/2 + 2;
                int px[] = {x, x + size, x + size/2};
                int py[] = {y, y, y + size};
                g2.setColor(getBackground());
                g2.fillPolygon(px, py, px.length);
                g2.dispose();
            }
        }
    }
}

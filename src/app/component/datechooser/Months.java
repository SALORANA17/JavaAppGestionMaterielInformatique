package app.component.datechooser;

public final class Months extends javax.swing.JPanel {

    private Event event;
    private int m;

    public Months() {
        initComponents();
    }

    private void addEvent() {
        for (int i = 0; i < getComponentCount(); i++) {
            ((Button) getComponent(i)).setEvent(event);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd1 = new app.component.datechooser.Button();
        cmd2 = new app.component.datechooser.Button();
        cmd3 = new app.component.datechooser.Button();
        cmd4 = new app.component.datechooser.Button();
        cmd5 = new app.component.datechooser.Button();
        cmd6 = new app.component.datechooser.Button();
        cmd7 = new app.component.datechooser.Button();
        cmd8 = new app.component.datechooser.Button();
        cmd9 = new app.component.datechooser.Button();
        cmd10 = new app.component.datechooser.Button();
        cmd11 = new app.component.datechooser.Button();
        cmd12 = new app.component.datechooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(159, 60));
        setLayout(new java.awt.GridLayout(4, 3));

        cmd1.setForeground(new java.awt.Color(75, 75, 75));
        cmd1.setText("Janvier");
        cmd1.setName("1"); // NOI18N
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });
        add(cmd1);

        cmd2.setForeground(new java.awt.Color(75, 75, 75));
        cmd2.setText("Fevrier");
        cmd2.setName("2"); // NOI18N
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });
        add(cmd2);

        cmd3.setForeground(new java.awt.Color(75, 75, 75));
        cmd3.setText("Mars");
        cmd3.setName("3"); // NOI18N
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });
        add(cmd3);

        cmd4.setForeground(new java.awt.Color(75, 75, 75));
        cmd4.setText("Avril");
        cmd4.setName("4"); // NOI18N
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });
        add(cmd4);

        cmd5.setForeground(new java.awt.Color(75, 75, 75));
        cmd5.setText("Mai");
        cmd5.setName("5"); // NOI18N
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });
        add(cmd5);

        cmd6.setForeground(new java.awt.Color(75, 75, 75));
        cmd6.setText("Juin");
        cmd6.setName("6"); // NOI18N
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });
        add(cmd6);

        cmd7.setForeground(new java.awt.Color(75, 75, 75));
        cmd7.setText("Juillet");
        cmd7.setName("7"); // NOI18N
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });
        add(cmd7);

        cmd8.setForeground(new java.awt.Color(75, 75, 75));
        cmd8.setText("Aout");
        cmd8.setName("8"); // NOI18N
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd8ActionPerformed(evt);
            }
        });
        add(cmd8);

        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("Septembre");
        cmd9.setName("9"); // NOI18N
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });
        add(cmd9);

        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("Octobre");
        cmd10.setName("10"); // NOI18N
        cmd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd10ActionPerformed(evt);
            }
        });
        add(cmd10);

        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("Novembre");
        cmd11.setName("11"); // NOI18N
        cmd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd11ActionPerformed(evt);
            }
        });
        add(cmd11);

        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("Decembre");
        cmd12.setName("12"); // NOI18N
        cmd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd12ActionPerformed(evt);
            }
        });
        add(cmd12);
    }// </editor-fold>//GEN-END:initComponents

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }
    
    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd1ActionPerformed

    private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd2ActionPerformed

    private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd3ActionPerformed

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd5ActionPerformed

    private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd6ActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd7ActionPerformed

    private void cmd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd8ActionPerformed

    private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd9ActionPerformed

    private void cmd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd10ActionPerformed

    private void cmd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd11ActionPerformed

    private void cmd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.component.datechooser.Button cmd1;
    private app.component.datechooser.Button cmd10;
    private app.component.datechooser.Button cmd11;
    private app.component.datechooser.Button cmd12;
    private app.component.datechooser.Button cmd2;
    private app.component.datechooser.Button cmd3;
    private app.component.datechooser.Button cmd4;
    private app.component.datechooser.Button cmd5;
    private app.component.datechooser.Button cmd6;
    private app.component.datechooser.Button cmd7;
    private app.component.datechooser.Button cmd8;
    private app.component.datechooser.Button cmd9;
    // End of variables declaration//GEN-END:variables
}

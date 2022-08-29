package app.component.datechooser;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;

public final class Dates extends javax.swing.JPanel {

    private Event event;
    private final int MONTH;
    private final int YEAR;
    private final int DAY;
    private int m;
    private int y;
    private int selectDay = 0;
    private int startDate;
    private int max_of_month;

    public Dates() {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String toDay = df.format(date);
        DAY = Integer.valueOf(toDay.split("-")[0]);
        MONTH = Integer.valueOf(toDay.split("-")[1]);
        YEAR = Integer.valueOf(toDay.split("-")[2]);
    }

    public void showDate(int month, int year, SelectedDate select) {
        m = month;
        y = year;
        // selectDay = 0;
        Calendar cd = Calendar.getInstance();
        cd.set(year, month - 1, 1);
        int start = cd.get(Calendar.DAY_OF_WEEK);
        max_of_month = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (start == 1) {
            start += 7;
        }
        clear();
        start += 5;
        startDate = start;
        for (int i = 1; i <= max_of_month; i++) {
            Button cmd = (Button) getComponent(start);
            cmd.setColorSelected(getForeground());
            cmd.setText(i + "");
            if (i == DAY && month == MONTH && year == YEAR) {
                cmd.setBackground(new Color(224, 214, 229));
            } else {
                cmd.setBackground(Color.WHITE);
            }
            if (i == select.getDay() && month == select.getMonth() && year == select.getYear()) {
                cmd.setBackground(getForeground());
                cmd.setForeground(new Color(255, 255, 255));
            }
            start++;
        }
    }

    private void clear() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((JButton) getComponent(i)).setText("");
        }
    }

    public void clearSelected() {
        for (int i = 7; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            if (MONTH == m && y == YEAR && !cmd.getText().equals("") && Integer.valueOf(cmd.getText()) == DAY) {
                cmd.setBackground(new Color(224, 214, 229));
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            } else {
                cmd.setBackground(Color.WHITE);
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            }
        }
        selectDay = 0;
    }

    private void addEvent() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((Button) getComponent(i)).setEvent(event);
        }
    }

    public void setSelected(int index) {
        selectDay = index;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMo = new app.component.datechooser.Button();
        cmdTu = new app.component.datechooser.Button();
        cmdWe = new app.component.datechooser.Button();
        cmdTh = new app.component.datechooser.Button();
        cmdFr = new app.component.datechooser.Button();
        cmdSa = new app.component.datechooser.Button();
        cmdSu = new app.component.datechooser.Button();
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
        cmd13 = new app.component.datechooser.Button();
        cmd14 = new app.component.datechooser.Button();
        cmd15 = new app.component.datechooser.Button();
        cmd16 = new app.component.datechooser.Button();
        cmd17 = new app.component.datechooser.Button();
        cmd18 = new app.component.datechooser.Button();
        cmd19 = new app.component.datechooser.Button();
        cmd20 = new app.component.datechooser.Button();
        cmd21 = new app.component.datechooser.Button();
        cmd22 = new app.component.datechooser.Button();
        cmd23 = new app.component.datechooser.Button();
        cmd24 = new app.component.datechooser.Button();
        cmd25 = new app.component.datechooser.Button();
        cmd26 = new app.component.datechooser.Button();
        cmd27 = new app.component.datechooser.Button();
        cmd28 = new app.component.datechooser.Button();
        cmd29 = new app.component.datechooser.Button();
        cmd30 = new app.component.datechooser.Button();
        cmd31 = new app.component.datechooser.Button();
        cmd32 = new app.component.datechooser.Button();
        cmd33 = new app.component.datechooser.Button();
        cmd34 = new app.component.datechooser.Button();
        cmd35 = new app.component.datechooser.Button();
        cmd36 = new app.component.datechooser.Button();
        cmd37 = new app.component.datechooser.Button();
        cmd38 = new app.component.datechooser.Button();
        cmd39 = new app.component.datechooser.Button();
        cmd40 = new app.component.datechooser.Button();
        cmd41 = new app.component.datechooser.Button();
        cmd42 = new app.component.datechooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(133, 147));
        setPreferredSize(new java.awt.Dimension(133, 147));
        setLayout(new java.awt.GridLayout(7, 7));

        cmdMo.setForeground(new java.awt.Color(118, 118, 118));
        cmdMo.setText("Lun");
        cmdMo.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdMo.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdMo.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdMo);

        cmdTu.setForeground(new java.awt.Color(118, 118, 118));
        cmdTu.setText("Mar");
        cmdTu.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdTu.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdTu.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdTu);

        cmdWe.setForeground(new java.awt.Color(118, 118, 118));
        cmdWe.setText("Mer");
        cmdWe.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdWe.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdWe.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdWe);

        cmdTh.setForeground(new java.awt.Color(118, 118, 118));
        cmdTh.setText("Jeu");
        cmdTh.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdTh.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdTh.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdTh);

        cmdFr.setForeground(new java.awt.Color(118, 118, 118));
        cmdFr.setText("Ven");
        cmdFr.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdFr.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdFr.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdFr);

        cmdSa.setForeground(new java.awt.Color(118, 118, 118));
        cmdSa.setText("Sam");
        cmdSa.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdSa.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdSa.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdSa);

        cmdSu.setForeground(new java.awt.Color(255, 1, 1));
        cmdSu.setText("Dim");
        cmdSu.setMaximumSize(new java.awt.Dimension(15, 21));
        cmdSu.setMinimumSize(new java.awt.Dimension(15, 21));
        cmdSu.setPreferredSize(new java.awt.Dimension(15, 21));
        add(cmdSu);

        cmd1.setForeground(new java.awt.Color(75, 75, 75));
        cmd1.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd1.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd1.setName("day"); // NOI18N
        cmd1.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd1);

        cmd2.setForeground(new java.awt.Color(75, 75, 75));
        cmd2.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd2.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd2.setName("day"); // NOI18N
        cmd2.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd2);

        cmd3.setForeground(new java.awt.Color(75, 75, 75));
        cmd3.setText("1");
        cmd3.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd3.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd3.setName("day"); // NOI18N
        cmd3.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd3);

        cmd4.setForeground(new java.awt.Color(75, 75, 75));
        cmd4.setText("2");
        cmd4.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd4.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd4.setName("day"); // NOI18N
        cmd4.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd4);

        cmd5.setForeground(new java.awt.Color(75, 75, 75));
        cmd5.setText("3");
        cmd5.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd5.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd5.setName("day"); // NOI18N
        cmd5.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd5);

        cmd6.setForeground(new java.awt.Color(75, 75, 75));
        cmd6.setText("4");
        cmd6.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd6.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd6.setName("day"); // NOI18N
        cmd6.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd6);

        cmd7.setForeground(new java.awt.Color(75, 75, 75));
        cmd7.setText("5");
        cmd7.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd7.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd7.setName("day"); // NOI18N
        cmd7.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd7);

        cmd8.setForeground(new java.awt.Color(75, 75, 75));
        cmd8.setText("6");
        cmd8.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd8.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd8.setName("day"); // NOI18N
        cmd8.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd8);

        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("7");
        cmd9.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd9.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd9.setName("day"); // NOI18N
        cmd9.setPreferredSize(new java.awt.Dimension(13, 15));
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });
        add(cmd9);

        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("8");
        cmd10.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd10.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd10.setName("day"); // NOI18N
        cmd10.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd10);

        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("9");
        cmd11.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd11.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd11.setName("day"); // NOI18N
        cmd11.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd11);

        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("10");
        cmd12.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd12.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd12.setName("day"); // NOI18N
        cmd12.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd12);

        cmd13.setForeground(new java.awt.Color(75, 75, 75));
        cmd13.setText("11");
        cmd13.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd13.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd13.setName("day"); // NOI18N
        cmd13.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd13);

        cmd14.setForeground(new java.awt.Color(75, 75, 75));
        cmd14.setText("12");
        cmd14.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd14.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd14.setName("day"); // NOI18N
        cmd14.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd14);

        cmd15.setForeground(new java.awt.Color(75, 75, 75));
        cmd15.setText("13");
        cmd15.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd15.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd15.setName("day"); // NOI18N
        cmd15.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd15);

        cmd16.setForeground(new java.awt.Color(75, 75, 75));
        cmd16.setText("14");
        cmd16.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd16.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd16.setName("day"); // NOI18N
        cmd16.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd16);

        cmd17.setForeground(new java.awt.Color(75, 75, 75));
        cmd17.setText("15");
        cmd17.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd17.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd17.setName("day"); // NOI18N
        cmd17.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd17);

        cmd18.setForeground(new java.awt.Color(75, 75, 75));
        cmd18.setText("16");
        cmd18.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd18.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd18.setName("day"); // NOI18N
        cmd18.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd18);

        cmd19.setForeground(new java.awt.Color(75, 75, 75));
        cmd19.setText("17");
        cmd19.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd19.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd19.setName("day"); // NOI18N
        cmd19.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd19);

        cmd20.setForeground(new java.awt.Color(75, 75, 75));
        cmd20.setText("18");
        cmd20.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd20.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd20.setName("day"); // NOI18N
        cmd20.setPreferredSize(new java.awt.Dimension(13, 15));
        cmd20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd20ActionPerformed(evt);
            }
        });
        add(cmd20);

        cmd21.setForeground(new java.awt.Color(75, 75, 75));
        cmd21.setText("19");
        cmd21.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd21.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd21.setName("day"); // NOI18N
        cmd21.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd21);

        cmd22.setForeground(new java.awt.Color(75, 75, 75));
        cmd22.setText("20");
        cmd22.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd22.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd22.setName("day"); // NOI18N
        cmd22.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd22);

        cmd23.setForeground(new java.awt.Color(75, 75, 75));
        cmd23.setText("21");
        cmd23.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd23.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd23.setName("day"); // NOI18N
        cmd23.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd23);

        cmd24.setForeground(new java.awt.Color(75, 75, 75));
        cmd24.setText("22");
        cmd24.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd24.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd24.setName("day"); // NOI18N
        cmd24.setPreferredSize(new java.awt.Dimension(13, 15));
        cmd24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd24ActionPerformed(evt);
            }
        });
        add(cmd24);

        cmd25.setForeground(new java.awt.Color(75, 75, 75));
        cmd25.setText("23");
        cmd25.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd25.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd25.setName("day"); // NOI18N
        cmd25.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd25);

        cmd26.setForeground(new java.awt.Color(75, 75, 75));
        cmd26.setText("24");
        cmd26.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd26.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd26.setName("day"); // NOI18N
        cmd26.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd26);

        cmd27.setForeground(new java.awt.Color(75, 75, 75));
        cmd27.setText("25");
        cmd27.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd27.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd27.setName("day"); // NOI18N
        cmd27.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd27);

        cmd28.setForeground(new java.awt.Color(75, 75, 75));
        cmd28.setText("26");
        cmd28.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd28.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd28.setName("day"); // NOI18N
        cmd28.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd28);

        cmd29.setForeground(new java.awt.Color(75, 75, 75));
        cmd29.setText("27");
        cmd29.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd29.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd29.setName("day"); // NOI18N
        cmd29.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd29);

        cmd30.setForeground(new java.awt.Color(75, 75, 75));
        cmd30.setText("28");
        cmd30.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd30.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd30.setName("day"); // NOI18N
        cmd30.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd30);

        cmd31.setForeground(new java.awt.Color(75, 75, 75));
        cmd31.setText("29");
        cmd31.setMaximumSize(new java.awt.Dimension(13, 15));
        cmd31.setMinimumSize(new java.awt.Dimension(13, 15));
        cmd31.setName("day"); // NOI18N
        cmd31.setPreferredSize(new java.awt.Dimension(13, 15));
        add(cmd31);

        cmd32.setForeground(new java.awt.Color(75, 75, 75));
        cmd32.setText("30");
        cmd32.setName("day"); // NOI18N
        add(cmd32);

        cmd33.setForeground(new java.awt.Color(75, 75, 75));
        cmd33.setText("31");
        cmd33.setName("day"); // NOI18N
        add(cmd33);

        cmd34.setForeground(new java.awt.Color(75, 75, 75));
        cmd34.setName("day"); // NOI18N
        add(cmd34);

        cmd35.setForeground(new java.awt.Color(75, 75, 75));
        cmd35.setName("day"); // NOI18N
        add(cmd35);

        cmd36.setForeground(new java.awt.Color(75, 75, 75));
        cmd36.setName("day"); // NOI18N
        add(cmd36);

        cmd37.setForeground(new java.awt.Color(75, 75, 75));
        cmd37.setName("day"); // NOI18N
        add(cmd37);

        cmd38.setForeground(new java.awt.Color(75, 75, 75));
        cmd38.setName("day"); // NOI18N
        add(cmd38);

        cmd39.setForeground(new java.awt.Color(75, 75, 75));
        cmd39.setName("day"); // NOI18N
        add(cmd39);

        cmd40.setForeground(new java.awt.Color(75, 75, 75));
        cmd40.setName("day"); // NOI18N
        add(cmd40);

        cmd41.setForeground(new java.awt.Color(75, 75, 75));
        cmd41.setName("day"); // NOI18N
        add(cmd41);

        cmd42.setForeground(new java.awt.Color(75, 75, 75));
        cmd42.setName("day"); // NOI18N
        add(cmd42);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd9ActionPerformed

    private void cmd20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd20ActionPerformed

    private void cmd24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd24ActionPerformed

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.component.datechooser.Button cmd1;
    private app.component.datechooser.Button cmd10;
    private app.component.datechooser.Button cmd11;
    private app.component.datechooser.Button cmd12;
    private app.component.datechooser.Button cmd13;
    private app.component.datechooser.Button cmd14;
    private app.component.datechooser.Button cmd15;
    private app.component.datechooser.Button cmd16;
    private app.component.datechooser.Button cmd17;
    private app.component.datechooser.Button cmd18;
    private app.component.datechooser.Button cmd19;
    private app.component.datechooser.Button cmd2;
    private app.component.datechooser.Button cmd20;
    private app.component.datechooser.Button cmd21;
    private app.component.datechooser.Button cmd22;
    private app.component.datechooser.Button cmd23;
    private app.component.datechooser.Button cmd24;
    private app.component.datechooser.Button cmd25;
    private app.component.datechooser.Button cmd26;
    private app.component.datechooser.Button cmd27;
    private app.component.datechooser.Button cmd28;
    private app.component.datechooser.Button cmd29;
    private app.component.datechooser.Button cmd3;
    private app.component.datechooser.Button cmd30;
    private app.component.datechooser.Button cmd31;
    private app.component.datechooser.Button cmd32;
    private app.component.datechooser.Button cmd33;
    private app.component.datechooser.Button cmd34;
    private app.component.datechooser.Button cmd35;
    private app.component.datechooser.Button cmd36;
    private app.component.datechooser.Button cmd37;
    private app.component.datechooser.Button cmd38;
    private app.component.datechooser.Button cmd39;
    private app.component.datechooser.Button cmd4;
    private app.component.datechooser.Button cmd40;
    private app.component.datechooser.Button cmd41;
    private app.component.datechooser.Button cmd42;
    private app.component.datechooser.Button cmd5;
    private app.component.datechooser.Button cmd6;
    private app.component.datechooser.Button cmd7;
    private app.component.datechooser.Button cmd8;
    private app.component.datechooser.Button cmd9;
    private app.component.datechooser.Button cmdFr;
    private app.component.datechooser.Button cmdMo;
    private app.component.datechooser.Button cmdSa;
    private app.component.datechooser.Button cmdSu;
    private app.component.datechooser.Button cmdTh;
    private app.component.datechooser.Button cmdTu;
    private app.component.datechooser.Button cmdWe;
    // End of variables declaration//GEN-END:variables


    public void next() {
        if (selectDay == max_of_month) {
            selectDay = 0;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 1);
        String n = cmd.getText();
        if (!n.equals("") && Integer.valueOf(n) <= max_of_month) {
            selectDay++;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void back() {
        if (selectDay <= 1) {
            selectDay = max_of_month + 1;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 1);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay--;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void up() {
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 7);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay -= 7;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void down() {
        if (getComponents().length > startDate - 1 + selectDay + 7) {
            JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 7);
            String n = cmd.getText();
            if (!n.equals("") && cmd.getName() != null) {
                selectDay += 7;
                event.execute(null, selectDay);
                cmd.setBackground(new Color(206, 110, 245));
            }
        }
    }
}

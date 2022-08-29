package app.component.datechooser;

import javax.swing.JButton;

public final class Years extends javax.swing.JPanel {

    private Event event;
    private int startYear;

    public Years() {
        initComponents();
    }

    public int showYear(int year) {
        year = calculateYear(year);
        for (int i = 0; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            cmd.setText(year + "");
            year++;
        }
        return startYear;
    }

    private int calculateYear(int year) {
        year -= year % 10;
        startYear = year;
        return year;
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
        cmd13 = new app.component.datechooser.Button();
        cmd14 = new app.component.datechooser.Button();
        cmd15 = new app.component.datechooser.Button();
        cmd16 = new app.component.datechooser.Button();
        cmd17 = new app.component.datechooser.Button();
        cmd18 = new app.component.datechooser.Button();
        cmd19 = new app.component.datechooser.Button();
        cmd20 = new app.component.datechooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(5, 4));

        cmd1.setForeground(new java.awt.Color(75, 75, 75));
        cmd1.setText("2010");
        cmd1.setName("year"); // NOI18N
        add(cmd1);

        cmd2.setForeground(new java.awt.Color(75, 75, 75));
        cmd2.setText("2011");
        cmd2.setName("year"); // NOI18N
        add(cmd2);

        cmd3.setForeground(new java.awt.Color(75, 75, 75));
        cmd3.setText("2012");
        cmd3.setName("year"); // NOI18N
        add(cmd3);

        cmd4.setForeground(new java.awt.Color(75, 75, 75));
        cmd4.setText("2013");
        cmd4.setName("year"); // NOI18N
        add(cmd4);

        cmd5.setForeground(new java.awt.Color(75, 75, 75));
        cmd5.setText("2014");
        cmd5.setName("year"); // NOI18N
        add(cmd5);

        cmd6.setForeground(new java.awt.Color(75, 75, 75));
        cmd6.setText("2015");
        cmd6.setName("year"); // NOI18N
        add(cmd6);

        cmd7.setForeground(new java.awt.Color(75, 75, 75));
        cmd7.setText("2016");
        cmd7.setName("year"); // NOI18N
        add(cmd7);

        cmd8.setForeground(new java.awt.Color(75, 75, 75));
        cmd8.setText("2017");
        cmd8.setName("year"); // NOI18N
        add(cmd8);

        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("2018");
        cmd9.setName("year"); // NOI18N
        add(cmd9);

        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("2019");
        cmd10.setName("year"); // NOI18N
        add(cmd10);

        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("2020");
        cmd11.setName("year"); // NOI18N
        add(cmd11);

        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("2021");
        cmd12.setName("year"); // NOI18N
        add(cmd12);

        cmd13.setForeground(new java.awt.Color(75, 75, 75));
        cmd13.setText("2022");
        cmd13.setName("year"); // NOI18N
        add(cmd13);

        cmd14.setForeground(new java.awt.Color(75, 75, 75));
        cmd14.setText("2023");
        cmd14.setName("year"); // NOI18N
        add(cmd14);

        cmd15.setForeground(new java.awt.Color(75, 75, 75));
        cmd15.setText("2024");
        cmd15.setName("year"); // NOI18N
        add(cmd15);

        cmd16.setForeground(new java.awt.Color(75, 75, 75));
        cmd16.setText("2025");
        cmd16.setName("year"); // NOI18N
        add(cmd16);

        cmd17.setForeground(new java.awt.Color(75, 75, 75));
        cmd17.setText("2026");
        cmd17.setName("year"); // NOI18N
        add(cmd17);

        cmd18.setForeground(new java.awt.Color(75, 75, 75));
        cmd18.setText("2027");
        cmd18.setName("year"); // NOI18N
        add(cmd18);

        cmd19.setForeground(new java.awt.Color(75, 75, 75));
        cmd19.setText("2028");
        cmd19.setName("year"); // NOI18N
        add(cmd19);

        cmd20.setForeground(new java.awt.Color(75, 75, 75));
        cmd20.setText("2029");
        cmd20.setName("year"); // NOI18N
        add(cmd20);
    }// </editor-fold>//GEN-END:initComponents

     public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    public int next(int year) {
        showYear(year + 20);
        return startYear;
    }

    public int back(int year) {
        showYear(year - 20);
        return startYear;
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
    private app.component.datechooser.Button cmd3;
    private app.component.datechooser.Button cmd4;
    private app.component.datechooser.Button cmd5;
    private app.component.datechooser.Button cmd6;
    private app.component.datechooser.Button cmd7;
    private app.component.datechooser.Button cmd8;
    private app.component.datechooser.Button cmd9;
    // End of variables declaration//GEN-END:variables
}

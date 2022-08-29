package app.component;

import app.controller.CommandeController;
import app.model.InformationMateriel;
import static app.controller.CommandeController.conversionDates;
import app.model.ConnexionDB;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;        
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class StatModalMoveStock extends javax.swing.JDialog {

  
    public StatModalMoveStock(java.awt.Frame parent, boolean modal,InformationMateriel materiel) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        labelNumCliListMat.setText(materiel.getNumMateriel());
        labelNomCliListMat.setText(materiel.getDesign());
        labelAdrCliListMat.setText((materiel.getPrixU().toString()));
        
        ButtonGroup groupChoiceEtat = new ButtonGroup();
        groupChoiceEtat.add(radioTwoDateEtat);
        groupChoiceEtat.add(radioMonthEtat);
        groupChoiceEtat.add(radioYearEtat);
        fixTable(jScrollPane2);
        
        this.labelTotalString.setVisible(false);
        this.labelTotalValue.setVisible(false);
    }

     public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(240, 240, 240));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240), 2));
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new app.component.datechooser.DateChooser();
        dateChooser2 = new app.component.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNumCliListMat = new javax.swing.JLabel();
        labelNomCliListMat = new javax.swing.JLabel();
        labelAdrCliListMat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListMat = new javax.swing.JTable();
        labelTotalValue = new javax.swing.JLabel();
        labelTotalString = new javax.swing.JLabel();
        paneTwoDateMatAchat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateChooserEndMatAchat = new app.component.TextFieldCustom();
        dateChooserStartMatAchat = new app.component.TextFieldCustom();
        btnSeeDateChooser3 = new app.component.ButtonCustom();
        btnSeeDateChooser4 = new app.component.ButtonCustom();
        radioTwoDateEtat = new app.component.RadioButtonCustom();
        paneMonthMatAchat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser2 = new com.toedter.calendar.JYearChooser();
        radioMonthEtat = new app.component.RadioButtonCustom();
        paneYearMatAchat = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        radioYearEtat = new app.component.RadioButtonCustom();
        jPanel3 = new javax.swing.JPanel();
        btnResultTwoDateMat = new app.component.ButtonCustom();

        dateChooser1.setTextRefernce(dateChooserStartMatAchat);

        dateChooser2.setTextRefernce(dateChooserEndMatAchat);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon("src/app/images/computer-science.png").getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MOUVEMENT DE STOCK");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Numéro du matériel");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Désignation");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("PU");

        labelNumCliListMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumCliListMat.setText("jLabel14");

        labelNomCliListMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomCliListMat.setText("jLabel15");

        labelAdrCliListMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAdrCliListMat.setText("jLabel16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdrCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNomCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAdrCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableListMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nom ", "Qté", "Date d'achat"
            }
        ));
        tableListMat.setEditingColumn(0);
        tableListMat.setEditingRow(0);
        tableListMat.setFocusable(false);
        tableListMat.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableListMat.setRequestFocusEnabled(false);
        tableListMat.setRowHeight(35);
        tableListMat.getTableHeader().setReorderingAllowed(false);
        tableListMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableListMat);

        labelTotalValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotalValue.setForeground(new java.awt.Color(51, 102, 255));
        labelTotalValue.setText("Total de stock");

        labelTotalString.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotalString.setText("Total ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelTotalString, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalString, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        paneTwoDateMatAchat.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Date du début ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Date fin");

        dateChooserEndMatAchat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dateChooserEndMatAchat.setForeground(new java.awt.Color(255, 51, 51));
        dateChooserEndMatAchat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateChooserEndMatAchat.setEnabled(false);
        dateChooserEndMatAchat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        dateChooserStartMatAchat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dateChooserStartMatAchat.setForeground(new java.awt.Color(255, 51, 51));
        dateChooserStartMatAchat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateChooserStartMatAchat.setEnabled(false);
        dateChooserStartMatAchat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnSeeDateChooser3.setBorder(null);
        btnSeeDateChooser3.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeDateChooser3.setText("...");
        btnSeeDateChooser3.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSeeDateChooser3.setColor(new java.awt.Color(0, 51, 102));
        btnSeeDateChooser3.setColorClick(new java.awt.Color(153, 153, 153));
        btnSeeDateChooser3.setColorOver(new java.awt.Color(255, 204, 204));
        btnSeeDateChooser3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeeDateChooser3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeeDateChooser3.setOpaque(true);
        btnSeeDateChooser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDateChooser3ActionPerformed(evt);
            }
        });

        btnSeeDateChooser4.setBorder(null);
        btnSeeDateChooser4.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeDateChooser4.setText("...");
        btnSeeDateChooser4.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSeeDateChooser4.setColor(new java.awt.Color(0, 51, 102));
        btnSeeDateChooser4.setColorClick(new java.awt.Color(153, 153, 153));
        btnSeeDateChooser4.setColorOver(new java.awt.Color(255, 204, 204));
        btnSeeDateChooser4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeeDateChooser4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeeDateChooser4.setOpaque(true);
        btnSeeDateChooser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDateChooser4ActionPerformed(evt);
            }
        });

        radioTwoDateEtat.setForeground(new java.awt.Color(255, 0, 51));
        radioTwoDateEtat.setText(" Entre 2 dates");
        radioTwoDateEtat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout paneTwoDateMatAchatLayout = new javax.swing.GroupLayout(paneTwoDateMatAchat);
        paneTwoDateMatAchat.setLayout(paneTwoDateMatAchatLayout);
        paneTwoDateMatAchatLayout.setHorizontalGroup(
            paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioTwoDateEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                        .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                                .addComponent(dateChooserEndMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnSeeDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                                .addComponent(dateChooserStartMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnSeeDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneTwoDateMatAchatLayout.setVerticalGroup(
            paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioTwoDateEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeeDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserStartMatAchat, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateChooserEndMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeeDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        paneMonthMatAchat.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("En année");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Mois de ");

        jYearChooser2.setBackground(new java.awt.Color(204, 204, 204));

        radioMonthEtat.setForeground(new java.awt.Color(255, 0, 51));
        radioMonthEtat.setText(" En un mois");
        radioMonthEtat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioMonthEtat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMonthEtatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneMonthMatAchatLayout = new javax.swing.GroupLayout(paneMonthMatAchat);
        paneMonthMatAchat.setLayout(paneMonthMatAchatLayout);
        paneMonthMatAchatLayout.setHorizontalGroup(
            paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneMonthMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jYearChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneMonthMatAchatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioMonthEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneMonthMatAchatLayout.setVerticalGroup(
            paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMonthMatAchatLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radioMonthEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneMonthMatAchatLayout.createSequentialGroup()
                        .addGroup(paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYearChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneYearMatAchat.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("En année");

        radioYearEtat.setForeground(new java.awt.Color(255, 0, 51));
        radioYearEtat.setText(" En une année");
        radioYearEtat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioYearEtat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioYearEtatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneYearMatAchatLayout = new javax.swing.GroupLayout(paneYearMatAchat);
        paneYearMatAchat.setLayout(paneYearMatAchatLayout);
        paneYearMatAchatLayout.setHorizontalGroup(
            paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneYearMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioYearEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneYearMatAchatLayout.setVerticalGroup(
            paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneYearMatAchatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioYearEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnResultTwoDateMat.setBackground(new java.awt.Color(0, 51, 102));
        btnResultTwoDateMat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResultTwoDateMat.setForeground(new java.awt.Color(255, 255, 255));
        btnResultTwoDateMat.setText("VOIR");
        btnResultTwoDateMat.setBorderColor(new java.awt.Color(0, 51, 102));
        btnResultTwoDateMat.setColor(new java.awt.Color(0, 51, 102));
        btnResultTwoDateMat.setColorClick(new java.awt.Color(0, 51, 102));
        btnResultTwoDateMat.setColorOver(new java.awt.Color(0, 153, 255));
        btnResultTwoDateMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResultTwoDateMat.setOver(true);
        btnResultTwoDateMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultTwoDateMatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnResultTwoDateMat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnResultTwoDateMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneTwoDateMatAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneMonthMatAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneYearMatAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneTwoDateMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paneMonthMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paneYearMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioMonthEtatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMonthEtatActionPerformed

    }//GEN-LAST:event_radioMonthEtatActionPerformed

    private void radioYearEtatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioYearEtatActionPerformed

    }//GEN-LAST:event_radioYearEtatActionPerformed

    private void tableListMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMatMouseClicked

        /*int row = tableCommande.getSelectedRow();

        String numCli = tableCommande.getValueAt(row, 0).toString();
        String nomCli = tableCommande.getValueAt(row, 1).toString();
        String adrCli = tableCommande.getValueAt(row, 2).toString();

        txtNumCliClient.setText(numCli);
        txtNomCliClient.setText(nomCli);
        txtAdresseCliClient.setText(adrCli);

        paneInfoClient.removeAll();
        paneInfoClient.add(paneModifyClient);
        paneInfoClient.repaint();
        paneInfoClient.revalidate();

        btnSearchNomClientAchat.setVisible(true);
        btnDeleteClient.setVisible(true);
        btnAddClientIcon.setVisible(true);*/
    }//GEN-LAST:event_tableListMatMouseClicked

    private void btnSeeDateChooser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDateChooser3ActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btnSeeDateChooser3ActionPerformed

    private void btnSeeDateChooser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDateChooser4ActionPerformed
        dateChooser2.showPopup();
    }//GEN-LAST:event_btnSeeDateChooser4ActionPerformed

    private void btnResultTwoDateMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultTwoDateMatMouseClicked
        String numMat = labelNumCliListMat.getText();

        if(this.radioMonthEtat.isSelected() == true ){
            int month = this.jMonthChooser1.getMonth();
            int year = this.jYearChooser2.getYear();

            InformationMateriel materiel = new InformationMateriel();
            materiel.setNumMateriel(numMat);

            DefaultTableModel modelTable = new DefaultTableModel();
            tableListMat.setModel(modelTable);

            modelTable.addColumn("N°");
            modelTable.addColumn("Nom");
            modelTable.addColumn("Qté");
            modelTable.addColumn("Date");
         
            tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
            tableListMat.getTableHeader().setForeground(Color.black);
            tableListMat.setRowHeight(30);
            fixTable(jScrollPane2);

            String sql = "SELECT a.NumClient, NomClient,Qte , DateAchat FROM achat a JOIN client cli "
            + "ON a.NumClient = cli.NumClient "
            + "WHERE NumMat = ? AND MONTH(DateAchat) = ? AND YEAR(DateAchat) = ? ORDER BY DateAchat ASC";

             String sql1 = "SELECT SUM(Qte) as somme FROM achat  "
            + "WHERE NumMat = ? AND MONTH(DateAchat) = ? AND YEAR(DateAchat) = ? ORDER BY DateAchat ASC";
            
            try{
                ConnexionDB conn = new ConnexionDB();
                Connection connexion = conn.getConnexion();
                PreparedStatement ps = connexion.prepareStatement(sql);
                ps.setString(1,materiel.getNumMateriel());
                ps.setInt(2, month + 1);
                ps.setInt(3, year);
                
                PreparedStatement ps1 = connexion.prepareStatement(sql1);
                ps1.setString(1,materiel.getNumMateriel());
                ps1.setInt(2, month + 1);
                ps1.setInt(3, year);

                ResultSet rs = ps.executeQuery();
                ResultSet rs1 = ps1.executeQuery();
                rs1.next();
                while(rs.next()){
                    
                    Vector v2 = new Vector();
                    for(int i = 0 ; i < 6 ; i++){

                        v2.add(rs.getString("a.NumClient"));
                        v2.add(rs.getString("NomClient"));
                        v2.add(rs.getInt("Qte"));   
                        v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                    }

                    modelTable.addRow(v2);
                    
                }

                this.labelTotalString.setVisible(true);
                this.labelTotalValue.setVisible(true);
                this.labelTotalValue.setText(rs1.getInt("somme")+"");
 
                
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(StatModalMoveStock.class.getName()).log(Level.SEVERE, null, ex);
            } 

        }else if(this.radioYearEtat.isSelected() == true ){
            int year = this.jYearChooser1.getYear();

            InformationMateriel materiel = new InformationMateriel();
            materiel.setNumMateriel(numMat);

            DefaultTableModel modelTable = new DefaultTableModel();
            tableListMat.setModel(modelTable);

            modelTable.addColumn("N°");
            modelTable.addColumn("Nom");
            modelTable.addColumn("Qté");
            modelTable.addColumn("Date");

            tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
            tableListMat.getTableHeader().setForeground(Color.black);
            tableListMat.setRowHeight(30);
            fixTable(jScrollPane2);
            
            String sql = "SELECT a.NumClient, NomClient,Qte , DateAchat FROM achat a JOIN client cli "
            + "ON a.NumClient = cli.NumClient "
            + "WHERE NumMat = ? AND YEAR(DateAchat) = ? ORDER BY DateAchat ASC";

            String sql1 = "SELECT SUM(Qte) as somme FROM achat  "
            + "WHERE NumMat = ? AND YEAR(DateAchat) = ? ORDER BY DateAchat ASC";
               
            try{
                ConnexionDB conn = new ConnexionDB();
                Connection connexion = conn.getConnexion();
                PreparedStatement ps = connexion.prepareStatement(sql);
                ps.setString(1,materiel.getNumMateriel());
                ps.setInt(2,year);
                
                PreparedStatement ps1 = connexion.prepareStatement(sql1);
                ps1.setString(1,materiel.getNumMateriel());
                ps1.setInt(2,year);

                ResultSet rs = ps.executeQuery();
                ResultSet rs1 = ps1.executeQuery();
                rs1.next();
                while(rs.next()){
                    
                    Vector v2 = new Vector();
                    for(int i = 0 ; i < 6 ; i++){

                        v2.add(rs.getString("a.NumClient"));
                        v2.add(rs.getString("NomClient"));
                        v2.add(rs.getInt("Qte"));   
                        v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                    }

                    modelTable.addRow(v2);
                    
                }
                
                this.labelTotalString.setVisible(true);
                this.labelTotalValue.setVisible(true);
                this.labelTotalValue.setText(rs1.getInt("somme")+"");
 
           
            } catch (SQLException ex) { 
                java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(StatModalMoveStock.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else if(this.radioTwoDateEtat.isSelected() == true){
            
            if(this.dateChooserStartMatAchat.getText().equals("") && this.dateChooserEndMatAchat.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Remplir les champs de dates ! " );
            }else{

                InformationMateriel materiel = new InformationMateriel();
                materiel.setNumMateriel(numMat);

                String dateStart =this.dateChooserStartMatAchat.getText();
                String dateEnd = this.dateChooserEndMatAchat.getText();

                try {
                    dateStart = conversionDates("dd-mm-yyyy","yyyy-mm-dd", dateStart);
                    dateEnd = conversionDates("dd-mm-yyyy","yyyy-mm-dd", dateEnd);
                } catch (ParseException ex) { 
                    java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

           
                DefaultTableModel modelTable = new DefaultTableModel();
                tableListMat.setModel(modelTable);

                modelTable.addColumn("N°");
                modelTable.addColumn("Nom");
                modelTable.addColumn("Qté");
                modelTable.addColumn("Date");

                tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                tableListMat.getTableHeader().setForeground(Color.black);
                tableListMat.setRowHeight(30);
                fixTable(jScrollPane2);

                String sql = "SELECT a.NumClient, NomClient,Qte , DateAchat FROM achat a JOIN client cli "
            + "ON a.NumClient = cli.NumClient "
            + "WHERE NumMat = ? AND DateAchat BETWEEN ? AND ? ORDER BY DateAchat ASC";
                
                String sql1 = "SELECT SUM(Qte) as somme FROM achat  "
            + "WHERE NumMat = ? AND DateAchat BETWEEN ? AND ? ORDER BY DateAchat ASC";


                try{
                    ConnexionDB conn = new ConnexionDB();
                    Connection connexion = conn.getConnexion();
                    PreparedStatement ps = connexion.prepareStatement(sql);
                    
                    ps.setString(1,materiel.getNumMateriel());
                    ps.setString(2,dateStart);
                    ps.setString(3,dateEnd);
                    
                    PreparedStatement ps1 = connexion.prepareStatement(sql1);
                    ps1.setString(1,materiel.getNumMateriel());
                    ps1.setString(2,dateStart);
                    ps1.setString(3,dateEnd);

                    ResultSet rs = ps.executeQuery();
                    ResultSet rs1 = ps1.executeQuery();
                    rs1.next();
                    while(rs.next()){

                        Vector v2 = new Vector();
                        for(int i = 0 ; i < 6 ; i++){

                            v2.add(rs.getString("a.NumClient"));
                            v2.add(rs.getString("NomClient"));
                            v2.add(rs.getInt("Qte"));   
                            v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                        }

                        modelTable.addRow(v2);

                    }
                    
                    this.labelTotalString.setVisible(true);
                    this.labelTotalValue.setVisible(true);
                    this.labelTotalValue.setText(rs1.getInt("somme")+"");
 
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ParseException ex) {
                    Logger.getLogger(StatModalMoveStock.class.getName()).log(Level.SEVERE, null, ex);
                } 

            }
        }else{
            JOptionPane.showMessageDialog(null, "Cochez un choix ! " );
        }

    }//GEN-LAST:event_btnResultTwoDateMatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatModalMoveStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatModalMoveStock dialog = new StatModalMoveStock(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public app.component.ButtonCustom btnResultTwoDateMat;
    public app.component.ButtonCustom btnSeeDateChooser3;
    public app.component.ButtonCustom btnSeeDateChooser4;
    private app.component.datechooser.DateChooser dateChooser1;
    private app.component.datechooser.DateChooser dateChooser2;
    public app.component.TextFieldCustom dateChooserEndMatAchat;
    public app.component.TextFieldCustom dateChooserStartMatAchat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JYearChooser jYearChooser2;
    public javax.swing.JLabel labelAdrCliListMat;
    public javax.swing.JLabel labelNomCliListMat;
    public javax.swing.JLabel labelNumCliListMat;
    public javax.swing.JLabel labelTotalString;
    public javax.swing.JLabel labelTotalValue;
    public javax.swing.JPanel paneMonthMatAchat;
    public javax.swing.JPanel paneTwoDateMatAchat;
    public javax.swing.JPanel paneYearMatAchat;
    public app.component.RadioButtonCustom radioMonthEtat;
    public app.component.RadioButtonCustom radioTwoDateEtat;
    public app.component.RadioButtonCustom radioYearEtat;
    public javax.swing.JTable tableListMat;
    // End of variables declaration//GEN-END:variables
}

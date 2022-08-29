package app.component;

import app.controller.CommandeController;
import static app.controller.CommandeController.conversionDates;
import app.model.ConnexionDB;
import app.model.InformationClient;
import app.model.StatModel;
import app.view.FactureModalForm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;        
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class StatModalMateriel extends javax.swing.JDialog {

    Double totalAmount = 0.0;
    Double bHeight = 0.0;
    
    String montant ;
    String adrCli ;
    String indexStartDate ;
    String indexEndDate ;
    
    String nomCli;
    String numCli ;
    static int facture = 0;
    String stringMontant ;
    
    ArrayList<String> itemDesign = new ArrayList<>();
    ArrayList<String> quantité = new ArrayList<>();
    ArrayList<String> itemPrice = new ArrayList<>();
    ArrayList<String> subTotal = new ArrayList<>();
    
    
    
    /**
     * Creates new form StatModalMateriel
     * @param parent
     * @param modal
     * @param client
     */
    public StatModalMateriel(java.awt.Frame parent, boolean modal, InformationClient client) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        labelMontantValueStringImpr.setVisible(false);
        labelMontantValueStringImpr1.setVisible(false);
        labelMontantTotal.setVisible(false);
        labelMontantValueListMat.setVisible(false);
        btnResultGroupListYear.setVisible(false);
        btnImprimerYearList.setVisible(false);
        
        fixTable(jScrollPane2);
        
        labelNumCliListMat.setText(client.getNumCli());
        labelNomCliListMat.setText(client.getNomCli());
        labelAdrCliListMat.setText(client.getAdrCli());
        
        ButtonGroup groupChoiceMat = new ButtonGroup();
        groupChoiceMat.add(radioTwoDateMaterielAchat);
        groupChoiceMat.add(radioMonthMaterielAchat);
        groupChoiceMat.add(radioYearMaterielAchat);
        
    }
    
    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new app.component.tableCustom.ScrollBarCustom());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelAdrCliListMat = new javax.swing.JLabel();
        labelNomCliListMat = new javax.swing.JLabel();
        labelNumCliListMat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListMat = new javax.swing.JTable();
        labelMontantTotal = new javax.swing.JLabel();
        labelMontantValueListMat = new javax.swing.JLabel();
        labelMontantValueStringImpr = new javax.swing.JLabel();
        labelMontantValueStringImpr1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnResultTwoDateMat = new app.component.ButtonCustom();
        btnImprimerYearList = new app.component.ButtonCustom();
        btnResultGroupListYear = new app.component.ButtonCustom();
        paneTwoDateMatAchat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateChooserEndMatAchat = new app.component.TextFieldCustom();
        dateChooserStartMatAchat = new app.component.TextFieldCustom();
        btnSeeDateChooser3 = new app.component.ButtonCustom();
        btnSeeDateChooser4 = new app.component.ButtonCustom();
        radioTwoDateMaterielAchat = new app.component.RadioButtonCustom();
        paneMonthMatAchat = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser2 = new com.toedter.calendar.JYearChooser();
        radioMonthMaterielAchat = new app.component.RadioButtonCustom();
        paneYearMatAchat = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        radioYearMaterielAchat = new app.component.RadioButtonCustom();

        dateChooser1.setTextRefernce(dateChooserStartMatAchat);

        dateChooser2.setTextRefernce(dateChooserEndMatAchat);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon("src/app/images/computer-science.png").getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Numéro du client");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nom du client");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Adresse du client");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LISTE DES MATERIELS ACHETES");

        labelAdrCliListMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAdrCliListMat.setText("jLabel16");

        labelNomCliListMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomCliListMat.setText("jLabel15");

        labelNumCliListMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumCliListMat.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNumCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdrCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAdrCliListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableListMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Désignation", "PU", "Qté", "Montant", "Date d'achat"
            }
        ));
        tableListMat.setEditingColumn(0);
        tableListMat.setEditingRow(0);
        tableListMat.setEnabled(false);
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
        if (tableListMat.getColumnModel().getColumnCount() > 0) {
            tableListMat.getColumnModel().getColumn(0).setMinWidth(50);
            tableListMat.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableListMat.getColumnModel().getColumn(0).setMaxWidth(50);
            tableListMat.getColumnModel().getColumn(3).setMinWidth(50);
            tableListMat.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableListMat.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        labelMontantTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMontantTotal.setText("Montant total");

        labelMontantValueListMat.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelMontantValueListMat.setForeground(new java.awt.Color(255, 51, 51));
        labelMontantValueListMat.setText("jLabel5");

        labelMontantValueStringImpr.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelMontantValueStringImpr.setText("Arrété la présente facture à la somme de (Ariary)");

        labelMontantValueStringImpr1.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        labelMontantValueStringImpr1.setForeground(new java.awt.Color(0, 102, 255));
        labelMontantValueStringImpr1.setText("Arrété la présente facture à la somme de ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelMontantTotal)
                        .addGap(47, 47, 47)
                        .addComponent(labelMontantValueListMat)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(labelMontantValueStringImpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMontantValueStringImpr1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontantTotal)
                    .addComponent(labelMontantValueListMat))
                .addGap(18, 18, 18)
                .addComponent(labelMontantValueStringImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMontantValueStringImpr1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

        btnImprimerYearList.setBackground(new java.awt.Color(102, 204, 255));
        btnImprimerYearList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImprimerYearList.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimerYearList.setText("IMPRIMER");
        btnImprimerYearList.setBorderColor(new java.awt.Color(102, 204, 255));
        btnImprimerYearList.setColor(new java.awt.Color(102, 204, 255));
        btnImprimerYearList.setColorClick(new java.awt.Color(102, 204, 255));
        btnImprimerYearList.setColorOver(new java.awt.Color(0, 51, 102));
        btnImprimerYearList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimerYearList.setOver(true);
        btnImprimerYearList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimerYearListMouseClicked(evt);
            }
        });

        btnResultGroupListYear.setBackground(new java.awt.Color(0, 51, 102));
        btnResultGroupListYear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResultGroupListYear.setForeground(new java.awt.Color(255, 255, 255));
        btnResultGroupListYear.setText("GROUPER");
        btnResultGroupListYear.setBorderColor(new java.awt.Color(0, 51, 102));
        btnResultGroupListYear.setColor(new java.awt.Color(0, 51, 102));
        btnResultGroupListYear.setColorClick(new java.awt.Color(0, 51, 102));
        btnResultGroupListYear.setColorOver(new java.awt.Color(0, 153, 255));
        btnResultGroupListYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResultGroupListYear.setOver(true);
        btnResultGroupListYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultGroupListYearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnResultTwoDateMat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResultGroupListYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimerYearList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultTwoDateMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimerYearList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResultGroupListYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        radioTwoDateMaterielAchat.setForeground(new java.awt.Color(255, 0, 51));
        radioTwoDateMaterielAchat.setText(" Entre 2 dates");
        radioTwoDateMaterielAchat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioTwoDateMaterielAchat.setName(""); // NOI18N

        javax.swing.GroupLayout paneTwoDateMatAchatLayout = new javax.swing.GroupLayout(paneTwoDateMatAchat);
        paneTwoDateMatAchat.setLayout(paneTwoDateMatAchatLayout);
        paneTwoDateMatAchatLayout.setHorizontalGroup(
            paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radioTwoDateMaterielAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                        .addComponent(dateChooserEndMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSeeDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                        .addComponent(dateChooserStartMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSeeDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        paneTwoDateMatAchatLayout.setVerticalGroup(
            paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTwoDateMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneTwoDateMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioTwoDateMaterielAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        paneMonthMatAchat.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("En année");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Mois de ");

        jYearChooser2.setBackground(new java.awt.Color(204, 204, 204));

        radioMonthMaterielAchat.setForeground(new java.awt.Color(255, 0, 51));
        radioMonthMaterielAchat.setText(" En un mois");
        radioMonthMaterielAchat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioMonthMaterielAchat.setName(""); // NOI18N

        javax.swing.GroupLayout paneMonthMatAchatLayout = new javax.swing.GroupLayout(paneMonthMatAchat);
        paneMonthMatAchat.setLayout(paneMonthMatAchatLayout);
        paneMonthMatAchatLayout.setHorizontalGroup(
            paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneMonthMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMonthMaterielAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jYearChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        paneMonthMatAchatLayout.setVerticalGroup(
            paneMonthMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMonthMatAchatLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radioMonthMaterielAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        radioYearMaterielAchat.setForeground(new java.awt.Color(255, 0, 51));
        radioYearMaterielAchat.setText(" En une année");
        radioYearMaterielAchat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioYearMaterielAchat.setName(""); // NOI18N

        javax.swing.GroupLayout paneYearMatAchatLayout = new javax.swing.GroupLayout(paneYearMatAchat);
        paneYearMatAchat.setLayout(paneYearMatAchatLayout);
        paneYearMatAchatLayout.setHorizontalGroup(
            paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneYearMatAchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(radioYearMaterielAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        paneYearMatAchatLayout.setVerticalGroup(
            paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneYearMatAchatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneYearMatAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioYearMaterielAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(paneTwoDateMatAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paneMonthMatAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(paneYearMatAchat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneTwoDateMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paneMonthMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paneYearMatAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeDateChooser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDateChooser3ActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btnSeeDateChooser3ActionPerformed

    private void btnSeeDateChooser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDateChooser4ActionPerformed
        dateChooser2.showPopup();
    }//GEN-LAST:event_btnSeeDateChooser4ActionPerformed

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

    private void btnResultTwoDateMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultTwoDateMatMouseClicked
        String numCli = labelNumCliListMat.getText();
        
            if(this.radioMonthMaterielAchat.isSelected() == true ){
                int month = this.jMonthChooser1.getMonth();
                int year = this.jYearChooser2.getYear();
                
                InformationClient client = new InformationClient();
                client.setNumCli(numCli);
                
                    DefaultTableModel modelTable = new DefaultTableModel();
                    tableListMat.setModel(modelTable);
                    
                    modelTable.addColumn("N°");
                    modelTable.addColumn("Désignation");
                    modelTable.addColumn("PU");
                    modelTable.addColumn("Qté");
                    modelTable.addColumn("Montant");                  
                    modelTable.addColumn("Date d'achat");                   

                tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                tableListMat.getTableHeader().setForeground(Color.black);
                tableListMat.setRowHeight(30);
                fixTable(jScrollPane2);
                
                String sql = "SELECT a.NumMat, Design, PU , Qte , DateAchat FROM achat a JOIN materiel mat "
                + "ON a.NumMat = mat.NumMat "
                + "WHERE NumClient = ? AND MONTH(DateAchat) = ? AND YEAR(DateAchat) = ? ORDER BY DateAchat ASC";
        
                try{
                    ConnexionDB conn = new ConnexionDB();
                    Connection connexion = conn.getConnexion();
                    PreparedStatement ps = connexion.prepareStatement(sql);
                    ps.setString(1,client.getNumCli());
                    ps.setInt(2, month + 1);
                    ps.setInt(3, year);

                    ResultSet rs = ps.executeQuery();

                    double somme = 0.0;
                    while(rs.next()){
                        int qte = rs.getInt("Qte");
                        double pu = rs.getDouble("PU");
                        
                        Vector v2 = new Vector();
                            for(int i = 0 ; i < 6 ; i++){
                                
                                v2.add(rs.getString("NumMat"));
                                v2.add(rs.getString("Design"));
                                v2.add(pu);
                                v2.add(qte);
                                v2.add(qte * pu);
                                v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                            }
                            
                            modelTable.addRow(v2);
                            somme += (qte * pu);
                    }
                   
                    labelMontantValueStringImpr.setVisible(true);
                    labelMontantValueStringImpr1.setVisible(true);
                    labelMontantValueListMat.setText(somme + "");
                    labelMontantTotal.setVisible(true);
                    labelMontantValueListMat.setVisible(true);
                    labelMontantValueStringImpr1.setText(""+ CommandeController.convertNumberToString((int)Double.parseDouble(somme +"")));
                    btnResultGroupListYear.setVisible(false);
                    btnImprimerYearList.setVisible(false);
                } catch (SQLException ex) {              
                    Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {              
                Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
            }              
                
            }else if(this.radioYearMaterielAchat.isSelected() == true ){
                int year = this.jYearChooser1.getYear();
               
                InformationClient client = new InformationClient();
                client.setNumCli(numCli);
                
                    DefaultTableModel modelTable = new DefaultTableModel();
                    tableListMat.setModel(modelTable);
                    
                    modelTable.addColumn("N°");
                    modelTable.addColumn("Désignation");
                    modelTable.addColumn("PU");
                    modelTable.addColumn("Qté");
                    modelTable.addColumn("Montant");                  
                    modelTable.addColumn("Date d'achat");
                
                
                tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                tableListMat.getTableHeader().setForeground(Color.black);
                tableListMat.setRowHeight(30);
                fixTable(jScrollPane2);
                
                String sql = "SELECT a.NumMat, Design, PU , Qte , DateAchat FROM achat a JOIN materiel mat "
                + "ON a.NumMat = mat.NumMat "
                + "WHERE NumClient = ? AND YEAR(DateAchat) = ? ORDER BY DateAchat ASC";

                try{
                    ConnexionDB conn = new ConnexionDB();
                    Connection connexion = conn.getConnexion();
                    PreparedStatement ps = connexion.prepareStatement(sql);
                    ps.setString(1,client.getNumCli());
                    ps.setInt(2,year);


                    ResultSet rs = ps.executeQuery();

                    double somme = 0.0;
                    while(rs.next()){
                        int qte = rs.getInt("Qte");
                        double pu = rs.getDouble("PU");
                        
                        Vector v2 = new Vector();
                            for(int i = 0 ; i < 6 ; i++){
                                
                                v2.add(rs.getString("NumMat"));
                                v2.add(rs.getString("Design"));
                                v2.add(pu);
                                v2.add(qte);
                                v2.add(qte * pu);
                                v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                            }
                            
                            modelTable.addRow(v2);
                            somme += (qte * pu);
                    }
                   
                    labelMontantValueStringImpr.setVisible(true);
                    labelMontantValueStringImpr1.setVisible(true);
                    labelMontantValueListMat.setText(somme + "");
                    labelMontantTotal.setVisible(true);
                    labelMontantValueListMat.setVisible(true);
                    labelMontantValueStringImpr1.setText(""+ CommandeController.convertNumberToString((int)Double.parseDouble(somme +"")));
                    btnResultGroupListYear.setVisible(true);
                    btnImprimerYearList.setVisible(false);
                } catch (SQLException ex) { 
                    Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) { 
                Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
            } 
                 
            }else if(this.radioTwoDateMaterielAchat.isSelected() == true){
                if(this.dateChooserStartMatAchat.getText().equals("") && this.dateChooserEndMatAchat.getText().equals("")){
                     JOptionPane.showMessageDialog(null, "Remplir les champs de dates ! " );
                }else{
                    
                    InformationClient client = new InformationClient();
                    client.setNumCli(numCli);
                 
                    String dateStart =this.dateChooserStartMatAchat.getText();
                    String dateEnd = this.dateChooserEndMatAchat.getText();
           
                    
                    try {
                        dateStart = conversionDates("dd-mm-yyyy","yyyy-mm-dd", dateStart);
                        dateEnd = conversionDates("dd-mm-yyyy","yyyy-mm-dd", dateEnd);
                    } catch (ParseException ex) {
                        Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
                    }

                     DefaultTableModel modelTable = new DefaultTableModel();
                    tableListMat.setModel(modelTable);
                    
                    modelTable.addColumn("N°");
                    modelTable.addColumn("Désignation");
                    modelTable.addColumn("PU");
                    modelTable.addColumn("Qté");
                    modelTable.addColumn("Montant");                  
                    modelTable.addColumn("Date d'achat");
                    fixTable(jScrollPane2);
                    
                    tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                    tableListMat.getTableHeader().setForeground(Color.black);
                    tableListMat.setRowHeight(30);

                    String sql = "SELECT a.NumMat,Design, PU , Qte , DateAchat FROM achat a JOIN materiel mat "
                        + "ON a.NumMat = mat.NumMat "
                        + "WHERE NumClient = ? AND DateAchat BETWEEN ? AND ? ORDER BY DateAchat ASC";

                    try{
                        ConnexionDB conn = new ConnexionDB();
                        Connection connexion = conn.getConnexion();
                        PreparedStatement ps = connexion.prepareStatement(sql);
                        ps.setString(1,client.getNumCli());
                        ps.setString(2,dateStart);
                        ps.setString(3,dateEnd);

                        ResultSet rs = ps.executeQuery();

                        double somme = 0.0;
                        while(rs.next()){
                            int qte = rs.getInt("Qte");
                            double pu = rs.getDouble("PU");

                            Vector v2 = new Vector();
                                for(int i = 0 ; i < 6 ; i++){

                                    v2.add(rs.getString("NumMat"));
                                    v2.add(rs.getString("Design"));
                                    v2.add(pu);
                                    v2.add(qte);
                                    v2.add(qte * pu);
                                    v2.add(CommandeController.conversionDates("yyyy-mm-dd","dd-mm-yyyy",(rs.getDate("DateAchat")).toString()));
                                }

                                modelTable.addRow(v2);
                                somme += (qte * pu);
                        }

                        labelMontantValueStringImpr.setVisible(true);
                        labelMontantValueStringImpr1.setVisible(true);
                        labelMontantValueListMat.setText(somme + "");
                        labelMontantTotal.setVisible(true);
                        labelMontantValueListMat.setVisible(true);
                        labelMontantValueStringImpr1.setText(""+ CommandeController.convertNumberToString((int)Double.parseDouble(somme +"")));
                        btnResultGroupListYear.setVisible(false);
                         btnImprimerYearList.setVisible(false);
                    } catch (SQLException ex) {
                      ex.printStackTrace();
                    } catch (ParseException ex) {
                        Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Cochez un choix ! " );
            }
    
    }//GEN-LAST:event_btnResultTwoDateMatMouseClicked

    public PageFormat getPageFormat(PrinterJob pj){
        
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double bodyHeight = bHeight;
        double headerHeight = 5.0;
        double footerHeight = 8.0;
        double width = cm_to_pp(8);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight );
        
        paper.setSize(width,height);
        paper.setImageableArea(0, 12, width, height - cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        
        return pf;
    }
    
    protected static double cm_to_pp(double cm){
        return toPPI(cm * 0.393600787);
    }
    
    protected static double toPPI(double inch){
        return inch * 72d;
    }
    
    public class BillPrintable implements Printable{
        
        @Override
        public int print(Graphics graphics , PageFormat pageFormat, int pageIndex) throws PrinterException{
          
            ImageIcon icon = new ImageIcon("D:\\Projet L3\\DesktopAppVenteMaterielInformatique\\src\\app\\images\\logo.png");
            int result = NO_SUCH_PAGE;
            
            numCli = labelNumCliListMat.getText();
            adrCli = labelAdrCliListMat.getText();
            int year = jYearChooser1.getYear(); 
            nomCli = labelNomCliListMat.getText();
            
            montant = labelMontantValueListMat.getText();
           
            DefaultTableModel df = (DefaultTableModel)tableListMat.getModel();
            int numRowCount = tableListMat.getRowCount();
            
            for(int i = 0 ; i < numRowCount ; i++ ){
                itemDesign.add(df.getValueAt(i, 0).toString());
                itemPrice.add(df.getValueAt(i, 1).toString());
                quantité.add(df.getValueAt(i, 2).toString());
                subTotal.add(df.getValueAt(i, 3).toString());
                
            }
              
            int r = numRowCount;
            
            if(pageIndex == 0){
                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int)pageFormat.getImageableX(), (int)pageFormat.getImageableY());
            
                try{
                    int y = 20;
                    int yShift = 10;
                    int headerRectHeight = 15;
                    
                    g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
                    g2d.drawImage(icon.getImage(),50,20,90,30,rootPane); y += yShift + 30 ;
                    g2d.drawString("----------------------------------------------",12,y); y += yShift ;
                    g2d.drawString("Client n° " + numCli , 12, y); y += yShift;
                    g2d.drawString("Nom du client : " + nomCli , 12, y); y += yShift;
                    g2d.drawString("Adresse : " + adrCli, 12, y); y += yShift;
                    g2d.drawString("----------------------------------------------",12,y); y += yShift ;
                    g2d.drawString("Facture N° " + facture++ , 12, y); y += yShift;
                    g2d.drawString("Année  : " + year, 12, y); y += yShift;
                    
                    g2d.drawString("----------------------------------------------", 12, y); y += headerRectHeight;
                    
                    g2d.drawString("Désignation       PU    Qte   Montant", 20, y); y += yShift;
                    g2d.drawString("----------------------------------------------", 10, y); y += headerRectHeight;
                    for(int i = 0; i < r ; i++){
                        g2d.drawString("" + itemDesign.get(i)+"                    ", 10, y); y += yShift;
                        g2d.drawString("         "+ itemPrice.get(i) + "      "+quantité.get(i) + "     " + subTotal.get(i), 15, y); y += yShift;
                    }
                    g2d.drawString("----------------------------------------------",10,y); y += yShift ;
                    g2d.drawString("Total :                 " + montant, 12, y); y += yShift;
                    g2d.drawString("----------------------------------------------",10,y); y += yShift ;
                    g2d.drawString("                    ( Ariary )", 10, y); y += yShift;
                    
                    g2d.drawString("***********************************************",10,y); y += yShift ;
                    g2d.drawString("            MERCI DE VOTRE VENUE            ", 10, y); y += yShift;
                    g2d.drawString("************************************************",10,y); y += yShift ;
                    g2d.drawString("            Future tech , 301                   ", 10, y); y += yShift;
                    g2d.drawString("        Ambatolahikosoa Rue Mort homme          ", 10, y); y += yShift;
                    g2d.drawString("        Contact : futuretech@gmail.com          ", 10, y); y += yShift;
                    g2d.drawString("                Tel : 0387122528             ", 10, y); y += yShift;
                    
                   
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                result = PAGE_EXISTS;
            
            }
            //facture= facture + 1 ;
            return result;
        }
    }

    private void btnImprimerYearListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimerYearListMouseClicked
            bHeight = Double.valueOf(itemDesign.size());
            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setPrintable(new BillPrintable(), getPageFormat(pj));
            
            try{
                pj.print();
                this.dispose();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_btnImprimerYearListMouseClicked

    private void btnResultGroupListYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultGroupListYearMouseClicked
            String numCli = labelNumCliListMat.getText();
            int year = this.jYearChooser1.getValue();
               
             InformationClient client = new InformationClient();
             client.setNumCli(numCli);
             
                DefaultTableModel modelTable = new DefaultTableModel();
                tableListMat.setModel(modelTable);

                modelTable.addColumn("Désignation");
                modelTable.addColumn("PU");
                modelTable.addColumn("Qté");
                modelTable.addColumn("Montant");
                
                tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                tableListMat.getTableHeader().setForeground(Color.black);
                tableListMat.setRowHeight(30);
                fixTable(jScrollPane2);
                
                String sql = "SELECT a.NumMat,Design,PU,SUM(Qte) as somme  FROM achat a JOIN materiel mat "
                + "ON a.NumMat = mat.NumMat "
                + "WHERE NumClient = ? AND YEAR(DateAchat) = ? GROUP BY a.NumMat";

                try{
                    ConnexionDB conn = new ConnexionDB();
                    Connection connexion = conn.getConnexion();
                    PreparedStatement ps = connexion.prepareStatement(sql);
                    ps.setString(1,client.getNumCli());
                    ps.setInt(2,year);


                    ResultSet rs = ps.executeQuery();

                    double somme = 0.0;
                    while(rs.next()){
                        int qte = rs.getInt("somme");
                        double pu = rs.getDouble("PU");
                        
                        Vector v2 = new Vector();
                            for(int i = 0 ; i < 4 ; i++){
                                
                                v2.add(rs.getString("Design"));
                                v2.add(pu);
                                v2.add(qte);
                                v2.add(qte * pu);
                               
                            }
                            
                            modelTable.addRow(v2);
                            somme += (qte * pu);
                    }
                   
                    labelMontantValueStringImpr.setVisible(true);
                    labelMontantValueStringImpr1.setVisible(true);
                    labelMontantValueListMat.setText(somme + "");
                    labelMontantTotal.setVisible(true);
                    labelMontantValueListMat.setVisible(true);
                    labelMontantValueStringImpr1.setText(""+ CommandeController.convertNumberToString((int)Double.parseDouble(somme +"")));

                } catch (SQLException ex) { 
                    Logger.getLogger(StatModalMateriel.class.getName()).log(Level.SEVERE, null, ex);
                } 
        
        btnImprimerYearList.setVisible(true);
    }//GEN-LAST:event_btnResultGroupListYearMouseClicked

    
    public static String conversionDates(String inputPattern,String outputPattern, String givenDate) throws ParseException{
    
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);
        Date date = null ;
        String requiredDate =  null;
        date = inputFormat.parse(givenDate);
        requiredDate = outputFormat.format(date);
        return requiredDate;
        
    }
    
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
            java.util.logging.Logger.getLogger(StatModalMateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatModalMateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatModalMateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatModalMateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatModalMateriel dialog = new StatModalMateriel(new javax.swing.JFrame(), true,null);
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
    public app.component.ButtonCustom btnImprimerYearList;
    public app.component.ButtonCustom btnResultGroupListYear;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JYearChooser jYearChooser2;
    public javax.swing.JLabel labelAdrCliListMat;
    public javax.swing.JLabel labelMontantTotal;
    public javax.swing.JLabel labelMontantValueListMat;
    public javax.swing.JLabel labelMontantValueStringImpr;
    public javax.swing.JLabel labelMontantValueStringImpr1;
    public javax.swing.JLabel labelNomCliListMat;
    public javax.swing.JLabel labelNumCliListMat;
    public javax.swing.JPanel paneMonthMatAchat;
    public javax.swing.JPanel paneTwoDateMatAchat;
    public javax.swing.JPanel paneYearMatAchat;
    public app.component.RadioButtonCustom radioMonthMaterielAchat;
    public app.component.RadioButtonCustom radioTwoDateMaterielAchat;
    public app.component.RadioButtonCustom radioYearMaterielAchat;
    public javax.swing.JTable tableListMat;
    // End of variables declaration//GEN-END:variables
}

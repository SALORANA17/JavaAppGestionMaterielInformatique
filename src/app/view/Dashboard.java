package app.view;

import app.component.tableCustom.ScrollBarCustom;
import java.awt.Color;
import javax.swing.ImageIcon;
import app.model.ConnexionDB;
import com.raven.chart.ModelChart;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javaswingdev.chart.ModelPieChart;
import javaswingdev.chart.PieChart;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        initComponents();
    
        simpleTitleBarDashBoard.init(this);
        this.setLocationRelativeTo(null);
       
        countClient();
        panelMain.removeAll();
        panelMain.add(paneDashboard);
        panelMain.repaint();
        panelMain.revalidate();
        chartEvolution();
        chartPie();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSuggestionUI1 = new app.component.comboSuggestion.ComboSuggestionUI();
        comboSuggestionUI2 = new app.component.comboSuggestion.ComboSuggestionUI();
        dateChooser1 = new app.component.datechooser.DateChooser();
        simpleTitleBarDashBoard = new app.component.titleBarWindow.SimpleTitleBar();
        headerApp = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        navbarApp = new javax.swing.JPanel();
        btn_dashboard = new app.component.ButtonCustomApp();
        btn_client = new app.component.ButtonCustomApp();
        btn_materiel = new app.component.ButtonCustomApp();
        btn_achat = new app.component.ButtonCustomApp();
        btn_stat = new app.component.ButtonCustomApp();
        panelMain = new javax.swing.JPanel();
        paneClient = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNumCliClient = new app.component.TextFieldCustom();
        jLabel7 = new javax.swing.JLabel();
        txtNomCliClient = new app.component.TextFieldCustom();
        jLabel8 = new javax.swing.JLabel();
        txtAdresseCliClient = new app.component.TextFieldCustom();
        paneInfoClient = new javax.swing.JPanel();
        paneModifyClient = new javax.swing.JPanel();
        btnAnnulerModifyClient = new app.component.ButtonCustom();
        btnModifyClient = new app.component.ButtonCustom();
        paneAddClient = new javax.swing.JPanel();
        btnAnnulerClient = new app.component.ButtonCustom();
        btnAddClient = new app.component.ButtonCustom();
        jPanel16 = new javax.swing.JPanel();
        inputSearchClient = new app.component.TextFieldCustom();
        btnSearchClient = new app.component.ButtonCustom();
        checkClientSearch = new app.component.ComboBoxCustom();
        btnDeleteClient = new app.component.ButtonCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        btnAddClientIcon = new app.component.ButtonCustom();
        btnSearchNomClientAchat = new app.component.ButtonCustom();
        paneMateriel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtNumMatMateriel = new app.component.TextFieldCustom();
        jLabel14 = new javax.swing.JLabel();
        txtDesignMateriel = new app.component.TextFieldCustom();
        jLabel15 = new javax.swing.JLabel();
        txtPuMateriel = new app.component.TextFieldCustom();
        paneInfoMateriel = new javax.swing.JPanel();
        paneModifyMateriel = new javax.swing.JPanel();
        btnModifyAnnulerMateriel = new app.component.ButtonCustom();
        btnModifyMateriel = new app.component.ButtonCustom();
        paneAddMateriel = new javax.swing.JPanel();
        btnAnnulerMateriel = new app.component.ButtonCustom();
        btnAddMateriel = new app.component.ButtonCustom();
        jLabel16 = new javax.swing.JLabel();
        txtStockMateriel = new app.component.TextFieldCustom();
        jPanel17 = new javax.swing.JPanel();
        checkMaterielSearch = new app.component.ComboBoxCustom();
        inputSearchMateriel = new app.component.TextFieldCustom();
        btnSearchMateriel = new app.component.ButtonCustom();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMateriel = new javax.swing.JTable();
        btnDeleteMateriel = new app.component.ButtonCustom();
        btnAddMaterielIcon = new app.component.ButtonCustom();
        paneAchat = new javax.swing.JPanel();
        paneCommandeAchatClient = new javax.swing.JPanel();
        paneCommandeAchat = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnClientCommanderMat = new app.component.ButtonCustom();
        inputNumClientSearchAchat = new javax.swing.JLabel();
        inputNomClientSearchAchat = new javax.swing.JLabel();
        inputAdresseClientSearchAchat = new javax.swing.JLabel();
        btnReturnClientAchat = new app.component.ButtonCustom();
        btnSearchNomClientStat = new app.component.ButtonCustom();
        paneAchatInfoGeneral = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableClient1 = new javax.swing.JTable();
        inputSearchClient1 = new app.component.TextFieldCustom();
        btnSearchClient1 = new app.component.ButtonCustom();
        btnDeleteAchat1 = new app.component.ButtonCustom();
        dateChooserCommande = new app.component.TextFieldCustom();
        btnSeeDateChooser = new app.component.ButtonCustom();
        jLabel26 = new javax.swing.JLabel();
        btnModifyAchat1 = new app.component.ButtonCustom();
        paneStat = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnSeeListMaterielClient = new app.component.ButtonCustom();
        txtNumClientSearchStat = new app.component.TextFieldCustom();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSeeListMatVendu = new app.component.ButtonCustom();
        jPanel19 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnSeeChiffreAffaire = new app.component.ButtonCustom();
        jLabel29 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel6 = new javax.swing.JPanel();
        btnListStockEtat = new app.component.ButtonCustom();
        jLabel25 = new javax.swing.JLabel();
        paneDashboard = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        pieChart1 = new javaswingdev.chart.PieChart();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lineChart1 = new com.raven.chart.LineChart();
        footerApp = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new app.component.ButtonCustomApp();

        dateChooser1.setTextRefernce(dateChooserCommande);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon("src/app/images/computer-science.png").getImage());
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        simpleTitleBarDashBoard.setMaximumSize(new java.awt.Dimension(32845, 30));
        simpleTitleBarDashBoard.setMinimumSize(new java.awt.Dimension(78, 30));
        simpleTitleBarDashBoard.setPreferredSize(new java.awt.Dimension(943, 30));
        getContentPane().add(simpleTitleBarDashBoard);

        headerApp.setMaximumSize(new java.awt.Dimension(32767, 160));
        headerApp.setMinimumSize(new java.awt.Dimension(0, 160));
        headerApp.setPreferredSize(new java.awt.Dimension(974, 160));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(250, 100));
        jPanel5.setMinimumSize(new java.awt.Dimension(250, 100));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/technology.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Future Tech");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Technology Business");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        navbarApp.setBackground(new java.awt.Color(0, 153, 255));
        navbarApp.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        navbarApp.setMinimumSize(new java.awt.Dimension(0, 60));
        navbarApp.setPreferredSize(new java.awt.Dimension(974, 60));

        btn_dashboard.setBackground(new java.awt.Color(0, 51, 102));
        btn_dashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setText("Tableau de bord");
        btn_dashboard.setBorderPainted(false);
        btn_dashboard.setDefaultCapable(false);
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.setFocusable(false);
        btn_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_dashboard.setOpaque(true);
        btn_dashboard.setRequestFocusEnabled(false);
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
        });

        btn_client.setBackground(new java.awt.Color(0, 153, 255));
        btn_client.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_client.setForeground(new java.awt.Color(255, 255, 255));
        btn_client.setText("Client");
        btn_client.setBorderPainted(false);
        btn_client.setDefaultCapable(false);
        btn_client.setFocusPainted(false);
        btn_client.setFocusable(false);
        btn_client.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_client.setOpaque(true);
        btn_client.setRequestFocusEnabled(false);
        btn_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientMouseClicked(evt);
            }
        });

        btn_materiel.setBackground(new java.awt.Color(0, 153, 255));
        btn_materiel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_materiel.setForeground(new java.awt.Color(255, 255, 255));
        btn_materiel.setText("Matériel");
        btn_materiel.setBorderPainted(false);
        btn_materiel.setDefaultCapable(false);
        btn_materiel.setFocusPainted(false);
        btn_materiel.setFocusable(false);
        btn_materiel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_materiel.setOpaque(true);
        btn_materiel.setRequestFocusEnabled(false);
        btn_materiel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_materielMouseClicked(evt);
            }
        });

        btn_achat.setBackground(new java.awt.Color(0, 153, 255));
        btn_achat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_achat.setForeground(new java.awt.Color(255, 255, 255));
        btn_achat.setText("Achat");
        btn_achat.setBorderPainted(false);
        btn_achat.setDefaultCapable(false);
        btn_achat.setFocusPainted(false);
        btn_achat.setFocusable(false);
        btn_achat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_achat.setOpaque(true);
        btn_achat.setRequestFocusEnabled(false);
        btn_achat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_achatMouseClicked(evt);
            }
        });

        btn_stat.setBackground(new java.awt.Color(0, 153, 255));
        btn_stat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_stat.setForeground(new java.awt.Color(255, 255, 255));
        btn_stat.setText("Statistique");
        btn_stat.setBorderPainted(false);
        btn_stat.setDefaultCapable(false);
        btn_stat.setFocusPainted(false);
        btn_stat.setFocusable(false);
        btn_stat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_stat.setOpaque(true);
        btn_stat.setRequestFocusEnabled(false);
        btn_stat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_statMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarAppLayout = new javax.swing.GroupLayout(navbarApp);
        navbarApp.setLayout(navbarAppLayout);
        navbarAppLayout.setHorizontalGroup(
            navbarAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarAppLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_client, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_materiel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_achat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_stat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        navbarAppLayout.setVerticalGroup(
            navbarAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(btn_client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_materiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_achat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerAppLayout = new javax.swing.GroupLayout(headerApp);
        headerApp.setLayout(headerAppLayout);
        headerAppLayout.setHorizontalGroup(
            headerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(navbarApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE))
        );
        headerAppLayout.setVerticalGroup(
            headerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerAppLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(headerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerAppLayout.createSequentialGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
                    .addComponent(navbarApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(headerApp);

        panelMain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelMain.setLayout(new java.awt.CardLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nom du client");

        txtNumCliClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNumCliClient.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumCliClient.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtNumCliClient.setEnabled(false);
        txtNumCliClient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Numéro du client");

        txtNomCliClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Adresse du client");

        txtAdresseCliClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        paneInfoClient.setBackground(new java.awt.Color(255, 255, 255));
        paneInfoClient.setLayout(new java.awt.CardLayout());

        paneModifyClient.setBackground(new java.awt.Color(255, 255, 255));

        btnAnnulerModifyClient.setBackground(new java.awt.Color(153, 153, 153));
        btnAnnulerModifyClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAnnulerModifyClient.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnulerModifyClient.setText("ANNULER");
        btnAnnulerModifyClient.setBorderColor(new java.awt.Color(153, 153, 153));
        btnAnnulerModifyClient.setColor(new java.awt.Color(153, 153, 153));
        btnAnnulerModifyClient.setColorClick(new java.awt.Color(153, 153, 153));
        btnAnnulerModifyClient.setColorOver(new java.awt.Color(255, 204, 204));
        btnAnnulerModifyClient.setFocusPainted(false);
        btnAnnulerModifyClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAnnulerModifyClient.setOpaque(true);
        btnAnnulerModifyClient.setOver(true);

        btnModifyClient.setBackground(new java.awt.Color(0, 51, 102));
        btnModifyClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModifyClient.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyClient.setText("MODIFIER");
        btnModifyClient.setBorderColor(new java.awt.Color(0, 51, 102));
        btnModifyClient.setColor(new java.awt.Color(0, 51, 102));
        btnModifyClient.setColorClick(new java.awt.Color(0, 51, 102));
        btnModifyClient.setColorOver(new java.awt.Color(0, 153, 255));
        btnModifyClient.setFocusPainted(false);
        btnModifyClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModifyClient.setOver(true);

        javax.swing.GroupLayout paneModifyClientLayout = new javax.swing.GroupLayout(paneModifyClient);
        paneModifyClient.setLayout(paneModifyClientLayout);
        paneModifyClientLayout.setHorizontalGroup(
            paneModifyClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneModifyClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModifyClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnnulerModifyClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        paneModifyClientLayout.setVerticalGroup(
            paneModifyClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneModifyClientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneModifyClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnulerModifyClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paneInfoClient.add(paneModifyClient, "card3");

        paneAddClient.setBackground(new java.awt.Color(255, 255, 255));

        btnAnnulerClient.setBackground(new java.awt.Color(153, 153, 153));
        btnAnnulerClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAnnulerClient.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnulerClient.setText("ANNULER");
        btnAnnulerClient.setBorderColor(new java.awt.Color(153, 153, 153));
        btnAnnulerClient.setColor(new java.awt.Color(153, 153, 153));
        btnAnnulerClient.setColorClick(new java.awt.Color(153, 153, 153));
        btnAnnulerClient.setColorOver(new java.awt.Color(255, 204, 204));
        btnAnnulerClient.setFocusPainted(false);
        btnAnnulerClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAnnulerClient.setOpaque(true);

        btnAddClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddClient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddClient.setText("AJOUTER");
        btnAddClient.setBorderColor(new java.awt.Color(0, 51, 102));
        btnAddClient.setColor(new java.awt.Color(0, 51, 102));
        btnAddClient.setColorClick(new java.awt.Color(0, 51, 102));
        btnAddClient.setColorOver(new java.awt.Color(0, 153, 255));
        btnAddClient.setFocusPainted(false);
        btnAddClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddClient.setOpaque(true);

        javax.swing.GroupLayout paneAddClientLayout = new javax.swing.GroupLayout(paneAddClient);
        paneAddClient.setLayout(paneAddClientLayout);
        paneAddClientLayout.setHorizontalGroup(
            paneAddClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAddClientLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnnulerClient, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        paneAddClientLayout.setVerticalGroup(
            paneAddClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAddClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneAddClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddClient, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnAnnulerClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneInfoClient.add(paneAddClient, "card2");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneInfoClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdresseCliClient, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNomCliClient, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumCliClient, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(txtNumCliClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomCliClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdresseCliClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(paneInfoClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        inputSearchClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSearchClient.setBackground(new java.awt.Color(0, 51, 102));
        btnSearchClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchClient.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchClient.setText("RECHERCHER");
        btnSearchClient.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSearchClient.setColor(new java.awt.Color(0, 51, 102));
        btnSearchClient.setColorClick(new java.awt.Color(0, 51, 102));
        btnSearchClient.setColorOver(new java.awt.Color(0, 153, 255));
        btnSearchClient.setFocusPainted(false);
        btnSearchClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchClient.setOver(true);

        checkClientSearch.setBackground(new java.awt.Color(204, 204, 204));
        checkClientSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N°", "NOM" }));
        checkClientSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnDeleteClient.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteClient.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteClient.setText("SUPPRIMER");
        btnDeleteClient.setBorderColor(new java.awt.Color(255, 102, 102));
        btnDeleteClient.setColor(new java.awt.Color(255, 102, 102));
        btnDeleteClient.setColorClick(new java.awt.Color(0, 51, 102));
        btnDeleteClient.setColorOver(new java.awt.Color(255, 0, 51));
        btnDeleteClient.setFocusPainted(false);
        btnDeleteClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteClient.setOver(true);

        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom", "Adresse"
            }
        ));
        tableClient.setEditingColumn(0);
        tableClient.setEditingRow(0);
        tableClient.setFocusable(false);
        tableClient.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableClient.setRequestFocusEnabled(false);
        tableClient.setRowHeight(35);
        tableClient.getTableHeader().setReorderingAllowed(false);
        tableClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableClient);
        if (tableClient.getColumnModel().getColumnCount() > 0) {
            tableClient.getColumnModel().getColumn(0).setMinWidth(80);
            tableClient.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableClient.getColumnModel().getColumn(0).setMaxWidth(880);
        }

        btnAddClientIcon.setBackground(new java.awt.Color(0, 153, 255));
        btnAddClientIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddClientIcon.setForeground(new java.awt.Color(255, 255, 255));
        btnAddClientIcon.setText("+");
        btnAddClientIcon.setBorderColor(new java.awt.Color(0, 153, 255));
        btnAddClientIcon.setColor(new java.awt.Color(0, 153, 255));
        btnAddClientIcon.setColorClick(new java.awt.Color(0, 51, 102));
        btnAddClientIcon.setColorOver(new java.awt.Color(0, 51, 102));
        btnAddClientIcon.setFocusPainted(false);
        btnAddClientIcon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddClientIcon.setOver(true);

        btnSearchNomClientAchat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchNomClientAchat.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNomClientAchat.setText(">>>");
        btnSearchNomClientAchat.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSearchNomClientAchat.setColor(new java.awt.Color(0, 51, 102));
        btnSearchNomClientAchat.setColorClick(new java.awt.Color(0, 51, 102));
        btnSearchNomClientAchat.setColorOver(new java.awt.Color(0, 153, 255));
        btnSearchNomClientAchat.setFocusPainted(false);
        btnSearchNomClientAchat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchNomClientAchat.setOpaque(true);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnAddClientIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchNomClientAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(checkClientSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputSearchClient, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inputSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkClientSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddClientIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchNomClientAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout paneClientLayout = new javax.swing.GroupLayout(paneClient);
        paneClient.setLayout(paneClientLayout);
        paneClientLayout.setHorizontalGroup(
            paneClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneClientLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        paneClientLayout.setVerticalGroup(
            paneClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMain.add(paneClient, "card3");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Désignation");

        txtNumMatMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNumMatMateriel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumMatMateriel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Numéro du matériel");

        txtDesignMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Prix unitaire");

        txtPuMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        paneInfoMateriel.setBackground(new java.awt.Color(255, 255, 255));
        paneInfoMateriel.setLayout(new java.awt.CardLayout());

        paneModifyMateriel.setBackground(new java.awt.Color(255, 255, 255));

        btnModifyAnnulerMateriel.setBackground(new java.awt.Color(153, 153, 153));
        btnModifyAnnulerMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModifyAnnulerMateriel.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyAnnulerMateriel.setText("ANNULER");
        btnModifyAnnulerMateriel.setBorderColor(new java.awt.Color(153, 153, 153));
        btnModifyAnnulerMateriel.setColor(new java.awt.Color(153, 153, 153));
        btnModifyAnnulerMateriel.setColorClick(new java.awt.Color(153, 153, 153));
        btnModifyAnnulerMateriel.setColorOver(new java.awt.Color(255, 204, 204));
        btnModifyAnnulerMateriel.setFocusPainted(false);
        btnModifyAnnulerMateriel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModifyAnnulerMateriel.setOpaque(true);
        btnModifyAnnulerMateriel.setOver(true);

        btnModifyMateriel.setBackground(new java.awt.Color(0, 51, 102));
        btnModifyMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModifyMateriel.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyMateriel.setText("MODIFIER");
        btnModifyMateriel.setBorderColor(new java.awt.Color(0, 51, 102));
        btnModifyMateriel.setColor(new java.awt.Color(0, 51, 102));
        btnModifyMateriel.setColorClick(new java.awt.Color(0, 51, 102));
        btnModifyMateriel.setColorOver(new java.awt.Color(0, 153, 255));
        btnModifyMateriel.setFocusPainted(false);
        btnModifyMateriel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModifyMateriel.setOver(true);

        javax.swing.GroupLayout paneModifyMaterielLayout = new javax.swing.GroupLayout(paneModifyMateriel);
        paneModifyMateriel.setLayout(paneModifyMaterielLayout);
        paneModifyMaterielLayout.setHorizontalGroup(
            paneModifyMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneModifyMaterielLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnModifyMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModifyAnnulerMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneModifyMaterielLayout.setVerticalGroup(
            paneModifyMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneModifyMaterielLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneModifyMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyAnnulerMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paneInfoMateriel.add(paneModifyMateriel, "card3");

        paneAddMateriel.setBackground(new java.awt.Color(255, 255, 255));

        btnAnnulerMateriel.setBackground(new java.awt.Color(153, 153, 153));
        btnAnnulerMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAnnulerMateriel.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnulerMateriel.setText("ANNULER");
        btnAnnulerMateriel.setBorderColor(new java.awt.Color(153, 153, 153));
        btnAnnulerMateriel.setColor(new java.awt.Color(153, 153, 153));
        btnAnnulerMateriel.setColorClick(new java.awt.Color(153, 153, 153));
        btnAnnulerMateriel.setColorOver(new java.awt.Color(255, 204, 204));
        btnAnnulerMateriel.setFocusPainted(false);
        btnAnnulerMateriel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAnnulerMateriel.setOpaque(true);

        btnAddMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddMateriel.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMateriel.setText("AJOUTER");
        btnAddMateriel.setBorderColor(new java.awt.Color(0, 51, 102));
        btnAddMateriel.setColor(new java.awt.Color(0, 51, 102));
        btnAddMateriel.setColorClick(new java.awt.Color(0, 51, 102));
        btnAddMateriel.setColorOver(new java.awt.Color(0, 153, 255));
        btnAddMateriel.setFocusPainted(false);
        btnAddMateriel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddMateriel.setOpaque(true);

        javax.swing.GroupLayout paneAddMaterielLayout = new javax.swing.GroupLayout(paneAddMateriel);
        paneAddMateriel.setLayout(paneAddMaterielLayout);
        paneAddMaterielLayout.setHorizontalGroup(
            paneAddMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAddMaterielLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAddMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnnulerMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        paneAddMaterielLayout.setVerticalGroup(
            paneAddMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAddMaterielLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneAddMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddMateriel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnAnnulerMateriel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneInfoMateriel.add(paneAddMateriel, "card2");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Stock");

        txtStockMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneInfoMateriel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStockMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtPuMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtDesignMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumMatMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addComponent(txtNumMatMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDesignMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStockMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(paneInfoMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        checkMaterielSearch.setBackground(new java.awt.Color(204, 204, 204));
        checkMaterielSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N°", "Designation" }));
        checkMaterielSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        inputSearchMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSearchMateriel.setBackground(new java.awt.Color(0, 51, 102));
        btnSearchMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchMateriel.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchMateriel.setText("RECHERCHER");
        btnSearchMateriel.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSearchMateriel.setColor(new java.awt.Color(0, 51, 102));
        btnSearchMateriel.setColorClick(new java.awt.Color(0, 51, 102));
        btnSearchMateriel.setColorOver(new java.awt.Color(0, 153, 255));
        btnSearchMateriel.setFocusPainted(false);
        btnSearchMateriel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchMateriel.setOver(true);

        tableMateriel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Désignation", "PU", "Stock"
            }
        ));
        tableMateriel.setEditingColumn(0);
        tableMateriel.setEditingRow(0);
        tableMateriel.setFocusable(false);
        tableMateriel.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableMateriel.setRequestFocusEnabled(false);
        tableMateriel.setRowHeight(35);
        tableMateriel.getTableHeader().setReorderingAllowed(false);
        tableMateriel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMaterielMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableMateriel);
        if (tableMateriel.getColumnModel().getColumnCount() > 0) {
            tableMateriel.getColumnModel().getColumn(0).setMinWidth(80);
            tableMateriel.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableMateriel.getColumnModel().getColumn(0).setMaxWidth(880);
        }

        btnDeleteMateriel.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteMateriel.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMateriel.setText("SUPPRIMER");
        btnDeleteMateriel.setBorderColor(new java.awt.Color(255, 102, 102));
        btnDeleteMateriel.setColor(new java.awt.Color(255, 102, 102));
        btnDeleteMateriel.setColorClick(new java.awt.Color(0, 51, 102));
        btnDeleteMateriel.setColorOver(new java.awt.Color(255, 0, 51));
        btnDeleteMateriel.setFocusPainted(false);
        btnDeleteMateriel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteMateriel.setOver(true);

        btnAddMaterielIcon.setBackground(new java.awt.Color(0, 153, 255));
        btnAddMaterielIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddMaterielIcon.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMaterielIcon.setText("+");
        btnAddMaterielIcon.setBorderColor(new java.awt.Color(0, 153, 255));
        btnAddMaterielIcon.setColor(new java.awt.Color(0, 153, 255));
        btnAddMaterielIcon.setColorClick(new java.awt.Color(0, 51, 102));
        btnAddMaterielIcon.setColorOver(new java.awt.Color(0, 51, 102));
        btnAddMaterielIcon.setFocusPainted(false);
        btnAddMaterielIcon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddMaterielIcon.setOver(true);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(btnAddMaterielIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(checkMaterielSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputSearchMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inputSearchMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkMaterielSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddMaterielIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneMaterielLayout = new javax.swing.GroupLayout(paneMateriel);
        paneMateriel.setLayout(paneMaterielLayout);
        paneMaterielLayout.setHorizontalGroup(
            paneMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMaterielLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        paneMaterielLayout.setVerticalGroup(
            paneMaterielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMain.add(paneMateriel, "card4");

        paneCommandeAchatClient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Nom du client : ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Numéro du client : ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Adresse du client : ");

        btnClientCommanderMat.setBackground(new java.awt.Color(0, 153, 255));
        btnClientCommanderMat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnClientCommanderMat.setForeground(new java.awt.Color(255, 255, 255));
        btnClientCommanderMat.setText("COMMANDER");
        btnClientCommanderMat.setBorderColor(new java.awt.Color(153, 153, 153));
        btnClientCommanderMat.setColor(new java.awt.Color(0, 153, 255));
        btnClientCommanderMat.setColorClick(new java.awt.Color(153, 153, 153));
        btnClientCommanderMat.setColorOver(new java.awt.Color(255, 204, 204));
        btnClientCommanderMat.setFocusPainted(false);
        btnClientCommanderMat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClientCommanderMat.setOpaque(true);
        btnClientCommanderMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientCommanderMatActionPerformed(evt);
            }
        });

        inputNumClientSearchAchat.setText("jLabel1");

        inputNomClientSearchAchat.setText("jLabel10");

        inputAdresseClientSearchAchat.setText("jLabel11");

        javax.swing.GroupLayout paneCommandeAchatLayout = new javax.swing.GroupLayout(paneCommandeAchat);
        paneCommandeAchat.setLayout(paneCommandeAchatLayout);
        paneCommandeAchatLayout.setHorizontalGroup(
            paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCommandeAchatLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCommandeAchatLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(32, 32, 32)
                        .addComponent(inputNumClientSearchAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneCommandeAchatLayout.createSequentialGroup()
                        .addGroup(paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputNomClientSearchAchat, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(inputAdresseClientSearchAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCommandeAchatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClientCommanderMat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        paneCommandeAchatLayout.setVerticalGroup(
            paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCommandeAchatLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(inputNumClientSearchAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNomClientSearchAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(paneCommandeAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(inputAdresseClientSearchAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnClientCommanderMat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        btnReturnClientAchat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReturnClientAchat.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnClientAchat.setText("<<<");
        btnReturnClientAchat.setBorderColor(new java.awt.Color(0, 51, 102));
        btnReturnClientAchat.setColor(new java.awt.Color(0, 51, 102));
        btnReturnClientAchat.setColorClick(new java.awt.Color(0, 51, 102));
        btnReturnClientAchat.setColorOver(new java.awt.Color(0, 153, 255));
        btnReturnClientAchat.setFocusPainted(false);
        btnReturnClientAchat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReturnClientAchat.setOpaque(true);
        btnReturnClientAchat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnClientAchatMouseClicked(evt);
            }
        });

        btnSearchNomClientStat.setBackground(new java.awt.Color(0, 204, 255));
        btnSearchNomClientStat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchNomClientStat.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNomClientStat.setText(">>>");
        btnSearchNomClientStat.setBorderColor(new java.awt.Color(0, 204, 255));
        btnSearchNomClientStat.setColor(new java.awt.Color(0, 204, 255));
        btnSearchNomClientStat.setColorClick(new java.awt.Color(0, 204, 255));
        btnSearchNomClientStat.setColorOver(new java.awt.Color(0, 51, 102));
        btnSearchNomClientStat.setFocusPainted(false);
        btnSearchNomClientStat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchNomClientStat.setOpaque(true);

        javax.swing.GroupLayout paneCommandeAchatClientLayout = new javax.swing.GroupLayout(paneCommandeAchatClient);
        paneCommandeAchatClient.setLayout(paneCommandeAchatClientLayout);
        paneCommandeAchatClientLayout.setHorizontalGroup(
            paneCommandeAchatClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCommandeAchatClientLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(paneCommandeAchatClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCommandeAchatClientLayout.createSequentialGroup()
                        .addComponent(btnReturnClientAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchNomClientStat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paneCommandeAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        paneCommandeAchatClientLayout.setVerticalGroup(
            paneCommandeAchatClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCommandeAchatClientLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(paneCommandeAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(paneCommandeAchatClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnClientAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchNomClientStat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        paneAchatInfoGeneral.setBackground(new java.awt.Color(255, 255, 255));

        tableClient1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Facture", "N° Client", "Nom", "N° Matériel", "Designation", "Qté", "Date d'achat"
            }
        ));
        tableClient1.setEditingColumn(0);
        tableClient1.setEditingRow(0);
        tableClient1.setFocusable(false);
        tableClient1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableClient1.setRequestFocusEnabled(false);
        tableClient1.setRowHeight(35);
        tableClient1.getTableHeader().setReorderingAllowed(false);
        tableClient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClient1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableClient1);
        if (tableClient1.getColumnModel().getColumnCount() > 0) {
            tableClient1.getColumnModel().getColumn(1).setMinWidth(80);
            tableClient1.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableClient1.getColumnModel().getColumn(1).setMaxWidth(880);
        }

        inputSearchClient1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSearchClient1.setBackground(new java.awt.Color(0, 51, 102));
        btnSearchClient1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearchClient1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchClient1.setText("RECHERCHER");
        btnSearchClient1.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSearchClient1.setColor(new java.awt.Color(0, 51, 102));
        btnSearchClient1.setColorClick(new java.awt.Color(0, 51, 102));
        btnSearchClient1.setColorOver(new java.awt.Color(0, 153, 255));
        btnSearchClient1.setFocusPainted(false);
        btnSearchClient1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchClient1.setOver(true);

        btnDeleteAchat1.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteAchat1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDeleteAchat1.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAchat1.setText("SUPPRIMER");
        btnDeleteAchat1.setBorderColor(new java.awt.Color(255, 102, 102));
        btnDeleteAchat1.setColor(new java.awt.Color(255, 102, 102));
        btnDeleteAchat1.setColorClick(new java.awt.Color(0, 51, 102));
        btnDeleteAchat1.setColorOver(new java.awt.Color(255, 0, 51));
        btnDeleteAchat1.setFocusPainted(false);
        btnDeleteAchat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteAchat1.setOver(true);

        dateChooserCommande.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateChooserCommande.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        btnSeeDateChooser.setBorder(null);
        btnSeeDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeDateChooser.setText("...");
        btnSeeDateChooser.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSeeDateChooser.setColor(new java.awt.Color(0, 51, 102));
        btnSeeDateChooser.setColorClick(new java.awt.Color(153, 153, 153));
        btnSeeDateChooser.setColorOver(new java.awt.Color(255, 204, 204));
        btnSeeDateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeeDateChooser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeeDateChooser.setOpaque(true);
        btnSeeDateChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDateChooserActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Date d'achat");

        btnModifyAchat1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModifyAchat1.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyAchat1.setText("MODIFIER");
        btnModifyAchat1.setBorderColor(new java.awt.Color(0, 51, 102));
        btnModifyAchat1.setColor(new java.awt.Color(0, 51, 102));
        btnModifyAchat1.setColorClick(new java.awt.Color(0, 51, 102));
        btnModifyAchat1.setColorOver(new java.awt.Color(0, 153, 255));
        btnModifyAchat1.setFocusPainted(false);
        btnModifyAchat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModifyAchat1.setOpaque(true);
        btnModifyAchat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyAchat1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneAchatInfoGeneralLayout = new javax.swing.GroupLayout(paneAchatInfoGeneral);
        paneAchatInfoGeneral.setLayout(paneAchatInfoGeneralLayout);
        paneAchatInfoGeneralLayout.setHorizontalGroup(
            paneAchatInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAchatInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneAchatInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAchatInfoGeneralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModifyAchat1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteAchat1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneAchatInfoGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(paneAchatInfoGeneralLayout.createSequentialGroup()
                        .addComponent(dateChooserCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSeeDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSearchClient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneAchatInfoGeneralLayout.setVerticalGroup(
            paneAchatInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAchatInfoGeneralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(paneAchatInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAchatInfoGeneralLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSearchClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneAchatInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateChooserCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeeDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputSearchClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paneAchatInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyAchat1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAchat1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout paneAchatLayout = new javax.swing.GroupLayout(paneAchat);
        paneAchat.setLayout(paneAchatLayout);
        paneAchatLayout.setHorizontalGroup(
            paneAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAchatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneCommandeAchatClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(paneAchatInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneAchatLayout.setVerticalGroup(
            paneAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCommandeAchatClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneAchatInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelMain.add(paneAchat, "card5");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Liste des Matériels achetés / Client");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Numéro du client");

        btnSeeListMaterielClient.setBackground(new java.awt.Color(0, 51, 102));
        btnSeeListMaterielClient.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSeeListMaterielClient.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeListMaterielClient.setText("VOIR");
        btnSeeListMaterielClient.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSeeListMaterielClient.setColor(new java.awt.Color(0, 51, 102));
        btnSeeListMaterielClient.setColorClick(new java.awt.Color(0, 51, 102));
        btnSeeListMaterielClient.setColorOver(new java.awt.Color(0, 153, 255));
        btnSeeListMaterielClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeeListMaterielClient.setOver(true);

        txtNumClientSearchStat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNumClientSearchStat.setForeground(new java.awt.Color(255, 51, 51));
        txtNumClientSearchStat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumClientSearchStat.setEnabled(false);
        txtNumClientSearchStat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 208, Short.MAX_VALUE)
                        .addComponent(btnSeeListMaterielClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumClientSearchStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtNumClientSearchStat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSeeListMaterielClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Listes des matériels vendus");

        btnSeeListMatVendu.setBackground(new java.awt.Color(0, 51, 102));
        btnSeeListMatVendu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSeeListMatVendu.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeListMatVendu.setText("VOIR");
        btnSeeListMatVendu.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSeeListMatVendu.setColor(new java.awt.Color(0, 51, 102));
        btnSeeListMatVendu.setColorClick(new java.awt.Color(0, 51, 102));
        btnSeeListMatVendu.setColorOver(new java.awt.Color(0, 153, 255));
        btnSeeListMatVendu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeeListMatVendu.setOver(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeeListMatVendu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSeeListMatVendu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Statistique de chiffre d'affaires");

        btnSeeChiffreAffaire.setBackground(new java.awt.Color(0, 51, 102));
        btnSeeChiffreAffaire.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSeeChiffreAffaire.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeChiffreAffaire.setText("VOIR");
        btnSeeChiffreAffaire.setBorderColor(new java.awt.Color(0, 51, 102));
        btnSeeChiffreAffaire.setColor(new java.awt.Color(0, 51, 102));
        btnSeeChiffreAffaire.setColorClick(new java.awt.Color(0, 51, 102));
        btnSeeChiffreAffaire.setColorOver(new java.awt.Color(0, 153, 255));
        btnSeeChiffreAffaire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSeeChiffreAffaire.setOver(true);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Année");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnSeeChiffreAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(btnSeeChiffreAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnListStockEtat.setBackground(new java.awt.Color(0, 51, 102));
        btnListStockEtat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnListStockEtat.setForeground(new java.awt.Color(255, 255, 255));
        btnListStockEtat.setText("VOIR");
        btnListStockEtat.setBorderColor(new java.awt.Color(0, 51, 102));
        btnListStockEtat.setColor(new java.awt.Color(0, 51, 102));
        btnListStockEtat.setColorClick(new java.awt.Color(0, 51, 102));
        btnListStockEtat.setColorOver(new java.awt.Color(0, 153, 255));
        btnListStockEtat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListStockEtat.setOver(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListStockEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnListStockEtat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Etat de stock et mouvement de stock");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneStatLayout = new javax.swing.GroupLayout(paneStat);
        paneStat.setLayout(paneStatLayout);
        paneStatLayout.setHorizontalGroup(
            paneStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStatLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        paneStatLayout.setVerticalGroup(
            paneStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStatLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(paneStatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        panelMain.add(paneStat, "card6");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pieChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 102));
        kGradientPanel1.setkGradientFocus(400);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 51, 102));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/user(1).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLIENT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("35");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lineChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lineChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneDashboardLayout = new javax.swing.GroupLayout(paneDashboard);
        paneDashboard.setLayout(paneDashboardLayout);
        paneDashboardLayout.setHorizontalGroup(
            paneDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneDashboardLayout.setVerticalGroup(
            paneDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDashboardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(paneDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paneDashboardLayout.createSequentialGroup()
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelMain.add(paneDashboard, "card2");

        getContentPane().add(panelMain);

        footerApp.setBackground(new java.awt.Color(0, 0, 0));
        footerApp.setMaximumSize(new java.awt.Dimension(32767, 40));
        footerApp.setMinimumSize(new java.awt.Dimension(100, 40));
        footerApp.setPreferredSize(new java.awt.Dimension(974, 40));

        labelLogin.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Bienvenue , Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Copyright by Salorana, 2022. Future Tech");

        btn_logout.setBackground(new java.awt.Color(0, 153, 255));
        btn_logout.setBorder(null);
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Déconnecter");
        btn_logout.setFocusable(false);
        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_logout.setOpaque(true);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerAppLayout = new javax.swing.GroupLayout(footerApp);
        footerApp.setLayout(footerAppLayout);
        footerAppLayout.setHorizontalGroup(
            footerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerAppLayout.createSequentialGroup()
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        footerAppLayout.setVerticalGroup(
            footerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(footerAppLayout.createSequentialGroup()
                .addGroup(footerAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(footerApp);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
        btn_dashboard.setBackground(new Color(0,51,102));
        
        panelMain.removeAll();
        panelMain.add(paneDashboard);
        panelMain.repaint();
        panelMain.revalidate();
        
        countClient();
        
        chartPie();
        
        btn_stat.setBackground(new Color(0,153,255));
        btn_materiel.setBackground(new Color(0,153,255));
        btn_client.setBackground(new Color(0,153,255));
        btn_achat.setBackground(new Color(0,153,255));
        
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void btn_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientMouseClicked
        btn_client.setBackground(new Color(0,51,102));
        
        panelMain.removeAll();
        panelMain.add(paneClient);
        panelMain.repaint();
        panelMain.revalidate();
        
        txtNomCliClient.setText(null);
        txtAdresseCliClient.setText(null);
        
        btnSearchNomClientAchat.setVisible(false);
        btnDeleteClient.setVisible(false);
        btnAddClientIcon.setVisible(false);
        
        btn_stat.setBackground(new Color(0,153,255));
        btn_materiel.setBackground(new Color(0,153,255));
        btn_dashboard.setBackground(new Color(0,153,255));
        btn_achat.setBackground(new Color(0,153,255));
        
        fixTable(jScrollPane2);  
        autoIDClient();
        
        paneInfoClient.removeAll();
        paneInfoClient.add(paneAddClient);
        paneInfoClient.repaint();
        paneInfoClient.revalidate();
        
    }//GEN-LAST:event_btn_clientMouseClicked

    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(240, 240, 240));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240), 2));
    }
    
    private void btn_materielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materielMouseClicked
        btn_materiel.setBackground(new Color(0,51,102));
        
        panelMain.removeAll();
        panelMain.add(paneMateriel);
        panelMain.repaint();
        panelMain.revalidate();
        
        paneCommandeAchat.setVisible(false);
        btnReturnClientAchat.setVisible(false);
        
        btnDeleteMateriel.setVisible(false);
        btnAddMaterielIcon.setVisible(false);
        
        txtDesignMateriel.setText(null);
        txtPuMateriel.setText(null);
        txtStockMateriel.setText(null);
        
        fixTable(jScrollPane3); 
        autoIDMateriel();
        
        btn_stat.setBackground(new Color(0,153,255));
        btn_dashboard.setBackground(new Color(0,153,255));
        btn_client.setBackground(new Color(0,153,255));
        btn_achat.setBackground(new Color(0,153,255));
        
        paneInfoMateriel.removeAll();
        paneInfoMateriel.add(paneAddMateriel);
        paneInfoMateriel.repaint();
        paneInfoMateriel.revalidate();
    }//GEN-LAST:event_btn_materielMouseClicked

    private void btn_achatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_achatMouseClicked
        btn_achat.setBackground(new Color(0,51,102));
        
        panelMain.removeAll();
        panelMain.add(paneAchat);
        panelMain.repaint();
        panelMain.revalidate();

        paneCommandeAchatClient.setVisible(false);
        paneAchatInfoGeneral.setVisible(true);
        fixTable(jScrollPane4);
        btn_stat.setBackground(new Color(0,153,255));
        btn_materiel.setBackground(new Color(0,153,255));
        btn_client.setBackground(new Color(0,153,255));
        btn_dashboard.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_achatMouseClicked

    private void btn_statMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_statMouseClicked
        btn_stat.setBackground(new Color(0,51,102));
        
        panelMain.removeAll();
        panelMain.add(paneStat);
        panelMain.repaint();
        panelMain.revalidate();
        
        btn_dashboard.setBackground(new Color(0,153,255));
        btn_materiel.setBackground(new Color(0,153,255));
        btn_client.setBackground(new Color(0,153,255));
        btn_achat.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_statMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        btn_logout.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        btn_logout.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btnClientCommanderMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientCommanderMatActionPerformed
        
    }//GEN-LAST:event_btnClientCommanderMatActionPerformed

    private void tableClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientMouseClicked
       
        int row = tableClient.getSelectedRow();
       
        String numCli = tableClient.getValueAt(row, 0).toString();
        String nomCli = tableClient.getValueAt(row, 1).toString();
        String adrCli = tableClient.getValueAt(row, 2).toString();
        
        txtNumCliClient.setText(numCli);
        txtNomCliClient.setText(nomCli);
        txtAdresseCliClient.setText(adrCli);
        
        paneInfoClient.removeAll();
        paneInfoClient.add(paneModifyClient);
        paneInfoClient.repaint();
        paneInfoClient.revalidate();
        
        btnSearchNomClientAchat.setVisible(true);
        btnDeleteClient.setVisible(true);
        btnAddClientIcon.setVisible(true);
    }//GEN-LAST:event_tableClientMouseClicked

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void tableMaterielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMaterielMouseClicked
        int row = tableMateriel.getSelectedRow();
       
        String numMat = tableMateriel.getValueAt(row, 0).toString();
        String design = tableMateriel.getValueAt(row, 1).toString();
        String pu = tableMateriel.getValueAt(row, 2).toString();
        String stock = tableMateriel.getValueAt(row, 3).toString();
        
        txtNumMatMateriel.setText(numMat);
        txtDesignMateriel.setText(design);
        txtPuMateriel.setText(pu);
        txtStockMateriel.setText(stock);
        
        paneInfoMateriel.removeAll();
        paneInfoMateriel.add(paneModifyMateriel);
        paneInfoMateriel.repaint();
        paneInfoMateriel.revalidate();
        
        btnDeleteMateriel.setVisible(true);
        btnAddMaterielIcon.setVisible(true);
    }//GEN-LAST:event_tableMaterielMouseClicked

    private void btnReturnClientAchatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnClientAchatMouseClicked
        fixTable(jScrollPane2);  
        autoIDClient();
    }//GEN-LAST:event_btnReturnClientAchatMouseClicked

    private void tableClient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClient1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableClient1MouseClicked

    private void btnSeeDateChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDateChooserActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btnSeeDateChooserActionPerformed

    private void btnModifyAchat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyAchat1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyAchat1MouseClicked

    public void autoIDClient(){
        ConnexionDB conn = new ConnexionDB();
        Connection connexion = conn.getConnexion(); 
        ResultSet rs = null;
        String sql = "SELECT MAX(NumClient) FROM client ";
        
        try{
            Statement statement = connexion.createStatement();
            rs = statement.executeQuery(sql);
            rs.next();
            rs.getString("MAX(NumClient)");
            
            if(rs.getString("MAX(NumClient)") == null){
                txtNumCliClient.setText("C0001");
            }else{
                Long id = Long.parseLong(rs.getString("MAX(NumClient)").substring(2,rs.getString("MAX(NumClient)").length()));
                id++;
                txtNumCliClient.setText("C0" + String.format("%03d", id));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void autoIDMateriel(){
        ConnexionDB conn = new ConnexionDB();
        Connection connexion = conn.getConnexion(); 
        ResultSet rs = null;
        String sql = "SELECT MAX(NumMat) FROM materiel ";
        
        try{
            Statement statement = connexion.createStatement();
            rs = statement.executeQuery(sql);
            rs.next();
            rs.getString("MAX(NumMat)");
            
            if(rs.getString("MAX(NumMat)") == null){
                txtNumMatMateriel.setText("MT0001");
            }else{
                Long id = Long.parseLong(rs.getString("MAX(NumMat)").substring(2,rs.getString("MAX(NumMat)").length()));
                id++;
                txtNumMatMateriel.setText("MT0" + String.format("%03d", id));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void countClient(){
        ConnexionDB conn = new ConnexionDB();
        Connection connexion = conn.getConnexion(); 
        ResultSet rs = null;
        String sql = "SELECT COUNT(NumClient) as number FROM client ";
        
        try{
            Statement statement = connexion.createStatement();
            rs = statement.executeQuery(sql);
            rs.next();
          
            jLabel1.setText(rs.getString("number"));
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void chartEvolution(){
        ConnexionDB conn = new ConnexionDB();
        Connection connexion = conn.getConnexion(); 
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        
        String sql = "SELECT SUM(Qte*Pu) as somme"
                + " FROM achat a,materiel mat WHERE a.NumMat = mat.NumMat "
                + "AND MONTH(DateAchat) = ? GROUP BY DATE_FORMAT(DateAchat,'%Y')"
                + "ORDER BY DATE_FORMAT(DateAchat,'%Y') DESC ";
        
        String sql1 = "SELECT DATE_FORMAT(DateAchat,'%m') as monthNumber FROM achat GROUP BY monthNumber ORDER BY monthNumber ASC";
        String sql2 = "SELECT DATE_FORMAT(DateAchat,'%Y') as yearNumber FROM achat GROUP BY yearNumber ORDER BY yearNumber DESC LIMIT 5";
        
        Color[] color = {new Color(23, 126, 238),new Color(221, 65, 65),new Color(47, 157, 64),new Color(196, 151, 58),new Color(150, 75, 58)};
        
        String[] text = {"Jan","Fev","Mar","Avr","Mai","Juin","Juil","Août","Sept","Oct","Nov","Dec"};

        try{
            PreparedStatement statement2 = connexion.prepareStatement(sql2);
            rs2 = statement2.executeQuery();
            int i=0;
           
            while(rs2.next()){
                
                lineChart1.addLegend("" + rs2.getInt("yearNumber") + "", color[i], color[i]);
                i++;
            }
           
            Statement statement = connexion.createStatement();
            rs = statement.executeQuery(sql1);
          
            while(rs.next()){
                int month = rs.getInt("monthNumber");
                PreparedStatement statement1 = connexion.prepareStatement(sql);
                statement1.setInt(1,month );
                rs1 = statement1.executeQuery();
                
                try{
                    
                    double[] calcul =  new double[5];
                    int k = 0;
                    while(rs1.next()){
                        calcul[k] = rs1.getDouble("somme");
                        k++;
                    }
                    lineChart1.addData(new ModelChart(text[month-1], calcul));
                }catch(SQLException e){
                    System.err.println(e);
                }
            }
            
            lineChart1.start(); 
        }catch(SQLException e){
            System.err.println(e);
        }
       
    }
    
    public void chartPie(){
        
        ConnexionDB conn = new ConnexionDB();
        Connection connexion = conn.getConnexion(); 
        ResultSet rs = null;
        String sql = "SELECT Design,SUM(Qte) as somme FROM achat a,materiel mat WHERE "
                + "a.NumMat = mat.NumMat "
                + "GROUP BY a.NumMat ORDER BY somme DESC LIMIT 5";
        String sql1 = "SELECT SUM(Qte) as total FROM achat" ;
                
        try{
            PreparedStatement statement = connexion.prepareStatement(sql);
            rs = statement.executeQuery();
            int somme = 0;
            int i=0;
            
            Object[] color = {new Color(23, 126, 238),new Color(221, 65, 65),new Color(47, 157, 64),new Color(196, 151, 58),new Color(150, 75, 58)};
            pieChart1.clearData();
            pieChart1.setChartType(PieChart.PeiChartType.DONUT_CHART);
            while(rs.next()){
                
                pieChart1.addData(new ModelPieChart(rs.getString("Design"), rs.getInt("somme"), (Color) color[i]));
                somme += rs.getInt("somme");
                i++;
            }
          
            statement = connexion.prepareStatement(sql1);
            rs = statement.executeQuery();
            rs.next();
            pieChart1.addData(new ModelPieChart("Reste", (rs.getInt("total")- somme), new Color(71, 20, 64)));
        
        }catch(SQLException e){
            System.err.println(e);
        }
       
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public app.component.ButtonCustom btnAddClient;
    public app.component.ButtonCustom btnAddClientIcon;
    public app.component.ButtonCustom btnAddMateriel;
    public app.component.ButtonCustom btnAddMaterielIcon;
    public app.component.ButtonCustom btnAnnulerClient;
    public app.component.ButtonCustom btnAnnulerMateriel;
    public app.component.ButtonCustom btnAnnulerModifyClient;
    public app.component.ButtonCustom btnClientCommanderMat;
    public app.component.ButtonCustom btnDeleteAchat1;
    public app.component.ButtonCustom btnDeleteClient;
    public app.component.ButtonCustom btnDeleteMateriel;
    public app.component.ButtonCustom btnListStockEtat;
    public app.component.ButtonCustom btnModifyAchat1;
    public app.component.ButtonCustom btnModifyAnnulerMateriel;
    public app.component.ButtonCustom btnModifyClient;
    public app.component.ButtonCustom btnModifyMateriel;
    public app.component.ButtonCustom btnReturnClientAchat;
    public app.component.ButtonCustom btnSearchClient;
    public app.component.ButtonCustom btnSearchClient1;
    public app.component.ButtonCustom btnSearchMateriel;
    public app.component.ButtonCustom btnSearchNomClientAchat;
    public app.component.ButtonCustom btnSearchNomClientStat;
    public app.component.ButtonCustom btnSeeChiffreAffaire;
    public app.component.ButtonCustom btnSeeDateChooser;
    public app.component.ButtonCustom btnSeeListMatVendu;
    public app.component.ButtonCustom btnSeeListMaterielClient;
    public app.component.ButtonCustomApp btn_achat;
    public app.component.ButtonCustomApp btn_client;
    public app.component.ButtonCustomApp btn_dashboard;
    private app.component.ButtonCustomApp btn_logout;
    public app.component.ButtonCustomApp btn_materiel;
    public app.component.ButtonCustomApp btn_stat;
    public app.component.ComboBoxCustom checkClientSearch;
    public app.component.ComboBoxCustom checkMaterielSearch;
    private app.component.comboSuggestion.ComboSuggestionUI comboSuggestionUI1;
    private app.component.comboSuggestion.ComboSuggestionUI comboSuggestionUI2;
    private app.component.datechooser.DateChooser dateChooser1;
    public app.component.TextFieldCustom dateChooserCommande;
    private javax.swing.JPanel footerApp;
    private javax.swing.JPanel headerApp;
    public javax.swing.JLabel inputAdresseClientSearchAchat;
    public javax.swing.JLabel inputNomClientSearchAchat;
    public javax.swing.JLabel inputNumClientSearchAchat;
    public app.component.TextFieldCustom inputSearchClient;
    public app.component.TextFieldCustom inputSearchClient1;
    public app.component.TextFieldCustom inputSearchMateriel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public com.toedter.calendar.JYearChooser jYearChooser1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JLabel labelLogin;
    private com.raven.chart.LineChart lineChart1;
    private javax.swing.JPanel navbarApp;
    public javax.swing.JPanel paneAchat;
    public javax.swing.JPanel paneAchatInfoGeneral;
    public javax.swing.JPanel paneAddClient;
    public javax.swing.JPanel paneAddMateriel;
    public javax.swing.JPanel paneClient;
    public javax.swing.JPanel paneCommandeAchat;
    public javax.swing.JPanel paneCommandeAchatClient;
    public javax.swing.JPanel paneDashboard;
    public javax.swing.JPanel paneInfoClient;
    public javax.swing.JPanel paneInfoMateriel;
    public javax.swing.JPanel paneMateriel;
    public javax.swing.JPanel paneModifyClient;
    public javax.swing.JPanel paneModifyMateriel;
    public javax.swing.JPanel paneStat;
    public javax.swing.JPanel panelMain;
    private javaswingdev.chart.PieChart pieChart1;
    private app.component.titleBarWindow.SimpleTitleBar simpleTitleBarDashBoard;
    public javax.swing.JTable tableClient;
    public javax.swing.JTable tableClient1;
    public javax.swing.JTable tableMateriel;
    public app.component.TextFieldCustom txtAdresseCliClient;
    public app.component.TextFieldCustom txtDesignMateriel;
    public app.component.TextFieldCustom txtNomCliClient;
    public app.component.TextFieldCustom txtNumCliClient;
    public app.component.TextFieldCustom txtNumClientSearchStat;
    public app.component.TextFieldCustom txtNumMatMateriel;
    public app.component.TextFieldCustom txtPuMateriel;
    public app.component.TextFieldCustom txtStockMateriel;
    // End of variables declaration//GEN-END:variables
}

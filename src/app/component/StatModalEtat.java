package app.component;

import app.controller.CommandeController;
import app.model.AchatModel;
import app.model.ConnexionDB;
import app.model.InformationClient;
import app.model.InformationMateriel;
import app.model.MaterielModel;
import app.model.StatModel;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class StatModalEtat extends javax.swing.JDialog {

    /**
     * Creates new form StatModalEtat
     */
    public StatModalEtat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        tableListStockMat();
        loadComboInformationMateriel();
        fixTable(jScrollPane2);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(240, 240, 240));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240), 2));
    }
    
    public void afficheInfoArticle(String materiel){
        AchatModel modAchat = new AchatModel();
        Object[] columns = new Object[4];
        int numRowCount = modAchat.rechercherInfoArticle(materiel).size();
        
        for(int i = 0; i < numRowCount ; i++){
            columns[0] = modAchat.rechercherInfoArticle(materiel).get(i).getNumMateriel();
            columns[1] = modAchat.rechercherInfoArticle(materiel).get(i).getDesign();
            columns[2] = modAchat.rechercherInfoArticle(materiel).get(i).getPrixU();
            columns[3] = modAchat.rechercherInfoArticle(materiel).get(i).getStock();
            
        }
        inputSearchMateriel.setText(columns[0] +"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new app.component.datechooser.DateChooser();
        dateChooser2 = new app.component.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnMoveStock = new app.component.ButtonCustom();
        inputSearchMateriel = new app.component.TextFieldCustom();
        comboArticleSearch = new app.component.comboSuggestion.ComboBoxSuggestion();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListMat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon("src/app/images/computer-science.png").getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ETAT DE STOCK DES MATERIELS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnMoveStock.setBackground(new java.awt.Color(0, 51, 102));
        btnMoveStock.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMoveStock.setForeground(new java.awt.Color(255, 255, 255));
        btnMoveStock.setText("MOUVEMENT DE STOCK >>");
        btnMoveStock.setBorderColor(new java.awt.Color(0, 51, 102));
        btnMoveStock.setColor(new java.awt.Color(0, 51, 102));
        btnMoveStock.setColorClick(new java.awt.Color(0, 51, 102));
        btnMoveStock.setColorOver(new java.awt.Color(0, 153, 255));
        btnMoveStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMoveStock.setOver(true);
        btnMoveStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMoveStockMouseClicked(evt);
            }
        });

        inputSearchMateriel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        inputSearchMateriel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputSearchMateriel.setEnabled(false);
        inputSearchMateriel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        comboArticleSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboArticleSearchItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Numéro du matériel");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Désignation");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboArticleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(inputSearchMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoveStock, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMoveStock, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboArticleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSearchMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableListMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Désignation", "Stock"
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
        if (tableListMat.getColumnModel().getColumnCount() > 0) {
            tableListMat.getColumnModel().getColumn(0).setMinWidth(100);
            tableListMat.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableListMat.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboArticleSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboArticleSearchItemStateChanged
        String design = comboArticleSearch.getSelectedItem().toString();
        afficheInfoArticle(design);
    }//GEN-LAST:event_comboArticleSearchItemStateChanged

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

    private void btnMoveStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoveStockMouseClicked
        String numMat = inputSearchMateriel.getText();
        StatModel modStat = new StatModel();
        
        InformationMateriel materiel = new InformationMateriel();
               materiel.setNumMateriel(numMat);
      
                Object[] columns = new Object[3];
                
                int numRowCount = modStat.listerMaterielByNum(materiel).size();

                for(int i = 0; i < numRowCount ; i++){
                    columns[0] = modStat.listerMaterielByNum(materiel).get(i).getNumMateriel();
                    columns[1] = modStat.listerMaterielByNum(materiel).get(i).getDesign();
                    columns[2] = modStat.listerMaterielByNum(materiel).get(i).getPrixU();
                    
                } 
                
                materiel.setNumMateriel(columns[0] + "");
                materiel.setDesign(columns[1] + "");
                materiel.setPrixU(Double.parseDouble(columns[2]+""));
                
        StatModalMoveStock statMove = new StatModalMoveStock(null, true, materiel);
        statMove.setVisible(true);     
        
    }//GEN-LAST:event_btnMoveStockMouseClicked

    public void tableListStockMat(){
      
                DefaultTableModel modelTable = (DefaultTableModel)tableListMat.getModel();

                tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                tableListMat.getTableHeader().setForeground(Color.black);
                tableListMat.setRowHeight(30);
                
                
                String sql = "SELECT NumMat,Design ,Stock  FROM materiel  "
                + "GROUP BY NumMat";

                try{
                    ConnexionDB conn = new ConnexionDB();
                    Connection connexion = conn.getConnexion();
                    PreparedStatement ps = connexion.prepareStatement(sql);
                
                    ResultSet rs = ps.executeQuery();

                    while(rs.next()){
                       
                        Vector v2 = new Vector();
                            for(int i = 0 ; i < 4 ; i++){
                                v2.add(rs.getString("NumMat"));
                                v2.add(rs.getString("Design"));
                                v2.add(rs.getInt("Stock"));
                            }
                         
                            modelTable.addRow(v2);
                    }
                
                } catch (SQLException ex) { 
                    Logger.getLogger(StatModalEtat.class.getName()).log(Level.SEVERE, null, ex);
                } 
        
                
    }
    
    public void loadComboInformationMateriel(){
        comboArticleSearch.removeAllItems();
        MaterielModel modMat = new MaterielModel();
        
        int numRowCount = modMat.listerMateriel().size();
        
        for(int i = 0; i < numRowCount ; i++){
            String design = modMat.listerMateriel().get(i).getDesign();
            this.comboArticleSearch.addItem(design);
 
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
            java.util.logging.Logger.getLogger(StatModalEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatModalEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatModalEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatModalEtat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatModalEtat dialog = new StatModalEtat(new javax.swing.JFrame(), true);
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
    private app.component.ButtonCustom btnMoveStock;
    public app.component.comboSuggestion.ComboBoxSuggestion comboArticleSearch;
    private app.component.datechooser.DateChooser dateChooser1;
    private app.component.datechooser.DateChooser dateChooser2;
    public app.component.TextFieldCustom inputSearchMateriel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tableListMat;
    // End of variables declaration//GEN-END:variables
}

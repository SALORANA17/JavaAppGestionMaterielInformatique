package app.component;

import app.controller.CommandeController;
import app.model.ConnexionDB;
import app.model.InformationClient;
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

public class StatModalVente extends javax.swing.JDialog {

    public StatModalVente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(parent);
        fixTable(jScrollPane2);
        
        tableShowInfoVente();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListMat = new javax.swing.JTable();
        labelMontantTotal = new javax.swing.JLabel();
        labelMontantValueListMat = new javax.swing.JLabel();
        labelMontantValueStringImpr = new javax.swing.JLabel();
        labelMontantValueStringImpr1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon("src/app/images/computer-science.png").getImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LISTE DES MATERIELS VENDUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tableListMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Désignation", "PU", "Qté", "Montant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
                        .addGap(18, 18, 18)
                        .addComponent(labelMontantValueListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMontantValueStringImpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMontantValueStringImpr1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontantTotal)
                    .addComponent(labelMontantValueListMat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelMontantValueStringImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMontantValueStringImpr1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 519, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    
    public void tableShowInfoVente(){
       
                DefaultTableModel modelTable = (DefaultTableModel)tableListMat.getModel();
                
                tableListMat.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD, 12));
                tableListMat.getTableHeader().setForeground(Color.black);
                tableListMat.setRowHeight(30);
                
                
                String sql = "SELECT a.NumMat,Design,PU,SUM(Qte) as somme  FROM achat a JOIN materiel mat "
                + "ON a.NumMat = mat.NumMat "
                + "GROUP BY a.NumMat";

                try{
                    ConnexionDB conn = new ConnexionDB();
                    Connection connexion = conn.getConnexion();
                    PreparedStatement ps = connexion.prepareStatement(sql);
                   
                    ResultSet rs = ps.executeQuery();

                    double somme = 0.0;
                    while(rs.next()){
                        int qte = rs.getInt("somme");
                        double pu = rs.getDouble("PU");
                        
                        Vector v2 = new Vector();
                            for(int i = 0 ; i < 4 ; i++){
                                v2.add(rs.getString("a.NumMat"));
                                v2.add(rs.getString("Design"));
                                v2.add(pu);
                                v2.add(qte);
                                v2.add((Double)(qte * pu));
                               
                            }
                            
                            modelTable.addRow(v2);
                            somme += Double.parseDouble((qte * pu)+"");
                    }
                   
                    labelMontantValueStringImpr.setVisible(true);
                    labelMontantValueStringImpr1.setVisible(true);
                    labelMontantValueListMat.setText(somme + "");
                    labelMontantTotal.setVisible(true);
                    labelMontantValueListMat.setVisible(true);
                    labelMontantValueStringImpr1.setText(""+ CommandeController.convertNumberToString((int)Double.parseDouble(somme +"")));

                } catch (SQLException ex) { 
                    Logger.getLogger(StatModalVente.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(StatModalVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatModalVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatModalVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatModalVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StatModalVente dialog = new StatModalVente(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel labelMontantTotal;
    public javax.swing.JLabel labelMontantValueListMat;
    public javax.swing.JLabel labelMontantValueStringImpr;
    public javax.swing.JLabel labelMontantValueStringImpr1;
    public javax.swing.JTable tableListMat;
    // End of variables declaration//GEN-END:variables
}

package app.view;

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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class FactureModalForm extends javax.swing.JDialog {

    Double totalAmount = 0.0;
    Double bHeight = 0.0;
    
    String montant ;
    String adrCli ;
    String dateCommande ;
    String nomCli;
    String numCli ;
    String numCom ;
    String stringMontant ;
    
    ArrayList<String> itemDesign = new ArrayList<>();
    ArrayList<String> quantité = new ArrayList<>();
    ArrayList<String> itemPrice = new ArrayList<>();
    ArrayList<String> subTotal = new ArrayList<>();
    
    /**
     * Creates new form FactureModalForm
     * @param parent
     * @param modal
     */
    public FactureModalForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public FactureModalForm(java.awt.Frame parent, boolean modal,String montant,String adrCli,String nomCli,String date,String numCom,String numCli, String montantString,DefaultTableModel modelTable, int row) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        DefaultTableModel df = (DefaultTableModel)tableCommandeImpr.getModel();
        for(int i=0 ; i < row ; i++){
            df.addRow(new String[]{modelTable.getValueAt(i,0).toString(),modelTable.getValueAt(i, 1).toString(),modelTable.getValueAt(i, 2).toString(),modelTable.getValueAt(i, 3).toString()});
           
        }
       
        paneImprimer.setVisible(true);
        btnImprimerFacture.setVisible(true);
        
        labelMontantValueImpr.setText(montant);
        labelAdrCliCommandeImpr.setText(adrCli);
        labelDateCommandeImpr.setText(date);
        labelNomCliCommandeImpr.setText(nomCli);
        labelNumCliCommandeImpr.setText(numCli);
        labelNumCommandeImpr.setText(numCom);
            
        labelMontantValueStringImpr.setText("Arrété la présente facture à la somme de " + montantString + " Ariary" );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneImprimer = new javax.swing.JPanel();
        btnImprimerFacture = new app.component.ButtonCustom();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCommandeImpr = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        labelNumCliCommandeImpr = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelAdrCliCommandeImpr = new javax.swing.JLabel();
        labelNomCliCommandeImpr = new javax.swing.JLabel();
        labelNumCommandeImpr = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        labelDateCommandeImpr = new javax.swing.JLabel();
        labelMontantTotal = new javax.swing.JLabel();
        labelMontantValueImpr = new javax.swing.JLabel();
        labelMontantValueStringImpr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon("src/app/images/computer-science.png").getImage());
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        paneImprimer.setBackground(new java.awt.Color(255, 255, 255));

        btnImprimerFacture.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImprimerFacture.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimerFacture.setText("IMPRIMER");
        btnImprimerFacture.setBorderColor(new java.awt.Color(0, 51, 102));
        btnImprimerFacture.setColor(new java.awt.Color(0, 51, 102));
        btnImprimerFacture.setColorClick(new java.awt.Color(0, 51, 102));
        btnImprimerFacture.setColorOver(new java.awt.Color(0, 153, 255));
        btnImprimerFacture.setFocusPainted(false);
        btnImprimerFacture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimerFacture.setOpaque(true);
        btnImprimerFacture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimerFactureMouseClicked(evt);
            }
        });

        tableCommandeImpr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Désignation", "PU", "Quantité", "Montant"
            }
        ));
        tableCommandeImpr.setEditingColumn(0);
        tableCommandeImpr.setEditingRow(0);
        tableCommandeImpr.setEnabled(false);
        tableCommandeImpr.setFocusable(false);
        tableCommandeImpr.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableCommandeImpr.setRequestFocusEnabled(false);
        tableCommandeImpr.setRowHeight(35);
        tableCommandeImpr.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tableCommandeImpr);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Numéro du client");

        labelNumCliCommandeImpr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumCliCommandeImpr.setText("jLabel14");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Nom du client");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Adresse du client");

        labelAdrCliCommandeImpr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAdrCliCommandeImpr.setText("jLabel16");

        labelNomCliCommandeImpr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomCliCommandeImpr.setText("jLabel15");

        labelNumCommandeImpr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumCommandeImpr.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Numéro du commande ");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Date du commande");

        labelDateCommandeImpr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDateCommandeImpr.setText("jLabel17");

        labelMontantTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMontantTotal.setText("Montant total");

        labelMontantValueImpr.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelMontantValueImpr.setForeground(new java.awt.Color(255, 51, 51));
        labelMontantValueImpr.setText("jLabel5");

        labelMontantValueStringImpr.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelMontantValueStringImpr.setText("Arrété la présente facture à la somme de ");

        javax.swing.GroupLayout paneImprimerLayout = new javax.swing.GroupLayout(paneImprimer);
        paneImprimer.setLayout(paneImprimerLayout);
        paneImprimerLayout.setHorizontalGroup(
            paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImprimerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneImprimerLayout.createSequentialGroup()
                        .addComponent(btnImprimerFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paneImprimerLayout.createSequentialGroup()
                        .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(labelMontantValueStringImpr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneImprimerLayout.createSequentialGroup()
                                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paneImprimerLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(labelAdrCliCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(paneImprimerLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(labelNumCliCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(paneImprimerLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(labelNomCliCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNumCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDateCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneImprimerLayout.createSequentialGroup()
                                .addComponent(labelMontantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMontantValueImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
        );
        paneImprimerLayout.setVerticalGroup(
            paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneImprimerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumCliCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneImprimerLayout.createSequentialGroup()
                        .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomCliCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneImprimerLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12))
                            .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelAdrCliCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDateCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNumCommandeImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneImprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMontantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMontantValueImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMontantValueStringImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnImprimerFacture, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(paneImprimer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            
            
            adrCli = labelAdrCliCommandeImpr.getText();
            dateCommande = labelDateCommandeImpr.getText();
            nomCli = labelNomCliCommandeImpr.getText();
            numCli = labelNumCliCommandeImpr.getText();
            numCom = labelNumCommandeImpr.getText();
            montant = labelMontantValueImpr.getText();
            stringMontant = labelMontantValueStringImpr.getText();
            
            DefaultTableModel df = (DefaultTableModel)tableCommandeImpr.getModel();
            int numRowCount = tableCommandeImpr.getRowCount();
            
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
                    g2d.drawString("Facture N° " + numCom + "/" + numCli, 12, y); y += yShift;
                    g2d.drawString("Le  " + dateCommande, 12, y); y += yShift;
                    g2d.drawString("----------------------------------------------", 12, y); y += headerRectHeight;
                    
                    g2d.drawString("Désignation       PU    Qte   Montant", 20, y); y += yShift;
                    g2d.drawString("----------------------------------------------", 10, y); y += headerRectHeight;
                    for(int i = 0; i < r ; i++){
                        g2d.drawString("" + itemDesign.get(i)+"                    ", 10, y); y += yShift;
                        g2d.drawString("         "+ itemPrice.get(i) + "      "+quantité.get(i) + "      " + subTotal.get(i), 15, y); y += yShift;
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
            
            return result;
        }
    }
    
    private void btnImprimerFactureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimerFactureMouseClicked
            bHeight = Double.valueOf(itemDesign.size());
            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setPrintable(new BillPrintable(), getPageFormat(pj));
            
            try{
                pj.print();
                this.dispose();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_btnImprimerFactureMouseClicked

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
            java.util.logging.Logger.getLogger(FactureModalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactureModalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactureModalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactureModalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FactureModalForm dialog = new FactureModalForm(new javax.swing.JFrame(), true);
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
    public app.component.ButtonCustom btnImprimerFacture;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel labelAdrCliCommandeImpr;
    public javax.swing.JLabel labelDateCommandeImpr;
    public javax.swing.JLabel labelMontantTotal;
    public javax.swing.JLabel labelMontantValueImpr;
    public javax.swing.JLabel labelMontantValueStringImpr;
    public javax.swing.JLabel labelNomCliCommandeImpr;
    public javax.swing.JLabel labelNumCliCommandeImpr;
    public javax.swing.JLabel labelNumCommandeImpr;
    public javax.swing.JPanel paneImprimer;
    public javax.swing.JTable tableCommandeImpr;
    // End of variables declaration//GEN-END:variables
}

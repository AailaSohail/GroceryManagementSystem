/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Zainab
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class salesdetails extends javax.swing.JFrame {

    /**
     * Creates new form salesdetails
     */
    Connection conn = null;
    public salesdetails() {
        super("Sales Details");
        initComponents();
        // Create a custom header renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new java.awt.Color(0, 128, 108));  // Set the background color
        headerRenderer.setForeground(new java.awt.Color(210, 227, 195));  // Set the text color

        // Apply the custom renderer to the JTableHeader
        jTable1.getTableHeader().setDefaultRenderer(headerRenderer);
        
        conn = databaseconnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        trans_no = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        refund = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 128, 108));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 128, 108));
        jLabel7.setText("Transaction No:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        trans_no.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trans_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_noActionPerformed(evt);
            }
        });
        jPanel1.add(trans_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 230, -1));

        search.setBackground(new java.awt.Color(0, 128, 108));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 100, 30));

        jScrollPane1.setBackground(new java.awt.Color(0, 128, 108));
        jScrollPane1.setForeground(new java.awt.Color(0, 128, 108));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(210, 227, 195));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 128, 108));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity", "Total Price"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(0, 128, 108));
        jTable1.setSelectionBackground(new java.awt.Color(0, 128, 108));
        jTable1.setSelectionForeground(new java.awt.Color(210, 227, 195));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 650, 250));

        back.setBackground(new java.awt.Color(0, 128, 108));
        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(242, 242, 242));
        back.setText("BACK");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 150, 50));

        refund.setBackground(new java.awt.Color(0, 128, 108));
        refund.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refund.setForeground(new java.awt.Color(242, 242, 242));
        refund.setText("REFUND");
        refund.setBorder(null);
        refund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundActionPerformed(evt);
            }
        });
        jPanel1.add(refund, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesdetails.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -30, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(210, 227, 195));
        jMenuBar1.setForeground(new java.awt.Color(0, 128, 108));

        jMenu1.setBackground(new java.awt.Color(210, 227, 195));
        jMenu1.setForeground(new java.awt.Color(0, 128, 108));
        jMenu1.setText("Home");

        jMenuItem1.setBackground(new java.awt.Color(210, 227, 195));
        jMenuItem1.setForeground(new java.awt.Color(0, 128, 108));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeicon.png"))); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trans_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trans_noActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        // Retrieve data from the SQL view
        String transno = trans_no.getText();
        try{
            String sql ="select * from sales_child WHERE Transno ='"+transno+"'";
            PreparedStatement ptst=conn.prepareCall(sql);
            ResultSet rs= ptst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            while(rs.next()){
            String sql1 ="select P.prod_name from product as P JOIN sales_child as S on P.prod_id="+rs.getString("prod_id");
            PreparedStatement ptst1=conn.prepareCall(sql1);
            ResultSet rs1= ptst1.executeQuery();
            if(rs1.next()){
               Object o[]={rs.getString("prod_id"),rs1.getString("prod_name"),rs.getString("rate"),rs.getString("quantity"),rs.getString("prod_amount")};
               tm.addRow(o);
            }
         }
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new cust_phistory().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void refundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new refund().setVisible(true);
    }//GEN-LAST:event_refundActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //TODO add your handling code here:
        setVisible(false);
        home obj = new home();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salesdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salesdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refund;
    private javax.swing.JButton search;
    private javax.swing.JTextField trans_no;
    // End of variables declaration//GEN-END:variables
}

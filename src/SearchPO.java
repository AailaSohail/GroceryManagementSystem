/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SearchPO extends javax.swing.JFrame {

    /**
     * Creates new form SearchPO
     */
    Connection conn = null;
    ResultSet rs;
    PreparedStatement ptst;
    
    
    
    public SearchPO() {
        super("SearchPO");
        initComponents();
        conn=databaseconnection.connection();
    }
   
     public void reset()
    {
        OrderID.setText("");
        Date.setText("");
        Quantity.setText("");
        CostValue.setText("");
        SaleValue.setText("");
        SupID.setText("");
        AppBy.setText("");
        AppDate.setText("");
        Status.setSelectedItem("");
        prod_id.setText("");      
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
        OrderID = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        search = new javax.swing.JButton();
        supID = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        sale = new javax.swing.JTextField();
        appBy = new javax.swing.JTextField();
        appDate = new javax.swing.JTextField();
        SupID = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Status = new javax.swing.JComboBox<>();
        CostValue = new javax.swing.JTextField();
        SaleValue = new javax.swing.JTextField();
        orderID = new javax.swing.JTextField();
        AppBy = new javax.swing.JTextField();
        AppDate = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        appDate1 = new javax.swing.JTextField();
        prod_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(OrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 370, 40));

        cancel.setBackground(new java.awt.Color(0, 128, 108));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 180, 50));

        search.setBackground(new java.awt.Color(0, 128, 108));
        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 180, 50));

        supID.setBackground(new java.awt.Color(210, 227, 195));
        supID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        supID.setForeground(new java.awt.Color(0, 128, 108));
        supID.setText("SUPPLIER ID");
        supID.setBorder(null);
        jPanel1.add(supID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 180, 50));

        date.setBackground(new java.awt.Color(210, 227, 195));
        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 128, 108));
        date.setText("DATE");
        date.setBorder(null);
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 180, 50));

        cost.setBackground(new java.awt.Color(210, 227, 195));
        cost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cost.setForeground(new java.awt.Color(0, 128, 108));
        cost.setText("COST VALUE");
        cost.setBorder(null);
        jPanel1.add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 180, 50));

        status.setBackground(new java.awt.Color(210, 227, 195));
        status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(0, 128, 108));
        status.setText("STATUS");
        status.setBorder(null);
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 180, 50));

        sale.setBackground(new java.awt.Color(210, 227, 195));
        sale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sale.setForeground(new java.awt.Color(0, 128, 108));
        sale.setText("SALE VALUE");
        sale.setBorder(null);
        jPanel1.add(sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 180, 50));

        appBy.setBackground(new java.awt.Color(210, 227, 195));
        appBy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appBy.setForeground(new java.awt.Color(0, 128, 108));
        appBy.setText("APPROVED BY");
        appBy.setBorder(null);
        jPanel1.add(appBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 180, 50));

        appDate.setBackground(new java.awt.Color(210, 227, 195));
        appDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appDate.setForeground(new java.awt.Color(0, 128, 108));
        appDate.setText("APPROVED DATE");
        appDate.setBorder(null);
        jPanel1.add(appDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 180, 50));

        SupID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SupID.setBorder(null);
        jPanel1.add(SupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 370, 40));

        Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 370, 40));

        Status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Complete", "Cancelled" }));
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 370, 40));

        CostValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(CostValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 370, 40));

        SaleValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(SaleValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 370, 40));

        orderID.setBackground(new java.awt.Color(210, 227, 195));
        orderID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderID.setForeground(new java.awt.Color(0, 128, 108));
        orderID.setText("ORDER ID");
        orderID.setBorder(null);
        orderID.setDisabledTextColor(new java.awt.Color(0, 128, 108));
        orderID.setDoubleBuffered(true);
        jPanel1.add(orderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 180, 50));

        AppBy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(AppBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 370, 40));

        AppDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(AppDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 370, 40));

        quantity.setBackground(new java.awt.Color(210, 227, 195));
        quantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quantity.setForeground(new java.awt.Color(0, 128, 108));
        quantity.setText("QUANTITY");
        quantity.setBorder(null);
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 180, 50));

        Quantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 370, 40));

        appDate1.setBackground(new java.awt.Color(210, 227, 195));
        appDate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appDate1.setForeground(new java.awt.Color(0, 128, 108));
        appDate1.setText("PRODUCT ID:");
        appDate1.setBorder(null);
        appDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appDate1ActionPerformed(evt);
            }
        });
        jPanel1.add(appDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 730, 180, 50));

        prod_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(prod_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, 370, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchPO.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        PurchaseOrder obj = new PurchaseOrder();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cancelActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         try {
            String id = OrderID.getText();

            String sql = "select * from PurchaseOrder as po join ProdOrder as p on po.orderNo = p.orderNo where po.orderNo=?";
            if (id.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter order ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                ptst = conn.prepareStatement(sql);
                ptst.setString(1, id);
                rs = ptst.executeQuery();
                if (rs.next()) {
                    SupID.setText(rs.getString(2));
                    Date.setText(rs.getString(3));
                    Status.setSelectedItem(rs.getString(8));
                    Quantity.setText(rs.getString(5));
                    CostValue.setText(rs.getString(6));
                    SaleValue.setText(rs.getString(7));
                    AppBy.setText(rs.getString(10));
                    AppDate.setText(rs.getString(9));

                    // Add the following line to set prod_id
                    prod_id.setText(rs.getString("prod_id"));
                } else {
                    JOptionPane.showMessageDialog(null, "No record found :(");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void appDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appDate1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchPO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AppBy;
    private javax.swing.JTextField AppDate;
    private javax.swing.JTextField CostValue;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField OrderID;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField SaleValue;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTextField SupID;
    private javax.swing.JTextField appBy;
    private javax.swing.JTextField appDate;
    private javax.swing.JTextField appDate1;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField orderID;
    private javax.swing.JTextField prod_id;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField sale;
    private javax.swing.JButton search;
    private javax.swing.JTextField status;
    private javax.swing.JTextField supID;
    // End of variables declaration//GEN-END:variables
}

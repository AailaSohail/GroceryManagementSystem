/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author user
 */
public class PurchaseOrder extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseOrder
     */
    public PurchaseOrder() {
        initComponents();
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
        search = new javax.swing.JButton();
        view = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        searchI = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        addI = new javax.swing.JLabel();
        updateI = new javax.swing.JLabel();
        deleteI = new javax.swing.JLabel();
        viewI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 170, 70));

        view.setBackground(new java.awt.Color(0, 128, 108));
        view.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("VIEW RECORDS");
        view.setBorder(null);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 170, 70));

        add.setBackground(new java.awt.Color(0, 128, 108));
        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 170, 70));

        update.setBackground(new java.awt.Color(0, 128, 108));
        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setBorder(null);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 170, 70));

        searchI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchI.png"))); // NOI18N
        jPanel1.add(searchI, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 150, 130));

        delete.setBackground(new java.awt.Color(0, 128, 108));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorder(null);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 170, 70));

        addI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addI.png"))); // NOI18N
        jPanel1.add(addI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 150, 130));

        updateI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateI.png"))); // NOI18N
        jPanel1.add(updateI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 150, 130));

        deleteI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deleteI.png"))); // NOI18N
        jPanel1.add(deleteI, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 150, 130));

        viewI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recordsI.png"))); // NOI18N
        jPanel1.add(viewI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 150, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Purchase Order.png"))); // NOI18N
        jLabel1.setLabelFor(jPanel1);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 790));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1002, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        ViewPO obj = new ViewPO();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        SearchPO obj = new SearchPO();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        AddPO obj = new AddPO();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        UpdatePO obj = new UpdatePO();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DeletePO obj = new DeletePO();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel addI;
    private javax.swing.JButton delete;
    private javax.swing.JLabel deleteI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search;
    private javax.swing.JLabel searchI;
    private javax.swing.JButton update;
    private javax.swing.JLabel updateI;
    private javax.swing.JButton view;
    private javax.swing.JLabel viewI;
    // End of variables declaration//GEN-END:variables
}
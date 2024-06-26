/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Types;

/**
 *
 * @author HP
 */

public class sales extends javax.swing.JFrame {

    /**
     * Creates new form sales
     */
    
        Connection conn = null;
    public sales() {
        super("Sales");
        initComponents();
        
        // Create a custom header renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new java.awt.Color(0, 128, 108));  // Set the background color
        headerRenderer.setForeground(new java.awt.Color(210, 227, 195));  // Set the text color

        // Apply the custom renderer to the JTableHeader
        jTable1.getTableHeader().setDefaultRenderer(headerRenderer);
        
        
        conn = databaseconnection.connection();
        jTextField2.setText(login.username);
        set_transno();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    void set_transno(){
                try {
                String query = "SELECT TOP 1 Transno FROM sales ORDER BY Transno DESC ";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                int no = resultSet.getInt("Transno")+1;
                jTextField6.setText(Integer.toString(no));
                }
                else
                {
                jTextField6.setText("0");}
            } catch (SQLException ex) {
                Logger.getLogger(sales.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void reset(){
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            jLabel2.setText("TOTAL BILL : 0.00 ");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField7.setText("");
            jTextField8.setText("");    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 128, 108));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SALES STATS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 160, 40));

        jButton3.setBackground(new java.awt.Color(0, 128, 108));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("GENERATE RECIEPT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 160, 40));

        jButton4.setBackground(new java.awt.Color(0, 128, 108));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADD ITEM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 110, 40));

        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 160, 30));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 250, 30));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 250, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 250, 30));

        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 190, 30));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 190, 30));

        jTable1.setBackground(new java.awt.Color(210, 227, 195));
        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 128, 108));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Poduct Name", "Price", "Quantity", "Total Price"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(178, 75, 130));
        jTable1.setSelectionForeground(new java.awt.Color(43, 75, 130));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 950, 190));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "EasyPaisa", "JazzCash" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 170, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 370, 50));

        jButton1.setBackground(new java.awt.Color(0, 128, 108));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DISCOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 700));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        String prodID=jTextField7.getText();
        int transno = Integer.parseInt(jTextField6.getText());
        int quantity = Integer.parseInt(jTextField8.getText());
                try{
            String sql ="select prod_id,prod_name,prod_price from product WHERE prod_id ='"+prodID+"'";
            PreparedStatement ptst=conn.prepareCall(sql);
            ResultSet rs= ptst.executeQuery();
               if(rs.next()){
               double price = rs.getFloat("prod_price");
               Object o[]={rs.getString("prod_id"),rs.getString("prod_name"),rs.getString("prod_price"),quantity,quantity*price};
               DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
               tm.insertRow(0,o);     
               } 
               else{
                JOptionPane.showMessageDialog(null, "NO PRODUCT FOUND");
               }
               jTextField7.setText("");
               jTextField8.setText("");      
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        jLabel2.setText("TOTAL BILL : " + Double.toString(view_bill()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
double view_bill(){
             double bill = 0;
         try{

        DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
        if(tm.getRowCount()==0){
        JOptionPane.showMessageDialog(null, "No Items have been entered");
        }
        else{
            for(int i=0;i<tm.getRowCount();i++){
            String Item_price = tm.getValueAt(i, 4).toString();
            double total_price=Double.parseDouble(Item_price);
             bill=bill+total_price;
            }
        }
         }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
         }
         return bill;
}
    void add_items_to_reciept(int transno, java.sql.Date date){
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
               try {
            for(int i=0;i<tm.getRowCount();i++){
                    String sql= "insert into sales_child values(?,?,?,?,?,?)";
                    String prodID = tm.getValueAt(i, 0).toString();
                    int prod_id=Integer.parseInt(prodID);
                    String price = tm.getValueAt(i, 2).toString();
                    double rate=Double.parseDouble(price);
                    String quant = tm.getValueAt(i, 3).toString();
                    int quantity=Integer.parseInt(quant);
                    String Item_price = tm.getValueAt(i, 4).toString();
                    double total_price=Double.parseDouble(Item_price);
                    PreparedStatement ptst=conn.prepareCall(sql);
                    ptst.setInt(1,transno);
                    ptst.setInt(2,prod_id);
                    ptst.setInt(3,quantity);
                    ptst.setDouble(4,rate);
                    ptst.setDate(5,date);
                    ptst.setDouble(6,total_price);
                    ptst.executeUpdate();
                } 
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                }
    }
    
    float discount(){
        
                String sql = "{CALL GetDiscount(?, ?)}";
        try{
            int cust_id = Integer.parseInt(jTextField1.getText());
            
            CallableStatement callableStatement = (CallableStatement) conn.prepareCall(sql);
            callableStatement.setInt(1, cust_id);

                // Register the output parameter
            callableStatement.registerOutParameter(2, Types.FLOAT);

                // Execute the stored procedure
            callableStatement.execute();
                // Retrieve the output parameter value
                float discount = callableStatement.getFloat(2);        
                return discount;

   
        }
        catch(Exception e ){
         JOptionPane.showMessageDialog(null, e);
         return (float) 0.0;
        }
    }
    
    float after_discount(){
       float amount=(float) view_bill();
        if(discount()!=0){
    float reduced_amount=(float) (discount()*view_bill());
     amount = (float) (view_bill()-reduced_amount);
        }
    return amount;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            if("".equals(jTextField6.getText())||"".equals(jTextField1.getText())||"".equals(jTextField2.getText())||"".equals(jTextField4.getText())){
            JOptionPane.showMessageDialog(null, "ENTER COMPLETE INFORMATION");
            }
        else{
        int transno = Integer.parseInt(jTextField6.getText());
        int cust_id = Integer.parseInt(jTextField1.getText());
        String emploid = jTextField2.getText();
        double paid_amount = Double.parseDouble(jTextField4.getText());
        java.sql.Date sqlDate = java.sql.Date.valueOf(LocalDate.now());
        String trans_type = (String) jComboBox1.getSelectedItem();
         try{
        DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
        if(tm.getRowCount()==0){
        JOptionPane.showMessageDialog(null, "No Items have been entered");
        }
        else{
          double bill = view_bill();
            if (after_discount()>paid_amount){
            JOptionPane.showMessageDialog(null, "INVALID PAYMENT");
            }
            else{
            double discount = discount();
            jLabel2.setText("TOTAL BILL : " + after_discount());
            String sql= "insert into sales values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ptst=conn.prepareCall(sql);
            ptst.setInt(1,transno);
            ptst.setDouble(2,after_discount());
            ptst.setInt(3,cust_id);
            ptst.setInt(4,login.empid);
            ptst.setDouble(5,0);
            ptst.setFloat(6, (float) discount);
            ptst.setString(7,trans_type);
            ptst.setDate(8,sqlDate);
            ptst.setString(9,emploid);
            ptst.setDouble(10,paid_amount);
            ptst.executeUpdate();
            add_items_to_reciept(transno, sqlDate);
            JOptionPane.showMessageDialog(null, "DONE");
            print_reciept();
            }
        }
        }catch(HeadlessException | NumberFormatException | SQLException e){
              JOptionPane.showMessageDialog(null, e);
         }
         set_transno();
         reset();
      } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabel2.setText("TOTAL BILL : " + after_discount());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //TODO add your handling code here:
        setVisible(false);
        home obj = new home();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        chart_home obj = new chart_home();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    void writeReceiptToFile(String filePath, StringBuilder receiptContent) throws IOException {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
        writer.println(receiptContent.toString());
    }
}
    
   void print_reciept(){
    int transno = Integer.parseInt(jTextField6.getText());
    StringBuilder receiptContent = new StringBuilder();
    DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
    receiptContent.append("Receipt no :").append(transno).append("\n");
    receiptContent.append("-----------------\n");
    receiptContent.append("Item\t\tName\t\tPrice\t\tQuantity\t\tTotalPrice\n");
    receiptContent.append("-----------------\n");
    for (int i = 0; i < tm.getRowCount(); i++) {
        receiptContent.append(tm.getValueAt(i, 0).toString() + "\t\t" + tm.getValueAt(i, 1).toString() + "\t\t" +
                tm.getValueAt(i, 2).toString() + "\t\t" + tm.getValueAt(i, 3).toString() + "\t\t" +
                tm.getValueAt(i, 4).toString() + "\t\t\n");
    }
    receiptContent.append("-----------------\n");
    receiptContent.append("Discount: ").append(discount()*100).append("%\n");
    receiptContent.append("Total: ").append(view_bill()).append("\n");
    receiptContent.append("After Discount: ").append(after_discount());

    // Specify the file path for the text file
    String textFilePath = "receipt.txt";
    
    try {
        // Write receipt content to the text file
        writeReceiptToFile(textFilePath, receiptContent);

        // Display a message indicating that the text file is generated
        JOptionPane.showMessageDialog(this, "Receipt saved as " + textFilePath, "Text Receipt", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
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
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}

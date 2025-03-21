/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


import static ababan_system.regForms.dbemail;
import static ababan_system.regForms.dbusername;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mypc
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        
        try{
            String query="SELECT*FROM tbl_user  WHERE u_username ='"+regUser.getText()+"'OR u_email = '"+regEmail.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                dbemail = resultSet.getString("u_email");
                if(dbemail.equals(regEmail.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already Used!");
                    regEmail.setText("");
                }
                
               
                dbusername = resultSet.getString("u_username");
                if(dbusername.equals(regUser.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already Used!");
                    regUser.setText("");
                    
                 }  
                return true;  
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
    public boolean updateCheck(){
        dbConnector dbc = new dbConnector();
        try{
            String query="SELECT*FROM tbl_user  WHERE (u_username ='"+regUser.getText()+"'OR u_email = '"+regEmail.getText()+"')AND u_id != '"+UId.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                dbemail = resultSet.getString("u_email");
                if(dbemail.equals(regEmail.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already Used!");
                    regnumber.setText("");
                }
                dbusername = resultSet.getString("u_username");
                if(dbusername.equals(regUser.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already Used!");
                    regUser.setText("");   
                 }  
                return true;  
            }else{
                return false;
            }   
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        regName = new javax.swing.JTextField();
        regnumber = new javax.swing.JTextField();
        regUser = new javax.swing.JTextField();
        regPass = new javax.swing.JTextField();
        registrationButton = new javax.swing.JButton();
        regUserType = new javax.swing.JComboBox<>();
        fn4 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        fn1 = new javax.swing.JLabel();
        fn2 = new javax.swing.JLabel();
        fn3 = new javax.swing.JLabel();
        regUserStatus = new javax.swing.JComboBox<>();
        fn5 = new javax.swing.JLabel();
        UId = new javax.swing.JTextField();
        fn6 = new javax.swing.JLabel();
        DeleteB = new javax.swing.JButton();
        UpdateB = new javax.swing.JButton();
        Clearb = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Cancelbutton = new javax.swing.JButton();
        regEmail = new javax.swing.JTextField();
        fn7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(regName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, 30));

        regnumber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnumberActionPerformed(evt);
            }
        });
        jPanel3.add(regnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        regUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(regUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 210, 30));

        regPass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(regPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 30));

        registrationButton.setText("ADD");
        registrationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationButtonMouseClicked(evt);
            }
        });
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(registrationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 130, 30));

        regUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user ", " " }));
        regUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUserTypeActionPerformed(evt);
            }
        });
        jPanel3.add(regUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 210, 30));

        fn4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn4.setForeground(new java.awt.Color(204, 204, 204));
        fn4.setText("Acc Status:");
        jPanel3.add(fn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        fn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn.setForeground(new java.awt.Color(204, 204, 204));
        fn.setText("Name:");
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 50, 10));

        fn1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn1.setForeground(new java.awt.Color(204, 204, 204));
        fn1.setText("Cell Num:");
        jPanel3.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 10));

        fn2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn2.setForeground(new java.awt.Color(204, 204, 204));
        fn2.setText("User:");
        jPanel3.add(fn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 40, 10));

        fn3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn3.setForeground(new java.awt.Color(204, 204, 204));
        fn3.setText("Password:");
        jPanel3.add(fn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 10));

        regUserStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "pending" }));
        regUserStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUserStatusActionPerformed(evt);
            }
        });
        jPanel3.add(regUserStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 210, 30));

        fn5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn5.setForeground(new java.awt.Color(204, 204, 204));
        fn5.setText("AccType:");
        jPanel3.add(fn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        UId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(UId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, 30));

        fn6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn6.setForeground(new java.awt.Color(204, 204, 204));
        fn6.setText("ID:");
        jPanel3.add(fn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 20, 10));

        DeleteB.setText("Delete");
        DeleteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteBMouseExited(evt);
            }
        });
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 130, 30));

        UpdateB.setText("Update");
        UpdateB.setEnabled(false);
        UpdateB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateBMouseExited(evt);
            }
        });
        UpdateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, 30));

        Clearb.setText("Clear");
        Clearb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearbMouseExited(evt);
            }
        });
        Clearb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbActionPerformed(evt);
            }
        });
        jPanel3.add(Clearb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, 30));

        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RefreshMouseExited(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel3.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 130, 30));

        Cancelbutton.setText("Cancel");
        Cancelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelbuttonMouseExited(evt);
            }
        });
        Cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(Cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 130, 30));

        regEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        regEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmailActionPerformed(evt);
            }
        });
        jPanel3.add(regEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 210, 30));

        fn7.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        fn7.setForeground(new java.awt.Color(204, 204, 204));
        fn7.setText("Email:");
        jPanel3.add(fn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 10));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 530, 380));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRATION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regnumberActionPerformed

    private void registrationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationButtonMouseClicked

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed
        
        
        if(regName.getText().isEmpty()||regnumber.getText().isEmpty()||regUser.getText().isEmpty()||regPass.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(null, "Fill apa ang wa na fill apan duh!");
        }else if(regPass.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above");
            regPass.setText("");

        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }

        else{

            dbConnector dbc=new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user(u_fname, u_email, u_contact, u_username, u_password, u_status, u_type) "
                + "VALUES('"+regName.getText()+"','"+regEmail.getText()+"','"+regnumber.getText()+",'"+regUser.getText()+"','"+regPass.getText()+"','"+regUserStatus.getSelectedItem()+"','"+regUserType.getSelectedItem()+"')"))
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");

        }

        }
    }//GEN-LAST:event_registrationButtonActionPerformed

    private void regUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUserTypeActionPerformed

    private void regUserStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUserStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUserStatusActionPerformed

    private void DeleteBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBMouseEntered

    private void DeleteBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBMouseExited

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBActionPerformed

    private void UpdateBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBMouseEntered

    private void UpdateBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBMouseExited

    private void UpdateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBActionPerformed
        if(regName.getText().isEmpty()||regEmail.getText().isEmpty()
            ||regnumber.getText().isEmpty()||regUser.getText().isEmpty()
                ||regPass.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(null, "Fill apa ang wa na fill apan duh!");
        }else if(regPass.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above");
            regPass.setText("");

        }else if(updateCheck()){

        }

        else{

            dbConnector dbc = new dbConnector();
            dbc.updateData("UPDATE tbl_user SET u_fname = '"+regName.getText()+"',"
                + "u_email ='"+regEmail.getText()+"',"
                + "u_contact ='"+regnumber.getText()+"',"
                + "u_username = '"+regUser.getText()+"', "
                + "u_password = '"+regPass.getText()+"',"
                + "u_status = '"+regUserStatus.getSelectedItem()+"',"
                + "u_type = '"+regUserType.getSelectedItem()+"'WHERE u_id = '"+UId.getText()+"'");

            usersForm uf=new usersForm();
            uf.setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_UpdateBActionPerformed

    private void ClearbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearbMouseEntered

    private void ClearbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearbMouseExited

    private void ClearbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearbActionPerformed

    private void RefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshMouseEntered

    private void RefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshMouseExited

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed

    private void CancelbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelbuttonMouseEntered
        
    }//GEN-LAST:event_CancelbuttonMouseEntered

    private void CancelbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelbuttonMouseExited
        
    }//GEN-LAST:event_CancelbuttonMouseExited

    private void CancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbuttonActionPerformed
        usersForm uf =new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelbuttonActionPerformed

    private void regEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmailActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbutton;
    private javax.swing.JButton Clearb;
    private javax.swing.JButton DeleteB;
    private javax.swing.JButton Refresh;
    public javax.swing.JTextField UId;
    public javax.swing.JButton UpdateB;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel fn1;
    private javax.swing.JLabel fn2;
    private javax.swing.JLabel fn3;
    private javax.swing.JLabel fn4;
    private javax.swing.JLabel fn5;
    private javax.swing.JLabel fn6;
    private javax.swing.JLabel fn7;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField regEmail;
    public javax.swing.JTextField regName;
    public javax.swing.JTextField regPass;
    public javax.swing.JTextField regUser;
    public javax.swing.JComboBox<String> regUserStatus;
    public javax.swing.JComboBox<String> regUserType;
    public javax.swing.JButton registrationButton;
    public javax.swing.JTextField regnumber;
    // End of variables declaration//GEN-END:variables
}

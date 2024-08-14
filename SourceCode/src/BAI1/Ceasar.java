/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ESC
 */
public class Ceasar extends javax.swing.JFrame {

    /**
     * Creates new form Caesar
     */
    public Ceasar() {
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

        txtchuongtrinh = new javax.swing.JLabel();
        txttukhoa = new javax.swing.JLabel();
        txtnoidungbd = new javax.swing.JLabel();
        txtnoidungsaugm = new javax.swing.JLabel();
        txtkhoa = new javax.swing.JTextField();
        txtmahoa = new javax.swing.JTextField();
        txtvanban = new javax.swing.JTextField();
        btngiaima = new javax.swing.JButton();
        btnmahoa = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        btnMoFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtchuongtrinh.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        txtchuongtrinh.setText(" MÃ HÓA & GIẢI MÃ ");

        txttukhoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttukhoa.setText("Khóa: ");

        txtnoidungbd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnoidungbd.setText("Plain Text:");

        txtnoidungsaugm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnoidungsaugm.setText("Cipher Text:");

        txtkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoaActionPerformed(evt);
            }
        });

        txtmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmahoaActionPerformed(evt);
            }
        });

        txtvanban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvanbanActionPerformed(evt);
            }
        });

        btngiaima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btngiaima.setText("^ Decypt ^");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        btnmahoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmahoa.setText("v Encypt v");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        btnGhiFile.setText("Ghi File");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        btnMoFile.setText("Mở File");
        btnMoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtchuongtrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnoidungsaugm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttukhoa)
                                    .addComponent(txtnoidungbd))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtvanban, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmahoa))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(btnmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(btnGhiFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(btngiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(btnMoFile)))
                .addGap(0, 484, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtchuongtrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(txtnoidungbd, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(txtvanban, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttukhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(txtnoidungsaugm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmahoa)
                            .addComponent(btnGhiFile))
                        .addGap(84, 84, 84)
                        .addComponent(txtmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngiaima)
                    .addComponent(btnMoFile))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoaActionPerformed

    private void txtmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmahoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmahoaActionPerformed

    private void txtvanbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvanbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvanbanActionPerformed

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        int k=Integer.valueOf(this.txtkhoa.getText());
        String br=this.txtmahoa.getText();
        this.txtvanban.setText(mahoa(br,-k));
    }//GEN-LAST:event_btngiaimaActionPerformed
    char mahoakt(char c, int k)
    {
        if (!Character.isLetter(c))   return c;
            return (char) ((((Character.toUpperCase(c) - 'A') + k) % 26 + 26) % 26 + 'A');
    }
    private String mahoa(String br, int k)
    {
        String kq="";
        int n=br.length();
        for (int i = 0; i < n; i++) {
            kq+=mahoakt(br.charAt(i), k);
        }
        return kq;
    }
    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        int k=Integer.valueOf(this.txtkhoa.getText());
        String br=this.txtvanban.getText();
        this.txtmahoa.setText(mahoa(br,k));
    }//GEN-LAST:event_btnmahoaActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        try {
            BufferedWriter bw = null;
            String fileName = "D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\Dulieu\\Dulieu.txt";
            String s = txtmahoa.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, " Đã Ghi File Thành Công !");
        }catch (IOException ex) {
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE,null, ex);
        }        
    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnMoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoFileActionPerformed
        try{
            BufferedReader br = null;
            String fileName = "D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\Dulieu\\Dulieu.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Đã mở File Thành Công !");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
        System.out.println("Du Lieu la:" + " " + sb);
        String chuoi = sb.toString();
        txtvanban.setText(chuoi);
        } catch(IOException ex){
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoFileActionPerformed

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
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ceasar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnMoFile;
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JLabel txtchuongtrinh;
    private javax.swing.JTextField txtkhoa;
    private javax.swing.JTextField txtmahoa;
    private javax.swing.JLabel txtnoidungbd;
    private javax.swing.JLabel txtnoidungsaugm;
    private javax.swing.JLabel txttukhoa;
    private javax.swing.JTextField txtvanban;
    // End of variables declaration//GEN-END:variables
}
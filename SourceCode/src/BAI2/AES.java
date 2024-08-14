/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BAI2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen Duy Quan
 */
public class AES extends javax.swing.JFrame {

    /**
     * Creates new form AES
     */
    SecretKey secretKey;

    public AES() {
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

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtText = new javax.swing.JTextField();
        txtEncypt = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        btnMaHoa = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        btnMoFile = new javax.swing.JButton();
        btnGiaiMa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("AES");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("User Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Mã Đăng Ký:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Plaintext:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Cipher text:");

        btnDangNhap.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDangNhap.setText("ĐĂNG NHẬP");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDangKy.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDangKy.setText("ĐĂNG KÝ");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        btnMaHoa.setText("MÃ HÓA");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        btnGhiFile.setText("GHI FILE");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        btnMoFile.setText("MỞ FILE");
        btnMoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoFileActionPerformed(evt);
            }
        });

        btnGiaiMa.setText("GIẢI MÃ");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(btnDangNhap)
                        .addGap(76, 76, 76)
                        .addComponent(btnDangKy))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(btnMaHoa)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGhiFile)
                                .addGap(56, 56, 56)
                                .addComponent(btnGiaiMa)
                                .addGap(38, 38, 38)
                                .addComponent(btnMoFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear))
                            .addComponent(txtEncypt, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(txtText)
                            .addComponent(txtCode)
                            .addComponent(txtPass)
                            .addComponent(txtUser))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(btnDangKy))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEncypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaHoa)
                    .addComponent(btnGhiFile)
                    .addComponent(btnMoFile)
                    .addComponent(btnGiaiMa)
                    .addComponent(btnClear))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        try {
            String user = txtUser.getText();
            String pass = txtPass.getText();
            String key = user + pass;
            String fileName = "D:\\AES.txt";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();

            String chuoi = sb.toString();
            Boolean k = key.equals(chuoi);
            if (k == true) {
                JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
                System.out.println("Khoa la: " + "" + sb);
                txtCode.setText(chuoi.getBytes().toString());
                KeyGenerator keyGen = KeyGenerator.getInstance("AES");
                keyGen.init(128);
                secretKey = keyGen.generateKey();
            } else {
                JOptionPane.showMessageDialog(null, "Dang nhap that bai");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        try {
            String user = txtUser.getText();
            String pass = txtPass.getText();
            String key = user + pass;
            String fileName = "D:\\AES.txt";
            String text = txtText.getText();
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(key);
            bw.close();
            JOptionPane.showMessageDialog(null, "Da dang ky thanh cong. vui long dang nhap lai !!!");
            txtCode.setText(key.getBytes().toString());
        } catch (IOException ex) {

        }


    }//GEN-LAST:event_btnDangKyActionPerformed


    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        String encryptedString = null;
        try {
            System.out.println("Sinh khoa" + secretKey);
            Cipher aesCipher = Cipher.getInstance("AES");

            aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
            String strData = txtText.getText();
            byte[] byteDataToEncypt = strData.getBytes("UTF-8");
            byte[] byteCipherText = aesCipher.doFinal(byteDataToEncypt);
            byte[] strCipherText = Base64.getEncoder().encode(byteCipherText);
            encryptedString = new String(strCipherText);
            System.out.println("Cipher Text generated using AES is " + strCipherText);

            txtEncypt.setText(encryptedString);
        } catch (Exception ex) {
            System.out.println("Loi ma hoa" + ex);
        }

    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        try {
            String cipherText = txtEncypt.getText();
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKey, aesCipher.getParameters());
            byte[] byteCipherText = Base64.getDecoder().decode(cipherText);
            byte[] byteDencyptedText = aesCipher.doFinal(byteCipherText);

            String strDencyptedText = new String(byteDencyptedText);
            System.out.println("Dencypted Text message is " + strDencyptedText);
            txtText.setText(strDencyptedText);
        } catch (Exception ex) {
            System.out.println("Loi ma hoa " + ex);
        }
    }//GEN-LAST:event_btnGiaiMaActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        try {
            String fileName = "D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\Dulieu\\AES.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            String s = txtEncypt.getText();
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Successfully wrote to the file.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Fail wrote to the file.");
        }
    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnMoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoFileActionPerformed
        try {
            String fileName = "D:\\Workspace\\STUDY\\BMTT\\ThucHanh\\THBMTT\\SourceCode\\Dulieu\\AES.txt";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();

            JOptionPane.showMessageDialog(null, "Da mo file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Du lieu la " + sb);
            String chuoi = sb.toString();
            txtText.setText(chuoi);
            btnGiaiMa.enable(true);
        } catch (Exception ex) { ex.printStackTrace();
        }
    }//GEN-LAST:event_btnMoFileActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        String n = null;
        txtUser.setText(n);
        txtPass.setText(n);
        txtCode.setText(n);
        txtText.setText(n);
        txtEncypt.setText(n);
        
    }//GEN-LAST:event_btnClearActionPerformed

    

    
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
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JButton btnMoFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEncypt;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtText;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
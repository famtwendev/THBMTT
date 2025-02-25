/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package THIKT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class FormNhan extends javax.swing.JFrame {

    /**
     * Creates new form FormNhan
     */
    public FormNhan() {
        initComponents();
    }
private static final String UNICODE_FORMAT="UTF8";
    private static final String DESEDE_ENCRYTION_SCHENE="DESede";
    private KeySpec myKeySpec;
    private SecretKeyFactory mySecretKeyFactory;
    private Cipher cipher;
    byte[] keyAsBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;
    
    
    public String encrypt (String unencryptedString) {
        String encryptedString = null;
        try { 
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
//            BASE64Encode base64encoder = new BASE64Encoder();
//            encryptedString = base64encoder.encode(encryptedText);
            byte[] encrypted = Base64.getEncoder().encode(encryptedText);
            encryptedString = new String(encrypted);
        } catch (Exception e){
        }
        return encryptedString;
    }
    
    public String decrypt(String encryptedString) {
        String decryptedText = null;
        try { 
            cipher.init(Cipher.DECRYPT_MODE, key);
//            BASE64Decoder base64decoder = new BASE64Decoder; 
//            byte[] encryptedText = base64decode.decodeBuffer(encryptedString);
           byte[] decrypt = Base64.getDecoder().decode(decryptedText);
           byte[] plainText = cipher.doFinal(decrypt);
            String a = new String(plainText);
            System.out.println("Chuoi plaintext:" +a);
            decryptedText = a; 
        } catch (Exception e){
            e.printStackTrace();
        }
        return decryptedText;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtNoivaBam2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtK2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMH2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnMoFile = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnGiaiMa2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnTachChuoi = new javax.swing.JButton();
        txtND1 = new javax.swing.JTextField();
        btnKTBam = new javax.swing.JButton();
        txtK1 = new javax.swing.JTextField();
        btnGiaiMa1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMAHOA1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtND2 = new javax.swing.JTextField();
        btnexit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBam1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ND Mã Hóa 1:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Bản mã băm:");

        txtK2.setText("nguyenphamtuyenthuchanhbmtt");
        txtK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtK2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nội Dung 2:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nối chuỗi Nội Dung 2 và Bản Băm:");

        btnMoFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoFile.setText("Mở File");
        btnMoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoFileActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Khóa 2:");

        btnGiaiMa2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGiaiMa2.setText("Giải Mã 2");
        btnGiaiMa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMa2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ND Mã Hóa 2:");

        btnTachChuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTachChuoi.setText("Tách Chuỗi");
        btnTachChuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachChuoiActionPerformed(evt);
            }
        });

        txtND1.setText("Hello");

        btnKTBam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKTBam.setText("Kiểm Tra Băm");
        btnKTBam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKTBamActionPerformed(evt);
            }
        });

        txtK1.setText("NguyenPhamTuyen");

        btnGiaiMa1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGiaiMa1.setText("Giải Mã 1");
        btnGiaiMa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMa1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("FORM NHẬN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Khóa 1:");

        txtND2.setText("Tuyen");

        btnexit.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnexit.setText("Thoát");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nội Dung 1:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(159, 159, 159)
                                .addComponent(txtND1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(186, 186, 186)
                                    .addComponent(txtK2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNoivaBam2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(148, 148, 148)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBam1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtND2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(142, 142, 142)
                                    .addComponent(txtMH2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(142, 142, 142)
                                    .addComponent(txtMAHOA1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGiaiMa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMoFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTachChuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKTBam, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(btnGiaiMa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnexit)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNoivaBam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtND2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKTBam))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMAHOA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGiaiMa1)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtND1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnexit)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMoFile)
                        .addGap(32, 32, 32)
                        .addComponent(btnGiaiMa2)
                        .addGap(32, 32, 32)
                        .addComponent(btnTachChuoi)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtK2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtK2ActionPerformed

    private void btnMoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoFileActionPerformed
    try{
        String fileName = "D:\\NoiDungMH2.txt";
            BufferedReader brd = new BufferedReader(new FileReader(fileName));
            StringBuffer sbu = new StringBuffer();
            char[] chuoifile = new char[5];
            while (brd.ready()) 
            {
                int len = brd.read(chuoifile);
                sbu.append(chuoifile, 0, len);
            }
            brd.close();
            txtMH2.setText(sbu.toString());
            System.out.println("ND Ma Hoa 2 :" + sbu.toString());
            JOptionPane.showMessageDialog(null, "Ban Da Mo File Thanh Cong!");
        } catch (Exception ex) { ex.printStackTrace();
        }        
    }//GEN-LAST:event_btnMoFileActionPerformed

    private void btnGiaiMa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMa2ActionPerformed
        try {
            myEncryptionKey = txtK2.getText();
            myEncryptionScheme = DESEDE_ENCRYTION_SCHENE;
            keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            myKeySpec = new DESedeKeySpec(keyAsBytes);
            mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme);
            key = mySecretKeyFactory.generateSecret(myKeySpec);
            System.out.println("Khoa ma hoa k:" + " " + key);

            String encryptedText = txtMH2.getText(); 

            String decrypted = decrypt(encryptedText); 

            System.out.println("Decrypted Value: " + decrypted);
            JOptionPane.showMessageDialog(null, "Da Giai Ma Thanh Cong!");
            txtNoivaBam2.setText(decrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_btnGiaiMa2ActionPerformed

    private void btnTachChuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachChuoiActionPerformed

    }//GEN-LAST:event_btnTachChuoiActionPerformed

    private void btnKTBamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKTBamActionPerformed

    }//GEN-LAST:event_btnKTBamActionPerformed

    private void btnGiaiMa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMa1ActionPerformed

    }//GEN-LAST:event_btnGiaiMa1ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(FormNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaiMa1;
    private javax.swing.JButton btnGiaiMa2;
    private javax.swing.JButton btnKTBam;
    private javax.swing.JButton btnMoFile;
    private javax.swing.JButton btnTachChuoi;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBam1;
    private javax.swing.JTextField txtK1;
    private javax.swing.JTextField txtK2;
    private javax.swing.JTextField txtMAHOA1;
    private javax.swing.JTextField txtMH2;
    private javax.swing.JTextField txtND1;
    private javax.swing.JTextField txtND2;
    private javax.swing.JTextField txtNoivaBam2;
    // End of variables declaration//GEN-END:variables
}

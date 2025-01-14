/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package BAI4;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.DHParameterSpec;

/**
 *
 * @author Acer
 */
public class Alice extends javax.swing.JFrame {

    /** Creates new form Alice */
    KeyAgreement aliceKeyAgree;
    PublicKey bobPubKey;
    SecretKey aliceDesKey;
    Cipher aliceCipher;
    public Alice() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtkhoab = new javax.swing.JTextField();
        txtkhoachung = new javax.swing.JTextField();
        txtmahoakab = new javax.swing.JTextField();
        txtkhoaa = new javax.swing.JTextField();
        btnkhoaa = new javax.swing.JButton();
        btnhienthiKB = new javax.swing.JButton();
        btnmahoaKAB = new javax.swing.JButton();
        btnkhoachung = new javax.swing.JButton();
        btnmahoagiaima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Alice");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Khóa Alice: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Khóa KAB: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("MÃ HÓA KAB: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Khóa BoB: ");

        btnkhoaa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnkhoaa.setText("Tạo Khóa A");
        btnkhoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoaaActionPerformed(evt);
            }
        });

        btnhienthiKB.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnhienthiKB.setText("Hiển Thị KB");
        btnhienthiKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhienthiKBActionPerformed(evt);
            }
        });

        btnmahoaKAB.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnmahoaKAB.setText("Mã Hóa KAB");
        btnmahoaKAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaKABActionPerformed(evt);
            }
        });

        btnkhoachung.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnkhoachung.setText("Khóa Chung");
        btnkhoachung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoachungActionPerformed(evt);
            }
        });

        btnmahoagiaima.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnmahoagiaima.setText("Mã Hóa/Giải Mã");
        btnmahoagiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoagiaimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkhoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkhoab, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkhoachung, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmahoakab, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmahoaKAB)
                            .addComponent(btnhienthiKB)
                            .addComponent(btnkhoaa)
                            .addComponent(btnkhoachung))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnmahoagiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtkhoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnkhoaa)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtkhoab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhienthiKB))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkhoachung, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoachung))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmahoakab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmahoaKAB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnmahoagiaima)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhienthiKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhienthiKBActionPerformed
    try {
        FileInputStream fis = new FileInputStream("D:/B.pub");
        byte[] bkeyP = new byte[fis.available()];
        fis.read(bkeyP);
        fis.close();
        txtkhoab.setText(bkeyP.toString());
    }catch(Exception ex){}
    }//GEN-LAST:event_btnhienthiKBActionPerformed
    
    private void btnkhoachungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoachungActionPerformed
    try{
        FileInputStream fis = new FileInputStream("D:/B.pub");
        byte[] bobPubKeyEnc = new byte[fis.available()];
        fis.read(bobPubKeyEnc);
        fis.close();
        
        KeyFactory aliceKeyFac = KeyFactory.getInstance("DH");
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(bobPubKeyEnc);
        bobPubKey = aliceKeyFac.generatePublic(x509KeySpec);
        System.out.println("Executing PHASE1 of key agreement...");
        aliceKeyAgree.doPhase(bobPubKey, true);
        byte[] aliceSharedSecret = aliceKeyAgree.generateSecret();
        
        System.out.println("Khoa chung: secret (DEBUG ONLY):" + CryptoUtil.toHexString(aliceSharedSecret));
        txtkhoachung.setText(CryptoUtil.toHexString(aliceSharedSecret));
    }
    catch(Exception ex){}
    }//GEN-LAST:event_btnkhoachungActionPerformed

    private void btnkhoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoaaActionPerformed
    try{
        AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("DH");
        paramGen. init (512) ;

        AlgorithmParameters params = paramGen.generateParameters();

        DHParameterSpec dhSkipParamSpec = (DHParameterSpec) params.getParameterSpec(DHParameterSpec.class) ;

        System.out.println("Generating a DH KeyFair...");

        KeyPairGenerator aliceKpairGen = KeyPairGenerator.getInstance("DH") ;
        aliceKpairGen.initialize (dhSkipParamSpec) ;

        KeyPair aliceKpair = aliceKpairGen.generateKeyPair();

        System.out.println("Initializing the KeyAgreement Engine vith DH privatel key");
        aliceKeyAgree = KeyAgreement.getInstance("DH");
        aliceKeyAgree.init(aliceKpair .getPrivate ());

        byte[] alicePubKeyEnc = aliceKpair.getPublic() .getEncoded() ;
        FileOutputStream fos=new FileOutputStream("D:/A.pub");
        fos.write (alicePubKeyEnc) ;
        fos.close ();

        txtkhoaa.setText (alicePubKeyEnc.toString ());

        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoaaActionPerformed

    private void btnmahoaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaKABActionPerformed
       try{
           aliceKeyAgree.doPhase(bobPubKey,true);
           aliceDesKey = aliceKeyAgree.generateSecret("DES");
           txtmahoakab.setText(aliceDesKey.toString());
           BufferedWriter bw = null;
           String fileName = "D:\\KhoaA.txt";
           bw = new BufferedWriter(new FileWriter(fileName));
           bw.write(aliceDesKey.toString());
           bw.close();
        }catch(Exception ex) {} 
    }//GEN-LAST:event_btnmahoaKABActionPerformed

    private void btnmahoagiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoagiaimaActionPerformed
        DESCS des = new DESCS();
        des.setVisible(true);
    }//GEN-LAST:event_btnmahoagiaimaActionPerformed

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
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhienthiKB;
    private javax.swing.JButton btnkhoaa;
    private javax.swing.JButton btnkhoachung;
    private javax.swing.JButton btnmahoaKAB;
    private javax.swing.JButton btnmahoagiaima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtkhoaa;
    private javax.swing.JTextField txtkhoab;
    private javax.swing.JTextField txtkhoachung;
    private javax.swing.JTextField txtmahoakab;
    // End of variables declaration//GEN-END:variables

}

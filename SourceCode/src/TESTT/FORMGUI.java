package TESTT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class FORMGUI extends javax.swing.JFrame {

    /**
     * Creates new form FORMGUI
     */
    // PlayFair
    SecretKey secretKey;
    char pf[][]={    {'M','O','N','A','R'},
                     {'C','H','Y','B','D'},
                     {'E','F','G','i','K'},
                     {'L','P','Q','S','T'},
                     {'U','V','W','X','Z'}        
        };
//    SecretKey secretKey;
    public FORMGUI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtK3 = new javax.swing.JTextField();
        txtM1 = new javax.swing.JTextField();
        txtK1 = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        txtM2 = new javax.swing.JTextField();
        txtH2 = new javax.swing.JTextField();
        txtN1 = new javax.swing.JTextField();
        txtM3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtE3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtN2 = new javax.swing.JTextArea();
        btnNoiChuoiN1 = new javax.swing.JButton();
        btnMHM1 = new javax.swing.JButton();
        btnBamChuoiN1 = new javax.swing.JButton();
        btnMaHoaN2 = new javax.swing.JButton();
        btnNoiChuoiN2 = new javax.swing.JButton();
        btnMaHoaN3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("FORM GỬI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cipher(E1)= En(M1) với K1: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Message (M1):");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Key Encrypt (K1):");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Message (M2): ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Message (N1)=E1+M2 : ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Message Hash (H2): ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Message (M3): ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Message (N2)=N1+H2+M3 : ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Key Encrypt (K3):");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Cipher(E3)= En(N2) với K3: ");

        txtK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtK3ActionPerformed(evt);
            }
        });

        txtM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypeMessageM1(evt);
            }
        });

        txtE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtE1ActionPerformed(evt);
            }
        });

        txtM2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KhoaM2(evt);
            }
        });

        txtM3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KhoaM3(evt);
            }
        });

        txtE3.setColumns(20);
        txtE3.setRows(5);
        jScrollPane1.setViewportView(txtE3);

        txtN2.setColumns(20);
        txtN2.setRows(5);
        jScrollPane2.setViewportView(txtN2);

        btnNoiChuoiN1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNoiChuoiN1.setText("Nối chuỗi N1 = E1 + M2");
        btnNoiChuoiN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoiChuoiN1ActionPerformed(evt);
            }
        });

        btnMHM1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMHM1.setText("Mã Hóa M1");
        btnMHM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMHM1ActionPerformed(evt);
            }
        });

        btnBamChuoiN1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBamChuoiN1.setText("Băm chuỗi N1");
        btnBamChuoiN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBamChuoiN1ActionPerformed(evt);
            }
        });

        btnMaHoaN2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMaHoaN2.setText("Mã Hóa N2");
        btnMaHoaN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaN2ActionPerformed(evt);
            }
        });

        btnNoiChuoiN2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNoiChuoiN2.setText("Nối chuỗi N2");
        btnNoiChuoiN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoiChuoiN2ActionPerformed(evt);
            }
        });

        btnMaHoaN3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMaHoaN3.setText("Thoát");
        btnMaHoaN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaN3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtK3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtH2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMHM1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBamChuoiN1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaHoaN2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNoiChuoiN2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMaHoaN3)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNoiChuoiN1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMHM1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoiChuoiN1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBamChuoiN1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtH2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnNoiChuoiN2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtK3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMaHoaN2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMaHoaN3)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBamChuoiN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBamChuoiN1ActionPerformed
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(txtN1.getText().getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < byteData.length; i++)
            {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100,16).substring(1));
            }
            String bamm1 = sb.toString();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                String hex = Integer.toHexString(0xff & byteData[i]);
                if(hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            String bamm2 = hexString.toString();
//            txtgoc.setText(bam.toString()); 
            if(bamm1.equals(bamm2) == true)
            {
                txtH2.setText(bamm1);   
                System.out.println("H2:" + bamm1);
            }           
            BufferedWriter bw = null;
            String fileName = "D:\\BamN1.txt";
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(hexString.toString());
            bw.close();
            JOptionPane.showMessageDialog(null, "Bạn Đã Băm Chuỗi N1 Thành Công");
            }catch(Exception ex)
            {
                System.out.println("Lỗi băm chuỗi N1 :" + ex); 
        }
    }//GEN-LAST:event_btnBamChuoiN1ActionPerformed

    private void btnNoiChuoiN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoiChuoiN2ActionPerformed
    try{
        String N1 = txtN1.getText();
        String H2 = txtH2.getText();
        String M3 = txtM3.getText();
        String bam = "";
        bam = N1 + H2 + M3;
        txtN2.setText(bam);
        System.out.println("N2:"+bam);
        BufferedWriter bw = null;
        String fileName = "D:\\NoiChuoiN2.txt";
        bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(bam.toString());
        bw.close();
        JOptionPane.showMessageDialog(null, "Bạn Đã Nối Chuỗi N1, H2 và M3 Thành Công!");
        }catch(Exception ex)
            {
                System.out.println("Lỗi Nối chuỗi N1, H2 và M3 :" + ex); 
        }
    }//GEN-LAST:event_btnNoiChuoiN2ActionPerformed

    
    private void btnMHM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMHM1ActionPerformed
        try{
        String key = this.txtK1.getText();
        String banro = this.txtM1.getText();
        banro=banro.toUpperCase();
        banro=banro.replace('J','I');
        String banma = mahoa(banro,key);
        this.txtE1.setText(banma);
            System.out.println("E1:"+banma);
        BufferedWriter bw = null;
        String fileName = "D:\\MaHoaM1.txt";
        bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(banma.toString());
        bw.close();
        JOptionPane.showMessageDialog(null, "Bạn Đã Mã Hóa M1 Thành Công");
        }catch(Exception ex)
            {
                System.out.println("Lỗi Mã Hóa M1 :" + ex); 
        }
    }//GEN-LAST:event_btnMHM1ActionPerformed

    private void keyTypeMessageM1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyTypeMessageM1
    char c = evt.getKeyChar();
    if(!(Character.isLetter(c)))
    {
        evt.consume();
    }
    }//GEN-LAST:event_keyTypeMessageM1

    private void btnMaHoaN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaN3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnMaHoaN3ActionPerformed

    private void txtE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtE1ActionPerformed

    private void btnNoiChuoiN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoiChuoiN1ActionPerformed
    try{
        String E1 = txtE1.getText();
        String M2 = txtM2.getText();
        String bam = "";
        bam = E1 + M2;
        txtN1.setText(bam);
        System.out.println("N1:"+bam);
        BufferedWriter bw = null;
        String fileName = "D:\\NoiChuoiN1.txt";
        bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(bam.toString());
        bw.close();
        JOptionPane.showMessageDialog(null, "Bạn Đã Nối chuỗi E1 và M2 Thành Công!");
        }catch(Exception ex)
            {
                System.out.println("Lỗi Nối Chuỗi N1 :" + ex); 
        }
    }//GEN-LAST:event_btnNoiChuoiN1ActionPerformed

    private void KhoaM2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KhoaM2
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || Character.isLetter(c)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_KhoaM2

    private void KhoaM3(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KhoaM3
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || Character.isLetter(c)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_KhoaM3

    private void btnMaHoaN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaN2ActionPerformed
        String encryptedString = null;
        try{
            String K3= txtK3.getText();
            System.out.println("Khoa la: " + "" + K3);
            String fileName = "D:\\K3.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(K3);
            bw.close();  
            K3.getBytes().toString();
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            String N2 = txtN2.getText();
            secretKey = keyGen.generateKey();
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] byteDataToEncypt = N2.getBytes("UTF-8");
            byte[] byteCipherText = aesCipher.doFinal(byteDataToEncypt);
            byte[] strCipherText = Base64.getEncoder().encode(byteCipherText);
            encryptedString = new String(strCipherText);
            txtE3.setText(encryptedString.toString());
            JOptionPane.showMessageDialog(null, "Mã Hóa E3 Thành Công");
            System.out.println("E3:"+encryptedString);
            
            String fileNamme = "D:\\MaHoaE3.txt";
            BufferedWriter bwc = new BufferedWriter(new FileWriter(fileNamme));
            bwc.write(encryptedString.toString());
            bwc.close();      
        }catch(Exception ex)
        {
            System.out.println("Lỗi Mã Hóa N2 :" + ex); 
        }
    }//GEN-LAST:event_btnMaHoaN2ActionPerformed

    private void txtK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtK3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtK3ActionPerformed

    private String mahoa(String banro, String key)
    {
        generatePlayfairMatrix(key);
        int n=banro.length();
        int i=0;
        String banma="";
        char a,b;
        while(i<n)
        {
            if(i==n-1)
            {
                a=banro.charAt(i);
                b='X';
                i++;
            }else{
                a=banro.charAt(i);
                b=banro.charAt(i+1);
                if(a==b)
                {
                    b='X';
                    i++;
                }else{
                    i+=2;
                }
            }
            banma+=thayThe(a,b);
        }
        return banma;
    }
    String thayThe(char a,char b)
    {
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0) == vtb.charAt(0))
        {
            x=pf[(vta.charAt(0)-'0')][((vta.charAt(1)-'0')+1)%5];
            y=pf[(vtb.charAt(0)-'0')][((vtb.charAt(1)-'0')+1)%5];
            return x+""+y;
        }
        if(vta.charAt(1) == vtb.charAt(1))
        {
            x=pf[((vta.charAt(0)-'0')+1)%5][(vta.charAt(1)-'0')];
            y=pf[((vtb.charAt(0)-'0')+1)%5][(vtb.charAt(1)-'0')];
            return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][(vtb.charAt(1)-'0')];
        y=pf[(vtb.charAt(0)-'0')][(vta.charAt(1)-'0')];
        return x+""+y;
    }
    
    private String timViTri(char a)
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(pf[i][j]==a)
                    return i+""+j;
            }
        }
        return "";
    }
    private void generatePlayfairMatrix(String key) 
    {
        key = key.toUpperCase();
        key = key.replace('J', 'I');
        key = key.replaceAll("\\s", "");

        StringBuilder sb = new StringBuilder(key);
        String alphabets = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabets.length(); i++) {
            char ch = alphabets.charAt(i);
            if (sb.indexOf(ch + "") == -1) {
                sb.append(ch);
            }
            
            
        }
        String playfairKey = sb.toString();
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                pf[i][j] = playfairKey.charAt(index);
                index++;
            }
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
            java.util.logging.Logger.getLogger(FORMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBamChuoiN1;
    private javax.swing.JButton btnMHM1;
    private javax.swing.JButton btnMaHoaN2;
    private javax.swing.JButton btnMaHoaN3;
    private javax.swing.JButton btnNoiChuoiN1;
    private javax.swing.JButton btnNoiChuoiN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextArea txtE3;
    private javax.swing.JTextField txtH2;
    private javax.swing.JTextField txtK1;
    private javax.swing.JTextField txtK3;
    private javax.swing.JTextField txtM1;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM3;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextArea txtN2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

/**
 *
 * @author ESC
 */
public class PlayFail extends javax.swing.JFrame {

    /**
     * Creates new form PlayFail
     */ 
    char pf[][]={{'M','O','N','A','R'},
                 {'C','H','Y','B','D'},
                 {'E','F','G','i','K'},
                 {'L','P','Q','S','T'},
                 {'U','V','W','X','Z'}        
        };
    public PlayFail() {
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

        btngiaima = new javax.swing.JButton();
        txtbr = new javax.swing.JTextField();
        txtk = new javax.swing.JTextField();
        txtchuongtrinh = new javax.swing.JLabel();
        txtmakhoa = new javax.swing.JLabel();
        txtbanro = new javax.swing.JLabel();
        txtbanma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();
        btnmahoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btngiaima.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btngiaima.setText("Giải mã");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        txtbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrActionPerformed(evt);
            }
        });

        txtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkActionPerformed(evt);
            }
        });

        txtchuongtrinh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtchuongtrinh.setText(" MÃ HÓA PLAYFAIL");

        txtmakhoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmakhoa.setText("Khóa: ");

        txtbanro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbanro.setText("Bản rõ: ");

        txtbanma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbanma.setText("Bản mã: ");

        txtbm.setColumns(20);
        txtbm.setRows(5);
        jScrollPane1.setViewportView(txtbm);

        btnmahoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmahoa.setText("Mã hóa");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbanro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbanma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmakhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                            .addComponent(txtbr)
                            .addComponent(txtk, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnmahoa)
                        .addGap(288, 288, 288)
                        .addComponent(btngiaima)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtchuongtrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtchuongtrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbanro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmakhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbanma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmahoa)
                    .addComponent(btngiaima))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        String banma= this.txtbm.getText();
        String banro=giaima(banma);
        int n = banro.length();
        String br="";
        for (int i = 0; i <n-2; i+=2) 
            if(banro.charAt(i)==banro.charAt(i+2))
                br+=banro.charAt(i);
            else
                br+=banro.charAt(i)+""+banro.charAt(i+1);
        
        if(banro.charAt(n-1)=='X')
            br+=banro.charAt(n-2);
        else
        {
            br+=banro.charAt(n-2);
            br+=banro.charAt(n-1); // coi loi            
        }
        this.txtbr.setText(br);
    }//GEN-LAST:event_btngiaimaActionPerformed
    private String giaima(String banma)
    {
        int n=banma.length();
        String banro="";
        char a,b;
        for (int i = 0; i < n; i+=2) {
            a=banma.charAt(i);
            b=banma.charAt(i+1);
            banro+=thayTheNguoc(a, b);
        }
        return banro;
    }
    String thayTheNguoc(char a, char b)
    {
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0) == vtb.charAt(0))
        {
            x=pf[(vta.charAt(0)-'0')][((vta.charAt(1)-'0')-1+5)%5];
            y=pf[(vtb.charAt(0)-'0')][((vtb.charAt(1)-'0')-1+5)%5];
            return x+""+y;
        }
        if(vta.charAt(1) == vtb.charAt(1))
        {
            x=pf[((vta.charAt(0)-'0')-1+5)%5][(vta.charAt(1)-'0')];
            y=pf[((vtb.charAt(0)-'0')-1+5)%5][(vtb.charAt(1)-'0')];
            return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][(vtb.charAt(1)-'0')];
        y=pf[(vtb.charAt(0)-'0')][(vta.charAt(1)-'0')];
        return x+""+y;
    }
    private void txtbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrActionPerformed

    private void txtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkActionPerformed

    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        String banro=this.txtbr.getText();
        banro=banro.toUpperCase();
        banro=banro.replace('J','I');
        String banma = mahoa(banro);
        this.txtbm.setText(banma);   
    }//GEN-LAST:event_btnmahoaActionPerformed
    private String mahoa(String banro)
    {
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
            }else
            {
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
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtbanma;
    private javax.swing.JLabel txtbanro;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextField txtbr;
    private javax.swing.JLabel txtchuongtrinh;
    private javax.swing.JTextField txtk;
    private javax.swing.JLabel txtmakhoa;
    // End of variables declaration//GEN-END:variables
}
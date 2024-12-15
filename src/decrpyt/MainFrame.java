/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package decrpyt;

import javax.swing.JOptionPane;

/**
 *
 * @author Princess Cias
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    static String KEYS[] = {"A","B","C","D","E","F","G","H","I","J",
                            "K","L","M","N","O","P","Q","R","S","T",
                            "U","V","W","X","Y","Z","0","1","2","3",
                            "4","5","6","7","8","9"};
    static String alphabet[] = new String[36];
    static String sample = "";
    static int key = 0;
    static String input = "";
    static String oldOutput = "";    
    static String output = "";
    static int status = 0; 
    static int msgLength=0;
    public MainFrame() {
        initComponents();
        encryptBTN.setSelected(true);
           if(encryptBTN.isSelected()){
            status = 1;
        }else{
            status=0;
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

        jLabel1 = new javax.swing.JLabel();
        encryptBTN = new javax.swing.JToggleButton();
        decryptBTN = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputMSG = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputMSG = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        keyId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Princesses Mae Cias");

        encryptBTN.setBackground(new java.awt.Color(0, 102, 0));
        encryptBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        encryptBTN.setForeground(new java.awt.Color(255, 255, 255));
        encryptBTN.setText("Encryptor");
        encryptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptBTNActionPerformed(evt);
            }
        });

        decryptBTN.setBackground(new java.awt.Color(102, 0, 0));
        decryptBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        decryptBTN.setForeground(new java.awt.Color(255, 255, 255));
        decryptBTN.setText("Decryptor");
        decryptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptBTNActionPerformed(evt);
            }
        });

        outputMSG.setEditable(false);
        outputMSG.setColumns(20);
        outputMSG.setRows(5);
        jScrollPane1.setViewportView(outputMSG);

        inputMSG.setColumns(20);
        inputMSG.setRows(5);
        jScrollPane2.setViewportView(inputMSG);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ceasar Cipher Encryptor/ Decryptor");

        keyId.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        keyId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        keyId.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("The Key Sould Olny 36 and below");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(encryptBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decryptBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(keyId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decryptBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keyId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void encryptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptBTNActionPerformed
        // TODO add your handling code here:
        decryptBTN.setSelected(false);

        if(encryptBTN.isSelected()){
            status = 1;
        }else{
            status=0;
        }
    }//GEN-LAST:event_encryptBTNActionPerformed

    private void decryptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptBTNActionPerformed
        // TODO add your handling code here:
        encryptBTN.setSelected(false);
     
        if(decryptBTN.isSelected()){
            status = 2;
        }else{
            status=0;
        }
    }//GEN-LAST:event_decryptBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(inputMSG.getText().equals("")){
           JOptionPane.showMessageDialog(null, "No Input Message Found", "Warning",JOptionPane.WARNING_MESSAGE);
       }else if(keyId.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Key Is Required", "Warning",JOptionPane.WARNING_MESSAGE);

       }else if(isStringInt(keyId.getText())){
            JOptionPane.showMessageDialog(null, "The Key Must Be a Number", "Warning",JOptionPane.WARNING_MESSAGE);
            keyId.setText("0");
       } 
        if(status==1){
            encrypt();
        }else if(status==2){
            decrypt();
        }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public boolean isStringInt(String s)
{
    try
    {
        Integer.parseInt(s);
        return false;
    } catch (NumberFormatException ex)
    {
        System.out.println(ex);
        return true;
    }
}
    public void decrypt(){
            outputMSG.setText("");
            oldOutput = "";
             output="";
            input = inputMSG.getText().toLowerCase().replaceAll("\\s+","");
            key = Integer.parseInt(keyId.getText());
            msgLength = input.length();
        
        

        for(int i=0; i<msgLength; i++){
  switch(input.charAt(i)){ //3
       	                case 'a': sample =KEYS[36-key < 36 ? 36-key : 36-key+35-1]; break;//33
                case 'b': sample =KEYS[36-key+1 < 36 ?  36-key+1 : 36-key+35-2];break;//34
                case 'c':sample = KEYS[36-key+2 < 36 ?  36-key+2 : 36-key+35-3]; break;//35
                case 'd':sample = KEYS[36-key+3 < 36 ?  36-key+3 : 36-key+3-36]; break;//36
                case 'e':sample = KEYS[36-key+4 < 36 ?  36-key+4 : 36-key+4-36]; break; //0
                case 'f':sample = KEYS[36-key+5 < 36 ?  36-key+5 : 36-key+5-36]; break;
                case 'g':sample = KEYS[36-key+6 < 36 ?  36-key+6 : 36-key+6-36]; break;
                case 'h':sample = KEYS[36-key+7 < 36 ?  36-key+7 : 36-key+7-36]; break;
                case 'i':sample = KEYS[36-key+8 < 36 ?  36-key+8 : 36-key+8-36]; break;
                case 'j':sample = KEYS[36-key+9 < 36 ?  36-key+9 :  36-key+9-36]; break;
                case 'k':sample = KEYS[36-key+10 < 36 ? 36-key+10 : 36-key+10-36]; break; 
                case 'l':sample = KEYS[36-key+11 < 36 ? 36-key+11 : 36-key+11-36]; break;
                case 'm':sample = KEYS[36-key+12 < 36 ? 36-key+12 : 36-key+12-36]; break;
                case 'n':sample = KEYS[36-key+13 < 36 ? 36-key+13 : 36-key+13-36]; break;
                case 'o':sample = KEYS[36-key+14 < 36 ? 36-key+14 : 36-key+14-36]; break;
                case 'p':sample = KEYS[36-key+15 < 36 ? 36-key+15 : 36-key+15-36]; break;
                case 'q':sample = KEYS[36-key+16 < 36 ? 36-key+16 : 36-key+16-36]; break;
                case 'r':sample = KEYS[36-key+17 < 36 ? 36-key+17 : 36-key+17-36]; break;
                case 's':sample = KEYS[36-key+18 < 36 ? 36-key+18 : 36-key+18-36]; break;
                case 't':sample = KEYS[36-key+19 < 36 ? 36-key+19 : 36-key+19-36]; break;
                case 'u':sample = KEYS[36-key+20 < 36 ? 36-key+20 : 36-key+20-36]; break;
                case 'v':sample = KEYS[36-key+21 < 36 ? 36-key+21 : 36-key+21-36]; break;
                case 'w':sample = KEYS[36-key+22 < 36 ? 36-key+22 : 36-key+22-36]; break;
                case 'x':sample = KEYS[36-key+23 < 36 ? 36-key+23 : 36-key+23-36]; break;
                case 'y':sample = KEYS[36-key+24 < 36 ? 36-key+24 : 36-key+24-36]; break;
                case 'z':sample = KEYS[36-key+25 < 36 ? 36-key+25 : 36-key+25-36]; break;
                case '0':sample = KEYS[36-key+26 < 36 ? 36-key+26 : 36-key+26-36]; break;
                case '1':sample = KEYS[36-key+27 < 36 ? 36-key+27 : 36-key+27-36]; break;
                case '2':sample = KEYS[36-key+28 < 36 ? 36-key+28 : 36-key+28-36]; break;
                case '3':sample = KEYS[36-key+29 < 36 ? 36-key+29 : 36-key+29-36]; break;
                case '4':sample = KEYS[36-key+30 < 36 ? 36-key+30 : 36-key+30-36]; break;
                case '5':sample = KEYS[36-key+31 < 36 ? 36-key+31 : 36-key+31-36]; break;
                case '6':sample = KEYS[36-key+32 < 36 ? 36-key+32 : 36-key+32-36]; break;
                case '7':sample = KEYS[36-key+33 < 36 ? 36-key+33 : 36-key+33-36]; break;
                case '8':sample = KEYS[36-key+34 < 36 ? 36-key+34 : 36-key+34-36]; break;
                case '9':sample = KEYS[36-key+35 < 36 ? 36-key+35 : 36-key+35-36]; break;
            }
            oldOutput = output +""+sample;
            output=oldOutput;
        }
             outputMSG.setText(output);
    }
    public void encrypt(){
            outputMSG.setText("");
            oldOutput = "";
             output="";
            input = inputMSG.getText().toLowerCase().replaceAll("\\s+","");
            key = Integer.parseInt(keyId.getText());
            msgLength = input.length();
        
        

        for(int i=0; i<msgLength; i++){

            switch(input.charAt(i)){
               					case 'a' :  sample =KEYS[key  < 36 ?key   : key-36]; break;
                case 'b' : sample = KEYS[key+1< 36 ?key+1 : key-35];break;
                case 'c' : sample = KEYS[key+2< 36 ?key+2 : key-34]; break;
                case 'd' : sample = KEYS[key+3< 36 ?key+3 : key-33]; break;
                case 'e' : sample = KEYS[key+4< 36 ?key+4 : key-32]; break; 
                case 'f' : sample = KEYS[key+5< 36 ?key+5 : key-31]; break;
                case 'g' : sample = KEYS[key+6< 36 ?key+6 : key-30]; break;
                case 'h' : sample = KEYS[key+7< 36 ?key+7 : key-29]; break;
                case 'i' : sample = KEYS[key+8< 36 ?key+8 : key-28]; break;
                case 'j' : sample = KEYS[key+9< 36 ?key+9 : key-27]; break;
                case 'k' : sample = KEYS[key+10< 36 ?key+10 : key-26]; break; 
                case 'l' : sample = KEYS[key+11< 36 ?key+11 : key-25]; break;
                case 'm' : sample = KEYS[key+12< 36 ?key+12 : key-24]; break;
                case 'n' : sample = KEYS[key+13< 36 ?key+13 : key-23]; break;
                case 'o' : sample = KEYS[key+14< 36 ?key+14 : key-22]; break;
                case 'p' : sample = KEYS[key+15< 36 ?key+15 : key-21]; break;
                case 'q' : sample = KEYS[key+16< 36 ?key+16 : key-20]; break;
                case 'r' : sample = KEYS[key+17< 36 ?key+17 : key-19]; break;
                case 's' : sample = KEYS[key+18< 36 ?key+18 : key-18]; break;
                case 't' : sample = KEYS[key+19< 36 ?key+19 : key-17]; break;
                case 'u' : sample = KEYS[key+20< 36 ?key+20 : key-16]; break;
                case 'v' : sample = KEYS[key+21< 36 ?key+21 : key-15]; break;
                case 'w' : sample = KEYS[key+22< 36 ?key+22 : key-14]; break;
                case 'x' : sample = KEYS[key+23< 36 ?key+23 : key-13]; break;
                case 'y' : sample = KEYS[key+24< 36 ?key+24 : key-12]; break;
                case 'z' : sample = KEYS[key+25< 36 ?key+25 : key-11]; break;
                case '0' : sample = KEYS[key+26< 36 ?key+26 : key-10]; break;
                case '1' : sample = KEYS[key+27< 36 ?key+27 : key-9]; break;
                case '2' : sample = KEYS[key+28< 36 ?key+28 : key-8]; break;
                case '3' : sample = KEYS[key+29< 36 ?key+29 : key-7]; break;
                case '4' : sample = KEYS[key+30< 36 ?key+30 : key-6]; break;
                case '5' : sample = KEYS[key+31< 36 ?key+31 : key-5]; break;
                case '6' : sample = KEYS[key+32< 36 ?key+32 : key-4]; break;
                case '7' : sample = KEYS[key+33< 36 ?key+33 : key-3]; break;
                case '8' : sample = KEYS[key+34< 36 ?key+34 : key-2]; break;
                case '9' : sample = KEYS[key+35< 36 ?key+35 : key-1]; break;
            }
            oldOutput = output +""+sample;
            output=oldOutput;
        }
             outputMSG.setText(output);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton decryptBTN;
    private javax.swing.JToggleButton encryptBTN;
    private javax.swing.JTextArea inputMSG;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyId;
    private javax.swing.JTextArea outputMSG;
    // End of variables declaration//GEN-END:variables
}

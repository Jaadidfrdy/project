/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectakhir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class GUIorder1 extends javax.swing.JFrame {

    /**
     * Creates new form GUIorder1
     */
    public GUIorder1() {
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

        txtdash = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btkembali = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        icdash = new javax.swing.JLabel();
        cmbjenis = new javax.swing.JComboBox<>();
        fieldtgl = new javax.swing.JTextField();
        btorderfix = new projectakhir.FButton();
        fielddeskripsi = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        fieldnama = new javax.swing.JTextField();
        fieldnotel = new javax.swing.JTextField();
        fieldalamat = new javax.swing.JTextField();
        fieldjumlah = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdash.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        txtdash.setText("DASHBOARD");
        txtdash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(txtdash, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel2.setText("MANAGEMENT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Mask group.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        btkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Group 13.png"))); // NOI18N
        btkembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btkembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel8.setText("LIST ORDER");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Vector.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Vector (1).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/solar_logout-3-bold.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 20, -1, -1));

        icdash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/teenyicons_home-solid.png"))); // NOI18N
        icdash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icdash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icdashMouseClicked(evt);
            }
        });
        getContentPane().add(icdash, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        getContentPane().add(cmbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 150, 30));

        fieldtgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldtglActionPerformed(evt);
            }
        });
        getContentPane().add(fieldtgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 830, 190, -1));

        btorderfix.setText("Order");
        btorderfix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btorderfixActionPerformed(evt);
            }
        });
        getContentPane().add(btorderfix, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 820, 100, 40));

        fielddeskripsi.setBorder(null);
        fielddeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielddeskripsiActionPerformed(evt);
            }
        });
        getContentPane().add(fielddeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 370, 130));

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 22, 350, 40));

        fieldnama.setBorder(null);
        fieldnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnamaActionPerformed(evt);
            }
        });
        getContentPane().add(fieldnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 360, 30));

        fieldnotel.setBorder(null);
        fieldnotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnotelActionPerformed(evt);
            }
        });
        getContentPane().add(fieldnotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 360, 30));

        fieldalamat.setBorder(null);
        fieldalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldalamatActionPerformed(evt);
            }
        });
        getContentPane().add(fieldalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 360, 30));

        fieldjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldjumlahActionPerformed(evt);
            }
        });
        getContentPane().add(fieldjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Group 16 (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1922, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(GUIorder1.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Anda berhasil Logout");

        new GUIlogin().setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        cmbjenis.addItem("Pilih jenis");
        cmbjenis.addItem("Canvas");
        cmbjenis.addItem("Kulit");
        cmbjenis.addItem("Suede");
        cmbjenis.addItem("Nubuck");
        cmbjenis.addItem("Karet");
        cmbjenis.addItem("Denim");
        cmbjenis.addItem("Mesh");
    }//GEN-LAST:event_formWindowActivated

    private void btkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btkembaliMouseClicked
        // TODO add your handling code here:
        new GUIdashbord().setVisible(true);
        dispose();
    }//GEN-LAST:event_btkembaliMouseClicked

    private void icdashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icdashMouseClicked
        // TODO add your handling code here:
        new GUIdashbord().setVisible(true);
        dispose();
    }//GEN-LAST:event_icdashMouseClicked

    private void btorderfixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btorderfixActionPerformed
        // TODO add your handling code here:
       tambah();
       table();
       clear();
    }//GEN-LAST:event_btorderfixActionPerformed

    private void fieldnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnamaActionPerformed
        // TODO add your handling code here:
        if (fieldnama.getText().equals("")){
            fieldnama.setText("");
        }
    }//GEN-LAST:event_fieldnamaActionPerformed

    private void fieldnotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnotelActionPerformed
        // TODO add your handling code here:
        if (fieldnotel.getText().equals("")){
            fieldnotel.setText("");
        }
    }//GEN-LAST:event_fieldnotelActionPerformed

    private void fieldalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldalamatActionPerformed
        // TODO add your handling code here:
        if (fieldalamat.getText().equals("")){
            fieldalamat.setText("");
        }
    }//GEN-LAST:event_fieldalamatActionPerformed

    private void fieldtglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldtglActionPerformed
        // TODO add your handling code here:
        if (fieldtgl.getText().equals("")){
            fieldtgl.setText("");
        }
    }//GEN-LAST:event_fieldtglActionPerformed

    private void fielddeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielddeskripsiActionPerformed
        // TODO add your handling code here:
        if (fielddeskripsi.getText().equals("")){
            fielddeskripsi.setText("");
        }
    }//GEN-LAST:event_fielddeskripsiActionPerformed

    private void fieldjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldjumlahActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new GUIlistorder().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

     private void tambah(){
     try{

            Connection kon = KoneksiKashoes.koneksikashoesdB();
            Statement st = kon.createStatement();

            PreparedStatement prs = kon.prepareStatement("INSERT INTO deep_clean (nama,no_telp,alamat,jenis_sepatu,jumlah_sepatu,tgl_masuk,deskripsi_pesanan) VALUES(?,?,?,?,?,?,?)"); 
            
            prs.setString(1, fieldnama.getText());
            prs.setString(2, fieldnotel.getText());
            prs.setString(3, fieldalamat.getText());
            prs.setString(4, cmbjenis.getSelectedItem().toString());
            prs.setString(5, fieldjumlah.getText());
            prs.setString(6, fieldtgl.getText());
            prs.setString(7, fielddeskripsi.getText());
            prs.execute();
             JOptionPane.showMessageDialog(null, "Pesanan sudah diterima");
            }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Pesanan belum diterima");
           
        }
     
        new GUIdashbord().setVisible(true);
        dispose();
    }
     private void clear(){
        fieldnama.setText("");
        fieldnotel.setText("");
        fieldalamat.setText("");
        cmbjenis.setSelectedItem("Pilih jenis");
        fieldjumlah.setText("");
        fieldtgl.setText("");
        fielddeskripsi.setText("");
     }
     private void table(){    
        
         
         Object header[] = {"nama","no_telp","alamat","jenis_sepatu","jumlah_sepatu","deskripsi_pesanan","tgl_masuk"};
         DefaultTableModel data = new DefaultTableModel(null,header);
         String sql_data = "SELECT nama,no_telp,alamat,jenis_sepatu,jumlah_sepatu,deskripsi_pesanan,tgl_masuk FROM deep_clean ORDER BY nama ASC";
         
         
         try{
             Connection kon = KoneksiKashoes.koneksikashoesdB();
             Statement st = kon.createStatement();
             ResultSet rs = st.executeQuery(sql_data);
             while(rs.next()){
                 String d1 = rs.getString(1);
                 String d2 = rs.getString(2);
                 String d3 = rs.getString(3);
                 String d4 = rs.getString(4);
                 String d5 = rs.getString(5);
                 String d6 = rs.getString(6);
                 String d7 = rs.getString(7);

                
                 
                 String d[] = {d1,d2,d3,d4,d5,d6,d7};
                 data.addRow(d);
                 
                 
             }
             
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
        fieldnama.setText("");
        fieldnotel.setText("");
        fieldalamat.setText("");
        cmbjenis.setSelectedItem("Pilih jenis");
        fieldjumlah.setText("");
        fieldtgl.setText("");
        fielddeskripsi.setText("");
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
            java.util.logging.Logger.getLogger(GUIorder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIorder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIorder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIorder1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIorder1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btkembali;
    private projectakhir.FButton btorderfix;
    private javax.swing.JComboBox<String> cmbjenis;
    private javax.swing.JTextField fieldalamat;
    private javax.swing.JTextField fielddeskripsi;
    private javax.swing.JTextField fieldjumlah;
    private javax.swing.JTextField fieldnama;
    private javax.swing.JTextField fieldnotel;
    private javax.swing.JTextField fieldtgl;
    private javax.swing.JLabel icdash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel txtdash;
    // End of variables declaration//GEN-END:variables
}

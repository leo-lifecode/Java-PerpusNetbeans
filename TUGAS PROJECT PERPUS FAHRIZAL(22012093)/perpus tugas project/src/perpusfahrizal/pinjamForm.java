/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpusfahrizal;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Unknown
 */
public class pinjamForm extends javax.swing.JFrame {

    /**
     * Creates new form pinjamForm
     */
    public pinjamForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        mainMenu mm = new mainMenu();
        if (mm.edit == true) {
            updatePinjam.setVisible(true);
            tambahPinjam.setVisible(false);
            this.setTitle("Edit Data Peminjaman");
        } else {
            updatePinjam.setVisible(false);
            tambahPinjam.setVisible(true);
            this.setTitle("Tambah Data Peminjaman");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtnip = new javax.swing.JTextField();
        txtnpm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cekData = new javax.swing.JButton();
        txthasilnip = new javax.swing.JTextField();
        txthasilnpm = new javax.swing.JTextField();
        txtkodebuku = new javax.swing.JTextField();
        txthasilkodebuku = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tambahPinjam = new javax.swing.JButton();
        updatePinjam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(154, 177, 206));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Kode Buku");
        jLabel5.setToolTipText("");

        txtnip.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("NPM");
        jLabel7.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("NIP");
        jLabel6.setToolTipText("");

        cekData.setBackground(new java.awt.Color(26, 34, 102));
        cekData.setForeground(new java.awt.Color(255, 255, 255));
        cekData.setText("Cek Data");
        cekData.setBorderPainted(false);
        cekData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekDataActionPerformed(evt);
            }
        });

        txthasilnip.setEditable(false);
        txthasilnip.setBackground(new java.awt.Color(255, 255, 255));
        txthasilnip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        txthasilnpm.setEditable(false);
        txthasilnpm.setBackground(new java.awt.Color(255, 255, 255));
        txthasilnpm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        txthasilkodebuku.setEditable(false);
        txthasilkodebuku.setBackground(new java.awt.Color(255, 255, 255));
        txthasilkodebuku.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        jPanel2.setLayout(new java.awt.CardLayout());

        tambahPinjam.setBackground(new java.awt.Color(26, 34, 102));
        tambahPinjam.setForeground(new java.awt.Color(255, 255, 255));
        tambahPinjam.setText("Tambah Data");
        tambahPinjam.setBorderPainted(false);
        tambahPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahPinjamActionPerformed(evt);
            }
        });
        jPanel2.add(tambahPinjam, "card2");

        updatePinjam.setBackground(new java.awt.Color(87, 101, 116));
        updatePinjam.setForeground(new java.awt.Color(255, 255, 255));
        updatePinjam.setText("Update Data");
        updatePinjam.setBorderPainted(false);
        updatePinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePinjamActionPerformed(evt);
            }
        });
        jPanel2.add(updatePinjam, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnpm)
                                    .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txthasilnip, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthasilnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtkodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txthasilkodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(cekData)
                        .addGap(126, 126, 126)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthasilkodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasilnip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasilnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cekData)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void view_mahasiswa() {
        try {
            String sql = "Select nama_mahasiswa from mahasiswa where npm='" + txtnpm.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                txthasilnpm.setText(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void view_pegawai() {
        try {
            String sql = "Select nama_pegawai from pegawai where nip='" + txtnip.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                txthasilnip.setText(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void view_buku() {
        try {
            String sql = "Select judul_buku from buku where kode_buku='" + txtkodebuku.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                txthasilkodebuku.setText(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void cekDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekDataActionPerformed
        txthasilnip.setText(null);
        txthasilnpm.setText(null);
        txthasilkodebuku.setText(null);
        view_mahasiswa();
        view_pegawai();
        view_buku();
    }//GEN-LAST:event_cekDataActionPerformed

    private void tambahPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahPinjamActionPerformed
        LocalDate sourceDate = LocalDate.now();
        LocalDate destDate = sourceDate.plusDays(3);
        String str = destDate.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        try {
            String sql = "INSERT INTO pinjam (kode_buku,nip,npm,tgl_kembali,kembali)VALUES('" + txtkodebuku.getText() + "','" + txtnip.getText() + "','" + txtnpm.getText() + "','" + str + "','n')";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tambahPinjamActionPerformed

    private void updatePinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePinjamActionPerformed
        try {
            String sql = "UPDATE pinjam SET kode_buku='" + txtkodebuku.getText() + "',nip='" + txtnip.getText() + "',npm='" + txtnpm.getText() + "'WHERE id_pinjam='"+ambilID+"'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_updatePinjamActionPerformed

    public String ambilkode, ambilnip, ambilnpm, ambilID;

    public String getambilID() {
        return ambilID;
    }
    public String getambilkode() {
        return ambilkode;
    }

    public String getambilnip() {
        return ambilnip;
    }

    public String getambilnpm() {
        return ambilnpm;
    }

    public void viewData() {
        txtkodebuku.setText(ambilkode);
        txtnpm.setText(ambilnpm);
        txtnip.setText(ambilnip);
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
            java.util.logging.Logger.getLogger(pinjamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pinjamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pinjamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pinjamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pinjamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekData;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton tambahPinjam;
    private javax.swing.JTextField txthasilkodebuku;
    private javax.swing.JTextField txthasilnip;
    private javax.swing.JTextField txthasilnpm;
    private javax.swing.JTextField txtkodebuku;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextField txtnpm;
    private javax.swing.JButton updatePinjam;
    // End of variables declaration//GEN-END:variables
}

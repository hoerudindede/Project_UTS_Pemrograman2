/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myProject;


import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcel
 */
public class LatihanTabel extends javax.swing.JFrame {
    private DefaultTableModel mod;
    Object[] data = new Object[4];
    /**
     * Creates new form LatihanTabel
     */
    public LatihanTabel() {
        initComponents();
        mod = (DefaultTableModel) tabMahasiswa.getModel();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNIM = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textKelas = new javax.swing.JTextField();
        textProdi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();

        setTitle("Tabel Mahasiswa");
        setResizable(false);

        tabMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Kelas", "Prodi"
            }
        ));
        tabMahasiswa.setGridColor(new java.awt.Color(204, 0, 153));
        tabMahasiswa.setShowGrid(true);
        tabMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabMahasiswa);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Kelas");

        jLabel4.setText("Prodi");

        textNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNIMActionPerformed(evt);
            }
        });

        textProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdiActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNIM)
                            .addComponent(textNama)
                            .addComponent(textKelas)
                            .addComponent(textProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnTambah))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCari)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnHapus)))))
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTambah)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNIMActionPerformed

    private void textProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdiActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String nim = textNIM.getText();
        String nama = textNama.getText();
        String kelas = textKelas.getText();
        String prodi = textProdi.getText();
        String sql ="INSERT INTO mhs VALUES ('"+nim+"','"+nama+"', '"+kelas+"', '"+prodi+"' )";
        runSQL(sql);
        loadTable();
        textNIM.setText("");
        textNama.setText("");
        textKelas.setText("");
        textProdi.setText("");
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tabMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMahasiswaMouseClicked
        // TODO add your handling code here:
        int row = tabMahasiswa.getSelectedRow();
        textNIM.setText(tabMahasiswa.getModel().getValueAt(row, 0).toString());
        textNama.setText( tabMahasiswa.getModel().getValueAt(row, 1).toString());
        textKelas.setText( tabMahasiswa.getModel().getValueAt(row, 2).toString());
        textProdi.setText( tabMahasiswa.getModel().getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_tabMahasiswaMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int konf = JOptionPane.showConfirmDialog(this, "Yakin Menghapus" + textNama.getText()+"?", "konfirmasi", 
                JOptionPane.YES_NO_OPTION);
        if(konf==0) { 
            String nim = textNIM.getText();
            runSQL("DELETE FROM mhs WHERE nim ='"+nim+"'");
            loadTable();
            kosong();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String nim = textNIM.getText();
        String nama = textNama.getText();
        String kelas = textKelas.getText();
        String prodi = textProdi.getText();
        int konf = JOptionPane.showConfirmDialog(this, "Yakin Menedit " + textNama.getText()+"?", "konfirmasi", 
                JOptionPane.YES_NO_OPTION);
        if(konf==0) { 
            runSQL("UPDATE mhs SET nama ='"+nama+"',"+"kelas='"+kelas+"',"+"prodi='"+prodi+"' WHERE nim='"+nim+"' ");
        }
            loadTable();
            kosong();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String nim = textNIM.getText();
        String nama = textNama.getText();
        String kelas = textKelas.getText();
        String prodi = textProdi.getText();
        String sql = "";
        
        if (!nim.isEmpty())
            sql = "SELECT * FROM mhs WHERE nim = '"+nim+"'";  
        else if (!nama.isEmpty())
            sql = "SELECT * FROM mhs WHERE nama like '"+nama+"'" ;
        else if (!kelas.isEmpty())
            sql = "SELECT * FROM mhs WHERE kelas = '"+kelas+"'";
        else if(!prodi.isEmpty())
            sql = "SELECT * FROM mhs WHERE prodi = '"+prodi+"'";
            
        mod.setRowCount(0); // Menghapus semua baris yang ada di tabel
        
        try {
            java.sql.Connection conn = (Connection)configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                mod.addRow(new Object[] {res.getString(1),
                res.getString(2), res.getString(3), 
                res.getString(4) });
            }
            tabMahasiswa.setModel(mod);
        } catch(Exception e) {
        }
    
    }//GEN-LAST:event_btnCariActionPerformed
        //cTODO add your handling code here:
    
    private void runSQL(String SQL) {
        try {
            java.sql.Connection conn = (Connection)configDB.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(SQL);
            pst.execute();
        }catch (Exception e) {
            System.err.println("SQL gagal");
        }
    }
    
    private void loadTable(){
        mod.setRowCount(0);
        try {
            String sql = "SELECT * FROM mhs";
            java.sql.Connection conn = (Connection)configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                mod.addRow(new Object[]{res.getString(1),
                res.getString(2), res.getString(3), 
                res.getString(4) });
            }
            tabMahasiswa.setModel(mod);
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(LatihanTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LatihanTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LatihanTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LatihanTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LatihanTabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabMahasiswa;
    private javax.swing.JTextField textKelas;
    private javax.swing.JTextField textNIM;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textProdi;
    // End of variables declaration//GEN-END:variables

    

    private void kosong() {
        textNIM.setText("");
        textNama.setText("");
        textKelas.setText("");
        textProdi.setText("");
    }
}

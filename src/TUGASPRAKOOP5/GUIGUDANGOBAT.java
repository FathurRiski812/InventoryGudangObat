/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TUGASPRAKOOP5;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Fatur Riski
 */
public class GUIGUDANGOBAT extends javax.swing.JFrame {

    /**
     * Creates new form GUIGUDANGOBAT
     */
    public GUIGUDANGOBAT() {
        initComponents();
//        getContentPane().setBackground(Color.PINK);
        selectPajak.setVisible(false);
        txtpajak.setVisible(false);
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
        namagudangobatpurepharmacymedikacentre = new javax.swing.JLabel();
        txtkodeobat = new javax.swing.JTextField();
        kodeobat = new javax.swing.JLabel();
        namaobat = new javax.swing.JLabel();
        txtnamaobat = new javax.swing.JTextField();
        jenisobat = new javax.swing.JLabel();
        txtjenisobat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtjumlahstok = new javax.swing.JTextField();
        hargaproduksi = new javax.swing.JLabel();
        txthargaproduksi = new javax.swing.JTextField();
        hargajual = new javax.swing.JLabel();
        txthargajual = new javax.swing.JTextField();
        tanggalexp = new javax.swing.JLabel();
        txttanggalexp = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        cekPajak = new javax.swing.JCheckBox();
        txtpajak = new javax.swing.JTextField();
        selectPajak = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelHasil = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namagudangobatpurepharmacymedikacentre.setText("GUDANG OBAT-OBATAN PURE PHARMACY MEDIKA CENTRE");

        kodeobat.setText("Kode Obat : ");

        namaobat.setText("Nama Obat : ");

        jenisobat.setText("Jenis Obat :");

        jLabel5.setText("Jumlah Stok :");

        hargaproduksi.setText("Harga Produksi :");

        hargajual.setText("Harga Jual :");

        tanggalexp.setText("Tanggal Expired :");

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        cekPajak.setText("Pajak");
        cekPajak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekPajakActionPerformed(evt);
            }
        });

        selectPajak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persen", "Rupiah" }));

        tabelHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Obat", "Nama Obat", "Jenis Obat", "Jumlah Stok", "Harga Produksi", "Harga Jual", "Tanggal Expired", "Pajak", "Harga Jual Akhir"
            }
        ));
        jScrollPane2.setViewportView(tabelHasil);

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeobat)
                            .addComponent(txtjumlahstok, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjenisobat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkodeobat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaobat)
                            .addComponent(jenisobat)
                            .addComponent(jLabel5)
                            .addComponent(selectPajak, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnhapus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnbatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnclose))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cekPajak)
                                .addComponent(tanggalexp)
                                .addComponent(hargajual)
                                .addComponent(hargaproduksi)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttanggalexp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txthargajual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                        .addComponent(txthargaproduksi, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addComponent(txtpajak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(namagudangobatpurepharmacymedikacentre)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namagudangobatpurepharmacymedikacentre)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kodeobat)
                            .addComponent(hargaproduksi))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkodeobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthargaproduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaobat)
                            .addComponent(hargajual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenisobat)
                            .addComponent(tanggalexp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjenisobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttanggalexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlahstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cekPajak))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectPajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnclose)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnsimpan)
                                .addComponent(btnhapus)
                                .addComponent(btnbatal)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        ClassMutasi objMutasi = new ClassMutasi();
        
        objMutasi.setKodeobat("P001");
        
//        memoobat.setText("");
//        ATP1 obt = new ATP1();
        String cetak = "";
        List data = new ArrayList<>();
        
        DefaultTableModel model = (DefaultTableModel)tabelHasil.getModel();
        
        if(cekPajak.isSelected()){
            String pajak;
            if(selectPajak.getSelectedIndex() == 0){
                PajakPersen obt = new PajakPersen();
                obt.datakodeobat(txtkodeobat.getText());
                obt.dataNamaobat(txtnamaobat.getText());
                String obat="";
                obt.datajenisobat(txtjenisobat.getText());
                obt.datajumlahstok(txtjumlahstok.getText());
                obt.datahargaproduksi(txthargaproduksi.getText());
                obt.datahargajual(txthargajual.getText());
                obt.datatanggalexpired(txttanggalexp.getText());
                obt.pajakPersen = Integer.parseInt(txtpajak.getText());
                pajak = String.valueOf(obt.hitungPajak());
                txtkodeobat.setText(obt.CocokKode(obt.namaobat));
                data = obt.generateList();
                data.add(pajak);
                data.add(Integer.parseInt(obt.hargajual)+Integer.parseInt(pajak));
//                model.addRow(data.toArray());
//                cetak = obt.cetakData(txtpajak.getText());
            }else{
                PajakRupiah obt = new PajakRupiah();
                obt.datakodeobat(txtkodeobat.getText());
                obt.dataNamaobat(txtnamaobat.getText());
                String obat="";
                obt.datajenisobat(txtjenisobat.getText());
                obt.datajumlahstok(txtjumlahstok.getText());
                obt.datahargaproduksi(txthargaproduksi.getText());
                obt.datahargajual(txthargajual.getText());
                obt.datatanggalexpired(txttanggalexp.getText());
                obt.pajakRupiah = Integer.parseInt(txtpajak.getText());
                pajak = String.valueOf(obt.hitungPajak());
                txtkodeobat.setText(obt.CocokKode(obt.namaobat));
                data = obt.generateList();
                data.add(pajak);
                data.add(Integer.parseInt(obt.hargajual)+Integer.parseInt(pajak));
//                model. addRow(data.toArray());
//                cetak = obt.cetakData(txtpajak.getText());
            }
//            memoobat.setText(cetak);
//            memoobat.append("Harga Jual Akhir       : "+ pajak+"\n");
        }else{
            ATP1 obt = new ATP1();
            obt.datakodeobat(txtkodeobat.getText());
            obt.dataNamaobat(txtnamaobat.getText());
            String obat="";
            obt.datajenisobat(txtjenisobat.getText());
            obt.datajumlahstok(txtjumlahstok.getText());
            obt.datahargaproduksi(txthargaproduksi.getText());
            obt.datahargajual(txthargajual.getText());
            obt.datatanggalexpired(txttanggalexp.getText());
            txtkodeobat.setText(obt.CocokKode(obt.namaobat));
            data = obt.generateList();
//            model.addRow(data.toArray());
//            cetak = obt.cetakData(txtpajak.getText());
//            memoobat.setText(obt.cetakData());
        }
        model.addRow(data.toArray());
        
        
        
//        memoobat.append("Gudang Obat-Obatan Pure Pharmacy Medika Centre\n\n");
//        memoobat.append("");
//        memoobat.append("Nama Obat          : "+ obt.namaobat+"\n");
//        memoobat.append("Kode Obat           : "+ obt.CocokKode(obt.namaobat)+"\n");
//        memoobat.append("Jenis Obat           : "+ obt.jenisobat+"\n");
//        memoobat.append("Jumlah Stok         : "+ obt.jumlahstok+"\n");
//        memoobat.append("Harga Produksi   : "+ obt.hargaproduksi+ "\n");
//        memoobat.append("Harga Jual           : "+ obt.hargajual+"\n");
//        memoobat.append("Tanggal Expired  : "+ obt.tanggalexpired+"\n");
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void cekPajakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekPajakActionPerformed
        // TODO add your handling code here:
        if(cekPajak.isSelected()){
            selectPajak.setVisible(true);
            txtpajak.setVisible(true);
        }else{
            selectPajak.setVisible(false);
            txtpajak.setVisible(false);
        }
    }//GEN-LAST:event_cekPajakActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    txtkodeobat.setText("");
    txtnamaobat.setText("");
    txtjenisobat.setText("");
    txtjumlahstok.setText("");
    txthargaproduksi.setText("");
    txthargajual.setText("");
    txttanggalexp.setText("");
    }//GEN-LAST:event_btnbatalActionPerformed

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
            java.util.logging.Logger.getLogger(GUIGUDANGOBAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIGUDANGOBAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIGUDANGOBAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIGUDANGOBAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIGUDANGOBAT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JCheckBox cekPajak;
    private javax.swing.JLabel hargajual;
    private javax.swing.JLabel hargaproduksi;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jenisobat;
    private javax.swing.JLabel kodeobat;
    private javax.swing.JLabel namagudangobatpurepharmacymedikacentre;
    private javax.swing.JLabel namaobat;
    private javax.swing.JComboBox<String> selectPajak;
    private javax.swing.JTable tabelHasil;
    private javax.swing.JLabel tanggalexp;
    private javax.swing.JTextField txthargajual;
    private javax.swing.JTextField txthargaproduksi;
    private javax.swing.JTextField txtjenisobat;
    private javax.swing.JTextField txtjumlahstok;
    private javax.swing.JTextField txtkodeobat;
    private javax.swing.JTextField txtnamaobat;
    private javax.swing.JTextField txtpajak;
    private javax.swing.JTextField txttanggalexp;
    // End of variables declaration//GEN-END:variables
}

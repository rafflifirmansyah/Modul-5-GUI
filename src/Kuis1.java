/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kandos
 */
public class Kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis1
     */
    public Kuis1() {
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
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        mapel = new javax.swing.JTextField();
        nilai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tekarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Penilaian Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 130, 40);
        getContentPane().add(nama);
        nama.setBounds(160, 50, 110, 30);
        getContentPane().add(absen);
        absen.setBounds(160, 90, 110, 30);
        getContentPane().add(mapel);
        mapel.setBounds(160, 130, 110, 30);
        getContentPane().add(nilai);
        nilai.setBounds(160, 170, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 50, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 90, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Mapel");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 130, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nilai");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 170, 60, 30);

        proses.setBackground(new java.awt.Color(255, 255, 102));
        proses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        proses.setText("PROSES");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(140, 220, 120, 40);

        tekarea.setColumns(20);
        tekarea.setRows(5);
        jScrollPane1.setViewportView(tekarea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 280, 250, 120);

        setBounds(0, 0, 420, 477);
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        String Nama = nama.getText();
        String Absen = absen.getText();
        String Mapel = mapel.getText();
        int Nilai = Integer.parseInt(nilai.getText());
        String ket = " ";
        
        if(Nilai < 75){
            ket = "Tidak Lulus";
        }
        else if(Nilai >= 75 && Nilai < 100){
            ket = "Lulus";;
        }
        else if(Nilai == 100){
            ket = "Sempurna";;
        }
        else if(Nilai > 100){
            ket = "Amazing";;
        }
        
        tekarea.setText("Nama : "+Nama+"\n"
                + "Absen : "+Absen+"\n"
                + "Mapel : "+Mapel+"\n"
                + "Nilai : "+Nilai+"\n"
                + "Keterangan : "+ket);
    }//GEN-LAST:event_prosesActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mapel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilai;
    private javax.swing.JButton proses;
    private javax.swing.JTextArea tekarea;
    // End of variables declaration//GEN-END:variables
}

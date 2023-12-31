/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package t2;

/**
 *
 * @author Leonardo
 */
public class JFrameGestionHorario extends javax.swing.JFrame {

    
    /**
     * Creates new form JFrameAsistencia
     */
    public JFrameGestionHorario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMañana = new javax.swing.JButton();
        btnTarde = new javax.swing.JButton();
        btnNoche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONE TURNO");

        btnMañana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t2/Group 1 (1).png"))); // NOI18N
        btnMañana.setBorder(null);
        btnMañana.setContentAreaFilled(false);
        btnMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMañanaActionPerformed(evt);
            }
        });

        btnTarde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t2/Group 2 (1).png"))); // NOI18N
        btnTarde.setBorder(null);
        btnTarde.setContentAreaFilled(false);
        btnTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTardeActionPerformed(evt);
            }
        });

        btnNoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t2/Group 3 (1).png"))); // NOI18N
        btnNoche.setBorder(null);
        btnNoche.setContentAreaFilled(false);
        btnNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNocheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTarde)
                    .addComponent(btnMañana)
                    .addComponent(btnNoche))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(btnMañana)
                .addGap(18, 18, 18)
                .addComponent(btnTarde)
                .addGap(18, 18, 18)
                .addComponent(btnNoche)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMañanaActionPerformed
        // TODO add your handling code here:
        JFrameM pantallaM = new JFrameM(this);
         pantallaM.setLocationRelativeTo(this);
         pantallaM.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnMañanaActionPerformed

    private void btnTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTardeActionPerformed
        // TODO add your handling code here:
        JFrameT pantallaT = new JFrameT();
        pantallaT.setLocationRelativeTo(null); 
        pantallaT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTardeActionPerformed

    private void btnNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNocheActionPerformed
        // TODO add your handling code here:
        JFrameT pantallaN = new JFrameT();
        pantallaN.setLocationRelativeTo(null); 
        pantallaN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNocheActionPerformed

    
    
     
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
            java.util.logging.Logger.getLogger(JFrameGestionHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGestionHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGestionHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMañana;
    private javax.swing.JButton btnNoche;
    private javax.swing.JButton btnTarde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

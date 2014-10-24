/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.base;

/**
 *
 * @author Casa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        btn_frequencia = new javax.swing.JButton();
        btn_matricula = new javax.swing.JButton();
        btn_evasao = new javax.swing.JButton();
        btn_presenca = new javax.swing.JButton();
        btn_turmas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        btn_frequencia.setBackground(new java.awt.Color(255, 255, 255));
        btn_frequencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_frequencia.setText("Atualizar frequência");
        btn_frequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_frequenciaActionPerformed(evt);
            }
        });

        btn_matricula.setBackground(new java.awt.Color(255, 255, 255));
        btn_matricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_matricula.setText("Matrículas");
        btn_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_matriculaActionPerformed(evt);
            }
        });

        btn_evasao.setBackground(new java.awt.Color(255, 255, 255));
        btn_evasao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_evasao.setText("Evasão");
        btn_evasao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_evasaoActionPerformed(evt);
            }
        });

        btn_presenca.setBackground(new java.awt.Color(255, 255, 255));
        btn_presenca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_presenca.setText("Controle de presença");
        btn_presenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_presencaActionPerformed(evt);
            }
        });

        btn_turmas.setBackground(new java.awt.Color(255, 255, 255));
        btn_turmas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_turmas.setText("Turmas");
        btn_turmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turmasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tela principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_evasao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_frequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_presenca, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(btn_frequencia)
                .addGap(18, 18, 18)
                .addComponent(btn_matricula)
                .addGap(18, 18, 18)
                .addComponent(btn_evasao)
                .addGap(18, 18, 18)
                .addComponent(btn_presenca)
                .addGap(18, 18, 18)
                .addComponent(btn_turmas)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_frequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_frequenciaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FrequenciaMain().setVisible(true);
    }//GEN-LAST:event_btn_frequenciaActionPerformed

    private void btn_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_matriculaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MatriculaMain().setVisible(true);
    }//GEN-LAST:event_btn_matriculaActionPerformed

    private void btn_evasaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_evasaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Evasao1().setVisible(true);
    }//GEN-LAST:event_btn_evasaoActionPerformed

    private void btn_presencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_presencaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ControledePresenca().setVisible(true);
    }//GEN-LAST:event_btn_presencaActionPerformed

    private void btn_turmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turmasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Turmas().setVisible(true);
    }//GEN-LAST:event_btn_turmasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_evasao;
    private javax.swing.JButton btn_frequencia;
    private javax.swing.JButton btn_matricula;
    private javax.swing.JButton btn_presenca;
    private javax.swing.JButton btn_turmas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

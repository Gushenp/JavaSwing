/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author 1075474
 */
public class CalcularTriangulos extends javax.swing.JFrame {


    public CalcularTriangulos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitle = new javax.swing.JPanel();
        jTitleLabel = new javax.swing.JLabel();
        jBody = new javax.swing.JPanel();
        jInputs = new javax.swing.JPanel();
        jCampo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCampo01 = new javax.swing.JTextField();
        jCampo2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCampo02 = new javax.swing.JTextField();
        jCampo3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCampo03 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jResult = new javax.swing.JPanel();
        jResultPanel = new javax.swing.JPanel();
        jResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jTitle.setBackground(new java.awt.Color(30, 35, 38));

        jTitleLabel.setBackground(new java.awt.Color(250, 207, 206));
        jTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTitleLabel.setForeground(new java.awt.Color(229, 233, 244));
        jTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitleLabel.setText("TIPOS DE TRIÂNGULOS");
        jTitleLabel.setToolTipText("");

        javax.swing.GroupLayout jTitleLayout = new javax.swing.GroupLayout(jTitle);
        jTitle.setLayout(jTitleLayout);
        jTitleLayout.setHorizontalGroup(
            jTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jTitleLayout.setVerticalGroup(
            jTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        jBody.setBackground(new java.awt.Color(30, 35, 38));

        jInputs.setBackground(new java.awt.Color(30, 35, 38));

        jCampo1.setBackground(new java.awt.Color(72, 81, 88));

        jLabel1.setBackground(new java.awt.Color(30, 35, 38));
        jLabel1.setText("Campo 01:");

        jCampo01.setBackground(new java.awt.Color(199, 208, 215));
        jCampo01.setForeground(new java.awt.Color(30, 35, 38));
        jCampo01.setText("0");
        jCampo01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampo01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCampo1Layout = new javax.swing.GroupLayout(jCampo1);
        jCampo1.setLayout(jCampo1Layout);
        jCampo1Layout.setHorizontalGroup(
            jCampo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCampo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCampo01)
                .addContainerGap())
        );
        jCampo1Layout.setVerticalGroup(
            jCampo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCampo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCampo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCampo01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jCampo2.setBackground(new java.awt.Color(72, 81, 88));

        jLabel2.setText("Campo 02:");

        jCampo02.setBackground(new java.awt.Color(199, 208, 215));
        jCampo02.setForeground(new java.awt.Color(30, 35, 38));
        jCampo02.setText("0");
        jCampo02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampo02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCampo2Layout = new javax.swing.GroupLayout(jCampo2);
        jCampo2.setLayout(jCampo2Layout);
        jCampo2Layout.setHorizontalGroup(
            jCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCampo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCampo02, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        jCampo2Layout.setVerticalGroup(
            jCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCampo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCampo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCampo02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jCampo3.setBackground(new java.awt.Color(72, 81, 88));

        jLabel3.setText("Campo 03:");

        jCampo03.setBackground(new java.awt.Color(199, 208, 215));
        jCampo03.setForeground(new java.awt.Color(30, 35, 38));
        jCampo03.setText("0");
        jCampo03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampo03ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCampo3Layout = new javax.swing.GroupLayout(jCampo3);
        jCampo3.setLayout(jCampo3Layout);
        jCampo3Layout.setHorizontalGroup(
            jCampo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCampo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCampo03, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
        jCampo3Layout.setVerticalGroup(
            jCampo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCampo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCampo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCampo03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(199, 208, 215));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Verificar Tipo");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInputsLayout = new javax.swing.GroupLayout(jInputs);
        jInputs.setLayout(jInputsLayout);
        jInputsLayout.setHorizontalGroup(
            jInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCampo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCampo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCampo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInputsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jInputsLayout.setVerticalGroup(
            jInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInputsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCampo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jResult.setBackground(new java.awt.Color(30, 35, 38));

        jResultPanel.setBackground(new java.awt.Color(72, 81, 88));

        jResultado.setBackground(new java.awt.Color(72, 81, 88));
        jResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jResultado.setForeground(new java.awt.Color(229, 233, 244));
        jResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jResultado.setText(":)");

        javax.swing.GroupLayout jResultPanelLayout = new javax.swing.GroupLayout(jResultPanel);
        jResultPanel.setLayout(jResultPanelLayout);
        jResultPanelLayout.setHorizontalGroup(
            jResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        jResultPanelLayout.setVerticalGroup(
            jResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jResultLayout = new javax.swing.GroupLayout(jResult);
        jResult.setLayout(jResultLayout);
        jResultLayout.setHorizontalGroup(
            jResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResultLayout.createSequentialGroup()
                .addComponent(jResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        jResultLayout.setVerticalGroup(
            jResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResultLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBodyLayout = new javax.swing.GroupLayout(jBody);
        jBody.setLayout(jBodyLayout);
        jBodyLayout.setHorizontalGroup(
            jBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBodyLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBodyLayout.setVerticalGroup(
            jBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBodyLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void iniciarCalculo(){
        double campo01 = Double.parseDouble(jCampo01.getText());
        double campo02 = Double.parseDouble(jCampo02.getText());
        double campo03 = Double.parseDouble(jCampo03.getText()); 
        
        String resultado = calcularTriangulo(campo01, campo02, campo03);
        
        jResultado.setText("Triângulo " + resultado);
        
    }
    
    private String calcularTriangulo(double campo01, double campo02, double campo03){
        if(campo01 == campo02 && campo02 == campo03){
            return "Equilátero.";
        } else if (campo01 == campo02 || campo02 == campo03) {
            return "Isósceles.";
        } else {
            return "Escaleno.";
        }
    }
    
    private void jCampo01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampo01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampo01ActionPerformed

    private void jCampo02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampo02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampo02ActionPerformed

    private void jCampo03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampo03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCampo03ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       iniciarCalculo();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalcularTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularTriangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularTriangulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBody;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCampo01;
    private javax.swing.JTextField jCampo02;
    private javax.swing.JTextField jCampo03;
    private javax.swing.JPanel jCampo1;
    private javax.swing.JPanel jCampo2;
    private javax.swing.JPanel jCampo3;
    private javax.swing.JPanel jInputs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jResult;
    private javax.swing.JPanel jResultPanel;
    private javax.swing.JLabel jResultado;
    private javax.swing.JPanel jTitle;
    private javax.swing.JLabel jTitleLabel;
    // End of variables declaration//GEN-END:variables
}

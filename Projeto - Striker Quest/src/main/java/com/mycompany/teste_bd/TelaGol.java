package com.mycompany.striker_quest;

/**
 * Classe TelaInicio
 *
 * Esta classe cria a tela TelaGol.
 */
public class TelaGol extends javax.swing.JFrame {

    /**
     * Cria um novo formulário TelaGol
     */
    public TelaGol() {
        initComponents();
    }

    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     * AVISO: NÃO modifique este código.
     * O conteúdo deste método é sempre regenerado pelo Editor de Formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcao1Button = new javax.swing.JButton();
        opcao2Button = new javax.swing.JButton();
        opcao3Button = new javax.swing.JButton();
        opcao4Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcao1Button.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 56)); // NOI18N
        opcao1Button.setText("1");
        opcao1Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        opcao1Button.setContentAreaFilled(false);
        getContentPane().add(opcao1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 70, 600, 200));

        opcao2Button.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 56)); // NOI18N
        opcao2Button.setText("2");
        opcao2Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        opcao2Button.setContentAreaFilled(false);
        getContentPane().add(opcao2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 680, 190));

        opcao3Button.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 56)); // NOI18N
        opcao3Button.setText("3");
        opcao3Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        opcao3Button.setContentAreaFilled(false);
        getContentPane().add(opcao3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 73, 680, 200));

        opcao4Button.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 56)); // NOI18N
        opcao4Button.setText("4");
        opcao4Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        opcao4Button.setContentAreaFilled(false);
        getContentPane().add(opcao4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 590, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cris e gol img.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1760, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método main para teste
     * 
     * Este método main é usado para testar a exibição da tela.
     * 
     * Ele não pertence ao projeto final do jogo.
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Cria e mostra o formulário */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton opcao1Button;
    private javax.swing.JButton opcao2Button;
    private javax.swing.JButton opcao3Button;
    private javax.swing.JButton opcao4Button;
    // End of variables declaration//GEN-END:variables
}

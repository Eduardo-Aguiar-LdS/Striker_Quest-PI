/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teste_bd;

/**
 *
 * @author Morbius
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarTelaPrinc();
    }

    public void mostrarTelaPrinc(){
        botaoEntrarAluno.setVisible(true);
        botaoEntrarProfessor.setVisible(true);
        e.setVisible(false);//aqueles textos em cima das caixas de input
        s.setVisible(false);
        r.setVisible(false);
        n.setVisible(false);
        t.setVisible(false);
        botaoConfirmaAluno.setVisible(false);
        botaoConfirmaProf.setVisible(false);
        emailProf1.setVisible(false);
        senhaProf1.setVisible(false);
        nomeAluno.setVisible(false);
        rgAluno.setVisible(false);
        turmaAluno.setVisible(false);
        botaoVolta.setVisible(false);
    }
    
    public void mostrarTelaAluno(){
        botaoEntrarAluno.setVisible(false);
        botaoEntrarProfessor.setVisible(false);
        e.setVisible(false);//aqueles textos em cima das caixas de input
        s.setVisible(false);
        r.setVisible(true);
        n.setVisible(true);
        t.setVisible(true);
        botaoConfirmaAluno.setVisible(true);
        botaoConfirmaProf.setVisible(false);
        emailProf1.setVisible(false);
        senhaProf1.setVisible(false);
        nomeAluno.setVisible(true);
        rgAluno.setVisible(true);
        turmaAluno.setVisible(true);
        botaoVolta.setVisible(true);
    }
    
    public void mostrarTelaProf(){
        botaoEntrarAluno.setVisible(false);
        botaoEntrarProfessor.setVisible(false);
        e.setVisible(true);//aqueles textos em cima das caixas de input
        s.setVisible(true);
        r.setVisible(false);
        n.setVisible(false);
        t.setVisible(false);
        botaoConfirmaAluno.setVisible(false);
        botaoConfirmaProf.setVisible(true);
        emailProf1.setVisible(true);
        senhaProf1.setVisible(true);
        nomeAluno.setVisible(false);
        rgAluno.setVisible(false);
        turmaAluno.setVisible(false);
        botaoVolta.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoEntrarAluno = new javax.swing.JButton();
        botaoEntrarProfessor = new javax.swing.JButton();
        emailProf1 = new javax.swing.JTextField();
        rgAluno = new javax.swing.JTextField();
        nomeAluno = new javax.swing.JTextField();
        senhaProf1 = new javax.swing.JPasswordField();
        turmaAluno = new javax.swing.JTextField();
        r = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        botaoConfirmaAluno = new javax.swing.JButton();
        botaoConfirmaProf = new javax.swing.JButton();
        botaoVolta = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        botaoEntrarAluno.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        botaoEntrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoEntrarAluno.setText("ALUNO");
        botaoEntrarAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoEntrarAluno.setContentAreaFilled(false);
        botaoEntrarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEntrarAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEntrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrarAluno);
        botaoEntrarAluno.setBounds(630, 600, 280, 100);

        botaoEntrarProfessor.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        botaoEntrarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoEntrarProfessor.setText("PROFESSOR");
        botaoEntrarProfessor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoEntrarProfessor.setContentAreaFilled(false);
        botaoEntrarProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEntrarProfessor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEntrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrarProfessor);
        botaoEntrarProfessor.setBounds(1010, 600, 280, 100);

        emailProf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailProf1ActionPerformed(evt);
            }
        });
        getContentPane().add(emailProf1);
        emailProf1.setBounds(800, 580, 320, 50);

        rgAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(rgAluno);
        rgAluno.setBounds(800, 650, 320, 50);

        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeAluno);
        nomeAluno.setBounds(800, 580, 320, 50);
        getContentPane().add(senhaProf1);
        senhaProf1.setBounds(800, 660, 320, 40);
        getContentPane().add(turmaAluno);
        turmaAluno.setBounds(800, 720, 320, 50);

        r.setText("RG:");
        getContentPane().add(r);
        r.setBounds(810, 626, 70, 30);

        n.setText("NOME:");
        getContentPane().add(n);
        n.setBounds(810, 560, 60, 16);

        s.setText("SENHA:");
        getContentPane().add(s);
        s.setBounds(810, 640, 70, 16);

        e.setText("E-MAIL:");
        getContentPane().add(e);
        e.setBounds(810, 560, 60, 16);

        t.setText("TURMA:");
        getContentPane().add(t);
        t.setBounds(810, 700, 70, 16);

        botaoConfirmaAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoConfirmaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoConfirmaAluno.setText("ENTRAR");
        botaoConfirmaAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoConfirmaAluno.setContentAreaFilled(false);
        botaoConfirmaAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConfirmaAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConfirmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfirmaAluno);
        botaoConfirmaAluno.setBounds(880, 780, 160, 50);

        botaoConfirmaProf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoConfirmaProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoConfirmaProf.setText("ENTRAR");
        botaoConfirmaProf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoConfirmaProf.setContentAreaFilled(false);
        botaoConfirmaProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConfirmaProf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConfirmaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaProfActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfirmaProf);
        botaoConfirmaProf.setBounds(880, 730, 160, 50);

        botaoVolta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoVolta.setText("VOLTAR");
        botaoVolta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoVolta.setContentAreaFilled(false);
        botaoVolta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVolta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVolta);
        botaoVolta.setBounds(880, 850, 160, 50);

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_menu.png"))); // NOI18N
        fundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarAlunoActionPerformed
        mostrarTelaAluno();
    }//GEN-LAST:event_botaoEntrarAlunoActionPerformed

    private void emailProf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailProf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailProf1ActionPerformed

    private void botaoConfirmaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaProfActionPerformed
        Professor prof = dadosProf(); //RETORNA UM PROFESSOR C OS DADOS INSERIDOS
    }//GEN-LAST:event_botaoConfirmaProfActionPerformed

    private void botaoConfirmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaAlunoActionPerformed
        Jogador aluno = dadosAluno();//RETORNA UM ALUNO C OS DADOS INSERIDOS
    }//GEN-LAST:event_botaoConfirmaAlunoActionPerformed

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void rgAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgAlunoActionPerformed

    private void botaoEntrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarProfessorActionPerformed
        mostrarTelaProf();
    }//GEN-LAST:event_botaoEntrarProfessorActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        mostrarTelaPrinc();
    }//GEN-LAST:event_botaoVoltaActionPerformed

    public Professor dadosProf(){ //pega dados das caixas de texto
        String email = emailProf1.getText();
        String senha = senhaProf1.getText();
        return new Professor(email, senha);
    }
    
    public Jogador dadosAluno(){//pega dados das caixas de texto
        String nome = nomeAluno.getText();
        String rg = rgAluno.getText();
        int idTurma = Integer.parseInt(turmaAluno.getText());
        return new Jogador(nome, rg, idTurma);
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmaAluno;
    private javax.swing.JButton botaoConfirmaProf;
    private javax.swing.JButton botaoEntrarAluno;
    private javax.swing.JButton botaoEntrarProfessor;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JLabel e;
    private javax.swing.JTextField emailProf1;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel n;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JLabel r;
    private javax.swing.JTextField rgAluno;
    private javax.swing.JLabel s;
    private javax.swing.JPasswordField senhaProf1;
    private javax.swing.JLabel t;
    private javax.swing.JTextField turmaAluno;
    // End of variables declaration//GEN-END:variables
}

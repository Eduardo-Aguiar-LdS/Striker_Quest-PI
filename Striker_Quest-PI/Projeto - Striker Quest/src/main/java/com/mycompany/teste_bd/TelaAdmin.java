/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teste_bd;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class TelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaOpcoes
     */
    public TelaAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSairConta1 = new javax.swing.JButton();
        botaoPontuacoes = new javax.swing.JButton();
        idTexto1 = new javax.swing.JLabel();
        idProf1 = new javax.swing.JTextField();
        turmaTexto = new javax.swing.JLabel();
        nomeTurma = new javax.swing.JTextField();
        cadastrarTurma = new javax.swing.JButton();
        fundo2 = new javax.swing.JLabel();
        cadastrarAluno = new javax.swing.JButton();
        rgAluno = new javax.swing.JTextField();
        nomeAluno = new javax.swing.JTextField();
        nomeTexto = new javax.swing.JLabel();
        rgAlunoTexto = new javax.swing.JLabel();
        idTurmaAluno = new javax.swing.JTextField();
        idTurmaTexto = new javax.swing.JLabel();
        fundo3 = new javax.swing.JLabel();
        cadastrarPergunta = new javax.swing.JButton();
        idTurmaTexto1 = new javax.swing.JLabel();
        respIncorreta1 = new javax.swing.JTextField();
        idProfPergunta = new javax.swing.JTextField();
        rgAlunoTexto1 = new javax.swing.JLabel();
        nomeTexto1 = new javax.swing.JLabel();
        perguntaP = new javax.swing.JTextField();
        idTurmaTexto2 = new javax.swing.JLabel();
        respIncorreta2 = new javax.swing.JTextField();
        respIncorreta3 = new javax.swing.JTextField();
        idTurmaTexto3 = new javax.swing.JLabel();
        respCorreta = new javax.swing.JTextField();
        idTurmaTexto4 = new javax.swing.JLabel();
        idPergunta = new javax.swing.JTextField();
        nomeTexto2 = new javax.swing.JLabel();
        fundo4 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        botaoSairConta1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        botaoSairConta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoSairConta1.setText("SAIR DA CONTA");
        botaoSairConta1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoSairConta1.setContentAreaFilled(false);
        botaoSairConta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSairConta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSairConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairConta1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSairConta1);
        botaoSairConta1.setBounds(730, 860, 210, 90);

        botaoPontuacoes.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        botaoPontuacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoPontuacoes.setText("VER PONTUAÇÕES");
        botaoPontuacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoPontuacoes.setContentAreaFilled(false);
        botaoPontuacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPontuacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPontuacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontuacoesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPontuacoes);
        botaoPontuacoes.setBounds(970, 860, 210, 90);

        idTexto1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTexto1.setText("SEU ID DE PROFESSOR:");
        getContentPane().add(idTexto1);
        idTexto1.setBounds(200, 220, 200, 40);

        idProf1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        idProf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProf1ActionPerformed(evt);
            }
        });
        getContentPane().add(idProf1);
        idProf1.setBounds(410, 220, 310, 40);

        turmaTexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        turmaTexto.setText("NOME DA TURMA:");
        getContentPane().add(turmaTexto);
        turmaTexto.setBounds(200, 160, 170, 40);

        nomeTurma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nomeTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTurma);
        nomeTurma.setBounds(410, 160, 310, 40);

        cadastrarTurma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarTurma.setText("CADASTRAR");
        cadastrarTurma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cadastrarTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarTurma);
        cadastrarTurma.setBounds(440, 300, 170, 40);

        fundo2.setBackground(new java.awt.Color(204, 204, 204));
        fundo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fundo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo2.setText("CADASTRAR TURMA");
        fundo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fundo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        fundo2.setOpaque(true);
        getContentPane().add(fundo2);
        fundo2.setBounds(180, 100, 670, 260);

        cadastrarAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarAluno.setText("CADASTRAR");
        cadastrarAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cadastrarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarAluno);
        cadastrarAluno.setBounds(440, 630, 170, 40);

        rgAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rgAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(rgAluno);
        rgAluno.setBounds(420, 500, 310, 40);

        nomeAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeAluno);
        nomeAluno.setBounds(420, 440, 310, 40);

        nomeTexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeTexto.setText("NOME DO ALUNO:");
        getContentPane().add(nomeTexto);
        nomeTexto.setBounds(210, 440, 170, 40);

        rgAlunoTexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rgAlunoTexto.setText("RG DO ALUNO:");
        getContentPane().add(rgAlunoTexto);
        rgAlunoTexto.setBounds(210, 500, 200, 40);

        idTurmaAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        idTurmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTurmaAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(idTurmaAluno);
        idTurmaAluno.setBounds(420, 560, 310, 40);

        idTurmaTexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTurmaTexto.setText("ID DA TURMA:");
        getContentPane().add(idTurmaTexto);
        idTurmaTexto.setBounds(210, 560, 200, 40);

        fundo3.setBackground(new java.awt.Color(204, 204, 204));
        fundo3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fundo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo3.setText("CADASTRAR ALUNO");
        fundo3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fundo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        fundo3.setOpaque(true);
        getContentPane().add(fundo3);
        fundo3.setBounds(190, 380, 670, 320);

        cadastrarPergunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarPergunta.setText("CADASTRAR");
        cadastrarPergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cadastrarPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarPergunta);
        cadastrarPergunta.setBounds(1300, 630, 170, 40);

        idTurmaTexto1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTurmaTexto1.setText("REPOSTA INCORRETA 1:");
        getContentPane().add(idTurmaTexto1);
        idTurmaTexto1.setBounds(1050, 380, 220, 40);

        respIncorreta1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        respIncorreta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respIncorreta1ActionPerformed(evt);
            }
        });
        getContentPane().add(respIncorreta1);
        respIncorreta1.setBounds(1270, 380, 310, 40);

        idProfPergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        idProfPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProfPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(idProfPergunta);
        idProfPergunta.setBounds(1270, 320, 310, 40);

        rgAlunoTexto1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rgAlunoTexto1.setText("SEU ID DE PROFESSOR:");
        getContentPane().add(rgAlunoTexto1);
        rgAlunoTexto1.setBounds(1050, 320, 200, 40);

        nomeTexto1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeTexto1.setText("PERGUNTA:");
        getContentPane().add(nomeTexto1);
        nomeTexto1.setBounds(1050, 260, 170, 40);

        perguntaP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        perguntaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perguntaPActionPerformed(evt);
            }
        });
        getContentPane().add(perguntaP);
        perguntaP.setBounds(1270, 260, 310, 40);

        idTurmaTexto2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTurmaTexto2.setText("REPOSTA INCORRETA 2:");
        getContentPane().add(idTurmaTexto2);
        idTurmaTexto2.setBounds(1050, 440, 220, 40);

        respIncorreta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        respIncorreta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respIncorreta2ActionPerformed(evt);
            }
        });
        getContentPane().add(respIncorreta2);
        respIncorreta2.setBounds(1270, 440, 310, 40);

        respIncorreta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        respIncorreta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respIncorreta3ActionPerformed(evt);
            }
        });
        getContentPane().add(respIncorreta3);
        respIncorreta3.setBounds(1270, 500, 310, 40);

        idTurmaTexto3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTurmaTexto3.setText("REPOSTA INCORRETA 3:");
        getContentPane().add(idTurmaTexto3);
        idTurmaTexto3.setBounds(1050, 500, 220, 40);

        respCorreta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        respCorreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respCorretaActionPerformed(evt);
            }
        });
        getContentPane().add(respCorreta);
        respCorreta.setBounds(1270, 560, 310, 40);

        idTurmaTexto4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idTurmaTexto4.setText("REPOSTA CORRETA:");
        getContentPane().add(idTurmaTexto4);
        idTurmaTexto4.setBounds(1050, 560, 220, 40);

        idPergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        idPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(idPergunta);
        idPergunta.setBounds(1270, 200, 310, 40);

        nomeTexto2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeTexto2.setText("ID DA SUA PERGUNTA:");
        getContentPane().add(nomeTexto2);
        nomeTexto2.setBounds(1050, 200, 210, 40);

        fundo4.setBackground(new java.awt.Color(204, 204, 204));
        fundo4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fundo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo4.setText("CADASTRAR PERGUNTA");
        fundo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fundo4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        fundo4.setOpaque(true);
        getContentPane().add(fundo4);
        fundo4.setBounds(1030, 100, 670, 600);

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_menu.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Turma novaTurma(){
        return new Turma(nomeTurma.getText(), Integer.parseInt(idProf1.getText()));
    }
    
    public Jogador novoJogador(){
        String nome_jogador = nomeAluno.getText();
        String rg = rgAluno.getText();
        int id_turma = Integer.parseInt(idTurmaAluno.getText());
        return new Jogador(nome_jogador, rg, id_turma);
    }
    
    public Pergunta novaPergunta(){
        String pergunta = perguntaP.getText();
        int id_professor = Integer.parseInt(idProfPergunta.getText());
        return new Pergunta(pergunta, id_professor);
    }
    
    public Resposta novaResposta(){
        String resposta_correta = respCorreta.getText();
        String resposta_um = respIncorreta1.getText();
        String resposta_dois = respIncorreta2.getText();
        String resposta_tres = respIncorreta3.getText();
        int id_pergunta = Integer.parseInt(idPergunta.getText());
        return new Resposta(resposta_correta, resposta_um, resposta_dois, resposta_tres, id_pergunta);
    }
    
    private void botaoSairConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairConta1ActionPerformed
        //codigo para sair da conta
        TelaLogin t = new TelaLogin();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSairConta1ActionPerformed

    private void nomeTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTurmaActionPerformed

    private void idProf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProf1ActionPerformed

    private void rgAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgAlunoActionPerformed

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void cadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTurmaActionPerformed
    //fazer codigo pra cadastrar turma
        Turma t = novaTurma();
        JOptionPane.showMessageDialog(null, "Turma existente");
        JOptionPane.showMessageDialog(null, "Turma cadastrada");
    }//GEN-LAST:event_cadastrarTurmaActionPerformed

    private void idTurmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTurmaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTurmaAlunoActionPerformed

    private void respIncorreta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respIncorreta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respIncorreta1ActionPerformed

    private void idProfPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProfPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProfPerguntaActionPerformed

    private void perguntaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perguntaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perguntaPActionPerformed

    private void respIncorreta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respIncorreta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respIncorreta2ActionPerformed

    private void respIncorreta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respIncorreta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respIncorreta3ActionPerformed

    private void respCorretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respCorretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respCorretaActionPerformed

    private void idPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPerguntaActionPerformed

    private void botaoPontuacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontuacoesActionPerformed
        

    //FAZER TELA DE RANK
        
        
    }//GEN-LAST:event_botaoPontuacoesActionPerformed

    private void cadastrarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPerguntaActionPerformed
            //fazer codigo pra cadastrar pergunta e resposta
        Pergunta p = novaPergunta();
        Resposta r = novaResposta();
        JOptionPane.showMessageDialog(null, "Pergunta existente");
        JOptionPane.showMessageDialog(null, "Pergunta cadastrada");
    }//GEN-LAST:event_cadastrarPerguntaActionPerformed

    private void cadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoActionPerformed
        //fazer codigo pra cadastrar jogador
        Jogador j = novoJogador();
        JOptionPane.showMessageDialog(null, "Jogador existente");
        JOptionPane.showMessageDialog(null, "Jogador cadastrado");
    }//GEN-LAST:event_cadastrarAlunoActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPontuacoes;
    private javax.swing.JButton botaoSairConta1;
    private javax.swing.JButton cadastrarAluno;
    private javax.swing.JButton cadastrarPergunta;
    private javax.swing.JButton cadastrarTurma;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel fundo3;
    private javax.swing.JLabel fundo4;
    private javax.swing.JTextField idPergunta;
    private javax.swing.JTextField idProf1;
    private javax.swing.JTextField idProfPergunta;
    private javax.swing.JLabel idTexto1;
    private javax.swing.JTextField idTurmaAluno;
    private javax.swing.JLabel idTurmaTexto;
    private javax.swing.JLabel idTurmaTexto1;
    private javax.swing.JLabel idTurmaTexto2;
    private javax.swing.JLabel idTurmaTexto3;
    private javax.swing.JLabel idTurmaTexto4;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JLabel nomeTexto;
    private javax.swing.JLabel nomeTexto1;
    private javax.swing.JLabel nomeTexto2;
    private javax.swing.JTextField nomeTurma;
    private javax.swing.JTextField perguntaP;
    private javax.swing.JTextField respCorreta;
    private javax.swing.JTextField respIncorreta1;
    private javax.swing.JTextField respIncorreta2;
    private javax.swing.JTextField respIncorreta3;
    private javax.swing.JTextField rgAluno;
    private javax.swing.JLabel rgAlunoTexto;
    private javax.swing.JLabel rgAlunoTexto1;
    private javax.swing.JLabel turmaTexto;
    // End of variables declaration//GEN-END:variables
}

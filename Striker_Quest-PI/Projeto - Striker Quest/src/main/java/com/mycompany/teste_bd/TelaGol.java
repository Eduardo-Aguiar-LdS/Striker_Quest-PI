package com.mycompany.teste_bd;

import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaGol extends javax.swing.JFrame {

    private String textoPergunta = "TEXTO PERGUNTA";

    public TelaGol() {
        initComponents();
        botaoProxima.setVisible(false);
        setLocationRelativeTo(null);
        
        //PARA TESTES:
        setTextoPergunta("Pergunta teste... testando... testando... testando... testando... testando... testando... testando... testando... testando... testando... testando... testando... testando... testando...");
        setTextoBotoes("A - SIM", "B - NUNCA", "C - TALVEZ", "D - TESTE");
    }

    public void setarTelaResposta(boolean foiGol, boolean superior, boolean direita) { //esse método muda a imagem para uma das imagens de defesa/gol
        String imgPath = "src/main/resources/images/";

        if (foiGol) {
            imgPath += "gol";
        } else {
            imgPath += "def";
        }

        if (superior) {
            imgPath += "_sup";
        } else {
            imgPath += "_inf";
        }

        if (direita) {
            imgPath += "_dir";
        } else {
            imgPath += "_esq";
        }
        //exemplo: se foiGol = true; superior = true e direita = true, a imagem q vai aparecer na tela é gol_sup_dir.png
        imgPath += ".png";

        fundo.setIcon(new ImageIcon(imgPath));
    }

    public void setarTelaNormal() {
        fundo.setIcon(new ImageIcon("src/main/resources/images/background_jogo.png"));
    }

    public void setTextoPergunta(String texto) {
        pergunta.setText(formataTexto(texto, 800));
    }

    public void setTextoBotoes(String texto1, String texto2, String texto3, String texto4) {
        botaoSuperiorDir.setText(formataTexto(texto1, 200));
        botaoSuperiorEsq.setText(formataTexto(texto2, 200));
        botaoInferiorDir.setText(formataTexto(texto3, 200));
        botaoInferiorEsq.setText(formataTexto(texto4, 200));
    }

    public String formataTexto(String texto, int limitador) { //limitador faz pular pra proxima linha, a porra do netbeans n faz isso sozinho
        return String.format("<html><p style=\"width:%dpx; text-align: center \">" + texto + "</html>", limitador);

    }

    public void mostrarBotoesEPergunta(boolean b) { //pra esconder os botoes e a pegunta, e mostrar o botao próxima
        botaoSuperiorEsq.setVisible(b);
        botaoSuperiorDir.setVisible(b);
        botaoInferiorDir.setVisible(b);
        botaoInferiorEsq.setVisible(b);
        pergunta.setVisible(b);
        botaoProxima.setVisible(!b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pergunta = new javax.swing.JLabel();
        botaoSuperiorEsq = new javax.swing.JButton();
        botaoInferiorEsq = new javax.swing.JButton();
        botaoInferiorDir = new javax.swing.JButton();
        botaoSuperiorDir = new javax.swing.JButton();
        botaoProxima = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1760, 1760));
        setMinimumSize(new java.awt.Dimension(1760, 1760));
        setPreferredSize(new java.awt.Dimension(1760, 1760));
        getContentPane().setLayout(null);

        pergunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        pergunta.setText("TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA TEXTO PERGUNTA ");
        pergunta.setToolTipText("");
        pergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pergunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pergunta);
        pergunta.setBounds(460, 480, 1090, 230);

        botaoSuperiorEsq.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoSuperiorEsq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoSuperiorEsq.setText("1");
        botaoSuperiorEsq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoSuperiorEsq.setContentAreaFilled(false);
        botaoSuperiorEsq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSuperiorEsq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSuperiorEsq.setOpaque(false);
        botaoSuperiorEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSuperiorEsqActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSuperiorEsq);
        botaoSuperiorEsq.setBounds(370, 40, 630, 200);

        botaoInferiorEsq.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoInferiorEsq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoInferiorEsq.setText("3");
        botaoInferiorEsq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoInferiorEsq.setContentAreaFilled(false);
        botaoInferiorEsq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInferiorEsq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoInferiorEsq.setOpaque(false);
        botaoInferiorEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInferiorEsqActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInferiorEsq);
        botaoInferiorEsq.setBounds(370, 250, 630, 200);

        botaoInferiorDir.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoInferiorDir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoInferiorDir.setText("4");
        botaoInferiorDir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoInferiorDir.setContentAreaFilled(false);
        botaoInferiorDir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInferiorDir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoInferiorDir.setOpaque(false);
        botaoInferiorDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInferiorDirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInferiorDir);
        botaoInferiorDir.setBounds(1010, 250, 650, 200);

        botaoSuperiorDir.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoSuperiorDir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoSuperiorDir.setText("2");
        botaoSuperiorDir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoSuperiorDir.setContentAreaFilled(false);
        botaoSuperiorDir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSuperiorDir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSuperiorDir.setOpaque(false);
        botaoSuperiorDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSuperiorDirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSuperiorDir);
        botaoSuperiorDir.setBounds(1010, 40, 650, 200);

        botaoProxima.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoProxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botoes.png"))); // NOI18N
        botaoProxima.setText("PROXIMA PERGUNTA");
        botaoProxima.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoProxima.setContentAreaFilled(false);
        botaoProxima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProxima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProxima);
        botaoProxima.setBounds(690, 750, 320, 140);

        fundo.setBackground(new java.awt.Color(255, 255, 255));
        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_jogo.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSuperiorEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSuperiorEsqActionPerformed
        mostrarBotoesEPergunta(false);
        //codigo pra checar resposta
        //se nao for gol:
        setarTelaResposta(false, true, false);
        //se for gol:
        setarTelaResposta(true, true, false);
    }//GEN-LAST:event_botaoSuperiorEsqActionPerformed

    private void botaoSuperiorDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSuperiorDirActionPerformed
        mostrarBotoesEPergunta(false);
        //se nao for gol:
        setarTelaResposta(false, true, true);
        //se for gol:
        setarTelaResposta(true, true, true);
    }//GEN-LAST:event_botaoSuperiorDirActionPerformed

    private void botaoInferiorEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInferiorEsqActionPerformed
        mostrarBotoesEPergunta(false);
        //se nao for gol:
        setarTelaResposta(false, false, false);
        //se for gol:
        setarTelaResposta(true, false, false);
    }//GEN-LAST:event_botaoInferiorEsqActionPerformed

    private void botaoInferiorDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInferiorDirActionPerformed
        mostrarBotoesEPergunta(false);
        //se nao for gol:
        setarTelaResposta(false, false, true);
        //se for gol:
        setarTelaResposta(true, false, true);
    }//GEN-LAST:event_botaoInferiorDirActionPerformed

    private void botaoProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximaActionPerformed
        mostrarBotoesEPergunta(true);
        setarTelaNormal();
        //codigo pra ir pra proxima
    }//GEN-LAST:event_botaoProximaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInferiorDir;
    private javax.swing.JButton botaoInferiorEsq;
    private javax.swing.JButton botaoProxima;
    private javax.swing.JButton botaoSuperiorDir;
    private javax.swing.JButton botaoSuperiorEsq;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel pergunta;
    // End of variables declaration//GEN-END:variables
}

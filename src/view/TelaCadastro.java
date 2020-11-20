/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;

/**
 *
 * @author nathi
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaCadastro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        PainelPrincipal = new javax.swing.JPanel();
        cabeçalho = new javax.swing.JLabel();
        icone_usuário = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        cep = new javax.swing.JLabel();
        t_nome = new javax.swing.JTextField();
        t_email = new javax.swing.JTextField();
        t_cidade = new javax.swing.JTextField();
        t_cep = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        t_cpf = new javax.swing.JTextField();
        t_endereco = new javax.swing.JTextField();
        l_numero = new javax.swing.JLabel();
        t_complemento = new javax.swing.JTextField();
        j_nascimento = new javax.swing.JLabel();
        s_nascimento = new javax.swing.JSpinner();
        b_sair = new javax.swing.JButton();
        j_senha = new javax.swing.JLabel();
        j_confirmarSenha = new javax.swing.JLabel();
        pass_senha = new javax.swing.JPasswordField();
        pass_confirmar = new javax.swing.JPasswordField();
        c_robo = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        l_telefone = new javax.swing.JLabel();
        t_telefone = new javax.swing.JTextField();
        l_sexo = new javax.swing.JLabel();
        r_feminino = new javax.swing.JRadioButton();
        r_masculino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro");
        setAlwaysOnTop(true);
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        cabeçalho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cabeçalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeçalho.setText("Cadastre-se");
        cabeçalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        icone_usuário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícone-usuário.png"))); // NOI18N

        nomeCompleto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nomeCompleto.setText("Nome:");

        cpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cpf.setText("CPF:");

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.setText("E-mail:");

        endereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        endereco.setText("Endereço:");

        cidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cidade.setText("Cidade:");

        estado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        estado.setText("Estado:");

        cep.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cep.setText("CEP:");

        t_nome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomeActionPerformed(evt);
            }
        });

        t_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_emailActionPerformed(evt);
            }
        });

        t_cidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        t_cep.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "PR", "MG" }));

        t_cpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        t_endereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_enderecoActionPerformed(evt);
            }
        });

        l_numero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        l_numero.setText("Complemento:");

        t_complemento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        j_nascimento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        j_nascimento.setText("Data de nascimento:");

        s_nascimento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s_nascimento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1605705861693L), null, new java.util.Date(1605705861693L), java.util.Calendar.YEAR));
        s_nascimento.setToolTipText("Dia");

        b_sair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b_sair.setText("Sair");

        j_senha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        j_senha.setText("Senha:");

        j_confirmarSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        j_confirmarSenha.setText("Confirmar senha:");

        pass_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_confirmarActionPerformed(evt);
            }
        });

        c_robo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        c_robo.setText("Não sou um robô");
        c_robo.setBorder(null);
        c_robo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_roboActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Efetuar login em conta existente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        l_telefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        l_telefone.setText("Telefone:");

        t_telefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t_telefone.setText("(00)00000-0000");
        t_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_telefoneActionPerformed(evt);
            }
        });

        l_sexo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        l_sexo.setText("Sexo:");

        r_feminino.setBackground(new java.awt.Color(255, 255, 255));
        r_feminino.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        r_feminino.setText("Feminino");

        r_masculino.setBackground(new java.awt.Color(255, 255, 255));
        r_masculino.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        r_masculino.setText("Masculino");

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(icone_usuário)
                        .addGap(18, 18, 18)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(183, 183, 183))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(t_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(j_nascimento)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(s_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(t_nome)))
                                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(l_telefone, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(30, 30, 30)
                                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(t_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(l_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(r_feminino)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(r_masculino))
                                                    .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(t_endereco, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(t_email, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                                            .addComponent(t_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(estado)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l_numero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(t_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_sair)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_robo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j_confirmarSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j_senha, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(pass_confirmar))
                .addGap(213, 213, 213))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_sair)
                .addGap(34, 34, 34)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addComponent(icone_usuário)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeCompleto)
                            .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j_nascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_telefone)
                            .addComponent(l_sexo)
                            .addComponent(r_feminino)
                            .addComponent(r_masculino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco)
                            .addComponent(t_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_numero)
                            .addComponent(t_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j_senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j_confirmarSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_robo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c_roboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_roboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_roboActionPerformed

    private void pass_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_confirmarActionPerformed

    private void t_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_emailActionPerformed

    private void t_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nomeActionPerformed

    private void t_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_telefoneActionPerformed

    private void t_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_enderecoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton b_sair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox c_robo;
    private javax.swing.JLabel cabeçalho;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel icone_usuário;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel j_confirmarSenha;
    private javax.swing.JLabel j_nascimento;
    private javax.swing.JLabel j_senha;
    private javax.swing.JLabel l_numero;
    private javax.swing.JLabel l_sexo;
    private javax.swing.JLabel l_telefone;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JPasswordField pass_confirmar;
    private javax.swing.JPasswordField pass_senha;
    private javax.swing.JRadioButton r_feminino;
    private javax.swing.JRadioButton r_masculino;
    private javax.swing.JSpinner s_nascimento;
    private javax.swing.JTextField t_cep;
    private javax.swing.JTextField t_cidade;
    private javax.swing.JTextField t_complemento;
    private javax.swing.JTextField t_cpf;
    private javax.swing.JTextField t_email;
    private javax.swing.JTextField t_endereco;
    private javax.swing.JTextField t_nome;
    private javax.swing.JTextField t_telefone;
    // End of variables declaration//GEN-END:variables
}

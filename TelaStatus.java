/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author nathi
 */
public class TelaStatus extends javax.swing.JFrame {

    /**
     * Creates new form TelaStatus
     */
    public TelaStatus() {
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

        painelDenuncias = new javax.swing.JPanel();
        tabelaStatus = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoPerfil = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Status");
        setBackground(new java.awt.Color(255, 255, 255));

        painelDenuncias.setBackground(new java.awt.Color(255, 255, 255));

        tabelaStatus.setBackground(new java.awt.Color(255, 255, 255));
        tabelaStatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tabelaStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabelaStatus.setText("Suas denúncias ");
        tabelaStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoSair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoSair.setText("Sair");

        botaoPerfil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botaoPerfil.setText("Perfil");

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Endereço", "Cep", "Descrição", "Status"
            }
        ));
        scroll.setViewportView(jTable2);

        javax.swing.GroupLayout painelDenunciasLayout = new javax.swing.GroupLayout(painelDenuncias);
        painelDenuncias.setLayout(painelDenunciasLayout);
        painelDenunciasLayout.setHorizontalGroup(
            painelDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDenunciasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDenunciasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDenunciasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoPerfil)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDenunciasLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        painelDenunciasLayout.setVerticalGroup(
            painelDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDenunciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(botaoSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 paineldenuncias} catch (InpaineldenunciastionException ex) {
            java.util.logging.Logger.getLogger(TelaStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoSair;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel painelDenuncias;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel tabelaStatus;
    // End of variables declaration//GEN-END:variables
}

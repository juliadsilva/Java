/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author julin
 */
public class Cadastroview extends javax.swing.JFrame {

    /**
     * Creates new form Cadastroview
     */
    
    DefaultTableModel dtm;
    
    public Cadastroview() {
        initComponents();
        this.setName("Loja Virtual");
        this.setLocationRelativeTo(null);
        dtm = (DefaultTableModel) jTable.getModel();
        ler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDesconto = new javax.swing.ButtonGroup();
        panelTela = new javax.swing.JPanel();
        tfNome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        tf_Codigo = new javax.swing.JTextField();
        tf_Preco = new javax.swing.JTextField();
        jrb_cinco = new javax.swing.JRadioButton();
        jrb_dez = new javax.swing.JRadioButton();
        jrb_quinze = new javax.swing.JRadioButton();
        btnAdiconar = new javax.swing.JButton();
        jcb_Setor = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTela.setBackground(new java.awt.Color(0, 0, 0));

        tfNome.setBackground(new java.awt.Color(255, 255, 255));
        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel1.setText("Nome");

        jLabel2.setText("Código do Produto");

        jLabel3.setText("Preço");

        jLabel4.setText("Setor");

        jLabel5.setText("Desconto");

        tf_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CodigoActionPerformed(evt);
            }
        });

        bgDesconto.add(jrb_cinco);
        jrb_cinco.setText("5%");
        jrb_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_cincoActionPerformed(evt);
            }
        });

        bgDesconto.add(jrb_dez);
        jrb_dez.setText("10%");
        jrb_dez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_dezActionPerformed(evt);
            }
        });

        bgDesconto.add(jrb_quinze);
        jrb_quinze.setText("15%");

        btnAdiconar.setBackground(new java.awt.Color(0, 204, 204));
        btnAdiconar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdiconar.setText("Adiconar");
        btnAdiconar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiconarActionPerformed(evt);
            }
        });

        jcb_Setor.setMaximumRowCount(6);
        jcb_Setor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrônico", "Livros", "Eletrodomésticos", "Móveis", "Brinquedos", "etc" }));
        jcb_Setor.setToolTipText("");
        jcb_Setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SetorActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(0, 204, 204));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tfNomeLayout = new javax.swing.GroupLayout(tfNome);
        tfNome.setLayout(tfNomeLayout);
        tfNomeLayout.setHorizontalGroup(
            tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_Preco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addComponent(tf_Codigo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_Nome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(39, 39, 39)
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_Setor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tfNomeLayout.createSequentialGroup()
                        .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tfNomeLayout.createSequentialGroup()
                                .addComponent(jrb_cinco)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_dez)
                                .addGap(18, 18, 18)
                                .addComponent(jrb_quinze))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(tfNomeLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnAdiconar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tfNomeLayout.setVerticalGroup(
            tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_Setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrb_cinco)
                    .addComponent(jrb_dez)
                    .addComponent(jrb_quinze))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tfNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdiconar)
                    .addComponent(btnLimpar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos em Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        jLabel6.setText("Quantidade");

        quantidade.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        quantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidade.setText("0");
        quantidade.setToolTipText("");
        quantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnListar.setBackground(new java.awt.Color(0, 204, 204));
        btnListar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jTable.setAutoCreateRowSorter(true);
        jTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Codigo", "Setor", "Preço", "Desconto"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
        panelTela.setLayout(panelTelaLayout);
        panelTelaLayout.setHorizontalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelTelaLayout.setVerticalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CodigoActionPerformed

    private void jrb_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_cincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_cincoActionPerformed

    private void jrb_dezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_dezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_dezActionPerformed

    private void btnAdiconarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiconarActionPerformed
        
        String nome = tf_Nome.getText();
        String preco = tf_Preco.getText();
        String codigo = tf_Codigo.getText();
        String setor = " ";
        
        String desconto = null;
        if(jrb_cinco.isSelected()){
            desconto = "5%";
        }else if(jrb_dez.isSelected()){
            desconto = "10%";
        }else{ 
            desconto = "15%";
        } 
       
        ProdutoController.addProduto(nome, preco, setor, codigo, desconto);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
    }//GEN-LAST:event_btnAdiconarActionPerformed

    private void jcb_SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_SetorActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        tf_Nome.setText(" ");
        tf_Preco.setText(" ");
        tf_Codigo.setText(" ");
        bgDesconto.clearSelection();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       ler();
    }//GEN-LAST:event_btnListarActionPerformed
    
    private void ler(){
        dtm.setRowCount(0);
        for(Produto produto : ProdutoController.listarPrdutos()){
            dtm.addRow(new Object[]{
                produto.getNome(), produto.getCodigo(), produto.getSetor(), produto.getPreco(), produto.getDesconto()
            });
        }
        quantidade.setText(Integer.toString(dtm.getRowCount()));
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
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastroview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastroview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDesconto;
    private javax.swing.JButton btnAdiconar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> jcb_Setor;
    private javax.swing.JRadioButton jrb_cinco;
    private javax.swing.JRadioButton jrb_dez;
    private javax.swing.JRadioButton jrb_quinze;
    private javax.swing.JPanel panelTela;
    private javax.swing.JLabel quantidade;
    private javax.swing.JPanel tfNome;
    private javax.swing.JTextField tf_Codigo;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_Preco;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Cat;

/**
 *
 * @author Julia
 * https://github.com/juliadsilva
 */

public class MainView extends javax.swing.JFrame {

    //Numero maximo de gatos que podem ser criados
    private int MAX_CAT_NUMBER = 5;
    private int catCounter = 0;

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        this.setTitle("Jump of The Cat");
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ctrlPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        addCatButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        jsair = new javax.swing.JButton();
        bgImagePanel = new javax.swing.JPanel();
        bgImageLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 204, 204));

        ctrlPanel.setBackground(new java.awt.Color(0, 0, 0));
        ctrlPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ctrlPanel.setToolTipText("");
        ctrlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 51, 204));
        titleLabel.setText("The Jump of The Cat");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addCatButton.setBackground(new java.awt.Color(255, 255, 255));
        addCatButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addCatButton.setForeground(new java.awt.Color(255, 51, 153));
        addCatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cat-black-face.png"))); // NOI18N
        addCatButton.setText("Cat cat = new Cat( );");
        addCatButton.setFocusCycleRoot(true);
        addCatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCat(evt);
            }
        });

        catTable.setAutoCreateRowSorter(true);
        catTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        catTable.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Cor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        catTable.setToolTipText("");
        catTable.setAlignmentX(0.0F);
        catTable.setAlignmentY(0.0F);
        catTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        catTable.setCellSelectionEnabled(true);
        catTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        catTable.setFocusable(false);
        catTable.setGridColor(new java.awt.Color(255, 51, 153));
        catTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        catTable.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(catTable);
        catTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jsair.setBackground(new java.awt.Color(255, 255, 255));
        jsair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jsair.setText("Sair");
        jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ctrlPanelLayout = new javax.swing.GroupLayout(ctrlPanel);
        ctrlPanel.setLayout(ctrlPanelLayout);
        ctrlPanelLayout.setHorizontalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctrlPanelLayout.createSequentialGroup()
                .addGroup(ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ctrlPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ctrlPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jsair)))
                .addGap(34, 34, 34))
        );
        ctrlPanelLayout.setVerticalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(addCatButton)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jsair)
                .addContainerGap())
        );

        bgImagePanel.setBackground(new java.awt.Color(0, 0, 0));

        bgImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outrspc5.gif"))); // NOI18N

        javax.swing.GroupLayout bgImagePanelLayout = new javax.swing.GroupLayout(bgImagePanel);
        bgImagePanel.setLayout(bgImagePanelLayout);
        bgImagePanelLayout.setHorizontalGroup(
            bgImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgImagePanelLayout.setVerticalGroup(
            bgImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bgImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Botão para adicionar cats na aplicação
    private void addCat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCat
        if (catCounter < MAX_CAT_NUMBER) {
            this.changeColorsJTable();
            this.bgImageLabel.add(addCatJlabel());
            catCounter++;
        } else {
            JOptionPane.showMessageDialog(null, "Ja tem gatinho de mais!", "MINHAU!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addCat
    
    // Botão para sair da aplicação
    private void jsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jsairActionPerformed

    public JTable changeColorsJTable() {
        catTable.getTableHeader().setBackground(java.awt.Color.pink);
        return catTable;
    }

    public JLabel addCatJlabel() {

        String imgPath = getRandomImage();
        ImageIcon icon = new ImageIcon(imgPath);
        
        Cat cat = new Cat(icon);
        catTable.setValueAt(cat.getName(), catCounter, 0);
        catTable.setValueAt(getCatColor(imgPath), catCounter, 1);
        cat.setSize(80, 85);
        cat.setVisible(true);
        this.add(cat);
        return cat;
    }

    public String getCatColor(String imgPath) {
        String color;
        if (imgPath.contains("1")) {
            color = "Verde";
        } else if (imgPath.contains("2")) {
            color = "Laranja";
        } else {
            color = "Rosa";
        }
        return color;
    }

    public String getRandomImage() {
        Random random = new Random();
        String prefix = "./src/images/cat0";
        String imageAddrs = prefix.concat(Integer.toString(random.nextInt(3) + 1)).concat(".png");
        return imageAddrs;
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCatButton;
    private javax.swing.JLabel bgImageLabel;
    private javax.swing.JPanel bgImagePanel;
    private javax.swing.JTable catTable;
    private javax.swing.JPanel ctrlPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jsair;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

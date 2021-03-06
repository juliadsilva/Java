/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.view;

import br.inatel.meaw.controller.MySQLConnection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.inatel.meaw.model.Musica;
import br.inatel.meaw.model.DAO.UserComumDAO;
import br.inatel.meaw.utils.Constants;
        
/**
 *
 * @author julia e rafaela
 */
public class Musicaview extends javax.swing.JFrame {
    UserComumDAO usercomumDAO = new UserComumDAO();
    MySQLConnection mySQLConnection = new MySQLConnection();
    DefaultTableModel dtmM;
    
    
    /**
     * Creates new form FramaInicil
     */
    public Musicaview() {
        initComponents();
        this.setTitle(Constants.TITLE);
        this.setLocationRelativeTo(null);
        mySQLConnection.connectMySQL();      
        dtmM = (DefaultTableModel) tableMusica.getModel();
        lerMusicas();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroupFilter = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelInicial = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        jLabel_OP = new javax.swing.JLabel();
        rbtNome = new javax.swing.JRadioButton();
        rbtGenero = new javax.swing.JRadioButton();
        rbtArtista = new javax.swing.JRadioButton();
        rbtAno = new javax.swing.JRadioButton();
        btnBuscarMusica = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableMusica = new javax.swing.JTable();
        ebuscarMusica = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        reproduzirMusica = new javax.swing.JTextField();
        btnReproduzirMusica = new javax.swing.JButton();
        reproduzirArtista = new javax.swing.JTextField();
        reproduzirGenero = new javax.swing.JTextField();
        reproduzirAno = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        title2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jScrollPane1.setViewportView(jEditorPane1);

        jScrollPane3.setViewportView(jTextPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInicial.setBackground(new java.awt.Color(169, 210, 254));
        panelInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelInicial.setForeground(new java.awt.Color(169, 210, 254));

        painelCadastro.setBackground(new java.awt.Color(169, 210, 254));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 2, true), "Buscar Musica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(247, 37, 133))); // NOI18N
        painelCadastro.setForeground(new java.awt.Color(247, 37, 133));
        painelCadastro.setName("Cadastro"); // NOI18N

        jLabel_OP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_OP.setForeground(new java.awt.Color(247, 37, 133));
        jLabel_OP.setText("Opções de Busca:");

        rbtNome.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroupFilter.add(rbtNome);
        rbtNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtNome.setForeground(new java.awt.Color(247, 37, 133));
        rbtNome.setText("Nome");
        rbtNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtNome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtGenero.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroupFilter.add(rbtGenero);
        rbtGenero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtGenero.setForeground(new java.awt.Color(247, 37, 133));
        rbtGenero.setText("Genero");
        rbtGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtGenero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtArtista.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroupFilter.add(rbtArtista);
        rbtArtista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtArtista.setForeground(new java.awt.Color(247, 37, 133));
        rbtArtista.setText("Artista");
        rbtArtista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtArtista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtAno.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroupFilter.add(rbtAno);
        rbtAno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtAno.setForeground(new java.awt.Color(247, 37, 133));
        rbtAno.setText("Ano");
        rbtAno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtAno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnBuscarMusica.setBackground(new java.awt.Color(169, 210, 254));
        btnBuscarMusica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscarMusica.setForeground(new java.awt.Color(247, 37, 133));
        btnBuscarMusica.setText("Buscar");
        btnBuscarMusica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarMusica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMusica.setOpaque(false);
        btnBuscarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMusicaActionPerformed(evt);
            }
        });

        tableMusica.setBackground(new java.awt.Color(169, 210, 254));
        tableMusica.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Artista", "Genero", "Tempo", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMusica.setGridColor(new java.awt.Color(255, 255, 255));
        tableMusica.setSelectionBackground(new java.awt.Color(114, 9, 183));
        jScrollPane4.setViewportView(tableMusica);

        ebuscarMusica.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ebuscarMusica.setForeground(new java.awt.Color(114, 9, 183));
        ebuscarMusica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        btnReset.setBackground(new java.awt.Color(169, 210, 254));
        btnReset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(247, 37, 133));
        btnReset.setText("Resetar");
        btnReset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setOpaque(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_OP)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(rbtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(rbtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(ebuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_OP)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNome)
                    .addComponent(rbtArtista)
                    .addComponent(rbtGenero)
                    .addComponent(rbtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ebuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(169, 210, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 2, true), "Reproduzir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(247, 37, 133))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(247, 37, 133));

        reproduzirMusica.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        reproduzirMusica.setForeground(new java.awt.Color(114, 9, 183));
        reproduzirMusica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reproduzirMusica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        btnReproduzirMusica.setBackground(new java.awt.Color(169, 210, 254));
        btnReproduzirMusica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnReproduzirMusica.setForeground(new java.awt.Color(247, 37, 133));
        btnReproduzirMusica.setText("Reproduzir");
        btnReproduzirMusica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReproduzirMusica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReproduzirMusica.setOpaque(false);
        btnReproduzirMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduzirMusicaActionPerformed(evt);
            }
        });

        reproduzirArtista.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        reproduzirArtista.setForeground(new java.awt.Color(114, 9, 183));
        reproduzirArtista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reproduzirArtista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        reproduzirGenero.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        reproduzirGenero.setForeground(new java.awt.Color(114, 9, 183));
        reproduzirGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reproduzirGenero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        reproduzirAno.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        reproduzirAno.setForeground(new java.awt.Color(114, 9, 183));
        reproduzirAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reproduzirAno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReproduzirMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reproduzirAno, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reproduzirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reproduzirArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reproduzirMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(reproduzirMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(reproduzirArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(reproduzirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(reproduzirAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnReproduzirMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSair.setText("X");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        title2.setBackground(new java.awt.Color(247, 37, 133));
        title2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(247, 37, 133));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Musica");
        title2.setToolTipText("");
        title2.setFocusable(false);
        title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title1.setBackground(new java.awt.Color(169, 210, 254));
        title1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(247, 37, 133));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("MEAW");
        title1.setToolTipText("");
        title1.setFocusable(false);
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icon2.setBackground(new java.awt.Color(247, 37, 133));
        icon2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        icon2.setForeground(new java.awt.Color(247, 37, 133));
        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/meaw/images/cat-black-face.png"))); // NOI18N
        icon2.setToolTipText("");
        icon2.setFocusable(false);
        icon2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icon1.setBackground(new java.awt.Color(169, 210, 254));
        icon1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        icon1.setForeground(new java.awt.Color(169, 210, 254));
        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/meaw/images/cat-black-face.png"))); // NOI18N
        icon1.setToolTipText("");
        icon1.setFocusable(false);
        icon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelInicialLayout = new javax.swing.GroupLayout(panelInicial);
        panelInicial.setLayout(panelInicialLayout);
        panelInicialLayout.setHorizontalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInicialLayout.createSequentialGroup()
                        .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(panelInicialLayout.createSequentialGroup()
                        .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInicialLayout.setVerticalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair))
                    .addComponent(icon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReproduzirMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduzirMusicaActionPerformed
        int linha = tableMusica.getSelectedRow();
        if (linha != -1){
            
                String nomeMusica = tableMusica.getValueAt(linha, 1).toString();
                String nomeArtista = tableMusica.getValueAt(linha, 2).toString();
                String genero = tableMusica.getValueAt(linha, 3).toString();
                String ano = tableMusica.getValueAt(linha, 5).toString();
                
                reproduzirMusica.setText(nomeMusica);
                reproduzirArtista.setText(nomeArtista);
                reproduzirGenero.setText(genero);
                reproduzirAno.setText(ano);
                
                limparCampos();
            
        }
        else  JOptionPane.showMessageDialog(this, "Selecione uma linha!", "ERRO!", JOptionPane.WARNING_MESSAGE);      
    }//GEN-LAST:event_btnReproduzirMusicaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Cadastroview cadastroview = new Cadastroview();
        this.dispose();
        cadastroview.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnBuscarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMusicaActionPerformed
       
        String filter = "";
        String value = "";
                
        if(rbtGenero.isSelected())
            filter = Constants.GENERO;
        else if(rbtAno.isSelected())
            filter = Constants.ANO;
        else if(rbtArtista.isSelected())
            filter = Constants.NOMEARTISTA;
        else if(rbtNome.isSelected())
            filter = Constants.NOMEMUSICA;
        
        value = ebuscarMusica.getText();
      
        dtmM.setRowCount(0);
        
        for (Musica musica : usercomumDAO.buscarMusica(mySQLConnection, filter, value)) {        
            dtmM.addRow(new Object[]{
                musica.getIdMusica(), musica.getNomeMusica(), musica.getnomeArtista(), musica.getGenero(), musica.getTempoDuracao(), musica.getAno()
            });
        }
    }//GEN-LAST:event_btnBuscarMusicaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnResetActionPerformed
 
    private void limparCampos() {
        ebuscarMusica.setText("");
        buttonGroupFilter.clearSelection();
        tableMusica.clearSelection();
        lerMusicas();
    }
    
    private void lerMusicas(){
        dtmM.setRowCount(0);
                
        for (Musica musica : usercomumDAO.buscarMusicas(mySQLConnection)) {        
            dtmM.addRow(new Object[]{
                musica.getIdMusica(), musica.getNomeMusica(), musica.getnomeArtista(), musica.getGenero(), musica.getTempoDuracao(), musica.getAno()
            });
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMusica;
    private javax.swing.JButton btnReproduzirMusica;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroupFilter;
    private javax.swing.JTextField ebuscarMusica;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel_OP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JRadioButton rbtAno;
    private javax.swing.JRadioButton rbtArtista;
    private javax.swing.JRadioButton rbtGenero;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTextField reproduzirAno;
    private javax.swing.JTextField reproduzirArtista;
    private javax.swing.JTextField reproduzirGenero;
    private javax.swing.JTextField reproduzirMusica;
    private javax.swing.JTable tableMusica;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables

    
}

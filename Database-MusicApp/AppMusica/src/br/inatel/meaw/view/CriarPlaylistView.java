/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.meaw.view;
import br.inatel.meaw.controller.MySQLConnection;
import br.inatel.meaw.exception.CampoVazioException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.inatel.meaw.model.Musica;
import br.inatel.meaw.model.DAO.UserPremiumDAO;
import br.inatel.meaw.model.Playlist;
import br.inatel.meaw.utils.Constants;
        
/**
 *
 * @author julia e rafaela
 */
public class CriarPlaylistView extends javax.swing.JFrame {
    UserPremiumDAO userpremiumcomumDAO = new UserPremiumDAO();
    MySQLConnection mySQLConnection = new MySQLConnection();
    DefaultTableModel dtmM;
    DefaultTableModel dtmA;
    int idUsuario;
   
    public CriarPlaylistView() {
        initComponents();
        this.setTitle(Constants.TITLE);
        this.setLocationRelativeTo(null);
        mySQLConnection.connectMySQL();   
        idUsuario = Constants.login;
        dtmM = (DefaultTableModel) tableMusicas.getModel(); 
        dtmA = (DefaultTableModel) tableAddMusicas.getModel(); 
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelInicial = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        jLabel_NOME = new javax.swing.JLabel();
        rbtNome = new javax.swing.JRadioButton();
        rbtGenero = new javax.swing.JRadioButton();
        rbtArtista = new javax.swing.JRadioButton();
        rbtAno = new javax.swing.JRadioButton();
        btnBuscarMusica = new javax.swing.JButton();
        ebuscarMusica = new javax.swing.JTextField();
        btnSelecionarMusica = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableMusicas = new javax.swing.JTable();
        btnResetar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCriarPlay = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableAddMusicas = new javax.swing.JTable();
        enomePlay = new javax.swing.JTextField();
        jLabel_NOME1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jScrollPane1.setViewportView(jEditorPane1);

        jScrollPane3.setViewportView(jTextPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInicial.setBackground(new java.awt.Color(169, 210, 254));
        panelInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelInicial.setForeground(new java.awt.Color(169, 210, 254));

        painelCadastro.setBackground(new java.awt.Color(169, 210, 254));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 2, true), "Musica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(247, 37, 133))); // NOI18N
        painelCadastro.setForeground(new java.awt.Color(247, 37, 133));
        painelCadastro.setName("Cadastro"); // NOI18N

        jLabel_NOME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_NOME.setForeground(new java.awt.Color(247, 37, 133));
        jLabel_NOME.setText("Opções de Busca:");

        rbtNome.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroup1.add(rbtNome);
        rbtNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtNome.setForeground(new java.awt.Color(247, 37, 133));
        rbtNome.setText("Nome");
        rbtNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtNome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtGenero.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroup1.add(rbtGenero);
        rbtGenero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtGenero.setForeground(new java.awt.Color(247, 37, 133));
        rbtGenero.setText("Genero");
        rbtGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtGenero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtArtista.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroup1.add(rbtArtista);
        rbtArtista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbtArtista.setForeground(new java.awt.Color(247, 37, 133));
        rbtArtista.setText("Artista");
        rbtArtista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbtArtista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        rbtAno.setBackground(new java.awt.Color(169, 210, 254));
        buttonGroup1.add(rbtAno);
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

        ebuscarMusica.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ebuscarMusica.setForeground(new java.awt.Color(114, 9, 183));
        ebuscarMusica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        btnSelecionarMusica.setBackground(new java.awt.Color(169, 210, 254));
        btnSelecionarMusica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSelecionarMusica.setForeground(new java.awt.Color(247, 37, 133));
        btnSelecionarMusica.setText("Selecionar");
        btnSelecionarMusica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSelecionarMusica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelecionarMusica.setOpaque(false);
        btnSelecionarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarMusicaActionPerformed(evt);
            }
        });

        tableMusicas.setBackground(new java.awt.Color(169, 210, 254));
        tableMusicas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableMusicas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMusicas.setGridColor(new java.awt.Color(255, 255, 255));
        tableMusicas.setSelectionBackground(new java.awt.Color(114, 9, 183));
        jScrollPane5.setViewportView(tableMusicas);

        btnResetar.setBackground(new java.awt.Color(169, 210, 254));
        btnResetar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetar.setForeground(new java.awt.Color(247, 37, 133));
        btnResetar.setText("Resetar");
        btnResetar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnResetar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResetar.setOpaque(false);
        btnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetarActionPerformed(evt);
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
                            .addComponent(jLabel_NOME)
                            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastroLayout.createSequentialGroup()
                                    .addComponent(ebuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastroLayout.createSequentialGroup()
                                    .addComponent(rbtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(rbtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(rbtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(btnResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSelecionarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_NOME)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNome)
                    .addComponent(rbtArtista)
                    .addComponent(rbtGenero)
                    .addComponent(rbtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ebuscarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(169, 210, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 2, true), "Adicionadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(247, 37, 133))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(247, 37, 133));

        btnCriarPlay.setBackground(new java.awt.Color(169, 210, 254));
        btnCriarPlay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCriarPlay.setForeground(new java.awt.Color(247, 37, 133));
        btnCriarPlay.setText("Criar");
        btnCriarPlay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCriarPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriarPlay.setOpaque(false);
        btnCriarPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarPlayActionPerformed(evt);
            }
        });

        tableAddMusicas.setBackground(new java.awt.Color(169, 210, 254));
        tableAddMusicas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableAddMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Artista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAddMusicas.setGridColor(new java.awt.Color(255, 255, 255));
        tableAddMusicas.setSelectionBackground(new java.awt.Color(114, 9, 183));
        jScrollPane4.setViewportView(tableAddMusicas);

        enomePlay.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        enomePlay.setForeground(new java.awt.Color(114, 9, 183));
        enomePlay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enomePlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 37, 133), 1, true));

        jLabel_NOME1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_NOME1.setForeground(new java.awt.Color(247, 37, 133));
        jLabel_NOME1.setText("Nome - Playlist");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnCriarPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel_NOME1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enomePlay)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel_NOME1)
                .addGap(26, 26, 26)
                .addComponent(enomePlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCriarPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel4.setBackground(new java.awt.Color(247, 37, 133));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 37, 133));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Criar Play");
        jLabel4.setToolTipText("");
        jLabel4.setFocusable(false);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setBackground(new java.awt.Color(169, 210, 254));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(247, 37, 133));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MEAW");
        jLabel5.setToolTipText("");
        jLabel5.setFocusable(false);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(247, 37, 133));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 37, 133));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/meaw/images/cat-black-face.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setFocusable(false);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setBackground(new java.awt.Color(169, 210, 254));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 210, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/meaw/images/cat-black-face.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelInicialLayout = new javax.swing.GroupLayout(panelInicial);
        panelInicial.setLayout(panelInicialLayout);
        panelInicialLayout.setHorizontalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicialLayout.createSequentialGroup()
                        .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelInicialLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(24, 24, 24))))
        );
        panelInicialLayout.setVerticalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarPlayActionPerformed
        
        String nomePlay = null;
        Playlist play = new Playlist(); 
        
        try{
            nomePlay = enomePlay.getText();
            userpremiumcomumDAO.insertPlaylist(mySQLConnection, nomePlay, idUsuario);
            play.setNomePlay(nomePlay); 
            addMusicaPlay(play);
            
            Playlistview playlistView = new Playlistview();
            this.dispose();
            playlistView.setVisible(true);
        }
        catch(CampoVazioException e){
            JOptionPane.showMessageDialog(this, "Insira o nome da Playlist", "ERRO!", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_btnCriarPlayActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Playlistview playlistView = new Playlistview();
        this.dispose();
        playlistView.setVisible(true);
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
                
        for (Musica musica : userpremiumcomumDAO.buscarMusica(mySQLConnection, filter, value)) {        
            dtmM.addRow(new Object[]{
                musica.getIdMusica(), musica.getNomeMusica(), musica.getnomeArtista(), musica.getGenero(), musica.getTempoDuracao(), musica.getAno()
            });
        }
    }//GEN-LAST:event_btnBuscarMusicaActionPerformed

    private void btnSelecionarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarMusicaActionPerformed
        int linha = tableMusicas.getSelectedRow();
        if (linha != -1){
            String idMusica = tableMusicas.getValueAt(linha, 0).toString();
            String nomeMusica = tableMusicas.getValueAt(linha, 1).toString();
            String nomeArtista = tableMusicas.getValueAt(linha, 2).toString();
            
            
            dtmA.addRow(new Object[]{
                idMusica, nomeMusica, nomeArtista
            });
            limparCampos();
        }
        else  JOptionPane.showMessageDialog(this, "Selecione uma linha!", "ERRO!", JOptionPane.WARNING_MESSAGE);   
    }//GEN-LAST:event_btnSelecionarMusicaActionPerformed

    private void btnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnResetarActionPerformed
 
    private void limparCampos() {
        ebuscarMusica.setText("");
        buttonGroup1.clearSelection();
        tableMusicas.clearSelection();
        lerMusicas();
    }
            
    private void lerMusicas(){
        dtmM.setRowCount(0);
                
        for (Musica musica : userpremiumcomumDAO.buscarMusicas(mySQLConnection)) {    
            dtmM.addRow(new Object[]{
                musica.getIdMusica(), musica.getNomeMusica(), musica.getnomeArtista(), musica.getGenero(), musica.getTempoDuracao(), musica.getAno()
            });
        }
    }
    
    private void addMusicaPlay(Playlist play){
       
        int idPlay;
        String idMusica;
        int linha = 0;
        
        idPlay = userpremiumcomumDAO.idPlaylist(mySQLConnection, play);
        
        while(linha != dtmA.getRowCount()){
            idMusica = tableAddMusicas.getValueAt(linha, 0).toString();
            userpremiumcomumDAO.insertMusicaPlaylist(mySQLConnection, idPlay, idMusica);
            linha++;           
        }
        
        userpremiumcomumDAO.quantidadeMusica(mySQLConnection, idPlay);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMusica;
    private javax.swing.JButton btnCriarPlay;
    private javax.swing.JButton btnResetar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSelecionarMusica;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ebuscarMusica;
    private javax.swing.JTextField enomePlay;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_NOME;
    private javax.swing.JLabel jLabel_NOME1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JRadioButton rbtAno;
    private javax.swing.JRadioButton rbtArtista;
    private javax.swing.JRadioButton rbtGenero;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tableAddMusicas;
    private javax.swing.JTable tableMusicas;
    // End of variables declaration//GEN-END:variables

    
}
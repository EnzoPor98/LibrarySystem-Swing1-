package GUI;

import Class.Book;
import Class.Client;
import Class.Loan;
import Class.Sanction;
import Controller.BookJpaController;
import Controller.ClientJpaController;
import Controller.LoanJpaController;
import Controller.SanctionJpaController;
import Controller.exceptions.NonexistentEntityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enzo Portillo.
 */
public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        setLocationRelativeTo(null);
        hideBtns();
    }

    // ========================================================================
    // =========================================================== TABLE MODEL.
    // ========================================================================
    DefaultTableModel allTableModel = new DefaultTableModel();

    private void cleanModelTable() {
        allTableModel.setNumRows(0);
        allTableModel.setColumnCount(0);
    }

    // ========================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        booksBtn = new javax.swing.JLabel();
        clientsBtn = new javax.swing.JLabel();
        sanctionsBtn = new javax.swing.JLabel();
        loansBtn = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        Background_1 = new javax.swing.JLabel();
        tabbedPanel = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        booksPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bookAuthorF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        bookTitleF = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bookDateF = new javax.swing.JTextField();
        bookEditF = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        bookCategF = new javax.swing.JTextField();
        bookRefreshBtn = new javax.swing.JLabel();
        bookAddBtn = new javax.swing.JLabel();
        bookEditBtn = new javax.swing.JLabel();
        bookDeleteBtn = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bookSrchBox = new javax.swing.JComboBox<>();
        bookSrchBtn = new javax.swing.JLabel();
        bookSrchF = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        bookStockF = new javax.swing.JTextField();
        bookLoanBtn = new javax.swing.JLabel();
        bookBackBtn = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();
        clientsPanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        clientContactF = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        clientDniF = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        clientNameF = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        clientAdressF = new javax.swing.JTextField();
        clientAddBtn = new javax.swing.JLabel();
        clientEditBtn = new javax.swing.JLabel();
        clientDeleteBtn = new javax.swing.JLabel();
        clientRefreshBtn = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        clientSrchBox = new javax.swing.JComboBox<>();
        clientSrchF = new javax.swing.JTextField();
        clientLoanBtn = new javax.swing.JLabel();
        clientSanctionBtn = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        clientSrchBtn = new javax.swing.JLabel();
        clientBackBtn = new javax.swing.JLabel();
        Background3 = new javax.swing.JLabel();
        sanctionsPanel = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        sancSelectClientBtn = new javax.swing.JLabel();
        sancReasonF = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        refreshBtn = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        sancSrchF = new javax.swing.JTextField();
        sancSrchBtn = new javax.swing.JLabel();
        sanctionBtn = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        sancTable = new javax.swing.JTable();
        Background4 = new javax.swing.JLabel();
        loansPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loanViewAllBtn = new javax.swing.JLabel();
        loanSrchF = new javax.swing.JTextField();
        loanRtrnBtn = new javax.swing.JLabel();
        loanBtn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        loanSrchBox = new javax.swing.JComboBox<>();
        loanSrchBtn = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        loanDateC = new com.toedter.calendar.JDateChooser();
        loanRefreshBtn = new javax.swing.JLabel();
        loanClientL = new javax.swing.JLabel();
        loanSelectBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loanUpAmountL = new javax.swing.JLabel();
        loanBookL = new javax.swing.JLabel();
        loanAmountL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loanDwnAmountL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Background5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");
        setName("LibrarySystem"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(0, 0, 0));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        Logo.setText("¡ LIBRARY SYSTEM !");
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 100));

        homeBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(0, 0, 0));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        homeBtn.setText("       INICIO");
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 200, 60));

        booksBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        booksBtn.setForeground(new java.awt.Color(0, 0, 0));
        booksBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        booksBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Books.png"))); // NOI18N
        booksBtn.setText("      LIBROS");
        booksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booksBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        booksBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksBtnMouseClicked(evt);
            }
        });
        getContentPane().add(booksBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, 200, 60));

        clientsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientsBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clients.png"))); // NOI18N
        clientsBtn.setText("    CLIENTES");
        clientsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clientsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsBtnMouseClicked(evt);
            }
        });
        getContentPane().add(clientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 295, 200, 60));

        sanctionsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sanctionsBtn.setForeground(new java.awt.Color(0, 0, 0));
        sanctionsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sanctionsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sanctions.png"))); // NOI18N
        sanctionsBtn.setText("   SANCIONES");
        sanctionsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sanctionsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sanctionsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanctionsBtnMouseClicked(evt);
            }
        });
        getContentPane().add(sanctionsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 365, 200, 60));

        loansBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loansBtn.setForeground(new java.awt.Color(0, 0, 0));
        loansBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loansBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loans.png"))); // NOI18N
        loansBtn.setText("  PRESTAMOS");
        loansBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loansBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loansBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loansBtnMouseClicked(evt);
            }
        });
        getContentPane().add(loansBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 200, 60));

        exitBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(0, 0, 0));
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        exitBtn.setText("      SALIR");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 200, 65));

        Background_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_Panel.png"))); // NOI18N
        getContentPane().add(Background_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        tabbedPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbedPanel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("LIBRARY SYSTEM          -          PANEL DE INICIO           -           LIBRARY SYSTEM");
        homePanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 560));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Enzo Portillo | Contacto: Enzoarielportillo1@gmail.com | Todos los derechos reservados ©");
        homePanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 780, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        homePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -13, 810, 680));

        tabbedPanel.addTab("Inicio", homePanel);

        booksPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("¡ PANEL DE LIBROS !");
        booksPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("FECHA:");
        booksPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 60, 25));

        bookAuthorF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookAuthorF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookAuthorF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 520, 25));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("TITULO:");
        booksPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 25));

        bookTitleF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookTitleF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookTitleF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 710, 25));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("EDICION:");
        booksPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 25));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("AUTOR:");
        booksPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 25));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CATEGORIA/S:");
        booksPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, 25));

        bookDateF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookDateF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookDateF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 120, 25));

        bookEditF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookEditF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookEditF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 50, 25));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("STOCK:");
        booksPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 60, 25));

        bookCategF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookCategF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookCategF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 350, 25));

        bookRefreshBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookRefreshBtn.setForeground(new java.awt.Color(0, 0, 0));
        bookRefreshBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookRefreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        bookRefreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookRefreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookRefreshBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bookRefreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookRefreshBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookRefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 70, 60));

        bookAddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookAddBtn.setForeground(new java.awt.Color(0, 0, 0));
        bookAddBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        bookAddBtn.setText("AÑADIR ");
        bookAddBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookAddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bookAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookAddBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 130, 60));

        bookEditBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookEditBtn.setForeground(new java.awt.Color(0, 0, 0));
        bookEditBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookEditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
        bookEditBtn.setText("EDITAR");
        bookEditBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookEditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookEditBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bookEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookEditBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookEditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 130, 60));

        bookDeleteBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookDeleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        bookDeleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        bookDeleteBtn.setText("BORRAR");
        bookDeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookDeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookDeleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bookDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookDeleteBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, 60));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("BUSCADOR:");
        booksPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 90, 25));

        bookSrchBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookSrchBox.setForeground(new java.awt.Color(0, 0, 0));
        bookSrchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Titulo", "Autor", "Categoria" }));
        booksPanel.add(bookSrchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 120, 25));

        bookSrchBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookSrchBtn.setForeground(new java.awt.Color(0, 0, 0));
        bookSrchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookSrchBtn.setText("BUSCAR");
        bookSrchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookSrchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookSrchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bookSrchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSrchBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookSrchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 90, 25));

        bookSrchF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookSrchF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookSrchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 460, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        booksPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 780, 10));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Lista de libros...");
        booksPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, -1));

        bookTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bookTable.setForeground(new java.awt.Color(0, 0, 0));
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Autor", "Fecha P.", "Edicion", "Categoria", "Stock", "Disponible"
            }
        ));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        booksPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 780, 280));

        bookStockF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookStockF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksPanel.add(bookStockF, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 100, 25));

        bookLoanBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bookLoanBtn.setForeground(new java.awt.Color(0, 0, 0));
        bookLoanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookLoanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loan.png"))); // NOI18N
        bookLoanBtn.setText("SELECCIONAR");
        bookLoanBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookLoanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookLoanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookLoanBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookLoanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, 60));

        bookBackBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookBackBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        bookBackBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookBackBtnMouseClicked(evt);
            }
        });
        booksPanel.add(bookBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 60));

        Background2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        booksPanel.add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        tabbedPanel.addTab("Libros", booksPanel);

        clientsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("¡ PANEL DE CLIENTES !");
        clientsPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("CONTACTO:");
        clientsPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 90, 25));

        clientContactF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientContactF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientsPanel.add(clientContactF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 280, 25));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("DNI:");
        clientsPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 40, 25));

        clientDniF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientDniF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientsPanel.add(clientDniF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 210, 25));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("NOMBRE:");
        clientsPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 25));

        clientNameF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientNameF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientsPanel.add(clientNameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 400, 25));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("DIRECCION:");
        clientsPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 25));

        clientAdressF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientAdressF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientsPanel.add(clientAdressF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, 25));

        clientAddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientAddBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientAddBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        clientAddBtn.setText("AÑADIR");
        clientAddBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientAddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clientAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientAddBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 130, 60));

        clientEditBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientEditBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientEditBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientEditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit.png"))); // NOI18N
        clientEditBtn.setText("EDITAR");
        clientEditBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientEditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientEditBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clientEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientEditBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientEditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 130, 60));

        clientDeleteBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientDeleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientDeleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        clientDeleteBtn.setText("BORRAR");
        clientDeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientDeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientDeleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clientDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientDeleteBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 140, 60));

        clientRefreshBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientRefreshBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientRefreshBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientRefreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        clientRefreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientRefreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientRefreshBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clientRefreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientRefreshBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientRefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, 60));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("BUSCADOR:");
        clientsPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 90, 25));

        clientSrchBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientSrchBox.setForeground(new java.awt.Color(0, 0, 0));
        clientSrchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Nombre", "DNI", "Contacto" }));
        clientsPanel.add(clientSrchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 120, 25));

        clientSrchF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientSrchF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientsPanel.add(clientSrchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 370, 25));

        clientLoanBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientLoanBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientLoanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLoanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loan.png"))); // NOI18N
        clientLoanBtn.setText("SELECCIONAR");
        clientLoanBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientLoanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientLoanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientLoanBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientLoanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 190, 60));

        clientSanctionBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientSanctionBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientSanctionBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientSanctionBtn.setText("VER SANCIONES");
        clientSanctionBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientSanctionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientSanctionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clientSanctionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientSanctionBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientSanctionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 170, 25));

        clientTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clientTable.setForeground(new java.awt.Color(0, 0, 0));
        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "DNI", "Direccion", "Contacto", "Fecha Creacion", "Ult. Prestamo", "Sanciones"
            }
        ));
        clientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(clientTable);

        clientsPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 310));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        clientsPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 780, 10));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Lista de clientes...");
        clientsPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

        clientSrchBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientSrchBtn.setForeground(new java.awt.Color(0, 0, 0));
        clientSrchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientSrchBtn.setText("BUSCAR");
        clientSrchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientSrchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientSrchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clientSrchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientSrchBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientSrchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 80, 25));

        clientBackBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clientBackBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        clientBackBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clientBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientBackBtnMouseClicked(evt);
            }
        });
        clientsPanel.add(clientBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 60));

        Background3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        clientsPanel.add(Background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        tabbedPanel.addTab("Clientes", clientsPanel);

        sanctionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("¡ PANEL DE SANCIONES !");
        sanctionsPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("MOTIVO:");
        sanctionsPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 25));

        sancSelectClientBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sancSelectClientBtn.setForeground(new java.awt.Color(0, 0, 0));
        sancSelectClientBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sancSelectClientBtn.setText("SELECCIONAR CLIENTE");
        sancSelectClientBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sancSelectClientBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sancSelectClientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sancSelectClientBtnMouseClicked(evt);
            }
        });
        sanctionsPanel.add(sancSelectClientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 280, 25));

        sancReasonF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sancReasonF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sanctionsPanel.add(sancReasonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 280, 25));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        sanctionsPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 780, 10));

        refreshBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 0, 0));
        refreshBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        refreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshBtnMouseClicked(evt);
            }
        });
        sanctionsPanel.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 70, 70));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("Lista de sanciones...");
        sanctionsPanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 760, -1));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("BUSCADOR:");
        sanctionsPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 90, 25));

        sancSrchF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sancSrchF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sanctionsPanel.add(sancSrchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 340, 25));

        sancSrchBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sancSrchBtn.setForeground(new java.awt.Color(0, 0, 0));
        sancSrchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sancSrchBtn.setText("BUSCAR POR DNI");
        sancSrchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sancSrchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sancSrchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sancSrchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sancSrchBtnMouseClicked(evt);
            }
        });
        sanctionsPanel.add(sancSrchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 140, 25));

        sanctionBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sanctionBtn.setForeground(new java.awt.Color(0, 0, 0));
        sanctionBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sanctionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sanctions.png"))); // NOI18N
        sanctionBtn.setText("SANCIONAR CLIENTE");
        sanctionBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sanctionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sanctionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sanctionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanctionBtnMouseClicked(evt);
            }
        });
        sanctionsPanel.add(sanctionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 230, 70));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("CLIENTE:");
        sanctionsPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 25));

        sancTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sancTable.setForeground(new java.awt.Color(0, 0, 0));
        sancTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "DNI", "Motivo de Sancion", "Fecha"
            }
        ));
        jScrollPane5.setViewportView(sancTable);

        sanctionsPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 780, 390));

        Background4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        sanctionsPanel.add(Background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        tabbedPanel.addTab("Sanciones", sanctionsPanel);

        loansPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Lista de prestamos activos...");
        loansPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 490, -1));

        loanViewAllBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanViewAllBtn.setForeground(new java.awt.Color(0, 0, 0));
        loanViewAllBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanViewAllBtn.setText("VER TODOS LOS PRESTAMOS");
        loanViewAllBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanViewAllBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanViewAllBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loanViewAllBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanViewAllBtnMouseClicked(evt);
            }
        });
        loansPanel.add(loanViewAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 240, 25));

        loanSrchF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loanSrchF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loansPanel.add(loanSrchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 360, 25));

        loanRtrnBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanRtrnBtn.setForeground(new java.awt.Color(0, 0, 0));
        loanRtrnBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loanRtrnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Return.png"))); // NOI18N
        loanRtrnBtn.setText("DEVOLUCION");
        loanRtrnBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanRtrnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanRtrnBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loanRtrnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanRtrnBtnMouseClicked(evt);
            }
        });
        loansPanel.add(loanRtrnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 170, 50));

        loanBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanBtn.setForeground(new java.awt.Color(0, 0, 0));
        loanBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loan.png"))); // NOI18N
        loanBtn.setText("PRESTAMO");
        loanBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanBtnMouseClicked(evt);
            }
        });
        loansPanel.add(loanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 170, 50));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("BUSCADOR:");
        loansPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 90, 25));

        loanSrchBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loanSrchBox.setForeground(new java.awt.Color(0, 0, 0));
        loanSrchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "DNI", "Fecha" }));
        loansPanel.add(loanSrchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 120, 25));

        loanSrchBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanSrchBtn.setForeground(new java.awt.Color(0, 0, 0));
        loanSrchBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanSrchBtn.setText("BUSCAR");
        loanSrchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanSrchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanSrchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loanSrchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanSrchBtnMouseClicked(evt);
            }
        });
        loansPanel.add(loanSrchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 90, 25));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("¡ PANEL DE PRESTAMOS !");
        loansPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, -1));

        loanTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loanTable.setForeground(new java.awt.Color(0, 0, 0));
        loanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "DNI", "Libro", "Cantidad", "Fecha Retiro", "Fecha Entrega", "Estado"
            }
        ));
        loanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(loanTable);

        loansPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 780, 340));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        loansPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 780, 10));

        loanDateC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loansPanel.add(loanDateC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 25));

        loanRefreshBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanRefreshBtn.setForeground(new java.awt.Color(0, 0, 0));
        loanRefreshBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loanRefreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh.png"))); // NOI18N
        loanRefreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanRefreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanRefreshBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loanRefreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanRefreshBtnMouseClicked(evt);
            }
        });
        loansPanel.add(loanRefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 70, 50));

        loanClientL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanClientL.setForeground(new java.awt.Color(0, 0, 0));
        loanClientL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loanClientL.setText("CLIENTE:");
        loansPanel.add(loanClientL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 30));

        loanSelectBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanSelectBtn.setForeground(new java.awt.Color(0, 0, 0));
        loanSelectBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanSelectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        loanSelectBtn.setText("SELECCIONAR LIBRO Y CLIENTE");
        loanSelectBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanSelectBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanSelectBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanSelectBtnMouseClicked(evt);
            }
        });
        loansPanel.add(loanSelectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 310, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("DEVOLUCION:");
        loansPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 25));

        loanUpAmountL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanUpAmountL.setForeground(new java.awt.Color(0, 0, 0));
        loanUpAmountL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanUpAmountL.setText("+");
        loanUpAmountL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanUpAmountL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanUpAmountL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanUpAmountLMouseClicked(evt);
            }
        });
        loansPanel.add(loanUpAmountL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 30, 30));

        loanBookL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanBookL.setForeground(new java.awt.Color(0, 0, 0));
        loanBookL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loanBookL.setText("COD. LIBRO: ");
        loansPanel.add(loanBookL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 25));

        loanAmountL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanAmountL.setForeground(new java.awt.Color(0, 0, 0));
        loanAmountL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanAmountL.setText("0");
        loanAmountL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loansPanel.add(loanAmountL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 70, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CANTIDAD:");
        loansPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, 25));

        loanDwnAmountL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loanDwnAmountL.setForeground(new java.awt.Color(0, 0, 0));
        loanDwnAmountL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loanDwnAmountL.setText("-");
        loanDwnAmountL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loanDwnAmountL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loanDwnAmountL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanDwnAmountLMouseClicked(evt);
            }
        });
        loansPanel.add(loanDwnAmountL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 30, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loansPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 310, 110));

        Background5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        loansPanel.add(Background5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        tabbedPanel.addTab("Prestamos", loansPanel);

        getContentPane().add(tabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ========================================================================

    // ========================================================================
    // ========================================================= PANEL BUTTONS.
    // ========================================================================
    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        tabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void booksBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksBtnMouseClicked
        loadBookTable();
        tabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_booksBtnMouseClicked

    private void clientsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsBtnMouseClicked
        loadClientTable();
        tabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_clientsBtnMouseClicked

    private void sanctionsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanctionsBtnMouseClicked
        loadSancTable();
        tabbedPanel.setSelectedIndex(3);
    }//GEN-LAST:event_sanctionsBtnMouseClicked

    private void loansBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loansBtnMouseClicked
        loadLoanTable();
        tabbedPanel.setSelectedIndex(4);
    }//GEN-LAST:event_loansBtnMouseClicked

    // ========================================================================
    // ============================================================ BOOK PANEL.
    // ========================================================================
    // VARIABLES TO USE.
    BookJpaController bookCtrl = new BookJpaController();
    Book book;
    List<Book> bookList;

    // COMPLETE THE BOOK OBJECT.
    private void newBook() {
        if (book == null) {
            book = new Book();
        }

        book.setTitle(bookTitleF.getText());
        book.setAuthor(bookAuthorF.getText());
        book.setDatePubl(bookDateF.getText());
        book.setEdit(bookEditF.getText());
        book.setCateg(bookCategF.getText());
        book.setStock(Integer.parseInt(bookStockF.getText()));
        book.setAvailable(book.getStock());
    }

    // RESET PANEL INFO.
    private void resetBookInfo() {
        bookTitleF.setText("");
        bookAuthorF.setText("");
        bookDateF.setText("");
        bookEditF.setText("");
        bookCategF.setText("");
        bookStockF.setText("");
        bookSrchF.setText("");
        bookSrchBox.setSelectedIndex(0);
        book = null;
        bookList = null;
    }

    // LOAD THE TABLE WITH THE BOOKS FROM THE DATABASE.
    private void loadBookTable() {
        // RESETS THE PANEL INFORMATION AUTOMATICALLY.
        resetBookInfo();
        cleanModelTable();

        // LOAD THE LIST OF BOOKS.
        bookList = bookCtrl.findBookEntities();

        // LOAD THE TABLE MODEL.
        String[] columns = {"ID", "Titulo", "Autor", "Fecha P.", "Edicion", "Categoria", "Stock", "Disponibles"};
        Object[] row = new Object[columns.length];
        allTableModel.setColumnIdentifiers(columns);

        // ADD ROWS WITH BOOK INFORMATION.
        for (Book x : bookList) {
            row[0] = x.getId();
            row[1] = x.getTitle();
            row[2] = x.getAuthor();
            row[3] = x.getDatePubl();
            row[4] = x.getEdit();
            row[5] = x.getCateg();
            row[6] = x.getStock();
            row[7] = x.getAvailable();
            allTableModel.addRow(row);
        }

        // SHOWS THE MODEL IN THE BOOK TABLE.
        bookTable.setModel(allTableModel);
    }

    // PLACE BOOK INFORMATION IN THE FIELDS FOR QUICK EDIT/DELETE.
    private void bookCompleteF() {
        bookTitleF.setText(book.getTitle());
        bookAuthorF.setText(book.getAuthor());
        bookDateF.setText(book.getDatePubl());
        bookEditF.setText(book.getEdit());
        bookCategF.setText(book.getCateg());
        bookStockF.setText(Integer.toString(book.getStock()));
    }

    private void bookAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookAddBtnMouseClicked
        // IF THE FIELDS ARE EMPTY, THE PROCESS CANNOT CONTINUE.
        if (bookTitleF.getText().equals("")
                || bookAuthorF.getText().equals("")
                || bookDateF.getText().equals("")
                || bookEditF.getText().equals("")
                || bookCategF.getText().equals("")
                || bookStockF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos, excepto el de ID, para agregar un nuevo libro.");
        } else {
            // WE TRY TO CREATE A NEW OBJECT IN THE DATABASE AND THEN I RELOAD THE TABLE.
            try {
                newBook();
                book.setId(0);
                bookCtrl.create(book);
                loadBookTable();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error.\n" + e);
            }
        }
    }//GEN-LAST:event_bookAddBtnMouseClicked

    private void bookEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookEditBtnMouseClicked
        // IF A BOOK WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (book == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un libro de la lista para editarlo.");
        } else {
            // WE TRY TO EDIT THE DATABASE OBJECT AND THEN I RELOAD THE TABLE.
            try {
                newBook();
                bookCtrl.edit(book);
                loadBookTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error al editar el libro.\n" + e);
            }
        }
    }//GEN-LAST:event_bookEditBtnMouseClicked

    private void bookDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookDeleteBtnMouseClicked
        // IF A BOOK WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (book == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un libro de la lista para borrarlo.");
        } else {
            // WE TRY TO DELETE THE DATABASE OBJECT AND THEN I RELOAD THE TABLE.
            try {
                bookCtrl.destroy(book.getId());
                loadBookTable();
            } catch (NonexistentEntityException e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error.\n" + e);
            }
        }
    }//GEN-LAST:event_bookDeleteBtnMouseClicked

    private void bookRefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRefreshBtnMouseClicked
        // RESET THE PANEL INFO AND RELOAD THE TABLE.
        loadBookTable();
    }//GEN-LAST:event_bookRefreshBtnMouseClicked

    private void bookSrchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookSrchBtnMouseClicked
        // IF YOU DON'T CHOOSE A FILTER OR FILL IN THE FIELD, YOU CANNOT CONTINUE.
        if (bookSrchBox.getSelectedIndex() == 0
                || bookSrchF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un filtro y completar el campo para realizar una busqueda.");
        } else {
            // WE LOAD THE TABLE ACCORDING TO THE CHOSEN FILTER.
            bookList = bookCtrl.findBookEntities();

            allTableModel.setRowCount(0);
            Object[] row = new Object[allTableModel.getColumnCount()];

            switch (bookSrchBox.getSelectedIndex()) {
                case 1 -> {
                    // ACCORDING TO THE TITLE.
                    for (Book x : bookList) {
                        if (x.getTitle().contains(bookSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getTitle();
                            row[2] = x.getAuthor();
                            row[3] = x.getDatePubl();
                            row[4] = x.getEdit();
                            row[5] = x.getCateg();
                            row[6] = x.getStock();
                            row[7] = x.getAvailable();
                            allTableModel.addRow(row);
                        }
                    }
                }
                case 2 -> {
                    // ACCORDING TO THE AUTHOR.
                    for (Book x : bookList) {
                        if (x.getAuthor().contains(bookSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getTitle();
                            row[2] = x.getAuthor();
                            row[3] = x.getDatePubl();
                            row[4] = x.getEdit();
                            row[5] = x.getCateg();
                            row[6] = x.getStock();
                            row[7] = x.getAvailable();
                            allTableModel.addRow(row);
                        }
                    }
                }
                case 3 -> {
                    // ACCORDING TO THE CATEGORY.
                    for (Book x : bookList) {
                        if (x.getCateg().contains(bookSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getTitle();
                            row[2] = x.getAuthor();
                            row[3] = x.getDatePubl();
                            row[4] = x.getEdit();
                            row[5] = x.getCateg();
                            row[6] = x.getStock();
                            row[7] = x.getAvailable();
                            allTableModel.addRow(row);
                        }
                    }
                }
            }

            bookTable.setModel(allTableModel);
        }
    }//GEN-LAST:event_bookSrchBtnMouseClicked

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // WE SELECT A ROW FROM THE TABLE.
        int numRow = bookTable.rowAtPoint(evt.getPoint());
        // WE OBTAIN THE VALUE (IN STRING) FROM THE FIRST COLUMN (ID).
        String numColumn = String.valueOf(bookTable.getValueAt(numRow, 0));
        // WE SEARCH FOR THE OBJECT IN THE DATABASE AND COMPLETE THE FIELDS WITH YOUR DATA.
        book = bookCtrl.findBook(Integer.parseInt(numColumn));
        bookCompleteF();
    }//GEN-LAST:event_bookTableMouseClicked

    private void bookLoanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookLoanBtnMouseClicked
        // IF A BOOK WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (book == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un libro de la lista para continuar con el prestamo.");
        } else {
            // WE PLACE THE ID OF THE BOOK IN THE LOANS PANEL.
            loanBookL.setText("COD. LIBRO: " + book.getId());
            // WE LOAD THE CUSTOMER TABLE AND GO TO YOUR PANEL.
            loadClientTable();
            tabbedPanel.setSelectedIndex(2);
        }
    }//GEN-LAST:event_bookLoanBtnMouseClicked

    // ========================================================================
    // ========================================================== CLIENT PANEL.
    // ========================================================================
    // VARIABLES TO USE.
    ClientJpaController clientCtrl = new ClientJpaController();
    Client client;
    List<Client> clientList;

    // COMPLETE THE CLIENT OBJECT.
    private void newClient() {
        if (client == null) {
            client = new Client();
        }

        client.setName(clientNameF.getText());
        client.setDni(clientDniF.getText());
        client.setAdress(clientAdressF.getText());
        client.setContact(clientContactF.getText());
        client.setDateIn(newDate());
    }

    // RESET PANEL INFO.
    private void resetClientInfo() {
        clientNameF.setText("");
        clientDniF.setText("");
        clientAdressF.setText("");
        clientContactF.setText("");
        clientSrchF.setText("");
        clientSrchBox.setSelectedIndex(0);
        client = null;
        clientList = null;
    }

    // LOAD THE TABLE WITH THE CLIENTS FROM THE DATABASE.
    private void loadClientTable() {
        // RESETS THE PANEL INFORMATION AUTOMATICALLY.
        resetClientInfo();
        cleanModelTable();

        // LOAD THE LIST OF CLIENTS.
        clientList = clientCtrl.findClientEntities();

        // LOAD THE TABLE MODEL.
        String[] columns = {"ID", "Nombre", "DNI", "Direccion", "Contacto", "Fecha Ingreso", "Ult. Prestamos", "Sanciones"};
        Object[] row = new Object[columns.length];
        allTableModel.setColumnIdentifiers(columns);

        // ADD ROWS WITH CLIENTS INFORMATION.
        for (Client x : clientList) {
            row[0] = x.getId();
            row[1] = x.getName();
            row[2] = x.getDni();
            row[3] = x.getAdress();
            row[4] = x.getContact();
            row[5] = x.getDateIn();

            // IF YOU DID NOT MAKE LOANS, PLACE "NO LOANS", BUT SHOW THE DATE OF THE LAST LOAN.
            if (x.getLoanList().isEmpty()) {
                row[6] = "Sin Prestamos";
            } else {
                row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getLoanList().get(x.getLoanList().size() - 1).getDateIn());
            }

            // IF YOU DO NOT HAVE SANCTIONS, ENTER "NO SANCTIONS", ELSE ENTER THE NUMBER OF SANCTIONS YOU HAVE.
            if (x.getSancList().isEmpty()) {
                row[7] = "Sin sanciones";
            } else {
                row[7] = x.getSancList().size();
            }

            allTableModel.addRow(row);
        }

        // SHOWS THE MODEL IN THE CLIENT TABLE.
        clientTable.setModel(allTableModel);
    }

    // PLACE BOOK INFORMATION IN THE FIELDS FOR QUICK EDIT/DELETE.
    private void clientCompleteF() {
        clientNameF.setText(client.getName());
        clientDniF.setText(client.getDni());
        clientAdressF.setText(client.getAdress());
        clientContactF.setText(client.getContact());
    }

    // CHANGE THE DATE FORMAT TO STRING TO ENTER IT INTO THE DATABASE.
    private String newDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = date.format(new Date());
        return dateString;
    }

    private void clientAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientAddBtnMouseClicked
        // IF THE FIELDS ARE EMPTY, THE PROCESS CANNOT CONTINUE.
        if (clientNameF.getText().equals("")
                || clientDniF.getText().equals("")
                || clientAdressF.getText().equals("")
                || clientContactF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes completar los campos, excepto el de ID, para agregar un nuevo cliente.");
        } else {
            // WE TRY TO CREATE A NEW OBJECT IN THE DATABASE AND THEN I RELOAD THE TABLE.
            try {
                newClient();
                client.setId(0);
                clientCtrl.create(client);
                loadClientTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.\n" + e);
            }
        }
    }//GEN-LAST:event_clientAddBtnMouseClicked

    private void clientEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientEditBtnMouseClicked
        // IF A CLIENT WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (client == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente de la lista para editarlo.");
        } else {
            // WE TRY TO EDIT THE DATABASE OBJECT AND THEN I RELOAD THE TABLE.
            try {
                newClient();
                clientCtrl.edit(client);
                loadClientTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error.\n" + e);
            }
        }
    }//GEN-LAST:event_clientEditBtnMouseClicked

    private void clientDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientDeleteBtnMouseClicked
        // IF A CLIENT WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (client == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente de la lista para borrarlo.");
        } else {
            // WE TRY TO DELETE THE DATABASE OBJECT AND THEN I RELOAD THE TABLE.
            try {
                clientCtrl.destroy(client.getId());
                loadClientTable();
            } catch (NonexistentEntityException e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error.\n" + e);
            }
        }
    }//GEN-LAST:event_clientDeleteBtnMouseClicked

    private void clientRefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientRefreshBtnMouseClicked
        // RESET THE PANEL INFO AND RELOAD THE TABLE.
        loadClientTable();
    }//GEN-LAST:event_clientRefreshBtnMouseClicked

    private void clientSanctionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSanctionBtnMouseClicked
        // IF A CLIENT WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (client == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente de la lista para ver sus sanciones.");
        } else {
            // WE LOAD THE CLIENT'S SANCTIONS INTO THE SANCTIONS TABLE AND GO TO THEIR PANEL.
            loadClientSanctions(client);
            tabbedPanel.setSelectedIndex(3);
        }
    }//GEN-LAST:event_clientSanctionBtnMouseClicked

    private void clientSrchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSrchBtnMouseClicked
        // IF YOU DON'T CHOOSE A FILTER OR FILL IN THE FIELD, YOU CANNOT CONTINUE.
        if (clientSrchBox.getSelectedIndex() == 0
                || clientSrchF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un filtro y completar el campo para realizar una busqueda.");
        } else {
            // WE LOAD THE TABLE ACCORDING TO THE CHOSEN FILTER.
            clientList = clientCtrl.findClientEntities();

            allTableModel.setRowCount(0);
            Object[] row = new Object[allTableModel.getColumnCount()];

            switch (clientSrchBox.getSelectedIndex()) {
                case 1 -> {
                    // ACCORDING TO THE NAME.
                    for (Client x : clientList) {
                        if (x.getName().equals(clientSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getName();
                            row[2] = x.getDni();
                            row[3] = x.getAdress();
                            row[4] = x.getContact();
                            row[5] = x.getDateIn();

                            if (x.getLoanList().isEmpty()) {
                                row[6] = "Sin Prestamos";
                            } else {
                                row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getLoanList().get(x.getLoanList().size() - 1).getDateIn());
                            }

                            if (x.getSancList().isEmpty()) {
                                row[7] = "Sin sanciones";
                            } else {
                                row[7] = x.getSancList().size();
                            }
                            allTableModel.addRow(row);
                        }
                    }
                }
                case 2 -> {
                    // ACCORDING TO THE DNI.
                    for (Client x : clientList) {
                        if (x.getDni().equals(clientSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getName();
                            row[2] = x.getDni();
                            row[3] = x.getAdress();
                            row[4] = x.getContact();
                            row[5] = x.getDateIn();

                            if (x.getLoanList().isEmpty()) {
                                row[6] = "Sin Prestamos";
                            } else {
                                row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getLoanList().get(x.getLoanList().size() - 1).getDateIn());
                            }

                            if (x.getSancList().isEmpty()) {
                                row[7] = "Sin sanciones";
                            } else {
                                row[7] = x.getSancList().size();
                            }
                            allTableModel.addRow(row);
                        }
                    }
                }
                case 3 -> {
                    // ACCORDING TO THE CONTACT.
                    for (Client x : clientList) {
                        if (x.getContact().equals(clientSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getName();
                            row[2] = x.getDni();
                            row[3] = x.getAdress();
                            row[4] = x.getContact();
                            row[5] = x.getDateIn();

                            if (x.getLoanList().isEmpty()) {
                                row[6] = "Sin Prestamos";
                            } else {
                                row[6] = x.getLoanList().get(x.getLoanList().size()).getDateIn();
                            }

                            if (x.getSancList().isEmpty()) {
                                row[7] = "Sin sanciones";
                            } else {
                                row[7] = x.getSancList().size();
                            }
                            allTableModel.addRow(row);
                        }
                    }
                }
            }

            clientTable.setModel(allTableModel);
        }
    }//GEN-LAST:event_clientSrchBtnMouseClicked

    private void clientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTableMouseClicked
        // WE SELECT A ROW FROM THE TABLE.
        int numRow = clientTable.rowAtPoint(evt.getPoint());
        // WE OBTAIN THE VALUE (IN STRING) FROM THE FIRST COLUMN (ID).
        String numColumn = String.valueOf(clientTable.getValueAt(numRow, 0));
        // WE SEARCH FOR THE OBJECT IN THE DATABASE AND COMPLETE THE FIELDS WITH YOUR DATA.
        client = clientCtrl.findClient(Integer.parseInt(numColumn));
        clientCompleteF();
    }//GEN-LAST:event_clientTableMouseClicked

    // ========================================================================
    // ============================================================ LOAN PANEL.
    // ========================================================================
    // VARIABLES TO USE.
    LoanJpaController loanCtrl = new LoanJpaController();
    Loan loan;
    List<Loan> loanList;
    boolean viewAllLoans = false;
    boolean hideBtns = true;
    private int amount = 0;

    // COMPLETE THE LOAN OBJECT.
    private void newLoan() {
        if (loan == null) {
            loan = new Loan();
        }

        loan.setBook(book);
        loan.setClient(client);
        loan.setAmount(amount);
        loan.setDateOut(new Date());
        loan.setDateIn(loanDateC.getDate());
        loan.setStatus("Activo");
    }

    // RESET PANEL INFO.
    private void resetLoanInfo() {
        loanBookL.setText("COD. LIBRO: ");
        loanClientL.setText("CLIENTE: ");
        loanAmountL.setText(Integer.toString(0));
        loanDateC.setDate(null);
        loanSrchF.setText("");
        loanSrchBox.setSelectedIndex(0);
        loanList = null;
        book = null;
        client = null;
        amount = 0;
    }

    // LOAD THE TABLE WITH THE LOANS FROM THE DATABASE.
    private void loadLoanTable() {
        // RESETS THE PANEL INFORMATION AUTOMATICALLY.
        cleanModelTable();

        // LOAD THE LIST OF LOANS.
        loanList = loanCtrl.findLoanEntities();

        // LOAD THE TABLE MODEL.
        String[] columns = {"ID", "Cliente", "DNI", "Libro", "Cantidad", "Fecha Retiro", "Fecha Entrega", "Estado"};
        Object[] row = new Object[columns.length];
        allTableModel.setColumnIdentifiers(columns);

        // ADD ROWS WITH LOANS INFORMATION.
        // IF viewAllLoans IS TRUE, ALL LOANS ARE SHOWN.
        if (viewAllLoans) {
            for (Loan x : loanList) {
                if (viewAllLoans) {
                    row[0] = x.getId();
                    row[1] = x.getClient().getName();
                    row[2] = x.getClient().getDni();
                    row[3] = x.getBook().getTitle();
                    row[4] = x.getAmount();
                    row[5] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateOut());
                    row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateIn());
                    row[7] = x.getStatus();

                    allTableModel.addRow(row);
                }
            }
        } else {
            // // IF viewAllLoans IS FALSE, ONLY SHOW ACTIVE LOANS.
            for (Loan x : loanList) {
                if (x.getStatus().equals("Activo")) {
                    row[0] = x.getId();
                    row[1] = x.getClient().getName();
                    row[2] = x.getClient().getDni();
                    row[3] = x.getBook().getTitle();
                    row[4] = x.getAmount();
                    row[5] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateOut());
                    row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateIn());
                    row[7] = x.getStatus();

                    allTableModel.addRow(row);
                }
            }
        }

        // SHOWS THE MODEL IN THE LOAN TABLE.
        loanTable.setModel(allTableModel);
    }

    // PLACE LOAN INFORMATION IN THE FIELDS FOR QUICK EDIT/DELETE.
    private void loanCompleteL() {
        loanBookL.setText("COD. LIBRO: " + loan.getBook().getId());
        loanClientL.setText("CLIENTE: " + loan.getClient().getDni());
        loanAmountL.setText(Integer.toString(loan.getAmount()));
        loanDateC.setDate(loan.getDateIn());
    }

    // WE EDIT THE AVAILABLE COPIES OF THE BOOK WHEN MAKING A LOAN OR RETURN.
    private void editBookAmount(char edit) {
        switch (edit) {
            case 'D' -> // IF WE MAKE A LOAN ITS AVAILABLE AMOUNT DECREASES.
                book.setAvailable(book.getAvailable() - amount);
            case 'I' -> // IF WE MAKE A RETURN INCREASE YOUR AVAILABLE QUANTITY.
                book.setAvailable(book.getAvailable() + amount);
        }

        try {
            bookCtrl.edit(loan.getBook());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.\n" + e);
        }
    }

    // HIDE THE ADD, EDIT AND DELETE BUTTONS WHEN SELECTING BOOKS AND CUSTOMERS FOR LOAN.
    private void hideBtns() {
        hideBtns = !hideBtns;

        if (hideBtns) {
            bookLoanBtn.setVisible(true);
            bookBackBtn.setVisible(true);
            clientLoanBtn.setVisible(true);
            clientBackBtn.setVisible(true);
            bookAddBtn.setVisible(false);
            bookEditBtn.setVisible(false);
            bookDeleteBtn.setVisible(false);
            clientAddBtn.setVisible(false);
            clientEditBtn.setVisible(false);
            clientDeleteBtn.setVisible(false);
        } else {
            bookLoanBtn.setVisible(false);
            bookBackBtn.setVisible(false);
            clientLoanBtn.setVisible(false);
            clientBackBtn.setVisible(false);
            bookAddBtn.setVisible(true);
            bookEditBtn.setVisible(true);
            bookDeleteBtn.setVisible(true);
            clientAddBtn.setVisible(true);
            clientEditBtn.setVisible(true);
            clientDeleteBtn.setVisible(true);
        }
    }

    private void loanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanBtnMouseClicked
        // IF BOOK AND CUSTOMER ARE NULL, AND AMOUNT IS 0, IT CANNOT BE CONTINUED.
        if (book == null || client == null || amount == 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un libro, un cliente e indicar una cantidad para realizar un prestamo.");
        } else if (book.getAvailable() < amount) {
            // THE REQUESTED AMOUNT IS GREATER THAN THE AVAILABLE AMOUNT, IT CANNOT BE CONTINUED.
            JOptionPane.showMessageDialog(null, "No hay tantos libros disponibles para realizar este prestamo.");
        } else {
            // WE TRY TO CREATE A NEW OBJECT IN THE DATABASE AND THEN I RELOAD THE TABLE.
            try {
                newLoan();
                loan.setId(0);
                editBookAmount('D');
                loanCtrl.create(loan);
                resetLoanInfo();
                loadLoanTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error.\n" + e);
            }
        }
    }//GEN-LAST:event_loanBtnMouseClicked

    private void loanRtrnBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanRtrnBtnMouseClicked
        // IF A LOAN WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (loan == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un prestamo de la lista para realizar la devolucion.");
        } else {
            // WE TRY TO MAKE THE RETURN.
            try {
                // IF THE STATUS OF THE LOAN IS INACTIVE, IT CANNOT BE CONTINUED.
                // ELSE IT CHANGES THE STATUS OF THE LOAN AND INCREASES THE AVAILABILITY OF THE BOOK.
                if (loan.getStatus().equals("Activo")) {
                    loan.setStatus("Inactivo");
                    loanCtrl.edit(loan);
                    editBookAmount('I');

                    // THE DATE OF THIS MOMENT IS GREATER THAN THE DELIVERY DATE (dateIn), THE CUSTOMER IS AUTOMATICALLY SANCTIONED FOR LATE DELIVERY.
                    if (loan.getDateIn().compareTo(new Date()) < 0) {
                        JOptionPane.showMessageDialog(null, "La devolucion fue tardia, el cliente sera sancionado automaticamente.");

                        // WE CREATE A SANCTION FOR THIS CUSTOMER.
                        sanction = new Sanction();
                        sanction.setId(0);
                        sanction.setClient(loan.getClient());
                        sanction.setReason("Devolucion tardia");
                        sanction.setSanctDate(new Date());
                        sancCtrl.create(sanction);
                        // IF THE DATE OF THIS MOMENT DOES NOT EXCEED THE DELIVERY DATE (dateIn), WE ASK THE USER IF THEY WANT TO SANCTION THE CUSTOMER OR NOT.
                    } else if (JOptionPane.showConfirmDialog(null, "Deseas sancionar a este cliente?") == 0) {
                        client = loan.getClient();
                        sancSelectClientBtn.setText(client.getDni());
                        tabbedPanel.setSelectedIndex(3);
                    }

                    // WE RESTART THE PANEL AND LOAD THE LOAN TABLE.
                    loadLoanTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Este prestamo ya ha sido devuelto.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.\n" + e);
            }
        }
    }//GEN-LAST:event_loanRtrnBtnMouseClicked

    private void loanViewAllBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanViewAllBtnMouseClicked
        // WE CHOOSE WHETHER OR NOT TO SHOW ALL LOANS, ACTIVE AND INACTIVE.
        viewAllLoans = !viewAllLoans;
        loadLoanTable();
    }//GEN-LAST:event_loanViewAllBtnMouseClicked

    private void loanSrchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanSrchBtnMouseClicked
        // IF YOU DON'T CHOOSE A FILTER OR FILL IN THE FIELD, YOU CANNOT CONTINUE.
        if (loanSrchBox.getSelectedIndex() == 0
                || loanSrchF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un filtro y completar el campo para realizar una busqueda.");
        } else {
            // WE LOAD THE TABLE ACCORDING TO THE CHOSEN FILTER.
            loanList = loanCtrl.findLoanEntities();

            allTableModel.setRowCount(0);
            Object[] row = new Object[allTableModel.getColumnCount()];

            switch (loanSrchBox.getSelectedIndex()) {
                case 1 -> {
                    // ACCORDING TO THE CLIENT.
                    for (Loan x : loanList) {
                        if (x.getClient().getDni().equals(loanSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getClient().getName();
                            row[2] = x.getClient().getDni();
                            row[3] = x.getBook().getTitle();
                            row[4] = x.getAmount();
                            row[5] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateOut());
                            row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateIn());
                            row[7] = x.getStatus();

                            allTableModel.addRow(row);
                        }
                    }
                }
                case 2 -> {
                    // ACCORDING TO THE DATE OUT.
                    for (Loan x : loanList) {
                        if (x.getDateOut().equals(loanSrchF.getText())) {
                            row[0] = x.getId();
                            row[1] = x.getClient().getName();
                            row[2] = x.getClient().getDni();
                            row[3] = x.getBook().getTitle();
                            row[4] = x.getAmount();
                            row[5] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateOut());
                            row[6] = new SimpleDateFormat("dd/MM/yyyy").format(x.getDateIn());
                            row[7] = x.getStatus();

                            allTableModel.addRow(row);
                        }
                    }
                }
            }

            loanTable.setModel(allTableModel);
        }
    }//GEN-LAST:event_loanSrchBtnMouseClicked

    private void loanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanTableMouseClicked
        // WE SELECT A ROW FROM THE TABLE.
        int numRow = loanTable.rowAtPoint(evt.getPoint());
        // WE OBTAIN THE VALUE (IN STRING) FROM THE FIRST COLUMN (ID).
        String numColumn = String.valueOf(loanTable.getValueAt(numRow, 0));
        // WE SEARCH FOR THE OBJECT IN THE DATABASE AND COMPLETE THE FIELDS WITH YOUR DATA.
        loan = loanCtrl.findLoan(Integer.parseInt(numColumn));
        // WE OBTAIN BOOK, CLIENT AND AMOUNT OF THE LOAN OBJECT.
        book = loan.getBook();
        client = loan.getClient();
        amount = loan.getAmount();
        loanCompleteL();
    }//GEN-LAST:event_loanTableMouseClicked

    private void clientLoanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientLoanBtnMouseClicked
        // IF A BOOK WAS NOT SELECTED FROM THE TABLE, YOU CANNOT CONTINUE.
        if (client == null) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente de la lista para continuar.");
        } else if (selectSanc == false) {
            // WE PLACE THE CUSTOMER'S ID IN THE LOAN PANEL, WE ALSO SHOW THE AMOUNT OF BOOKS TO WITHDRAW (STARTS AT 1)
            loanClientL.setText("CLIENTE: " + client.getDni());
            amount = 1;
            loanAmountL.setText(Integer.toString(amount));
            // WE LOAD THE LOAN TABLE, GO TO YOUR PANEL AND SHOW THE ADD, EDIT AND DELETE BUTTONS FROM THE BOOKS AND CLIENTS PANELS AGAIN.
            loadLoanTable();
            tabbedPanel.setSelectedIndex(4);
            hideBtns();
        } else {
            // WE SELECT THE CUSTOMER FOR AND PLACE HIS NAME ON THE SANCTIONS PANEL, THEN WE GO TO HIS PANEL.
            sancSelectClientBtn.setText(client.getName());
            selectSanc = false;
            cleanModelTable();
            // WE SHOW AGAIN THE ADD, EDIT AND DELETE BUTTONS FROM THE BOOKS AND CLIENTS PANELS.
            hideBtns();
            tabbedPanel.setSelectedIndex(3);
        }
    }//GEN-LAST:event_clientLoanBtnMouseClicked

    private void loanRefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanRefreshBtnMouseClicked
        resetLoanInfo();
        loadLoanTable();
    }//GEN-LAST:event_loanRefreshBtnMouseClicked

    private void loanSelectBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanSelectBtnMouseClicked
        // WE HIDE THE ADD, EDIT AND DELETE BUTTONS FROM THE BOOK AND CLIENTS PANELS.
        hideBtns();
        // WE LOAD THE BOOK TABLE AND GO TO YOUR PANEL.
        loadBookTable();
        tabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_loanSelectBtnMouseClicked

    private void bookBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookBackBtnMouseClicked
        // WE SHOW THE BUTTONS AGAIN, SELECT THE BOOK AND RETURN TO THE LOANS PANEL.
        book = null;
        hideBtns();
        loadLoanTable();
        tabbedPanel.setSelectedIndex(4);
    }//GEN-LAST:event_bookBackBtnMouseClicked

    private void clientBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientBackBtnMouseClicked
        // DESELECT THE BOOK AND RETURN TO THE CLIENTS PANEL.
        client = null;
        loadBookTable();
        tabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_clientBackBtnMouseClicked

    private void loanUpAmountLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanUpAmountLMouseClicked
        // WE CHANGE THE AMOUNT OF BOOKS TO BE LOANED.
        amount += 1;
        loanAmountL.setText(Integer.toString(amount));
    }//GEN-LAST:event_loanUpAmountLMouseClicked

    private void loanDwnAmountLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanDwnAmountLMouseClicked
        // WE CHANGE THE AMOUNT OF BOOKS TO BE LOANED.
        if (amount > 0) {
            amount -= 1;
            loanAmountL.setText(Integer.toString(amount));
        }
    }//GEN-LAST:event_loanDwnAmountLMouseClicked

    // ========================================================================
    // ======================================================== SANCTION PANEL.
    // ========================================================================
    // VARIABLES TO USE.
    SanctionJpaController sancCtrl = new SanctionJpaController();
    Sanction sanction;
    List<Sanction> sancList;
    private boolean selectSanc = false;

    // COMPLETE THE SANCTION OBJECT.
    private void newSanction() {
        if (sanction == null) {
            sanction = new Sanction();
        }

        sanction.setClient(client);
        sanction.setReason(sancReasonF.getText());
        sanction.setSanctDate(new Date());
    }

    // RESET PANEL INFO.
    private void resetSancInfo() {
        sancSelectClientBtn.setText("SELECCIONAR CLIENTE");
        sancReasonF.setText("");
        sancSrchF.setText("");
        sanction = null;
        sancList = null;
    }

    // LOAD THE TABLE WITH THE SANCTION FROM THE DATABASE.
    private void loadSancTable() {
        // RESETS THE PANEL INFORMATION AUTOMATICALLY.
        resetSancInfo();
        cleanModelTable();

        // LOAD THE LIST OF SANCTION.
        sancList = sancCtrl.findSanctionEntities();

        // LOAD THE TABLE MODEL.
        String[] columns = {"ID", "Cliente", "DNI", "Motivo de Sancion", "Fecha"};
        Object[] row = new Object[columns.length];
        allTableModel.setColumnIdentifiers(columns);

        // ADD ROWS WITH SANCTION INFORMATION.
        for (Sanction x : sancList) {
            row[0] = x.getId();
            row[1] = x.getClient().getName();
            row[2] = x.getClient().getDni();
            row[3] = x.getReason();
            row[4] = new SimpleDateFormat("dd/MM/yyyy").format(x.getSanctDate());

            allTableModel.addRow(row);
        }

        // SHOWS THE MODEL IN THE SANCTION TABLE.
        sancTable.setModel(allTableModel);
    }

    // WE CHARGE THE LOANS OF A SPECIFIC CLIENT.
    private void loadClientSanctions(Client x) {
        cleanModelTable();

        String[] columns = {"ID", "Cliente", "DNI", "Motivo de Sancion", "Fecha"};
        Object[] row = new Object[columns.length];
        allTableModel.setColumnIdentifiers(columns);

        for (Sanction y : client.getSancList()) {
            row[0] = y.getId();
            row[1] = y.getClient().getName();
            row[2] = y.getClient().getDni();
            row[3] = y.getReason();
            row[4] = new SimpleDateFormat("dd/MM/yyyy").format(y.getSanctDate());

            allTableModel.addRow(row);
        }

        sancTable.setModel(allTableModel);
    }

    private void sanctionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanctionBtnMouseClicked
        // IF CLIENT IS NULL OR THE FIELD IS EMPTY, YOU CANNOT CONTINUE.
        if (client == null || sancReasonF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente y completar el campo para realizar una sancion.");
        } else {
            try {
                // WE TRY TO CREATE A NEW OBJECT IN THE DATABASE AND THEN I RELOAD THE TABLE.
                newSanction();
                sanction.setId(0);
                sancCtrl.create(sanction);
                loadSancTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error.\n" + e);
            }
        }
    }//GEN-LAST:event_sanctionBtnMouseClicked

    private void refreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseClicked
        loadSancTable();
    }//GEN-LAST:event_refreshBtnMouseClicked

    private void sancSelectClientBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sancSelectClientBtnMouseClicked
        // IF selectSanc IS TRUE, WE WILL SELECT A CUSTOMER FROM THE CUSTOMER PANEL AND RETURN TO THIS PANEL.
        selectSanc = !selectSanc;
        hideBtns();
        loadClientTable();
        tabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_sancSelectClientBtnMouseClicked

    private void sancSrchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sancSrchBtnMouseClicked
        // IF YOU DO NOT ENTER AN ID YOU CANNOT PERFORM THE SEARCH
        if (sancSrchF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes completar el campo para realizar una busqueda.");
        } else {
            // WE LOAD THE TABLE ACCORDING TO THE CHOSEN FILTER.
            sancList = sancCtrl.findSanctionEntities();

            allTableModel.setRowCount(0);
            Object[] row = new Object[allTableModel.getColumnCount()];

            for (Sanction x : sancList) {
                // ACCORDING TO THE DNI.
                if (x.getClient().getDni().equals(sancSrchF.getText())) {
                    row[0] = x.getId();
                    row[1] = x.getClient().getName();
                    row[2] = x.getClient().getDni();
                    row[3] = x.getReason();
                    row[4] = new SimpleDateFormat("dd/MM/yyyy").format(x.getSanctDate());

                    allTableModel.addRow(row);
                }
            }

            sancTable.setModel(allTableModel);
        }
    }//GEN-LAST:event_sancSrchBtnMouseClicked

    // ========================================================================
    // =========================================================== MAIN METHOD.
    // ========================================================================
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // ========================================================================
    // ============================================================== NETBEANS.
    // ========================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel Background3;
    private javax.swing.JLabel Background4;
    private javax.swing.JLabel Background5;
    private javax.swing.JLabel Background_1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel bookAddBtn;
    private javax.swing.JTextField bookAuthorF;
    private javax.swing.JLabel bookBackBtn;
    private javax.swing.JTextField bookCategF;
    private javax.swing.JTextField bookDateF;
    private javax.swing.JLabel bookDeleteBtn;
    private javax.swing.JLabel bookEditBtn;
    private javax.swing.JTextField bookEditF;
    private javax.swing.JLabel bookLoanBtn;
    private javax.swing.JLabel bookRefreshBtn;
    private javax.swing.JComboBox<String> bookSrchBox;
    private javax.swing.JLabel bookSrchBtn;
    private javax.swing.JTextField bookSrchF;
    private javax.swing.JTextField bookStockF;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField bookTitleF;
    private javax.swing.JLabel booksBtn;
    private javax.swing.JPanel booksPanel;
    private javax.swing.JLabel clientAddBtn;
    private javax.swing.JTextField clientAdressF;
    private javax.swing.JLabel clientBackBtn;
    private javax.swing.JTextField clientContactF;
    private javax.swing.JLabel clientDeleteBtn;
    private javax.swing.JTextField clientDniF;
    private javax.swing.JLabel clientEditBtn;
    private javax.swing.JLabel clientLoanBtn;
    private javax.swing.JTextField clientNameF;
    private javax.swing.JLabel clientRefreshBtn;
    private javax.swing.JLabel clientSanctionBtn;
    private javax.swing.JComboBox<String> clientSrchBox;
    private javax.swing.JLabel clientSrchBtn;
    private javax.swing.JTextField clientSrchF;
    private javax.swing.JTable clientTable;
    private javax.swing.JLabel clientsBtn;
    private javax.swing.JPanel clientsPanel;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel loanAmountL;
    private javax.swing.JLabel loanBookL;
    private javax.swing.JLabel loanBtn;
    private javax.swing.JLabel loanClientL;
    private com.toedter.calendar.JDateChooser loanDateC;
    private javax.swing.JLabel loanDwnAmountL;
    private javax.swing.JLabel loanRefreshBtn;
    private javax.swing.JLabel loanRtrnBtn;
    private javax.swing.JLabel loanSelectBtn;
    private javax.swing.JComboBox<String> loanSrchBox;
    private javax.swing.JLabel loanSrchBtn;
    private javax.swing.JTextField loanSrchF;
    private javax.swing.JTable loanTable;
    private javax.swing.JLabel loanUpAmountL;
    private javax.swing.JLabel loanViewAllBtn;
    private javax.swing.JLabel loansBtn;
    private javax.swing.JPanel loansPanel;
    private javax.swing.JLabel refreshBtn;
    private javax.swing.JTextField sancReasonF;
    private javax.swing.JLabel sancSelectClientBtn;
    private javax.swing.JLabel sancSrchBtn;
    private javax.swing.JTextField sancSrchF;
    private javax.swing.JTable sancTable;
    private javax.swing.JLabel sanctionBtn;
    private javax.swing.JLabel sanctionsBtn;
    private javax.swing.JPanel sanctionsPanel;
    private javax.swing.JTabbedPane tabbedPanel;
    // End of variables declaration//GEN-END:variables
}

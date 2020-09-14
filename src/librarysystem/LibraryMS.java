package librarysystem;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * @author EVSILEROOT
 */
public class LibraryMS extends javax.swing.JFrame {

    public LibraryMS() {
        initComponents();

//      Using external third party library  
        com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("s", "s", "s");

//        setting the data into table in statitics label 
        returnbooktableUpdates();
        issuebooktableUpdates();
//        Importing image and setting it in label 
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\EVSILEROOT\\Desktop\\DOG.jpg");
        Image image = imageIcon.getImage();
        Image imageScale = image.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaIcon = new ImageIcon(imageScale);
        photoLabel.setIcon(scaIcon);
//
//        issueBookDetailsTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
//        issueBookDetailsTable.getTableHeader().setOpaque(false);
//        issueBookDetailsTable.getTableHeader().setBackground(new Color(32, 136, 203));


//        Setting Icon to the main jframe
        ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\EVSILEROOT\\Documents\\NetBeansProjects\\LibrarySystem\\src\\Icons\\library.png");
        Image image1 = imageIcon1.getImage();
        Image imageScale1 = image1.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(imageScale1);
        this.setIconImage(logo.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        homePhoto = new javax.swing.JLabel();
        addStudent = new javax.swing.JLabel();
        addBook = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        statitics = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        returnBook = new javax.swing.JLabel();
        issueBook = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        mainpanell = new javax.swing.JPanel();
        jbHome = new javax.swing.JPanel();
        jlabe30 = new javax.swing.JPanel();
        haddbook = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jlabel32 = new javax.swing.JPanel();
        hstati = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jlabel31 = new javax.swing.JPanel();
        haddStudent = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        hissue = new javax.swing.JLabel();
        jlabel33 = new javax.swing.JPanel();
        hreturn = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jlabel34 = new javax.swing.JPanel();
        habout = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jbAddBook = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        aisbn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        abookName = new javax.swing.JTextField();
        abookId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        aPublisher = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aPrice = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        aEdition = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbStudent = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        sstudentName = new javax.swing.JTextField();
        sFathername = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sStudentid = new javax.swing.JTextField();
        sCourse = new javax.swing.JComboBox<>();
        sBranch = new javax.swing.JComboBox<>();
        sYear = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        sGender = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        sSemester = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jbStatitics = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueBookDetailsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnBookDetailsTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jbIssuebook = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        ipublisher = new javax.swing.JTextField();
        iBookname = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        iEdition = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        iIsbn = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        iPrice = new javax.swing.JTextField();
        iBookid = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        iFathername = new javax.swing.JTextField();
        iCourse = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        istudentname = new javax.swing.JTextField();
        iYear = new javax.swing.JTextField();
        iStudentid = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        iBranch = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        searchBook = new javax.swing.JButton();
        searchStudent = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        issueBtn = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        iDateofissue = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        jbReturnBook = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rStudentid = new javax.swing.JTextField();
        rbookname = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        rstudentname = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        rCourse = new javax.swing.JTextField();
        returnBtn = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        rDateofissue = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        rBranch = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        rbookid = new javax.swing.JTextField();
        rDateofreturn = new com.toedter.calendar.JDateChooser();
        jbAboutUs = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel67 = new javax.swing.JLabel();
        sqlLoading = new javax.swing.JProgressBar();
        jLabel68 = new javax.swing.JLabel();
        JavaSciprt = new javax.swing.JLabel();
        javaLoading = new javax.swing.JProgressBar();
        javaScriptLoading = new javax.swing.JProgressBar();
        jLabel69 = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Krishna Library Management System]");
        setLocation(new java.awt.Point(215, 15));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(251, 196, 171));

        homePhoto.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        homePhoto.setForeground(new java.awt.Color(0, 0, 0));
        homePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_library_100px_1.png"))); // NOI18N
        homePhoto.setText("Dashboard");
        homePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePhotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePhotoMouseEntered(evt);
            }
        });

        addStudent.setBackground(new java.awt.Color(251, 196, 171));
        addStudent.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        addStudent.setForeground(new java.awt.Color(0, 0, 0));
        addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_user_group_woman_man_30px.png"))); // NOI18N
        addStudent.setText("       Add Student");
        addStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        addStudent.setOpaque(true);
        addStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addStudentMouseExited(evt);
            }
        });

        addBook.setBackground(new java.awt.Color(251, 196, 171));
        addBook.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        addBook.setForeground(new java.awt.Color(0, 0, 0));
        addBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_book_30px_1.png"))); // NOI18N
        addBook.setText("         Add Book");
        addBook.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        addBook.setOpaque(true);
        addBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBookMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        statitics.setBackground(new java.awt.Color(251, 196, 171));
        statitics.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        statitics.setForeground(new java.awt.Color(0, 0, 0));
        statitics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_statistics_30px_1.png"))); // NOI18N
        statitics.setText("         Statistics");
        statitics.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        statitics.setOpaque(true);
        statitics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statiticsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statiticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statiticsMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Operation");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Action");

        about.setBackground(new java.awt.Color(251, 196, 171));
        about.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        about.setForeground(new java.awt.Color(0, 0, 0));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_about_30px.png"))); // NOI18N
        about.setText("        About Us");
        about.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        about.setOpaque(true);
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutMouseExited(evt);
            }
        });

        returnBook.setBackground(new java.awt.Color(251, 196, 171));
        returnBook.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        returnBook.setForeground(new java.awt.Color(0, 0, 0));
        returnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_return_book_30px.png"))); // NOI18N
        returnBook.setText("      Return Book");
        returnBook.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        returnBook.setOpaque(true);
        returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnBookMouseExited(evt);
            }
        });

        issueBook.setBackground(new java.awt.Color(251, 196, 171));
        issueBook.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        issueBook.setForeground(new java.awt.Color(0, 0, 0));
        issueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_book_shelf_30px.png"))); // NOI18N
        issueBook.setText("       Issue Book");
        issueBook.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        issueBook.setOpaque(true);
        issueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issueBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issueBookMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(about, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(issueBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                    .addComponent(statitics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
            .addComponent(jLabel7)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homePhoto))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(homePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statitics, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(240, 128, 128));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(".");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        mainpanell.setBackground(new java.awt.Color(255, 218, 185));

        jbHome.setBackground(new java.awt.Color(255, 218, 185));
        jbHome.setBorder(new javax.swing.border.MatteBorder(null));
        jbHome.setPreferredSize(new java.awt.Dimension(685, 540));

        jlabe30.setBackground(new java.awt.Color(119, 46, 37));
        jlabe30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabe30MouseEntered(evt);
            }
        });

        haddbook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        haddbook.setForeground(new java.awt.Color(255, 255, 255));
        haddbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_book_30px_1.png"))); // NOI18N
        haddbook.setText("Add Book");
        haddbook.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        haddbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haddbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                haddbookMouseEntered(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(119, 46, 37));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32");
        jTextArea3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(119, 46, 37)));
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout jlabe30Layout = new javax.swing.GroupLayout(jlabe30);
        jlabe30.setLayout(jlabe30Layout);
        jlabe30Layout.setHorizontalGroup(
            jlabe30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabe30Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(haddbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabe30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jlabe30Layout.setVerticalGroup(
            jlabe30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabe30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haddbook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlabel32.setBackground(new java.awt.Color(196, 69, 54));
        jlabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabel32MouseEntered(evt);
            }
        });

        hstati.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hstati.setForeground(new java.awt.Color(255, 255, 255));
        hstati.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_statistics_30px_1.png"))); // NOI18N
        hstati.setText("Statitics");
        hstati.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        hstati.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hstatiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hstatiMouseEntered(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(196, 69, 54));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32");
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout jlabel32Layout = new javax.swing.GroupLayout(jlabel32);
        jlabel32.setLayout(jlabel32Layout);
        jlabel32Layout.setHorizontalGroup(
            jlabel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlabel32Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(hstati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(jlabel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jlabel32Layout.setVerticalGroup(
            jlabel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hstati, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlabel31.setBackground(new java.awt.Color(40, 61, 59));
        jlabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabel31MouseEntered(evt);
            }
        });

        haddStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        haddStudent.setForeground(new java.awt.Color(255, 255, 255));
        haddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_user_group_woman_man_30px.png"))); // NOI18N
        haddStudent.setText("Add Student");
        haddStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        haddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haddStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                haddStudentMouseEntered(evt);
            }
        });

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(40, 61, 59));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setText("The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32");
        jTextArea6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(119, 46, 37)));
        jScrollPane8.setViewportView(jTextArea6);

        javax.swing.GroupLayout jlabel31Layout = new javax.swing.GroupLayout(jlabel31);
        jlabel31.setLayout(jlabel31Layout);
        jlabel31Layout.setHorizontalGroup(
            jlabel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel31Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(haddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(jlabel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jlabel31Layout.setVerticalGroup(
            jlabel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(haddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 210, 63));

        hissue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hissue.setForeground(new java.awt.Color(0, 0, 0));
        hissue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_book_shelf_30px.png"))); // NOI18N
        hissue.setText("Issue Book");
        hissue.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        hissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hissueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hissueMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(hissue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(314, 314, 314))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hissue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jlabel33.setBackground(new java.awt.Color(59, 206, 172));
        jlabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabel33MouseEntered(evt);
            }
        });

        hreturn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hreturn.setForeground(new java.awt.Color(255, 255, 255));
        hreturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_return_book_30px.png"))); // NOI18N
        hreturn.setText("Return Book");
        hreturn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        hreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hreturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hreturnMouseEntered(evt);
            }
        });

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(59, 206, 172));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. ");
        jTextArea5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(119, 46, 37)));
        jScrollPane7.setViewportView(jTextArea5);

        javax.swing.GroupLayout jlabel33Layout = new javax.swing.GroupLayout(jlabel33);
        jlabel33.setLayout(jlabel33Layout);
        jlabel33Layout.setHorizontalGroup(
            jlabel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlabel33Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(hreturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101))
            .addGroup(jlabel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jlabel33Layout.setVerticalGroup(
            jlabel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlabel34.setBackground(new java.awt.Color(51, 51, 51));
        jlabel34.setForeground(new java.awt.Color(60, 63, 65));
        jlabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlabel34MouseEntered(evt);
            }
        });

        habout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        habout.setForeground(new java.awt.Color(255, 255, 255));
        habout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_about_30px.png"))); // NOI18N
        habout.setText("About Us");
        habout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        habout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                haboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                haboutMouseEntered(evt);
            }
        });

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English");
        jTextArea4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(119, 46, 37)));
        jScrollPane6.setViewportView(jTextArea4);

        javax.swing.GroupLayout jlabel34Layout = new javax.swing.GroupLayout(jlabel34);
        jlabel34.setLayout(jlabel34Layout);
        jlabel34Layout.setHorizontalGroup(
            jlabel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlabel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel34Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(habout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93))
        );
        jlabel34Layout.setVerticalGroup(
            jlabel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(habout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("LIBRARY SOFTWARES DEMO");

        jLabel25.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Plot No 24, Mohan Rao Colony Shamirpet Mandal, Ranga Medchal District 509993");

        javax.swing.GroupLayout jbHomeLayout = new javax.swing.GroupLayout(jbHome);
        jbHome.setLayout(jbHomeLayout);
        jbHomeLayout.setHorizontalGroup(
            jbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbHomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jlabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jbHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlabe30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbHomeLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbHomeLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbHomeLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))))
        );
        jbHomeLayout.setVerticalGroup(
            jbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(30, 30, 30)
                .addGroup(jbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlabe30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jbAddBook.setBackground(new java.awt.Color(255, 218, 185));
        jbAddBook.setForeground(new java.awt.Color(0, 0, 0));
        jbAddBook.setPreferredSize(new java.awt.Dimension(685, 563));

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(126, 87, 194));
        jLabel5.setText("Book ID");

        aisbn.setBackground(new java.awt.Color(255, 218, 185));
        aisbn.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        aisbn.setForeground(new java.awt.Color(0, 0, 0));
        aisbn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(126, 87, 194));
        jLabel8.setText("Book Name");

        abookName.setBackground(new java.awt.Color(255, 218, 185));
        abookName.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        abookName.setForeground(new java.awt.Color(0, 0, 0));
        abookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));

        abookId.setEditable(false);
        abookId.setBackground(new java.awt.Color(255, 218, 185));
        abookId.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        abookId.setForeground(new java.awt.Color(0, 0, 0));
        abookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(126, 87, 194));
        jLabel9.setText("ISBN");

        aPublisher.setBackground(new java.awt.Color(255, 218, 185));
        aPublisher.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        aPublisher.setForeground(new java.awt.Color(0, 0, 0));
        aPublisher.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(126, 87, 194));
        jLabel10.setText("Publisher");

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(126, 87, 194));
        jLabel11.setText("Edition");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(126, 87, 194));
        jLabel12.setText("Price");

        aPrice.setBackground(new java.awt.Color(255, 218, 185));
        aPrice.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        aPrice.setForeground(new java.awt.Color(0, 0, 0));
        aPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 0)));

        addButton.setBackground(new java.awt.Color(41, 50, 65));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_new_15px.png"))); // NOI18N
        addButton.setText("Add Book");
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        aEdition.setBackground(new java.awt.Color(255, 218, 185));
        aEdition.setForeground(new java.awt.Color(0, 0, 0));
        aEdition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jPanel8.setBackground(new java.awt.Color(251, 196, 171));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Adding Books");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jbAddBookLayout = new javax.swing.GroupLayout(jbAddBook);
        jbAddBook.setLayout(jbAddBookLayout);
        jbAddBookLayout.setHorizontalGroup(
            jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbAddBookLayout.createSequentialGroup()
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jbAddBookLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jbAddBookLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aEdition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jbAddBookLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(120, 120, 120))
                            .addGroup(jbAddBookLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97))
                            .addComponent(aisbn)
                            .addComponent(abookId)
                            .addGroup(jbAddBookLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102)))
                        .addGap(182, 182, 182)
                        .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbAddBookLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(83, 83, 83))
                            .addGroup(jbAddBookLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68))
                            .addGroup(jbAddBookLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(117, 117, 117))
                            .addComponent(aPrice)
                            .addComponent(aPublisher)
                            .addComponent(abookName))))
                .addGap(91, 91, 91))
        );
        jbAddBookLayout.setVerticalGroup(
            jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbAddBookLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(38, 38, 38))
        );

        jbStudent.setBackground(new java.awt.Color(255, 218, 185));

        jLabel19.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(126, 87, 194));
        jLabel19.setText("Name");

        sstudentName.setBackground(new java.awt.Color(255, 218, 185));
        sstudentName.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        sstudentName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        sFathername.setBackground(new java.awt.Color(255, 218, 185));
        sFathername.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        sFathername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(126, 87, 194));
        jLabel23.setText("Father Name");

        jLabel26.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(126, 87, 194));
        jLabel26.setText("Course");

        jLabel27.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(126, 87, 194));
        jLabel27.setText("Branch");

        jLabel28.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(126, 87, 194));
        jLabel28.setText("Year");

        jLabel29.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(126, 87, 194));
        jLabel29.setText("Student ID");

        sStudentid.setEditable(false);
        sStudentid.setBackground(new java.awt.Color(255, 218, 185));
        sStudentid.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        sStudentid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        sCourse.setBackground(new java.awt.Color(255, 218, 185));
        sCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.E", "B.TECH", "M.TECH", "MBA", "BBA", "BCA", "B.Sc", "M.Sc" }));

        sBranch.setBackground(new java.awt.Color(255, 218, 185));
        sBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mechanical", "CSE", "IT", "Civil", "Auto Mobiile", "Civil", "E.E.E", "Other" }));

        sYear.setBackground(new java.awt.Color(255, 218, 185));
        sYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second", "Third", "Fouth", "Fivth", " " }));

        jButton5.setBackground(new java.awt.Color(41, 50, 65));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_add_new_15px.png"))); // NOI18N
        jButton5.setText("Add Student");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        sGender.setBackground(new java.awt.Color(255, 218, 185));
        sGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel30.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(126, 87, 194));
        jLabel30.setText("Gender");

        sSemester.setBackground(new java.awt.Color(255, 218, 185));
        sSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2st", "3st", "4st", "5st", "6st", "7st", "8st", " " }));

        jLabel34.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(126, 87, 194));
        jLabel34.setText("Semester");

        jPanel9.setBackground(new java.awt.Color(251, 196, 171));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Adding Student");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jbStudentLayout = new javax.swing.GroupLayout(jbStudent);
        jbStudent.setLayout(jbStudentLayout);
        jbStudentLayout.setHorizontalGroup(
            jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbStudentLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbStudentLayout.createSequentialGroup()
                        .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sGender, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jbStudentLayout.createSequentialGroup()
                        .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sFathername)
                            .addGroup(jbStudentLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(jbStudentLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addComponent(sBranch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sStudentid, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(195, 195, 195)
                        .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbStudentLayout.createSequentialGroup()
                                .addComponent(sstudentName)
                                .addGap(11, 11, 11))
                            .addGroup(jbStudentLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(111, 111, 111))
                            .addGroup(jbStudentLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addGap(104, 104, 104))
                            .addComponent(sCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jbStudentLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(77, 77, 77))
                            .addComponent(sYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbStudentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(86, 86, 86))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jbStudentLayout.setVerticalGroup(
            jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbStudentLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sStudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sFathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jbStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbStudentLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jbStudentLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addComponent(jButton5)
                .addGap(36, 36, 36))
        );

        jbStatitics.setBackground(new java.awt.Color(255, 218, 185));

        issueBookDetailsTable.setAutoCreateRowSorter(true);
        issueBookDetailsTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        issueBookDetailsTable.setForeground(new java.awt.Color(0, 0, 0));
        issueBookDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book_ID", "Student_ID", "Book-Name", "Student-Name", "Course", "Branch", "Date-of-Issue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issueBookDetailsTable.setFocusable(false);
        issueBookDetailsTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        issueBookDetailsTable.setRowHeight(25);
        issueBookDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(issueBookDetailsTable);

        returnBookDetailsTable.setAutoCreateRowSorter(true);
        returnBookDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book_ID", "Student_ID", "Book-Name", "Student-Name", "Course", "Branch", "Date-of-Issue", "Date-of-Return"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        returnBookDetailsTable.setFocusable(false);
        returnBookDetailsTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        returnBookDetailsTable.setRowHeight(25);
        returnBookDetailsTable.setSelectionBackground(new java.awt.Color(244, 151, 142));
        returnBookDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(returnBookDetailsTable);

        jPanel10.setBackground(new java.awt.Color(251, 196, 171));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Statitics");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Issue-Book-Details");

        jLabel20.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Return-Book-Details");

        javax.swing.GroupLayout jbStatiticsLayout = new javax.swing.GroupLayout(jbStatitics);
        jbStatitics.setLayout(jbStatiticsLayout);
        jbStatiticsLayout.setHorizontalGroup(
            jbStatiticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbStatiticsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jbStatiticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jbStatiticsLayout.createSequentialGroup()
                .addGroup(jbStatiticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jbStatiticsLayout.setVerticalGroup(
            jbStatiticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbStatiticsLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jbIssuebook.setBackground(new java.awt.Color(255, 218, 185));

        jLabel33.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(126, 87, 194));
        jLabel33.setText("Name");

        ipublisher.setEditable(false);
        ipublisher.setBackground(new java.awt.Color(255, 218, 185));
        ipublisher.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        ipublisher.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        iBookname.setEditable(false);
        iBookname.setBackground(new java.awt.Color(255, 218, 185));
        iBookname.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iBookname.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel37.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(126, 87, 194));
        jLabel37.setText("ISBN");

        iEdition.setEditable(false);
        iEdition.setBackground(new java.awt.Color(255, 218, 185));
        iEdition.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iEdition.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel40.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(126, 87, 194));
        jLabel40.setText("Publisher");

        jLabel41.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(126, 87, 194));
        jLabel41.setText("Edition");

        iIsbn.setEditable(false);
        iIsbn.setBackground(new java.awt.Color(255, 218, 185));
        iIsbn.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iIsbn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel42.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(126, 87, 194));
        jLabel42.setText("Price");

        jLabel43.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Book_ID");

        iPrice.setEditable(false);
        iPrice.setBackground(new java.awt.Color(255, 218, 185));
        iPrice.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        iBookid.setBackground(new java.awt.Color(255, 218, 185));
        iBookid.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iBookid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel45.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(126, 87, 194));
        jLabel45.setText("Father Name");

        iFathername.setEditable(false);
        iFathername.setBackground(new java.awt.Color(255, 218, 185));
        iFathername.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iFathername.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        iCourse.setEditable(false);
        iCourse.setBackground(new java.awt.Color(255, 218, 185));
        iCourse.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iCourse.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel47.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(126, 87, 194));
        jLabel47.setText("Year");

        jLabel49.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Student_ID");

        istudentname.setEditable(false);
        istudentname.setBackground(new java.awt.Color(255, 218, 185));
        istudentname.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        istudentname.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        iYear.setEditable(false);
        iYear.setBackground(new java.awt.Color(255, 218, 185));
        iYear.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iYear.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        iStudentid.setBackground(new java.awt.Color(255, 218, 185));
        iStudentid.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iStudentid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel51.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(126, 87, 194));
        jLabel51.setText("Name");

        iBranch.setEditable(false);
        iBranch.setBackground(new java.awt.Color(255, 218, 185));
        iBranch.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        iBranch.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel55.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(126, 87, 194));
        jLabel55.setText("Branch");

        jLabel56.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(126, 87, 194));
        jLabel56.setText("Course");

        searchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_15px.png"))); // NOI18N
        searchBook.setText("Search");
        searchBook.setFocusable(false);
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });

        searchStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_15px.png"))); // NOI18N
        searchStudent.setText("Search");
        searchStudent.setFocusable(false);
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(126, 87, 194));
        jLabel44.setText("Date-of-Issue");

        issueBtn.setBackground(new java.awt.Color(41, 50, 65));
        issueBtn.setForeground(new java.awt.Color(255, 255, 255));
        issueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_reading_15px.png"))); // NOI18N
        issueBtn.setText("Issue Book");
        issueBtn.setFocusable(false);
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(251, 196, 171));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Issue Books");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        iDateofissue.setBackground(new java.awt.Color(255, 218, 185));
        iDateofissue.setOpaque(false);

        jLabel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jbIssuebookLayout = new javax.swing.GroupLayout(jbIssuebook);
        jbIssuebook.setLayout(jbIssuebookLayout);
        jbIssuebookLayout.setHorizontalGroup(
            jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbIssuebookLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipublisher)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(84, 84, 84))
                                    .addComponent(iEdition)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94))
                                    .addComponent(iIsbn)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(112, 112, 112))
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(118, 118, 118))
                                    .addComponent(iPrice))
                                .addGap(178, 178, 178))
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58))
                            .addComponent(iFathername)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addComponent(istudentname)
                                .addGap(3, 3, 3))
                            .addComponent(iCourse)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addComponent(iBranch)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(122, 122, 122))
                            .addComponent(iYear))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbIssuebookLayout.createSequentialGroup()
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(iBookid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbIssuebookLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iDateofissue, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)))
                                .addComponent(issueBtn))
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iBookname)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(111, 111, 111)))
                                .addGap(94, 94, 94)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(131, 131, 131))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jbIssuebookLayout.createSequentialGroup()
                                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(searchStudent))
                                        .addComponent(iStudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(62, 62, 62))))
        );
        jbIssuebookLayout.setVerticalGroup(
            jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbIssuebookLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel43))
                                    .addComponent(searchBook))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iBookid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jbIssuebookLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel49)
                                    .addComponent(searchStudent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iStudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iBookname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(istudentname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iIsbn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iFathername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ipublisher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iEdition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iBranch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(issueBtn))
                    .addGroup(jbIssuebookLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jbIssuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iDateofissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        jbReturnBook.setBackground(new java.awt.Color(255, 218, 185));

        jLabel31.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Student_ID");

        jLabel32.setFont(new java.awt.Font("Open Sans Semibold", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("  :");

        rStudentid.setBackground(new java.awt.Color(255, 218, 185));
        rStudentid.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rStudentid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        rbookname.setEditable(false);
        rbookname.setBackground(new java.awt.Color(255, 218, 185));
        rbookname.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rbookname.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel59.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Book Name");

        rstudentname.setEditable(false);
        rstudentname.setBackground(new java.awt.Color(255, 218, 185));
        rstudentname.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rstudentname.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel62.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Student Name");

        jLabel63.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Course");

        rCourse.setEditable(false);
        rCourse.setBackground(new java.awt.Color(255, 218, 185));
        rCourse.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rCourse.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        returnBtn.setBackground(new java.awt.Color(41, 50, 65));
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_return_15px.png"))); // NOI18N
        returnBtn.setText("Return Book");
        returnBtn.setFocusable(false);
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Date-of-Issue");

        rDateofissue.setEditable(false);
        rDateofissue.setBackground(new java.awt.Color(255, 218, 185));
        rDateofissue.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rDateofissue.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel70.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Branch");

        rBranch.setEditable(false);
        rBranch.setBackground(new java.awt.Color(255, 218, 185));
        rBranch.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rBranch.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        jLabel71.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Date-of-Return");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_15px.png"))); // NOI18N
        jButton8.setText("Search");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(251, 196, 171));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Return Books");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel36.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Book____ID");

        jLabel38.setFont(new java.awt.Font("Open Sans Semibold", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("  :");

        rbookid.setBackground(new java.awt.Color(255, 218, 185));
        rbookid.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        rbookid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        rDateofreturn.setBackground(new java.awt.Color(255, 218, 185));

        javax.swing.GroupLayout jbReturnBookLayout = new javax.swing.GroupLayout(jbReturnBook);
        jbReturnBook.setLayout(jbReturnBookLayout);
        jbReturnBookLayout.setHorizontalGroup(
            jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbReturnBookLayout.createSequentialGroup()
                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbReturnBookLayout.createSequentialGroup()
                                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(260, 260, 260))
                            .addGroup(jbReturnBookLayout.createSequentialGroup()
                                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(217, 217, 217))
                            .addGroup(jbReturnBookLayout.createSequentialGroup()
                                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rCourse)
                                    .addComponent(rDateofissue)
                                    .addComponent(rbookname))
                                .addGap(169, 169, 169))
                            .addGroup(jbReturnBookLayout.createSequentialGroup()
                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(253, 253, 253))))
                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbookid)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                        .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbReturnBookLayout.createSequentialGroup()
                                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rBranch, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rstudentname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(7, 7, 7))
                            .addComponent(rDateofreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbReturnBookLayout.createSequentialGroup()
                        .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(returnBtn)
                            .addGroup(jbReturnBookLayout.createSequentialGroup()
                                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37))
                                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40))
                                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                                        .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(95, 95, 95))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbReturnBookLayout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rStudentid)
                                        .addGap(18, 18, 18)))
                                .addComponent(jButton8)))
                        .addGap(24, 24, 24))))
        );
        jbReturnBookLayout.setVerticalGroup(
            jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbReturnBookLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(rStudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel38)
                    .addComponent(rbookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jButton8))
                .addGap(44, 44, 44)
                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jbReturnBookLayout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbReturnBookLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(jLabel71)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbReturnBookLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGap(5, 5, 5)
                .addGroup(jbReturnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rDateofissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rDateofreturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(returnBtn)
                .addGap(35, 35, 35))
        );

        jbAboutUs.setBackground(new java.awt.Color(255, 218, 185));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 218, 185));
        jTextArea1.setColumns(23);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("My name is sunil bohara i'm from Nepal i love coding and \nprogramming languages i'm not a professional programmer but \nstill learning new stuff's day by day currently i'm working \non java desktop applications \n");
        jTextArea1.setBorder(null);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_developer_25px.png"))); // NOI18N
        jLabel67.setText("Sunil Bohara");

        sqlLoading.setMinimum(100);

        javaLoading.setMinimum(50);

        javaScriptLoading.setMinimum(50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_java_40px.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_javascript_40px_1.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_database_administrator_40px.png"))); // NOI18N

        javax.swing.GroupLayout jbAboutUsLayout = new javax.swing.GroupLayout(jbAboutUs);
        jbAboutUs.setLayout(jbAboutUsLayout);
        jbAboutUsLayout.setHorizontalGroup(
            jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbAboutUsLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbAboutUsLayout.createSequentialGroup()
                        .addComponent(javaLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(javaScriptLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(sqlLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addGroup(jbAboutUsLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(jbAboutUsLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel69)
                        .addGroup(jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jbAboutUsLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(JavaSciprt))
                            .addGroup(jbAboutUsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel68)))))
                .addGap(90, 90, 90))
            .addGroup(jbAboutUsLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(256, 256, 256))
        );
        jbAboutUsLayout.setVerticalGroup(
            jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbAboutUsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbAboutUsLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel68)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbAboutUsLayout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(JavaSciprt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbAboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sqlLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaScriptLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainpanellLayout = new javax.swing.GroupLayout(mainpanell);
        mainpanell.setLayout(mainpanellLayout);
        mainpanellLayout.setHorizontalGroup(
            mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbIssuebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbStatitics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbAddBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbHome, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
        );
        mainpanellLayout.setVerticalGroup(
            mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbIssuebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbStatitics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
            .addGroup(mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbHome, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(248, 173, 157));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CREDITS");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("@  Copyrights 2020 All  rights received Sunil Bohara");

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainpanell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainpanell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Random r = new Random();
        int studentrandom = r.nextInt(10000);
        int bookrandom = r.nextInt(100000);
        sStudentid.setText(Integer.toString(studentrandom));
        abookId.setText(Integer.toString(bookrandom));
    }//GEN-LAST:event_formWindowActivated

    public void issuebooktableUpdates() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) issueBookDetailsTable.getModel();
        try {
            MysqlData sqlData = MysqlData.getInstance();
            sqlData.connectiontoServer();
            sqlData.readData("select * from issuedbooks");
            ResultSet resultSet = sqlData.getdata();
            defaultTableModel.setRowCount(0);
            while (resultSet.next()) {
                String[] issueBookData = {resultSet.getString("bookid"), resultSet.getString("studentid"),
                    resultSet.getString("bookname"), resultSet.getString("studentname"), resultSet.getString("course"),
                    resultSet.getString("branch"), resultSet.getString("dateofissue")};
                defaultTableModel.addRow(issueBookData);
                defaultTableModel.fireTableDataChanged();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void returnbooktableUpdates() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) returnBookDetailsTable.getModel();
        try {
            MysqlData sqlData = MysqlData.getInstance();
            sqlData.connectiontoServer();
            sqlData.readData("select * from returnbooks");
            ResultSet resultSet = sqlData.getdata();
            defaultTableModel.setRowCount(0);
            while (resultSet.next()) {
                String[] returnbookData = {resultSet.getString("bookid"), resultSet.getString("studentid"),
                    resultSet.getString("bookname"), resultSet.getString("studentname"), resultSet.getString("course"),
                    resultSet.getString("branch"), resultSet.getString("dateofissue"),resultSet.getString("dateofreturn")};
                defaultTableModel.addRow(returnbookData);
                defaultTableModel.fireTableDataChanged();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void EmptyString(String labelname) {
        if (labelname.equals("addingbook")) {
            abookName.setText("");
            aisbn.setText("");
            aPublisher.setText("");
            aEdition.setSelectedIndex(1);
            aPrice.setText("");
            abookName.requestFocus();
        } else if (labelname.equals("addingstudent")) {
            sstudentName.setText("");
            sFathername.setText("");
            sstudentName.requestFocus();
        } else if (labelname.equals("issuedbooks")) {
            iBookid.setText("");
            iStudentid.setText("");
            iBookname.setText("");
            istudentname.setText("");
            iIsbn.setText("");
            iFathername.setText("");
            ipublisher.setText("");
            iCourse.setText("");
            iEdition.setText("");
            iBranch.setText("");
            iPrice.setText("");
            iYear.setText("");
            iDateofissue.setDateFormatString("");
            iBookid.requestFocus();
        } else if (labelname.equals("returnbooks")) {
            rbookid.setText("");
            rStudentid.setText("");
            rbookname.setText("");
            rstudentname.setText("");
            rCourse.setText("");
            rBranch.setText("");
            rDateofissue.setText("");
            rDateofreturn.setDateFormatString("");
            rbookid.requestFocus();
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jbHome.setVisible(true);
        jbAddBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbStudent.setVisible(false);
        jbStatitics.setVisible(false);
        jbIssuebook.setVisible(false);
        jbReturnBook.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void issueBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookMouseExited
        issueBook.setBackground(new Color(251, 196, 171));
        issueBook.setForeground(Color.black);
    }//GEN-LAST:event_issueBookMouseExited

    private void issueBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookMouseEntered
        issueBook.setBackground(new Color(238, 66, 102));
        issueBook.setForeground(Color.white);
    }//GEN-LAST:event_issueBookMouseEntered

    private void issueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueBookMouseClicked
        jbIssuebook.setVisible(true);
        jbStudent.setVisible(false);
        jbStatitics.setVisible(false);
        jbAddBook.setVisible(false);
        jbReturnBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbHome.setVisible(false);
    }//GEN-LAST:event_issueBookMouseClicked

    private void returnBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookMouseExited
        returnBook.setBackground(new Color(251, 196, 171));
        returnBook.setForeground(Color.black);
    }//GEN-LAST:event_returnBookMouseExited

    private void returnBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookMouseEntered
        returnBook.setBackground(new Color(238, 66, 102));
        returnBook.setForeground(Color.white);
    }//GEN-LAST:event_returnBookMouseEntered

    private void returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookMouseClicked
        jbReturnBook.setVisible(true);
        jbStudent.setVisible(false);
        jbStatitics.setVisible(false);
        jbIssuebook.setVisible(false);
        jbAddBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbHome.setVisible(false);
    }//GEN-LAST:event_returnBookMouseClicked

    private void aboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseExited
        about.setBackground(new Color(251, 196, 171));
        about.setForeground(Color.black);
    }//GEN-LAST:event_aboutMouseExited

    private void aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseEntered
        about.setBackground(new Color(238, 66, 102));
        about.setForeground(Color.white);
    }//GEN-LAST:event_aboutMouseEntered

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        jbAboutUs.setVisible(true);
        jbStudent.setVisible(false);
        jbStatitics.setVisible(false);
        jbIssuebook.setVisible(false);
        jbReturnBook.setVisible(false);
        jbAddBook.setVisible(false);
        jbHome.setVisible(false);
    }//GEN-LAST:event_aboutMouseClicked

    private void statiticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statiticsMouseExited
        statitics.setBackground(new Color(251, 196, 171));
        statitics.setForeground(Color.black);
    }//GEN-LAST:event_statiticsMouseExited

    private void statiticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statiticsMouseEntered
        statitics.setBackground(new Color(238, 66, 102));
        statitics.setForeground(Color.white);
    }//GEN-LAST:event_statiticsMouseEntered

    private void statiticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statiticsMouseClicked
        jbStatitics.setVisible(true);
        jbStudent.setVisible(false);
        jbAddBook.setVisible(false);
        jbIssuebook.setVisible(false);
        jbReturnBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbHome.setVisible(false);
    }//GEN-LAST:event_statiticsMouseClicked

    private void addBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookMouseClicked
        jbAddBook.setVisible(true);
        jbStudent.setVisible(false);
        jbStatitics.setVisible(false);
        jbIssuebook.setVisible(false);
        jbReturnBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbHome.setVisible(false);
    }//GEN-LAST:event_addBookMouseClicked

    private void addStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentMouseExited
        addStudent.setBackground(new Color(251, 196, 171));
        addStudent.setForeground(Color.black);
    }//GEN-LAST:event_addStudentMouseExited

    private void addStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentMouseEntered
        addStudent.setBackground(new Color(238, 66, 102));
        addStudent.setForeground(Color.white);
    }//GEN-LAST:event_addStudentMouseEntered

    private void addStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentMouseClicked
        addStudent.setBackground(new Color(238, 66, 102));
        addStudent.setForeground(Color.white);
        jbStudent.setVisible(true);
        jbAddBook.setVisible(false);
        jbStatitics.setVisible(false);
        jbIssuebook.setVisible(false);
        jbReturnBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbHome.setVisible(false);
    }//GEN-LAST:event_addStudentMouseClicked

    private void homePhotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePhotoMouseEntered
        homePhoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_homePhotoMouseEntered

    private void homePhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePhotoMouseClicked
        jbHome.setVisible(true);
        jbAddBook.setVisible(false);
        jbAboutUs.setVisible(false);
        jbStudent.setVisible(false);
        jbStatitics.setVisible(false);
        jbIssuebook.setVisible(false);
        jbReturnBook.setVisible(false);
    }//GEN-LAST:event_homePhotoMouseClicked

    private void addBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookMouseEntered
        addBook.setBackground(new Color(238, 66, 102));
        addBook.setForeground(Color.white);
    }//GEN-LAST:event_addBookMouseEntered

    private void addBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookMouseExited
        addBook.setBackground(new Color(251, 196, 171));
        addBook.setForeground(Color.black);
    }//GEN-LAST:event_addBookMouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (sStudentid.getText().length() == 0 || sstudentName.getText().length() == 0
                || sFathername.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Fields are empty");
        } else {
            int yesno = JOptionPane.showConfirmDialog(this, "Are you sure you want to add new book", "Confirm", JOptionPane.YES_NO_OPTION);
            if (yesno == JOptionPane.YES_OPTION) {
                String id = sStudentid.getText();
                int studentid = Integer.parseInt(id);
                String studentname = sstudentName.getText();
                String fathername = sFathername.getText();
                String course = sCourse.getSelectedItem().toString();
                String branch = sBranch.getSelectedItem().toString();
                String year = sYear.getSelectedItem().toString();
                String gender = sGender.getSelectedItem().toString();
                String semester = sSemester.getSelectedItem().toString();
                try {
                    MysqlData sqlData = MysqlData.getInstance();
                    sqlData.connectiontoServer();
                    sqlData.iduData("insert into addingstudent (studentid,studentname,fathername,course,branch,year,"
                            + "gender,semester) values('" + studentid + "','" + studentname + "','" + fathername + "','"
                            + course + "','" + branch + "','" + year + "','" + gender + "','" + semester + "')");
                    sqlData.closeConnection();
                    JOptionPane.showMessageDialog(this, "Data has been added succesfully");
                    EmptyString("addingstudent");
                    Random r = new Random();
                    int random = r.nextInt(10000);
                    sStudentid.setText(Integer.toString(random));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (yesno == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Your option has been cancelled");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if (abookId.getText().length() == 0 || abookName.getText().length() == 0 || aisbn.getText().length() == 0
                || aPublisher.getText().length() == 0 || aPrice.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Fields are empty");
        } else {
            int yesno = JOptionPane.showConfirmDialog(this, "Are you sure you want to Add New Studnet", "Confirm", JOptionPane.YES_NO_OPTION);
            if (yesno == JOptionPane.YES_OPTION) {
                String id = abookId.getText();
                int bookid = Integer.parseInt(id);
                String bookname = abookName.getText();
                String isbn = aisbn.getText();
                int ISBN = Integer.parseInt(isbn);
                String publisher = aPublisher.getText();
                String edi = aEdition.getSelectedItem().toString();
                int edition = Integer.parseInt(edi);
                String pri = aPrice.getText();
                int price = Integer.parseInt(pri);

                try {
                    MysqlData sqlData = MysqlData.getInstance();
                    sqlData.connectiontoServer();
                    sqlData.iduData("insert into addingbook (bookid,name,isbn,publisher,edition,price) values"
                            + "('" + bookid + "','" + bookname + "','" + ISBN + "','" + publisher + "','" + edition
                            + "','" + price + "')");
                    sqlData.closeConnection();
                    JOptionPane.showMessageDialog(this, "Data has been added succesfully");
                    EmptyString("addingbook");
                    Random r = new Random();
                    int random = r.nextInt(10000);
                    abookId.setText(Integer.toString(random));
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            } else if (yesno == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Your option has been cancelled");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void jlabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel34MouseEntered

    }//GEN-LAST:event_jlabel34MouseEntered

    private void haboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haboutMouseEntered
        habout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_haboutMouseEntered

    private void jlabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel33MouseEntered

    }//GEN-LAST:event_jlabel33MouseEntered

    private void hreturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hreturnMouseEntered
        hreturn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_hreturnMouseEntered

    private void hissueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hissueMouseEntered
        hissue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_hissueMouseEntered

    private void jlabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel31MouseEntered

    }//GEN-LAST:event_jlabel31MouseEntered

    private void haddStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haddStudentMouseEntered
        haddStudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_haddStudentMouseEntered

    private void jlabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel32MouseEntered

    }//GEN-LAST:event_jlabel32MouseEntered

    private void hstatiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hstatiMouseEntered
        hstati.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_hstatiMouseEntered

    private void jlabe30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabe30MouseEntered

    }//GEN-LAST:event_jlabe30MouseEntered

    private void haddbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haddbookMouseEntered
        haddbook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_haddbookMouseEntered

    private void haddbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haddbookMouseClicked
        jbHome.setVisible(false);
        jbAddBook.setVisible(true);
    }//GEN-LAST:event_haddbookMouseClicked

    private void haddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haddStudentMouseClicked
        jbHome.setVisible(false);
        jbStudent.setVisible(true);
    }//GEN-LAST:event_haddStudentMouseClicked

    private void hstatiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hstatiMouseClicked
        jbHome.setVisible(false);
        jbStatitics.setVisible(true);
    }//GEN-LAST:event_hstatiMouseClicked

    private void hissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hissueMouseClicked
        jbHome.setVisible(false);
        jbIssuebook.setVisible(true);
    }//GEN-LAST:event_hissueMouseClicked

    private void hreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hreturnMouseClicked
        jbHome.setVisible(false);
        jbReturnBook.setVisible(true);
    }//GEN-LAST:event_hreturnMouseClicked

    private void haboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_haboutMouseClicked
        jbHome.setVisible(false);
        jbAboutUs.setVisible(true);
    }//GEN-LAST:event_haboutMouseClicked

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        if (iBookid.getText().length() == 0 || iStudentid.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Id's are empty");
        } else {
            int yesno = JOptionPane.showConfirmDialog(this, "Are you sure you want to issue book", "Confirm", JOptionPane.YES_NO_OPTION);
            if (yesno == JOptionPane.YES_OPTION) {
                String bid = iBookid.getText();
                int bookid = Integer.parseInt(bid);
                String sid = iStudentid.getText();
                int studentid = Integer.parseInt(sid);
                String bookname = iBookname.getText();
                String studentname = istudentname.getText();
                String course = iCourse.getText();
                String branch = iBranch.getText();
                String dateofissue = iDateofissue.getDate().toString();
                try {
                    MysqlData sqlData = MysqlData.getInstance();
                    sqlData.connectiontoServer();
                    sqlData.iduData("insert into issuedbooks (bookid,studentid,bookname,studentname,course,branch,dateofissue) values('" + bookid + "','" + studentid + "','" + bookname + "','" + studentname + "','" + course + "','" + branch + "','" + dateofissue + "')");
                    sqlData.closeConnection();
                    JOptionPane.showMessageDialog(this, "Data has been added succesfully");
                    EmptyString("issuedbooks");
                    issuebooktableUpdates();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            } else if (yesno == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Your option has been cancelled");
            }
        }
    }//GEN-LAST:event_issueBtnActionPerformed

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        if (iBookid.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "ID is empty");
        } else {
            try {
                String id = iBookid.getText();
                int bookid = Integer.parseInt(id);
                MysqlData sqlData = MysqlData.getInstance();
                sqlData.connectiontoServer();
                sqlData.readData("select * from addingbook where bookid = '" + bookid + "'");
                ResultSet resultSet = sqlData.getdata();
                while (resultSet.next()) {
                    iBookname.setText(resultSet.getString("name"));
                    iIsbn.setText(resultSet.getString("isbn"));
                    ipublisher.setText(resultSet.getString("publisher"));
                    iEdition.setText(resultSet.getString("edition"));
                    iPrice.setText(resultSet.getString("price"));
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_searchBookActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        if (iStudentid.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "ID is empty");
        } else {
            try {
                String id = iStudentid.getText();
                int studentid = Integer.parseInt(id);
                MysqlData sqlData = MysqlData.getInstance();
                sqlData.connectiontoServer();
                sqlData.readData("select * from addingstudent where studentid = '" + studentid + "'");
                ResultSet resultSet = sqlData.getdata();
                while (resultSet.next()) {
                    istudentname.setText(resultSet.getString("studentname"));
                    iFathername.setText(resultSet.getString("fathername"));
                    iCourse.setText(resultSet.getString("course"));
                    iBranch.setText(resultSet.getString("branch"));
                    iYear.setText(resultSet.getString("year"));
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_searchStudentActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        if (rbookid.getText().isEmpty() || rStudentid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id's are empty");
        } else {
            int yesno = JOptionPane.showConfirmDialog(this, "Are you sure you want to issue book", "Confirm", JOptionPane.YES_NO_OPTION);
            if (yesno == JOptionPane.YES_OPTION) {
                String rbid = rbookid.getText();
                int bookid = Integer.parseInt(rbid);
                String rsid = rStudentid.getText();
                int studentid = Integer.parseInt(rsid);
                String bookname = rbookname.getText();
                String studentname = rstudentname.getText();
                String course = rCourse.getText();
                String branch = rBranch.getText();
                String dateofissue = rDateofissue.getText();
                String dateofreturn = rDateofreturn.getDate().toString();
                try {
                    MysqlData sqlData = MysqlData.getInstance();
                    sqlData.connectiontoServer();
                    sqlData.iduData("insert into returnbooks (bookid,studentid,bookname,studentname,course,branch,dateofissue,dateofreturn) values('" + bookid + "','" + studentid + "','" + bookname + "','" + studentname + "','" + course + "','" + branch + "','" + dateofissue + "','" + dateofreturn + "')");
                    sqlData.iduData("delete from issuedbooks where bookid = '" + bookid + "'");
                    sqlData.closeConnection();
                    JOptionPane.showMessageDialog(this, "Data has been added succesfully");
                    EmptyString("returnbooks");
                    returnbooktableUpdates();
                    issuebooktableUpdates();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            } else if (yesno == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Your option has been cancelled");
            }
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (rbookid.getText().isEmpty() || rStudentid.getText().isEmpty()) {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("s", "s", "s");
            JOptionPane.showMessageDialog(this, "ID is empty");
        } else {
            try {
                String rbid = rbookid.getText();
                int returnbookid = Integer.parseInt(rbid);
                String rsid = rbookid.getText();
                int returnstudentid = Integer.parseInt(rsid);
                MysqlData sqlData = MysqlData.getInstance();
                sqlData.connectiontoServer();
                sqlData.readData("select * from issuedbooks where bookid = '" + returnbookid + "'and'" + returnstudentid + "'");
                ResultSet resultSet = sqlData.getdata();
                while (resultSet.next()) {
                    rbookname.setText(resultSet.getString("bookname"));
                    rstudentname.setText(resultSet.getString("studentname"));
                    rCourse.setText(resultSet.getString("course"));
                    rBranch.setText(resultSet.getString("branch"));
                    rDateofissue.setText(resultSet.getString("dateofissue"));
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
//          My fav one
//            UIManager.setLookAndFeel("com.pagosoft.plaf.PgsLookAndFeel");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaSciprt;
    private javax.swing.JComboBox<String> aEdition;
    private javax.swing.JTextField aPrice;
    private javax.swing.JTextField aPublisher;
    private javax.swing.JTextField abookId;
    private javax.swing.JTextField abookName;
    private javax.swing.JLabel about;
    private javax.swing.JLabel addBook;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addStudent;
    private javax.swing.JTextField aisbn;
    private javax.swing.JLabel habout;
    private javax.swing.JLabel haddStudent;
    private javax.swing.JLabel haddbook;
    private javax.swing.JLabel hissue;
    private javax.swing.JLabel homePhoto;
    private javax.swing.JLabel hreturn;
    private javax.swing.JLabel hstati;
    private javax.swing.JTextField iBookid;
    private javax.swing.JTextField iBookname;
    private javax.swing.JTextField iBranch;
    private javax.swing.JTextField iCourse;
    private com.toedter.calendar.JDateChooser iDateofissue;
    private javax.swing.JTextField iEdition;
    private javax.swing.JTextField iFathername;
    private javax.swing.JTextField iIsbn;
    private javax.swing.JTextField iPrice;
    private javax.swing.JTextField iStudentid;
    private javax.swing.JTextField iYear;
    private javax.swing.JTextField ipublisher;
    private javax.swing.JLabel issueBook;
    private javax.swing.JTable issueBookDetailsTable;
    private javax.swing.JButton issueBtn;
    private javax.swing.JTextField istudentname;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JProgressBar javaLoading;
    private javax.swing.JProgressBar javaScriptLoading;
    private javax.swing.JPanel jbAboutUs;
    private javax.swing.JPanel jbAddBook;
    private javax.swing.JPanel jbHome;
    private javax.swing.JPanel jbIssuebook;
    private javax.swing.JPanel jbReturnBook;
    private javax.swing.JPanel jbStatitics;
    private javax.swing.JPanel jbStudent;
    private javax.swing.JPanel jlabe30;
    private javax.swing.JPanel jlabel31;
    private javax.swing.JPanel jlabel32;
    private javax.swing.JPanel jlabel33;
    private javax.swing.JPanel jlabel34;
    private javax.swing.JPanel mainpanell;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JTextField rBranch;
    private javax.swing.JTextField rCourse;
    private javax.swing.JTextField rDateofissue;
    private com.toedter.calendar.JDateChooser rDateofreturn;
    private javax.swing.JTextField rStudentid;
    private javax.swing.JTextField rbookid;
    private javax.swing.JTextField rbookname;
    private javax.swing.JLabel returnBook;
    private javax.swing.JTable returnBookDetailsTable;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTextField rstudentname;
    private javax.swing.JComboBox<String> sBranch;
    private javax.swing.JComboBox<String> sCourse;
    private javax.swing.JTextField sFathername;
    private javax.swing.JComboBox<String> sGender;
    private javax.swing.JComboBox<String> sSemester;
    private javax.swing.JTextField sStudentid;
    private javax.swing.JComboBox<String> sYear;
    private javax.swing.JButton searchBook;
    private javax.swing.JButton searchStudent;
    private javax.swing.JProgressBar sqlLoading;
    private javax.swing.JTextField sstudentName;
    private javax.swing.JLabel statitics;
    // End of variables declaration//GEN-END:variables
}

package view;

import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fila extends javax.swing.JFrame {
    
    String num;
    
    String adimin;
    
    int a = -1;    
    
    String sit ="Andamento";
    
    String nomep;
    
    String fila;
    
    String idfunc;    
    
    public Fila() { 
        
    setResizable(false);
         
    initComponents();
        
    this.setLocationRelativeTo(null);    
        
    jFormattedTextField8.grabFocus(); 
     
    try {
        
    LoginSenha l = new LoginSenha();
            
    String lp; 
      
    Class.forName("com.mysql.jdbc.Driver");

    Connection con;

    con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

    String sqls;     
         
    String stmt;
         
    String stmt1;
         
    String stmt2;
         
    String stmt3;

    sqls = "SELECT * FROM func WHERE login = ? ";         
         
    PreparedStatement ps;

    ps = (PreparedStatement) con.prepareStatement(sqls);
            
    lp = LoginSenha.jTextField1.getText();
         
    ps.setString(1, lp);
            
    ResultSet rs;

    rs = ps.executeQuery();
            
    String loginBanco = null;
            
    String senhaBanco = null;
            
    String adm = null;
         
    String nome = null;
                            
    String setor = null; 
         
    rs.next();
             
    nome = rs.getString("nome");            
    setor = rs.getString("setor");                
    loginBanco = rs.getString("login");                
    senhaBanco = rs.getString("senha");                
    adm = rs.getString("adm");                 
    idfunc = rs.getString("idfunc");        
              
    jTextField2.setText(idfunc);
    
    jTextField4.setText(nome);
         
    jTextField3.setText(setor);
         
    nomep=jTextField4.getText();
         
    fila=jTextField3.getText();
    
    adimin=adm;
    
    ps.close();
         
    rs.close();

        if (lp.equals(loginBanco) && adm.equals("sim")) {
             
        jMenu1.setVisible(true);  
        
        jMenuItem14.setVisible(false);
         
        } else if (lp.equals(loginBanco) && adm.equals("nao")){
                
                jMenu1.setVisible(false);
                
                jMenuItem12.setVisible(false);
                
                jMenuItem7.setVisible(false);
               
                }  
            
    con.close();
    
    refrashtabela(1);
          
    } catch (SQLException | ClassNotFoundException e) {
            
      Logger.getLogger(LoginSenha.class.getName()).log(Level.SEVERE, null, e);
                    
      }
                  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jComboBox9 = new javax.swing.JComboBox();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SWL Manager");

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SWL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Atualizar Fila");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Setor:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem Vindo funcionario:");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Solicitações novas:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mensagens novas:");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField7.setEditable(false);

        jTextField5.setEditable(false);

        jTextField2.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jTextField6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jLabel2)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fila de Processos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Processos na sua Fila");

        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Data de Abertura", "Situaçao", "Assunto", "Prioridade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable2MouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Data de Abertura", "Situaçao", "Assunto", "Prioridade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Processos Abertos ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Prioridade:");

        jFormattedTextField6.setEditable(false);
        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jFormattedTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField6ActionPerformed(evt);
            }
        });

        jFormattedTextField7.setEditable(false);
        try {
            jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Situação:");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Setor responsavel:");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Assunto:");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("N° processo:");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Aberto em:");

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("as");

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Proprietario:");

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        try {
            jFormattedTextField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Enviar para o setor:");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane9.setViewportView(jTextArea6);

        jComboBox9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox9.setToolTipText("");
        jComboBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox9MouseClicked(evt);
            }
        });
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton19.setText("Enviar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton20.setText("Salvar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Andamento", "Fechado" }));
        jComboBox3.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane10.setViewportView(jTextArea7);

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane11.setViewportView(jTextArea8);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Expandir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea9.setRows(5);
        jTextArea9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea9AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane12.setViewportView(jTextArea9);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 33, Short.MAX_VALUE)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, 0, 110, Short.MAX_VALUE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton19, jButton20});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton19)
                        .addComponent(jButton20)
                        .addComponent(jButton1)
                        .addComponent(jButton4)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton19, jButton20});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuBar1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem1.setText("Cadastrar processo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem2.setText("Cadastrar funcionario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem4.setText("Cadastrar novo setor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Processos");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem9.setText("Consultar Processos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem7.setText("Registro de Processos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Solicitação");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem8.setText("Consultar Solicitação");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem10.setText("Consultar Mensagens");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Funcionario");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem12.setText("Alterar Dados do funcionario");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem14.setText("Abrir Chamado");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem5.setText("Enviar Mensagem");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem3.setText("Consultar Dados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        new CadFuncionario().show();      
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        new CadProcesso().show();       
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuBar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuBar1AncestorAdded
      
    }//GEN-LAST:event_jMenuBar1AncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int i=1;
        
        refrashtabela(i);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        new CadSetor().show();   
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        if(evt.getClickCount() == 2){
            
        Object obj  = (jTable1.getValueAt(jTable1.getSelectedRow(), 0));  
            
        String Id = obj.toString(); 
            
        String num= jFormattedTextField8.getText();
            
        jTextField5.setText(Id);
            
        jTextField7.setText("s");            
             
            try {
                
                StringBuffer textos = new StringBuffer();
            
                textos.append(jTextArea6.getText() + "\n"); 
                textos.append(jTextArea7.getText()); 
            
                jTextArea8.setText(textos.toString());
                
                int a = -1;
                
                LoginSenha lll = new LoginSenha();
        
                String lppp; 
                
                lppp = LoginSenha.jTextField1.getText();  
                
                Class.forName("com.mysql.jdbc.Driver");               

                com.mysql.jdbc.Connection conn; 
                
                conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                
                String sqlsss;
                
                sqlsss = "SELECT idfunc FROM func WHERE login = ?";
                
                com.mysql.jdbc.PreparedStatement pssss;
                                
                pssss = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlsss);
                                           
                pssss.setString(1, lppp);
                
                ResultSet rssss;
                
                rssss = pssss.executeQuery();
                
                int idfuncc = 0;    

                rssss.next();
                
                idfuncc = rssss.getInt("idfunc");
                         
                String sqlss;
                
                sqlss = "SELECT num, proprietario FROM processo WHERE num = ?";                
                
                com.mysql.jdbc.PreparedStatement psss;                
                
                psss = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlss);  
                
                psss.setString(1, Id);
                
                ResultSet rsss;

                rsss = psss.executeQuery();
                
                int proprietario; 
                
                rsss.next();
                    
                proprietario = rsss.getInt("proprietario");
                
                if(proprietario==a){       
               
                    
        
                }else if(proprietario == idfuncc){        
              
                        if(Id.equals(num)||num.equals("    ")||jTextArea7.getText().equals("")){
                            
                        jFormattedTextField8.setText(Id);
                        
                        }else{    
                     
                              int xx = JOptionPane.showConfirmDialog(null, "Deseja Salvar as Alterações do Processo atual, antes de Trabalhar em outro processo" ,"Não esqueça de Salvar o processo Atual",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                                if (xx==0){
                                    
                                jFormattedTextField8.setText(Id);
                     
                                    if(jComboBox3.getSelectedItem().toString().equals("Andamento")||jComboBox3.getSelectedItem().toString().equals("Selecione")){
                                
                                        if(jTextField14.getText().equals("")){
                                       
                                        JOptionPane.showMessageDialog(null, "Consulte o N° do processo Antes de Salvar!"); 
            
                                        }else{
                                        
                                        Class.forName("com.mysql.jdbc.Driver");

                                        com.mysql.jdbc.Connection mat;

                                        mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                               
                                        String quer = "UPDATE processo SET situacao = ?, descricao = ?, proprietario = ? WHERE num = ? ";
                      
                                        com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(quer);
                
                                        stmt.setString(1, jTextField17.getText());
                                        stmt.setString(2, jTextArea8.getText());
                                        stmt.setString(3, idfunc); 
                                        stmt.setString(4, num);                 
                                                
                                        stmt.executeUpdate();                     
                   
                                        stmt.close();
                   
                                        mat.close();
            
                                        refrashtabela(1);
                                    
                                        jFormattedTextField7.setText("");
                                        jFormattedTextField6.setText("");
                                        jTextField17.setText("");
                                        jTextArea6.setText("");
                                        jTextArea7.setText("");
                                        jTextField13.setText("");
                                        jTextField14.setText("");
                                        jTextField15.setText("");
                                        jTextField16.setText("");
                                        jComboBox9.setSelectedItem("Selecione");
                                        jComboBox3.setSelectedItem("Selecione");
                                    
                                        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");   
                    
                                        jFormattedTextField8.grabFocus(); 
                                    
                                        }
                                    
                                    }else{                                         
                                        
                                     int xxx = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja ENCERRAR o Processo?", "ATENÇÃO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                                        if (xxx == 0) {
                                            
                                            if(jTextField14.getText().equals("")){
                                       
                                            JOptionPane.showMessageDialog(null, "Consulte o N° do processo para Encerrar o processo!"); 
            
                                            }else{
                
                                            Class.forName("com.mysql.jdbc.Driver");

                                            com.mysql.jdbc.Connection mat;

                                            mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

                                            String query2;
                    
                                            query2 = "UPDATE processo SET situacao = ?, descricao = ? WHERE num = ? ";
                        
                                            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(query2);  
                                     
                                            stmt.setString(1, jComboBox3.getSelectedItem().toString());
                                            stmt.setString(2, jTextArea8.getText()); 
                                            stmt.setString(3, num); 
                                
                                            stmt.executeUpdate();                     
                     
                                            stmt.close();
                     
                                            mat.close();
              
                                            refrashtabela(1);
              
                                            jFormattedTextField7.setText("");
                                            jFormattedTextField6.setText("");
                                            jTextField17.setText("");
                                            jTextArea6.setText("");
                                            jTextArea7.setText("");
                                            jTextField13.setText("");
                                            jTextField14.setText("");
                                            jTextField15.setText("");
                                            jTextField16.setText("");
                                            jFormattedTextField8.setText(""); 
                                            jComboBox9.setSelectedItem("Selecione");
                                            jComboBox3.setSelectedItem("Selecione");
                
                                            JOptionPane.showMessageDialog(null, "ADMINISTRADORES INFORMA, Processo Encerrado!!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                   
                                            jFormattedTextField8.grabFocus(); 
                                        
                                            }
                                        
                                        }
            
                                    } 
                                
                                }  
          
                        }
                   
                jButton2.doClick();
                                
                }
                
            } catch (SQLException | ClassNotFoundException ex) {
                
                Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
            int i=1;
        
            refrashtabela(i);
            
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
        if(evt.getClickCount() == 2){
            
        Object obj  = (jTable2.getValueAt(jTable2.getSelectedRow(), 0));  
        String Id = obj.toString();             
            
        String num= jFormattedTextField8.getText();
            
        jTextField5.setText(Id);
            
        jTextField7.setText("s"); 
            
            try {
                
                StringBuffer textos = new StringBuffer();
            
                textos.append(jTextArea6.getText() + "\n"); 
                textos.append(jTextArea7.getText()); 
            
                jTextArea8.setText(textos.toString());
                
                int a = -1;
                
                LoginSenha lll = new LoginSenha();
        
                String lppp; 
                
                lppp = LoginSenha.jTextField1.getText();  
                
                Class.forName("com.mysql.jdbc.Driver");               

                com.mysql.jdbc.Connection conn; 
                
                conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                
                String sqlsss;
                
                sqlsss = "SELECT idfunc FROM func WHERE login = ?";
                
                com.mysql.jdbc.PreparedStatement pssss;
                                
                pssss = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlsss);
                                           
                pssss.setString(1, lppp);
                
                ResultSet rssss;
                
                rssss = pssss.executeQuery();
                
                int idfuncc = 0;    

                if (rssss.next()) {
                
                idfuncc = rssss.getInt("idfunc"); 
                
                }
                         
                String sqlss;
                
                sqlss = "SELECT num, proprietario FROM processo WHERE num = ?";                
                
                com.mysql.jdbc.PreparedStatement psss;                
                
                psss = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlss);  
                
                psss.setString(1, Id);
                
                ResultSet rsss;

                rsss = psss.executeQuery();
                
                int proprietario;                 
                
                rsss.next();
                    
                proprietario = rsss.getInt("proprietario");                
                             
                if(proprietario == a){
        
                int x = JOptionPane.showConfirmDialog(null, "Aceitar Processo" ,"Deseja Trabalhar no Processo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                                       
                    if (x==0) {   
                    
                    LoginSenha ll = new LoginSenha();
        
                    String lpp; 
                
                    lpp = LoginSenha.jTextField1.getText();  
                
                    Class.forName("com.mysql.jdbc.Driver");               

                    com.mysql.jdbc.Connection con;                
               
                    con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                         
                    String sqls;

                    sqls = "SELECT login, idfunc FROM login WHERE login = ?";

                    com.mysql.jdbc.PreparedStatement ps;

                    ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqls);

                    ps.setString(1, lpp);                
            
                    ResultSet rs;

                    rs = ps.executeQuery();
            
                    String login = null;  
                
                    String idfunc = null;    

                    rs.next();
                
                    login = rs.getString("login");
                    idfunc = rs.getString("idfunc");

                    ps.close();                
            
                    String query; 
                
                    String situacao="Andamento";
                            
                    query = "UPDATE processo p, login l SET p.situacao = ?, p.proprietario = ?, p.nome = ? WHERE l.login = ? AND p.num = ? ";
                    
                    com.mysql.jdbc.PreparedStatement stmtt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);                        
                 
                    stmtt.setString(1, situacao);
                    stmtt.setString(2, idfunc);    
                    stmtt.setString(3, jTextField4.getText()); 
                    stmtt.setString(4, login); 
                    stmtt.setString(5, Id); 
                
                    stmtt.executeUpdate();   
                               
                    stmtt.close();
                
                    String query1; 
                
                    query1 = "UPDATE solicitacao SET idfuncsol = ? WHERE num = ? ";
                    
                    com.mysql.jdbc.PreparedStatement stmttt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query1);                        
                 
                    String index;
 
                    index = (String) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0);
                
                    stmttt.setString(1, idfunc);
                    stmttt.setString(2, index);    
                
                    stmttt.executeUpdate();   
                               
                    stmttt.close(); 
                
                    con.close();   
                    
                    psss.close(); 
            
                    conn.close();                      
        
                        if(Id.equals(num)||num.equals("    ")){
                            
                        jFormattedTextField8.setText(Id);
                        
                        }else{
             
                         int xx = JOptionPane.showConfirmDialog(null, "Deseja Salvar as Alterações do Processo atual, antes de Trabalhar em outro processo" ,"Não esqueça de Salvar o processo Atual",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                            if (xx==0){ 
                                    
                                if(jTextField14.getText().equals("")){            
         
                                JOptionPane.showMessageDialog(null, "Consulte o N° do processo Antes de Salvar!"); 
                                
                                }else{ 
                                    
                                    jFormattedTextField8.setText(Id);
                     
                                    if(jComboBox3.getSelectedItem().toString().equals("Andamento")||jComboBox3.getSelectedItem().toString().equals("Selecione")){
            
                                    Class.forName("com.mysql.jdbc.Driver");

                                    com.mysql.jdbc.Connection mat;

                                    mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

                                    String quer = "UPDATE processo SET situacao = ?, descricao = ?, proprietario = ? WHERE num = ? ";
                      
                                    com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(quer);
                
                                    stmt.setString(1, jTextField17.getText());
                                    stmt.setString(2, jTextArea8.getText());
                                    stmt.setString(3, idfunc); 
                                    stmt.setString(4, num);                 
                                                
                                    stmt.executeUpdate();                     
                   
                                    stmt.close();
                   
                                    mat.close();
            
                                    refrashtabela(1);            
              
                                    jFormattedTextField7.setText("");
                                    jFormattedTextField6.setText("");
                                    jTextField17.setText("");
                                    jTextArea6.setText("");
                                    jTextArea7.setText("");
                                    jTextField13.setText("");
                                    jTextField14.setText("");
                                    jTextField15.setText("");
                                    jTextField16.setText("");
                                    jComboBox9.setSelectedItem("Selecione");
                                    jComboBox3.setSelectedItem("Selecione");
                    
                                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!"); 
                                    
                                    jFormattedTextField8.grabFocus(); 
                    
                                    }else{
                
                                        int xxx = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja ENCERRAR o Processo?", "ATENÇÃO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                                            if (xxx == 0) {
                
                                            Class.forName("com.mysql.jdbc.Driver");

                                            com.mysql.jdbc.Connection mat;

                                            mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

                                            String query2;
                    
                                            query2 = "UPDATE processo SET situacao = ?, descricao = ? WHERE num = ? ";
                        
                                            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(query2);  
              
                                            stmt.setString(1, jComboBox3.getSelectedItem().toString());
                                            stmt.setString(2, jTextArea8.getText()); 
                                            stmt.setString(3, num); 
                                
                                            stmt.executeUpdate();                     
                     
                                            stmt.close();
                     
                                            mat.close();
              
                                            refrashtabela(1);
              
                                            jFormattedTextField7.setText("");
                                            jFormattedTextField6.setText("");
                                            jTextField17.setText("");
                                            jTextArea6.setText("");
                                            jTextArea7.setText("");
                                            jTextField13.setText("");
                                            jTextField14.setText("");
                                            jTextField15.setText("");
                                            jTextField16.setText("");
                                            jFormattedTextField8.setText(""); 
                                            jComboBox9.setSelectedItem("Selecione");
                                            jComboBox3.setSelectedItem("Selecione");
                
                                            JOptionPane.showMessageDialog(null, "ADMINISTRADORES INFORMA, Processo Encerrado!!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                   
                                            jFormattedTextField8.grabFocus(); 
              
                                            }
            
                                     } 
                     
                                }
                 
                             } 
          
                        }
                        
                    jButton2.doClick();
                    
                    }
                
        }else if(proprietario == idfuncc){        
                    
              psss.close(); 
            
              conn.close();              
              
              jButton2.doClick();
            
              }else{
        
               JOptionPane.showMessageDialog(null, "Esse processo ja esta em Andamento!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               
              }
                
            }catch (SQLException | ClassNotFoundException exx) {
            
            } 
            
            int i=1;
        
            refrashtabela(i);            
            
        }
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        new ConsProcesso().show();
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
        
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        new ConsSolocitacao().show();
        
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       
        new ConsMensagens().show();
        
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       
        new AlteraFuncionario().show();
        
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
         
        new ConsAdm().show();
         
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
        new ConsFuncionario().show();
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        new ConsProcessoArq().show();
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseEntered

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
        
        
        
    }//GEN-LAST:event_jTable2AncestorAdded

    private void jFormattedTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField6ActionPerformed

   }//GEN-LAST:event_jFormattedTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jFormattedTextField7.setText("");
        jFormattedTextField6.setText("");
        jTextField17.setText("");
        jTextArea6.setText("");
        jTextArea7.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jComboBox9.setSelectedItem("Selecione");
        jComboBox3.setSelectedItem("Selecione");
        
        num = jFormattedTextField8.getText();

        try {

            if (jFormattedTextField8.getText().equals("    ")) {

            JOptionPane.showMessageDialog(null, "Digite um numero de processo valido!! ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
            jFormattedTextField8.grabFocus();
                
            } else {

              String sit = "Andamento";

              Class.forName("com.mysql.jdbc.Driver");

              Connection cons;

              cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

              String query = "SELECT * FROM processo WHERE  num = ? AND setor = ? AND proprietario = ? AND situacao = ?";

              PreparedStatement consulta;

              consulta = (PreparedStatement) cons.prepareStatement(query);

              consulta.setString(1, jFormattedTextField8.getText());
              consulta.setString(2, fila);
              consulta.setString(3, idfunc);
              consulta.setString(4, sit);

              ResultSet rs;

              rs = consulta.executeQuery();

                while (rs.next()) {

                jFormattedTextField7.setText(rs.getString("data"));
                jFormattedTextField6.setText(rs.getString("hora"));
                jTextField17.setText(rs.getString("situacao"));
                jTextField13.setText(rs.getString("assunto"));
                jTextField14.setText(rs.getString("setor"));
                jTextField15.setText(rs.getString("prioridade"));
                jTextField16.setText(rs.getString("nome"));
                jTextArea6.setText(rs.getString("descricao"));

                }

              consulta.close();

              cons.close();
                
              jTextArea6.grabFocus();
                
                if (jTextField13.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Processo não se econtra na sua fila!! ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    
                jFormattedTextField8.grabFocus();   
                    
                }
                
            }
            
        } catch (ClassNotFoundException ex) {

            System.out.println("Nao foi possivel fazer a consulta");

        } catch (SQLException ex) {

            System.out.println("Nao foi possivel connectar ao SQL" + ex.getMessage());

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed

   }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
            
        if(jTextField14.getText().equals("")){            
         
        JOptionPane.showMessageDialog(null, "Consulte um N° de processo Valido Antes de Enviar!"); 
            
        jFormattedTextField8.grabFocus(); 
            
        }else{ 
            
            if(jComboBox9.getSelectedItem().toString().equals("Selecione")||jComboBox9.getSelectedItem().toString().equals("") ){  
            
            JOptionPane.showMessageDialog(null, "Selecione o Setor para onde vai enviar o processo!"); 
            
            }else{ 
              
                if(jComboBox3.getSelectedItem().toString().equals("Selecione")){
         
                JOptionPane.showMessageDialog(null, " Selecione a Atual Situação do processo!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               
                }else{
             
                    try {  
                        
                    StringBuffer textos = new StringBuffer();
            
                    textos.append(jTextArea6.getText() + "\n"); 
                    textos.append(jTextArea7.getText()); 
                    
                    jTextArea8.setText(textos.toString()); 
             
                    if(jComboBox3.getSelectedItem().toString().equals("Andamento")){
             
                    int num = -1;
            
                    String nome = null;
            
                    Class.forName("com.mysql.jdbc.Driver"); 
            
                        if (jComboBox3.getSelectedItem().toString().equals("")||jTextArea6.getText().equals("")) {

                        JOptionPane.showMessageDialog(null, " Todos os campos são Obrigatórios!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                        }else {                     
                    
                        com.mysql.jdbc.Connection con;                
                   
                        con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                     
                        String query;
                    
                        query = "UPDATE processo SET data = ?, hora = ?, situacao = ?, setor = ?, proprietario = ?, descricao = ?, nome = ? WHERE num = ? ";
                        
                        com.mysql.jdbc.PreparedStatement stmtt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);  
                   
                        stmtt.setString(1, jFormattedTextField7.getText());
                        stmtt.setString(2, jFormattedTextField6.getText());
                        stmtt.setString(3, jTextField17.getText());
                        stmtt.setString(4, jComboBox9.getSelectedItem().toString());
                        stmtt.setInt(5, num);                    
                        stmtt.setString(6, jTextArea8.getText());
                        stmtt.setString(7, nome);
                        stmtt.setString(8, jFormattedTextField8.getText());                     
                                
                        stmtt.executeUpdate();
                    
                        stmtt.close();   
                    
                        con.close();                                       
                
                        refrashtabela(1);
                    
                        JOptionPane.showMessageDialog(null, "O processo foi encaminhado!!"); 
                    
                        jFormattedTextField7.setText("");
                        jFormattedTextField6.setText("");
                        jTextField17.setText("");
                        jTextArea6.setText("");
                        jTextArea7.setText("");
                        jTextField13.setText("");
                        jTextField14.setText("");
                        jTextField15.setText("");
                        jTextField16.setText("");
                        jFormattedTextField8.setText(""); 
                        jComboBox9.setSelectedItem("Selecione");
                        jComboBox3.setSelectedItem("Selecione");
                        
                        }
            
                    jFormattedTextField8.grabFocus(); 
                    
                    } else{
               
                    Class.forName("com.mysql.jdbc.Driver");

                    com.mysql.jdbc.Connection mat;

                    mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

                        if (jFormattedTextField8.getText().equals("    ")||jFormattedTextField7.getText().equals("  /  /    ")||jFormattedTextField6.getText().equals("  :  ")||jTextField17.getText().equals("")||jTextField13.getText().equals("")||jTextField14.getText().equals("")||jTextField15.getText().equals("")||jTextField16.getText().equals("")||jComboBox9.getSelectedItem().toString().equals("")||jTextArea6.getText().equals("")) {

                        JOptionPane.showMessageDialog(null, " Todos os campos são Obrigatórios!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                        }else{
                
                        int x = JOptionPane.showConfirmDialog(this, "Tem Certeza que deseja ENCERRAR o Processo?", "ATENÇÃO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
             
                            if (x == 0) {
                
                            Fila ta = new Fila();
               
                            String num2 = ta.idfunc;                    
              
                            String query1;
                    
                            query1 = "UPDATE processo SET situacao = ?, descricao = ? WHERE num = ? ";
                        
                            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(query1);  
              
                            stmt.setString(1, jComboBox3.getSelectedItem().toString());
                            stmt.setString(2, jTextArea8.getText()); 
                            stmt.setString(3, jFormattedTextField8.getText()); 
                                
                            stmt.executeUpdate(); 
              
                            stmt.close();
                     
                            mat.close();              
              
                            refrashtabela(1);
                    
                            JOptionPane.showMessageDialog(null, "ADMINISTRADORES INFORMA, Processo Encerrado!!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
               
                            jFormattedTextField7.setText("");
                            jFormattedTextField6.setText("");
                            jTextField17.setText("");
                            jTextArea6.setText("");
                            jTextArea7.setText("");
                            jTextField13.setText("");
                            jTextField14.setText("");
                            jTextField15.setText("");
                            jTextField16.setText("");
                            jFormattedTextField8.setText(""); 
                            jComboBox9.setSelectedItem("Selecione");
                            jComboBox3.setSelectedItem("Selecione");
                            }  
              
                        jFormattedTextField8.grabFocus(); 
                    
                        }
             
                    }             
             
                } catch (SQLException | ClassNotFoundException ex) {
                    
                  Logger.getLogger(ConsSolicitacaoDet.class.getName()).log(Level.SEVERE, null, ex);
            
                }
                
              }
            
            }
          
       } 
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
                
        String proprietario = idfunc;
        
        if(jTextField14.getText().equals("")){            
         
        JOptionPane.showMessageDialog(null, "Consulte um N° de processo Valido Antes de Salvar!"); 
            
        jFormattedTextField8.grabFocus(); 
            
        }else{ 
            
        if (jTextArea6.getText().equals("")){

        JOptionPane.showMessageDialog(null, " Todos os campos são Obrigatórios!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
        }else{             
         
         try {
             
            StringBuffer textos = new StringBuffer();
            
            textos.append(jTextArea6.getText() + "\n"); 
            textos.append(jTextArea7.getText()); 
            
            jTextArea8.setText(textos.toString()); 
              
            if(jComboBox3.getSelectedItem().toString().equals("Andamento")||jComboBox3.getSelectedItem().toString().equals("Selecione")){
            
            Class.forName("com.mysql.jdbc.Driver");

            com.mysql.jdbc.Connection mat;

            mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

            String query1 = "UPDATE processo SET situacao = ?, descricao = ?, proprietario = ? WHERE num = ? ";
                      
            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(query1);
                
            stmt.setString(1, jTextField17.getText());
            stmt.setString(2, jTextArea8.getText());
            stmt.setString(3, proprietario); 
            stmt.setString(4, jFormattedTextField8.getText());                 
                                                
            stmt.executeUpdate();                     
                   
            stmt.close();
                   
            mat.close();
            
            refrashtabela(1);
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!"); 
              
            jFormattedTextField7.setText("");
            jFormattedTextField6.setText("");
            jTextField17.setText("");
            jTextArea6.setText("");
            jTextArea7.setText("");
            jTextField13.setText("");
            jTextField14.setText("");
            jTextField15.setText("");
            jTextField16.setText("");
            jFormattedTextField8.setText(""); 
            jComboBox9.setSelectedItem("Selecione");
            jComboBox3.setSelectedItem("Selecione");
                    
            jFormattedTextField8.grabFocus(); 
                    
            }else{
                
            int x = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja ENCERRAR o Processo?", "ATENÇÃO", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (x == 0) {
                
            Class.forName("com.mysql.jdbc.Driver");

            com.mysql.jdbc.Connection mat;

            mat = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

                if (jFormattedTextField8.getText().equals("    ")||jFormattedTextField7.getText().equals("  /  /    ")||jFormattedTextField6.getText().equals("  :  ")||jTextField17.getText().equals("")||jTextField13.getText().equals("")||jTextField14.getText().equals("")||jTextField15.getText().equals("")||jTextField16.getText().equals("")||jComboBox3.getSelectedItem().toString().equals("")||jTextArea6.getText().equals("")) {

                JOptionPane.showMessageDialog(null, " Todos os campos são Obrigatórios!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                }else{   
              
                String query1;
                    
                query1 = "UPDATE processo SET situacao = ?, descricao = ? WHERE num = ? ";
                        
                com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) mat.prepareStatement(query1);  
              
                stmt.setString(1, jComboBox3.getSelectedItem().toString());
                stmt.setString(2, jTextArea8.getText()); 
                stmt.setString(3, jFormattedTextField8.getText()); 
                                
                stmt.executeUpdate();                     
                     
                stmt.close();
                     
                mat.close();
              
                refrashtabela(1);
              
                jFormattedTextField7.setText("");
                jFormattedTextField6.setText("");
                jTextField17.setText("");
                jTextArea6.setText("");
                jTextArea7.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jFormattedTextField8.setText(""); 
                jComboBox9.setSelectedItem("Selecione");
                jComboBox3.setSelectedItem("Selecione");
                
                JOptionPane.showMessageDialog(null, "ADMINISTRADORES INFORMA, Processo Encerrado!!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                   
                jFormattedTextField8.grabFocus();  
                        
                }
              
          }
            
          } 
            
       }catch (SQLException | ClassNotFoundException ex) {
            
       Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
            
       }
          
      }
        
      }        
               
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox9MouseClicked
        
        refrashtabela(1);
        
    }//GEN-LAST:event_jComboBox9MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
        
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        new ConsDados().show();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        StringBuffer texto = new StringBuffer();
        
        texto.append("DADOS DO PROCESSO");       
        texto.append("\n");
        texto.append("\n");
        texto.append("N° Processo: ");
        texto.append(jFormattedTextField8.getText() + "       ");
        texto.append("Data de Abertura: ");
        texto.append(jFormattedTextField7.getText() + "       ");
        texto.append("Hora de Abertura: ");
        texto.append(jFormattedTextField6.getText() + "\n");
        texto.append("\n");
        texto.append("Situação: ");
        texto.append(jTextField17.getText() + "       ");
        texto.append("Assunto: ");
        texto.append(jTextField13.getText() + "        ");
        texto.append("Setor: ");
        texto.append(jTextField14.getText() + "\n");
        texto.append("\n");
        texto.append("Prioridade: ");
        texto.append(jTextField15.getText() + "         ");
        texto.append("Proprietario: ");
        texto.append(jTextField16.getText() + "\n");
        texto.append("\n");
        texto.append("\n");
        texto.append("DESCRIÇÃO");
        texto.append("\n");
        texto.append("\n");
        texto.append(jTextArea6.getText() + "\n"); 

        jTextArea8.setText(texto.toString()); 
        
        System.out.println(jTextArea8.getText());

        try {
            
            jTextArea8.print();
            
        } catch (PrinterException ex) {
            
            JOptionPane.showMessageDialog(this, "Não foi possível imprimir\n" + ex.getMessage());
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea6AncestorAdded
        jTextArea6.setColumns(72);  
        jTextArea6.setRows(3);  
        jTextArea6.setWrapStyleWord(true);  
        jTextArea6.setLineWrap(true);  
    }//GEN-LAST:event_jTextArea6AncestorAdded

    private void jTextArea7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea7AncestorAdded
        jTextArea7.setColumns(72);  
        jTextArea7.setRows(3);  
        jTextArea7.setWrapStyleWord(true);  
        jTextArea7.setLineWrap(true);
    }//GEN-LAST:event_jTextArea7AncestorAdded

    private void jTextArea8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea8AncestorAdded
        jTextArea8.setColumns(72);  
        jTextArea8.setRows(3);  
        jTextArea8.setWrapStyleWord(true);  
        jTextArea8.setLineWrap(true);
    }//GEN-LAST:event_jTextArea8AncestorAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StringBuffer textos = new StringBuffer();
            
        textos.append(jTextArea6.getText() + "\n"); 
        textos.append(jTextArea7.getText()); 
            
        jTextArea9.setText(textos.toString());    
        
        new ConsExp().show();    
                         
                    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextArea9AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea9AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea9AncestorAdded
    public void refrashtabela(int i){
        
            int ii = i; 
        
            if(ii==1){
            
                try {
           
                Class.forName("com.mysql.jdbc.Driver");
            
                Connection con;               
           
                con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
            
                String stmt1 = "SELECT * FROM processo WHERE setor = ? AND proprietario = ? AND situacao = ? ORDER BY prioridade";   
             
                PreparedStatement consultas;
             
                consultas = con.prepareStatement(stmt1);            
             
                consultas.setString(1, jTextField3.getText()); 
                consultas.setInt(2, a);             
                consultas.setString(3, sit);             
             
                ResultSet rss;     
             
                rss = consultas.executeQuery();
             
                DefaultTableModel Mode2 = (DefaultTableModel) jTable2.getModel();
             
                jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
                jTable2.getColumnModel().getColumn(1).setPreferredWidth(20);
                jTable2.getColumnModel().getColumn(2).setPreferredWidth(20);  
                jTable2.getColumnModel().getColumn(3).setPreferredWidth(100); 
                jTable2.getColumnModel().getColumn(4).setPreferredWidth(10);
                       
                Mode2.setNumRows(0);
             
                    while(rss.next()){          
         
                    Mode2.addRow(new Object[]{rss.getString("num"), rss.getString("data"), rss.getString("situacao"),  rss.getString("assunto"), rss.getString("prioridade")});
              
                    }             
               
                rss.close(); 
                
                String stmt = "SELECT * FROM processo WHERE setor = ? AND proprietario = ? AND situacao = ? ORDER BY prioridade";   
             
                PreparedStatement consulta;
             
                consulta = con.prepareStatement(stmt);
             
                consulta.setString(1, jTextField3.getText());
                consulta.setString(2, jTextField2.getText());             
                consulta.setString(3, sit);
             
                ResultSet r;     
             
                r = consulta.executeQuery();
             
                DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
             
                jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
                jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
                jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);  
                jTable1.getColumnModel().getColumn(3).setPreferredWidth(100); 
                jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);  
             
                Mode1.setNumRows(0);
             
                    while(r.next()){          
                    
                    Mode1.addRow(new Object[]{r.getString("num"), r.getString("data"), r.getString("situacao"),  r.getString("assunto"), r.getString("prioridade")});
              
                    }      
                
                r.close(); 
            
                consulta.close();
                
                String situ = "Nova";
                
                String stmt2 = "SELECT count(*) FROM solicitacao WHERE situacao = ? AND idfuncsol = ?"; 
            
                PreparedStatement pss;

                pss = (PreparedStatement) con.prepareStatement(stmt2);
            
                pss.setString(1, situ);            
                pss.setString(2, idfunc);
            
                ResultSet rssss;

                rssss = pss.executeQuery();   
            
                String novo = null;                 
         
                    if (rssss.next()) {
             
                    novo = rssss.getString("count(*)");            
            
                    }
            
                jTextField1.setText(novo);                        
            
                rssss.close();
            
                pss.close();
             
                String stmt3 = "SELECT count(*) FROM soliciadm WHERE situacao = ? AND idsolicit = ?"; 
            
                PreparedStatement psss;

                psss = (PreparedStatement) con.prepareStatement(stmt3);
            
                psss.setString(1, situ);            
                psss.setString(2, idfunc);
            
                ResultSet rsssss;

                rsssss = psss.executeQuery();   
            
                String novo1 = null;                 
         
                    if (rsssss.next()) {
             
                    novo1 = rsssss.getString("count(*)");            
            
                    }
            
                jTextField6.setText(novo1);                        
             
                rsssss.close();
            
                psss.close();  
                
                jComboBox9.removeAllItems();
                
                jComboBox9.addItem("Selecione");
                
                String stmt4 = "SELECT * FROM setor";
         
                java.sql.PreparedStatement consu;
             
                consu = con.prepareStatement(stmt4);
             
                ResultSet rsServicos;     
         
                rsServicos = consu.executeQuery();
            
                    while(rsServicos.next()){
            
                    String serv = rsServicos.getString(1);
            
                    jComboBox9.addItem(serv);
            
                    }
        
                rsServicos.close();
             
                consu.close();
            
                con.close();
                
                } catch (SQLException | ClassNotFoundException ex) {
            
                Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
            
                }
                   
                jTable2.repaint();  
             
                jTable2.revalidate();
                
                jTable1.repaint();  
             
                jTable1.revalidate(); 
                
            } 
    
    }
   
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            
            public void run() {
                
                new Fila().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    public final javax.swing.JFormattedTextField jFormattedTextField8 = new javax.swing.JFormattedTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    public static final javax.swing.JTextArea jTextArea9 = new javax.swing.JTextArea();
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public static transient volatile javax.swing.JTextField jTextField4;
    public static final transient javax.swing.JTextField jTextField5 = new javax.swing.JTextField();
    private javax.swing.JTextField jTextField6;
    public static final transient javax.swing.JTextField jTextField7 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}

package view;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.Fila.jTextArea9;
import javax.swing.JTable;

public class TProcesso extends javax.swing.JFrame {

    String num;
    
    int op;
    
    String data;
    
    String hora;
    
    String data1;
    
    String hora1;
    
    int op1;
    
    String adm;
        
    public TProcesso() {
        
        try {
            
            setResizable(false);           
            
            initComponents(); 
            
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            Fila f = new Fila();
            
            LoginSenha l = new LoginSenha();
                
            adm = f.adimin;    
            
            String lp = l.jTextField1.getText();
                        
            if (adm.equals("sim")) {
                     
            jButton5.setVisible(true);
            
            jComboBox1.setVisible(true);
            
            jLabel9.setVisible(true);
            
            jButton4.setVisible(false); 
            
            }else{
                
            jButton5.setVisible(false); 
            
            jComboBox1.setVisible(false);
            
            jLabel9.setVisible(false);
            
            } 
                
            this.setLocationRelativeTo(null);
                
            ConsProcesso ta = new ConsProcesso(); 
            
            ConsProcessoArq tp = new ConsProcessoArq();
            
            String decid = tp.jTextField1.getText();
            
                if(decid .equals("ok")){
                
                jFormattedTextField3.setText(tp.jTextField2.getText());
                
                op = -1;
            
                }else{
            
                jFormattedTextField3.setText(ta.jTextField1.getText());
            
                }
                
                jComboBox1.addItem("Selecione");
               
                Class.forName("com.mysql.jdbc.Driver");

                Connection con;
                    
                con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                
                String stmt4 = "SELECT * FROM setor";
                 
                java.sql.PreparedStatement consu;
                     
                consu = con.prepareStatement(stmt4);
                     
                ResultSet rsServicos;     
                 
                rsServicos = consu.executeQuery();
                    
                    while(rsServicos.next()){
                    
                    String serv = rsServicos.getString(1);
                    
                    jComboBox1.addItem(serv);
                    
                    }
                
                rsServicos.close();
                     
                consu.close();
                    
                con.close();
                
        } catch (SQLException | ClassNotFoundException ex) {
            
            Logger.getLogger(TProcesso.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Processo");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processo em Andamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

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
                "N°", "Data", "Hora", "Situação", "Proprietario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Reabrir processo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Setor que deseja enviar o processo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 260, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prioridade:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Situação:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Setor responsavel:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Assunto:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N° processo:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aberto em:");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jFormattedTextField3.setEditable(false);
        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("as");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Proprietario:");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Abrir Chamado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("solicitar processo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Expandir ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea9.setRows(5);
        jScrollPane12.setViewportView(jTextArea9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton4, jButton6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(11, 11, 11))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection cons;
            
            cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
            
            String query = "SELECT * FROM processo WHERE num = ?";
            
            PreparedStatement consulta;
            
            consulta = (PreparedStatement) cons.prepareStatement(query);
            
            consulta.setString(1, jFormattedTextField3.getText());
            
            ResultSet rs;
            
            rs = consulta.executeQuery();
            
            while (rs.next()) {
                
                jTextField5.setText(rs.getString("situacao"));
                jTextField6.setText(rs.getString("data"));
                jTextField7.setText(rs.getString("hora"));
                jTextField3.setText(rs.getString("assunto"));
                jTextField4.setText(rs.getString("setor"));
                jTextField1.setText(rs.getString("prioridade"));
                jTextField2.setText(rs.getString("nome"));
                jTextArea1.setText(rs.getString("descricao"));
                
            }            
            
            consulta.close();
            
            String query1 = "SELECT * FROM logprocesso WHERE num = ?";

            java.sql.PreparedStatement consultas;
            
            consultas = cons.prepareStatement(query1);

            consultas.setString(1, jFormattedTextField3.getText());
            
            ResultSet rss;

            rss = consultas.executeQuery();
    
            DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
            
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);   
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
             
            Mode1.setNumRows(0);

            while (rss.next()) {
              
            Mode1.addRow(new Object[]{rss.getString("num"),rss.getString("datainicio"), rss.getString("horainicio"), rss.getString("situacao"),  rss.getString("nome")});
              
            }

            cons.close();
            
            consultas.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TProcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        if(jTextField1.getText().equals("")){
        
        JOptionPane.showMessageDialog(null, "Consulte o processo que deseja Solicitar !");           
    
        }else{ 
            
            Object obj = (jTable1.getValueAt(jTable1.getRowCount()-1, 3).toString());
        
            String a = obj.toString();
        
            if(a.equals("Fechado")){
        
            JOptionPane.showMessageDialog(null, "ADMINISTRADORES INFORMA, Esse processo esta Fechado!!!", "Contate um adiministrador para verificar esse procedimento", JOptionPane.INFORMATION_MESSAGE);
   
            }else{   
                
            new Solicitacao().show();
            
            }
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        new ConsAdm().show();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
    Fila f = new Fila();                
     
    String adm = f.adimin; 
    
     if(evt.getClickCount() == 2){  
            
     jFormattedTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
          
     data1=(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
     
     hora1=(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
     
        if(adm.equals("sim")){
         
        op1 = -3;
     
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText(""); 
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField3.setText("");
        jTextArea1.setText("");
        jComboBox1.setSelectedItem("Selecione");
     
        }else{        
        
        JOptionPane.showMessageDialog(null, "Contate um ADMINISTRADOR para mais informações"); 
        
        }       
        
     click();
     
     }
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
    if(jTextField1.getText().equals("")){
        
    JOptionPane.showMessageDialog(null, "Consulte o processo que deseja Reativar !");           
    
    }else{
        
        if(jComboBox1.getSelectedItem().toString().equals("Selecione")){
        
        JOptionPane.showMessageDialog(null, "Selecione o Setor que deseja Enviar esse Processo!");           
    
        }else{ 
        
        try {
           
        String sit1;
            
        Class.forName("com.mysql.jdbc.Driver");

        Connection cons;
                   
        cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
               
        String query1 = "SELECT * FROM processo WHERE num = ?";

        java.sql.PreparedStatement consultas;
                   
        consultas = cons.prepareStatement(query1);

        consultas.setString(1, jFormattedTextField3.getText());
                  
        ResultSet rss;

        rss = consultas.executeQuery();
           
        rss.next();
            
        sit1 = rss.getString("situacao");
        
        cons.close();
                   
        consultas.close(); 
                
           if(sit1.equals("Andamento")){        
           
           JOptionPane.showMessageDialog(null, "Esse processo ja se econtra Aberto!!");
           
           new TProcesso().setVisible(false);

           dispose();
           
           }else{
               
               int xx = JOptionPane.showConfirmDialog(null, "Esse processo Sera Aberto com a Descrição presente nesse formulario, Deseja continuar?" ,"Reativação do processo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
               if (xx==0){  
               
                   try {
                   
                    String sit = "Andamento";
               
                    int propri = -1;
               
                    String nome = null;
               
                    Class.forName("com.mysql.jdbc.Driver"); 
                         
                    com.mysql.jdbc.Connection con;                
                                
                    con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                                  
                    String query;
                                 
                    query = "UPDATE processo SET  situacao = ?, setor = ?, proprietario = ?, descricao = ?, nome = ? WHERE num = ? ";
                                 
                    com.mysql.jdbc.PreparedStatement stmtt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);  
                    stmtt.setString(1, sit);                   
                    stmtt.setString(2, jComboBox1.getSelectedItem().toString());
                    stmtt.setInt(3, propri); 
                    stmtt.setString(4, jTextArea1.getText()); 
                    stmtt.setString(5, nome);     
                    stmtt.setString(6, jFormattedTextField3.getText());      
                             
                    stmtt.executeUpdate();                          
                                  
                    stmtt.close();                            
                                 
                    con.close();
                                  
                    JOptionPane.showMessageDialog(null, "O processo Foi Aberto novamente!!");                     
                                                          
                    new TProcesso().setVisible(false);

                    dispose(); 
                                 
                    } catch (SQLException | ClassNotFoundException ex) {            
                  
                    } 
               
               }else{
        
                JOptionPane.showMessageDialog(null, "Solicitação Cancelada!!");        
            
                new TProcesso().setVisible(false);

                dispose();       
                
               }   
               
           }
           
        } catch (    SQLException | ClassNotFoundException ex) {
            
        Logger.getLogger(TProcesso.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        }
    
    }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        jTextArea1.setColumns(72);  
        jTextArea1.setRows(3);  
        jTextArea1.setWrapStyleWord(true);  
        jTextArea1.setLineWrap(true);  
    }//GEN-LAST:event_jTextArea1AncestorAdded

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    
        StringBuffer textos = new StringBuffer();
            
        textos.append(jTextArea1.getText()); 
            
        jTextArea9.setText(textos.toString());    
        
        new ConsExp().show();  
        
    }//GEN-LAST:event_jButton6ActionPerformed
    public void click(){
        
    if(op==-1){
        
    num = jFormattedTextField3.getText();
            
        try {        
                
        ConsProcessoArq ca = new ConsProcessoArq();
        
        hora = ca.jTextField4.getText();
        
        data = ca.jTextField3.getText();
        
        if(op1 == -3){
            
        data = data1;
        
        hora = hora1;
        
        } 
                      
        Class.forName("com.mysql.jdbc.Driver");

        Connection cons;
            
        cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
            
        String query = "SELECT * FROM logprocesso WHERE  num = ? AND datainicio = ? AND horainicio = ?";

        PreparedStatement consulta;        
         
            
        consulta = (PreparedStatement) cons.prepareStatement(query);
        
               
        consulta.setString(1, jFormattedTextField3.getText());
        consulta.setString(2, data);          
        consulta.setString(3, hora);
        
        ResultSet rs;

        rs = consulta.executeQuery();

            while (rs.next()) {
                
            jTextField5.setText(rs.getString("situacao"));
            jTextField6.setText(rs.getString("data"));
            jTextField7.setText(rs.getString("hora"));    
            jTextField3.setText(rs.getString("assunto"));
            jTextField4.setText(rs.getString("setor"));
            jTextField1.setText(rs.getString("prioridade"));
            jTextField2.setText(rs.getString("nome"));
            jTextArea1.setText(rs.getString("descricao"));
      
            }            
            
         consulta.close();
            
         String query1 = "SELECT * FROM logprocesso WHERE num = ?";

         java.sql.PreparedStatement consultas;
            
         consultas = cons.prepareStatement(query1);

         consultas.setString(1, jFormattedTextField3.getText());
            
         ResultSet rss;

         rss = consultas.executeQuery();
    
         DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
         
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);   
         jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
             
         Mode1.setNumRows(0);

            while (rss.next()) {
              
            Mode1.addRow(new Object[]{rss.getString("num"),rss.getString("datainicio"), rss.getString("horainicio"), rss.getString("situacao"),  rss.getString("nome")});
              
            }

         cons.close();
            
         consultas.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
        
    }else{
        
        num = jFormattedTextField3.getText();
            
        try {
            
        Class.forName("com.mysql.jdbc.Driver");

        Connection cons;
            
        cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
            
        String query = "SELECT * FROM processo WHERE num = ?";

        PreparedStatement consulta;
            
        consulta = (PreparedStatement) cons.prepareStatement(query);

        consulta.setString(1, jFormattedTextField3.getText());
            
        ResultSet rs;

        rs = consulta.executeQuery();

            while (rs.next()) {
                
            jTextField5.setText(rs.getString("situacao"));
            jTextField6.setText(rs.getString("data"));
            jTextField7.setText(rs.getString("hora"));    
            jTextField3.setText(rs.getString("assunto"));
            jTextField4.setText(rs.getString("setor"));
            jTextField1.setText(rs.getString("prioridade"));
            jTextField2.setText(rs.getString("nome"));
            jTextArea1.setText(rs.getString("descricao"));
      
            }            
            
         consulta.close();
            
         String query1 = "SELECT * FROM logprocesso WHERE num = ?";

         java.sql.PreparedStatement consultas;
            
         consultas = cons.prepareStatement(query1);

         consultas.setString(1, jFormattedTextField3.getText());
            
         ResultSet rss;

         rss = consultas.executeQuery();
    
         DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
            
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);   
         jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
             
         Mode1.setNumRows(0);

            while (rss.next()) {
              
            Mode1.addRow(new Object[]{rss.getString("num"),rss.getString("datainicio"), rss.getString("horainicio"), rss.getString("situacao"),  rss.getString("nome")});
              
            }

         cons.close();
            
         consultas.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
    }
  
    }
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            
            public void run() {
                
                new TProcesso().setVisible(true);
                
            }
            
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JButton jButton1 = new javax.swing.JButton();
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    public final javax.swing.JFormattedTextField jFormattedTextField3 = new javax.swing.JFormattedTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    public static final transient javax.swing.JTextArea jTextArea9 = new javax.swing.JTextArea();
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}

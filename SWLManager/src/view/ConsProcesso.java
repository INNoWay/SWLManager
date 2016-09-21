package view;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsProcesso extends javax.swing.JFrame {
    
    String IId;

    public ConsProcesso() {
        
    setResizable(false);
        
    initComponents();
              
    this.setLocationRelativeTo(null);
        
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    jTextField1.grabFocus(); 
        
        try{  
        
        Class.forName("com.mysql.jdbc.Driver");  

        java.sql.Connection  con;  
          
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
        
        jComboBox3.removeAllItems();
                
        jComboBox3.addItem("Selecione");
        
        String stmt = "SELECT * FROM setor";
         
        java.sql.PreparedStatement consulta;
             
        consulta = con.prepareStatement(stmt);
             
        ResultSet rsServicos;     
         
        rsServicos = consulta.executeQuery();
            
            while(rsServicos.next()){
            
            String serv = rsServicos.getString(1);
            
            jComboBox3.addItem(serv);
            
            }
        
        rsServicos.close();
        
        String stmt1;
         
        stmt1 = "SELECT * FROM processo"; 
             
        consulta = con.prepareStatement(stmt1);    
             
        ResultSet rss;     
             
        rss = consulta.executeQuery();
             
        DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
             
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
             
        Mode1.setNumRows(0);
             
            while(rss.next()){          
         
            Mode1.addRow(new Object[]{rss.getString("num"), rss.getString("situacao"), rss.getString("assunto"),  rss.getString("setor"), rss.getString("prioridade"), rss.getString("nome")});
              
            }  
                         
        rss.close(); 
            
        consulta.close();
            
        con.close();
        
        } catch (ClassNotFoundException | SQLException ex) {
            
            
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Processos");
        setPreferredSize(new java.awt.Dimension(695, 508));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(695, 508));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
                "N° ", "Situação", "Assunto", "Setor", "Prioridade", "Proprietario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Setor:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Situação:");

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Andamento", "Fechado" }));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))))
                .addGap(52, 52, 52))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jComboBox3.getSelectedItem().toString().equals("Selecione")||jComboBox3.getSelectedItem().toString().equals("") ){  
            
        JOptionPane.showMessageDialog(null, "Selecione o Setor que deseja pesquisar!"); 
            
        }else{
            
            try {            

            Class.forName("com.mysql.jdbc.Driver");

            Connection cons;

            cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

            String query = "SELECT * FROM processo WHERE  setor = ?";

            PreparedStatement consulta;
            
            consulta = cons.prepareStatement(query);

            consulta.setString(1, jComboBox3.getSelectedItem().toString());
            
            ResultSet rss;

            rss = consulta.executeQuery();
    
            DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
            
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
             
            Mode1.setNumRows(0);

                while (rss.next()) {
              
                Mode1.addRow(new Object[]{rss.getString("num"), rss.getString("situacao"), rss.getString("assunto"),  rss.getString("setor"), rss.getString("prioridade"), rss.getString("nome")});
              
                }

            cons.close();
            
            consulta.close();
            
            } catch (ClassNotFoundException ex) {
            
            System.out.println("Nao foi possivel fazer a consulta");
            
            } catch (SQLException ex) {
            
            System.out.println("Nao foi possivel connectar ao SQL" + ex.getMessage());
            
            }
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(jComboBox4.getSelectedItem().toString().equals("Selecione")||jComboBox3.getSelectedItem().toString().equals("") ){  
            
        JOptionPane.showMessageDialog(null, "Selecione a situação que deseja pesquisar!"); 
            
        }else{ 
            
            try {
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection cons;

            cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

            String query = "SELECT * FROM processo WHERE  situacao = ?";

            PreparedStatement consulta;
            
            consulta = cons.prepareStatement(query);

            consulta.setString(1, jComboBox4.getSelectedItem().toString());
            
            ResultSet rss;

            rss = consulta.executeQuery();
    
            DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
            
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
             
            Mode1.setNumRows(0);

                while (rss.next()) {
              
                Mode1.addRow(new Object[]{rss.getString("num"), rss.getString("situacao"), rss.getString("assunto"),  rss.getString("setor"), rss.getString("prioridade"), rss.getString("nome")});
              
                }

            cons.close();
            
            consulta.close();
            
            } catch (    ClassNotFoundException | SQLException ex) {
            
            
            }
        
        }
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
         if(evt.getClickCount() == 2){
             
         Object obj  = (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            
         String Id = obj.toString(); 
            
         Object obj1  = (jTable1.getValueAt(jTable1.getSelectedRow(), 1));  
            
         String Id1 = obj1.toString();
            
         jTextField1.setText(Id);
            
            try {
                                
            int a = -1;
                
            LoginSenha lll = new LoginSenha();
        
            String lppp; 
                
            lppp = LoginSenha.jTextField1.getText();  
                
            Class.forName("com.mysql.jdbc.Driver");               

            com.mysql.jdbc.Connection conn; 
                
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
                
            String sqlsss;
                
            sqlsss = "SELECT idfunc, setor FROM func WHERE login = ?";
                
            com.mysql.jdbc.PreparedStatement pssss;
                                
            pssss = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlsss);
                                           
            pssss.setString(1, lppp);
                
            ResultSet rssss;
                
            rssss = pssss.executeQuery();
                
            int idfuncc = 0; 
                
            rssss.next();
                
            idfuncc = rssss.getInt("idfunc"); 
                
            String setor = null;
                         
            String sqlss;                
                               
            sqlss = "SELECT num, setor, proprietario FROM processo WHERE num = ?";                
                
            com.mysql.jdbc.PreparedStatement psss;                
                
            psss = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlss);  
                
            psss.setString(1, Id);
                
            ResultSet rsss;

            rsss = psss.executeQuery();
                
            int proprietario;                 
                
            rsss.next();
                
            setor = rsss.getString("setor"); 
                
            Fila t = new Fila();
                    
            proprietario = rsss.getInt("proprietario");
                
                if(proprietario == a && t.fila.equals(setor)){
        
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

                        if (rs.next()) {
                
                        login = rs.getString("login");  
                
                        idfunc = rs.getString("idfunc"); 
                
                        }

                    ps.close();        
            
                    String query; 
                
                    Fila tf = new Fila();
                
                    String situacao="Andamento";
                            
                    query = "UPDATE processo p, login l SET p.situacao = ?, p.proprietario = ?, p.nome = ? WHERE l.login = ? AND p.num = ? ";
                    
                    com.mysql.jdbc.PreparedStatement stmtt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);                        
                 
                    stmtt.setString(1, situacao);
                    stmtt.setString(2, idfunc);    
                    stmtt.setString(3, tf.nomep); 
                    stmtt.setString(4, login); 
                    stmtt.setString(5, Id); 
                
                    stmtt.executeUpdate();   
                               
                    stmtt.close();
                                
                    con.close();   
    
                    new ConsProcesso().setVisible(false);
                
                    dispose();
                
                    psss.close(); 
            
                    conn.close();
                
                    JOptionPane.showMessageDialog(null, "Esse processo ja se econtra em sua Fila!");   
        
                    }
        
                }else if(proprietario == idfuncc && t.fila.equals(setor) && Id1.equals("Andamento")){
              
                new ConsProcesso().setVisible(false);
    
                dispose();
                
                psss.close(); 
            
                conn.close();    
              
                JOptionPane.showMessageDialog(null, "Esse processo ja se econtra em sua Fila!");              
            
                }else{
               
                new TProcesso().show();
    
                new ConsProcesso().setVisible(false);               
    
                dispose();
              
                psss.close(); 
            
                conn.close();
                
                }
                
            } catch (    SQLException | ClassNotFoundException ex) {
                
                Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new ConsProcesso().setVisible(true);
                
            }
            
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private final javax.swing.JTable jTable1 = new javax.swing.JTable();
    public static final transient javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}

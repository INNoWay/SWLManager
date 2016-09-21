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

public class ConsMensagens extends javax.swing.JFrame {

    int numsolicit;
    
    public ConsMensagens() {
        
    setResizable(false);
        
    initComponents();        
        
    this.setLocationRelativeTo(null);
    
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        try{ 
                
        Class.forName("com.mysql.jdbc.Driver");
        
        java.sql.Connection  con;  
          
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
          
        java.sql.PreparedStatement consulta;  
        
        Fila f = new Fila();
             
        String id = f.idfunc;
        
        String stmt1;
         
        stmt1 = "SELECT * FROM soliciadm  WHERE idsolicit = ?"; 
             
        consulta = con.prepareStatement(stmt1);  
             
        consulta.setString(1, id);
             
        ResultSet rss;     
             
        rss = consulta.executeQuery();
             
        DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
             
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);  
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10); 
             
        Mode1.setNumRows(0);
             
            while(rss.next()){          
         
            Mode1.addRow(new Object[]{rss.getString("nome"), rss.getString("setor"), rss.getString("situacao"), rss.getString("idsolicitadm")});
                            
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensagens Recebidas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome ", "Setor ", "Status ", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Nova", "Visualizada" }));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Consulta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Status");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(225, 225, 225)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2) {
            
        Object obj = (jTable1.getValueAt(jTable1.getSelectedRow(), 3));
            
        String Id = obj.toString();

        jTextField1.setText(Id);
            
        Object obj1 = (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            
        String Id1 = obj1.toString();
            
        jTextField2.setText(Id1);

        new ConsMensagensDet().show();

            try {

            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection con;

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

            java.sql.PreparedStatement consulta;

            Fila f = new Fila();

            String id = f.idfunc;

            String stmt1;

            stmt1 = "SELECT idsolicitadm FROM soliciadm WHERE idsolicitadm =?";

            consulta = con.prepareStatement(stmt1);

            consulta.setString(1, Id);

            ResultSet rss;

            rss = consulta.executeQuery();

            rss.next();

            numsolicit = rss.getInt("idsolicitadm");

            rss.close();

            consulta.close();

            String query;

            String situacao = "Visualizada";

            query = "UPDATE soliciadm SET situacao = ? WHERE idsolicitadm = ? ";

            com.mysql.jdbc.PreparedStatement stmtt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);

            stmtt.setString(1, situacao);

            stmtt.setInt(2, numsolicit);

            stmtt.executeUpdate();

            stmtt.close();

            con.close();
            
            refresh(1);
            
            } catch (    ClassNotFoundException | SQLException ex) {

            }
            
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    if(jComboBox1.getSelectedItem().toString().equals("Selecione")){
    
    JOptionPane.showMessageDialog(null, "Selecione o Status da Mensagem que deseja Consultar");
    
    }else{
        
        try {

        Fila f = new Fila();

        String id = f.idfunc;

        Class.forName("com.mysql.jdbc.Driver");

        Connection cons;

        cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

        String query = "SELECT * FROM soliciadm  WHERE situacao = ? AND idsolicit = ?";

        PreparedStatement consulta;

        consulta = (PreparedStatement) cons.prepareStatement(query);

        consulta.setString(1, jComboBox1.getSelectedItem().toString());
        consulta.setString(2, id);

        ResultSet rss;

        rss = consulta.executeQuery();

        DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);

        Mode1.setNumRows(0);

            while (rss.next()) {

                Mode1.addRow(new Object[]{rss.getString("nome"), rss.getString("setor"), rss.getString("situacao"), rss.getString("idsolicitadm")});
            
            }
            
        consulta.close();
            
        cons.close();

        } catch (SQLException | ClassNotFoundException ex) {
            
            
        }
        
    }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int row = 0;

        row = jTable1.getSelectedRow();

        if ((row == -1)) {

        JOptionPane.showMessageDialog(null, "Selecione uma linha da TABELA para deletar a Mensagem selecionada!", "Aviso Importante!", JOptionPane.INFORMATION_MESSAGE);

        } else {

          int x = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir A Mensagem?", "A Mensagem não sera mais recuperada", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (x == 0){

                try {

                Class.forName("com.mysql.jdbc.Driver");

                Connection cons;

                cons = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");

                String query = " DELETE FROM soliciadm WHERE idsolicitadm = ? ";

                PreparedStatement consulta;

                consulta = (PreparedStatement) cons.prepareStatement(query);

                String index;

                index = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);

                consulta.setString(1, index);

                consulta.executeUpdate();
                
                refresh(1);
                
                JOptionPane.showMessageDialog(null, "Mensagem Deletada");
                
                } catch (ClassNotFoundException ex) {

                    Logger.getLogger(ConsSolocitacao.class.getName()).log(Level.SEVERE, null, ex);

                } catch (SQLException ex) {

                    System.out.println("Nao foi possivel Deletar ");

                }

            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed
    public void refresh(int aux){
    
    if(aux==1){
        
        try{ 
                
        Class.forName("com.mysql.jdbc.Driver");
        
        java.sql.Connection  con;  
          
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/swlmanager", "root", "");
          
        java.sql.PreparedStatement consulta;  
        
        Fila f = new Fila();
             
        String id = f.idfunc;
        
        String stmt1;
         
        stmt1 = "SELECT * FROM soliciadm  WHERE idsolicit = ?"; 
             
        consulta = con.prepareStatement(stmt1);  
             
        consulta.setString(1, id);
             
        ResultSet rss;     
             
        rss = consulta.executeQuery();
             
        DefaultTableModel Mode1 = (DefaultTableModel) jTable1.getModel();
             
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);  
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10); 
             
        Mode1.setNumRows(0);
             
            while(rss.next()){          
         
            Mode1.addRow(new Object[]{rss.getString("nome"), rss.getString("setor"), rss.getString("situacao"), rss.getString("idsolicitadm")});
                            
            }    
                         
        rss.close(); 
            
        consulta.close();
            
        con.close();
        
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
    }
    
    }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new ConsMensagens().setVisible(true);
                
            }
            
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static final transient javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    public static final transient javax.swing.JTextField jTextField2 = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}

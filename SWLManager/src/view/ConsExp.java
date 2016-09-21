package view;

public class ConsExp extends javax.swing.JFrame {
  
    public ConsExp() {
    
    setResizable(false);
         
    initComponents();
        
    this.setLocationRelativeTo(null);
    
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);   
    
    Fila f= new Fila();
    
    TProcesso tp = new TProcesso();
    
    StringBuffer textos = new StringBuffer();
            
    textos.append(f.jTextArea9.getText() + "\n"); 
    textos.append(tp.jTextArea9.getText() + "\n"); 
            
    jTextArea6.setText(textos.toString());
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Processo");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea6AncestorAdded
        
        jTextArea6.setColumns(72);
        jTextArea6.setRows(3);
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setLineWrap(true);
        
    }//GEN-LAST:event_jTextArea6AncestorAdded

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new ConsExp().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}

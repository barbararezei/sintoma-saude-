/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uc10_atividade03_barbararezei;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class tabelas extends javax.swing.JFrame {

    /**
     * Creates new form tabelas
     */
    public tabelas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelaspanel = new javax.swing.JPanel();
        sintomasaudetext = new javax.swing.JLabel();
        tabela1scrolpanel = new javax.swing.JScrollPane();
        tabelaincidente = new javax.swing.JTable();
        tabelaincitext = new javax.swing.JLabel();
        buscarincbutton = new javax.swing.JButton();
        nomepesqtextfield = new javax.swing.JTextField();
        tabelapactext = new javax.swing.JLabel();
        imprimirincbutton = new javax.swing.JButton();
        tabela2scrolpane = new javax.swing.JScrollPane();
        tabelapacientes = new javax.swing.JTable();
        buscapactextfield = new javax.swing.JTextField();
        buscapacbutton = new javax.swing.JButton();
        imprimirpacbutton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        sintomasaudetext.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sintomasaudetext.setText("SINTOMA SAUDE");

        tabelaincidente.setModel(montartabelainci(incidenteJPA.listar()));
        tabela1scrolpanel.setViewportView(tabelaincidente);

        tabelaincitext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaincitext.setText("TABELA DE INCIDENTES");

        buscarincbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscarincbutton.setText("BUSCAR DATA");
        buscarincbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarincbuttonActionPerformed(evt);
            }
        });

        tabelapactext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelapactext.setText("TABELA DADOS PACIENTE");

        imprimirincbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imprimirincbutton.setText("IMPRIMIR");

        tabelapacientes.setModel(montartabelapaci(pacienteJPA.listar()));
        tabela2scrolpane.setViewportView(tabelapacientes);

        buscapacbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscapacbutton.setText("BUSCAR NOME");
        buscapacbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscapacbuttonActionPerformed(evt);
            }
        });

        imprimirpacbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imprimirpacbutton.setText("IMPRIMIR");

        javax.swing.GroupLayout tabelaspanelLayout = new javax.swing.GroupLayout(tabelaspanel);
        tabelaspanel.setLayout(tabelaspanelLayout);
        tabelaspanelLayout.setHorizontalGroup(
            tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelaspanelLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelaspanelLayout.createSequentialGroup()
                            .addComponent(nomepesqtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tabelapactext)
                                .addGroup(tabelaspanelLayout.createSequentialGroup()
                                    .addComponent(buscarincbutton)
                                    .addGap(18, 18, 18)
                                    .addComponent(imprimirincbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(343, 343, 343))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelaspanelLayout.createSequentialGroup()
                            .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sintomasaudetext)
                                .addComponent(tabelaincitext))
                            .addGap(458, 458, 458)))
                    .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tabela2scrolpane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                        .addComponent(tabela1scrolpanel, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(tabelaspanelLayout.createSequentialGroup()
                        .addComponent(buscapactextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscapacbutton)
                        .addGap(46, 46, 46)
                        .addComponent(imprimirpacbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        tabelaspanelLayout.setVerticalGroup(
            tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabelaspanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sintomasaudetext)
                .addGap(54, 54, 54)
                .addComponent(tabelaincitext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabela1scrolpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarincbutton)
                    .addComponent(nomepesqtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimirincbutton))
                .addGap(54, 54, 54)
                .addComponent(tabelapactext)
                .addGap(18, 18, 18)
                .addComponent(tabela2scrolpane, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(tabelaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscapactextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscapacbutton)
                    .addComponent(imprimirpacbutton))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabelaspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabelaspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        tabelaincidente.setModel(montartabelainci(incidenteJPA.listar()));
        tabela1scrolpanel.setViewportView(tabelaincidente);
        
        tabelapacientes.setModel(montartabelapaci(pacienteJPA.listar()));
         tabela2scrolpane.setViewportView(tabelapacientes);
    }//GEN-LAST:event_formWindowGainedFocus

    private void buscarincbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarincbuttonActionPerformed
        // TODO add your handling code here:
        
        String busca = nomepesqtextfield.getText();
        if(busca.isEmpty()){
            tabelaincidente.setModel( montartabelainci(incidenteJPA.listar()));
        }else
        {
            incidenteJPA inc = new incidenteJPA();
            List <incidente> in = 
                    inc.listarbusca(busca);
            tabelaincidente.setModel(montartabelaincibus(in));
        }
    }//GEN-LAST:event_buscarincbuttonActionPerformed

    private void buscapacbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscapacbuttonActionPerformed
        // TODO add your handling code here:
        
         String busca = buscapactextfield.getText();
        if(busca.isEmpty()){
            tabelapacientes.setModel(montartabelapaci(pacienteJPA.listar()));
        }else
        {
            pacienteJPA pac = new pacienteJPA();
            List <paciente> pa = 
                    pac.listarbusca(busca);
             tabelapacientes.setModel(montartabelapacibus(pa));
        }
        
    }//GEN-LAST:event_buscapacbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(tabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelas().setVisible(true);
            }
        });
    }
    
    
    private DefaultTableModel montartabelainci(List<incidente> lista) {
        String[] colunas = {"id","idpaciente","data","hora","relato"};
        
        DefaultTableModel tabela = new DefaultTableModel();
        
        tabela.setColumnIdentifiers(colunas);
        
        for (int i = 0; lista.size() > i; i++) {
           incidente in = lista.get(i);
            
            String[] linha = {
                Integer.toString(in.getIdincidente()),
                Integer.toString(in.getIdpaciente()),
                in.getData(),
                in.getHora(),
                in.getRelato()
                
            };
            tabela.addRow(linha);
        }
        return tabela;
    }
    
    private DefaultTableModel montartabelapaci(List<paciente> lista) {
        String[] colunas = {"id","nome","idade","condição","remedio","informação remedio"};
        
        DefaultTableModel tabela = new DefaultTableModel();
        
        tabela.setColumnIdentifiers(colunas);
        
        for (int i = 0; lista.size() > i; i++) {
           paciente pac = lista.get(i);
            
            String[] linha = {
                Integer.toString(pac.getIdpaciente()),
                pac.getNome(),
                pac.getIdade(),
                pac.getCondicao(),
                pac.getRemedio(),
                pac.getInfremedio()
                
                
            };
            tabela.addRow(linha);
        }
        return tabela;
    }
    
     private DefaultTableModel montartabelaincibus(List<incidente> busca) {
        String[] colunas = {"id","idpaciente","data","hora","relato"};
        
        DefaultTableModel tabela = new DefaultTableModel();
        
        tabela.setColumnIdentifiers(colunas);
        
        for (int i = 0; busca.size() > i; i++) {
           incidente in = busca.get(i);
            
            String[] linha = {
                Integer.toString(in.getIdincidente()),
                Integer.toString(in.getIdpaciente()),
                in.getData(),
                in.getHora(),
                in.getRelato()
                
            };
            tabela.addRow(linha);
        }
        return tabela;
    }
     
     
     private DefaultTableModel montartabelapacibus (List<paciente> busca) {
        String[] colunas = {"id","nome","idade","condição","remedio","informação remedio"};
        
        DefaultTableModel tabela = new DefaultTableModel();
        
        tabela.setColumnIdentifiers(colunas);
        
        for (int i = 0; busca.size() > i; i++) {
           paciente pac = busca.get(i);
            
            String[] linha = {
                Integer.toString(pac.getIdpaciente()),
                pac.getNome(),
                pac.getIdade(),
                pac.getCondicao(),
                pac.getRemedio(),
                pac.getInfremedio()
                
                
            };
            tabela.addRow(linha);
        }
        return tabela;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscapacbutton;
    private javax.swing.JTextField buscapactextfield;
    private javax.swing.JButton buscarincbutton;
    private javax.swing.JButton imprimirincbutton;
    private javax.swing.JToggleButton imprimirpacbutton;
    private javax.swing.JTextField nomepesqtextfield;
    private javax.swing.JLabel sintomasaudetext;
    private javax.swing.JScrollPane tabela1scrolpanel;
    private javax.swing.JScrollPane tabela2scrolpane;
    private javax.swing.JTable tabelaincidente;
    private javax.swing.JLabel tabelaincitext;
    private javax.swing.JTable tabelapacientes;
    private javax.swing.JLabel tabelapactext;
    private javax.swing.JPanel tabelaspanel;
    // End of variables declaration//GEN-END:variables
}

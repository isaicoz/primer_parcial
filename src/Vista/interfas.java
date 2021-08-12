/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adalb
 */
public class interfas extends javax.swing.JFrame { 
    
    
    
    DefaultTableModel t_Terrestres;
    
    public interfas() {
        
        initComponents();  
        
       Terrestres.addItem("Automovil");
        Terrestres.addItem("Moto");
        Terrestres.addItem("Avion");
        Terrestres.addItem("Helicoptero");
        /* Encabezado o Columnas de la tabla  */
        t_Terrestres = new DefaultTableModel();
        String encabezado[]={"Marca","Linea","Color","Placas","Asientos","Motor","Modelo","tipo"};
        t_Terrestres.setColumnIdentifiers(encabezado);
        tbt_terrestres.setModel(t_Terrestres);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_principal = new javax.swing.JPanel();
        interfas = new javax.swing.JLabel();
        marcalabel = new javax.swing.JLabel();
        marcatxt = new javax.swing.JTextField();
        linealabel = new javax.swing.JLabel();
        lineatxt = new javax.swing.JTextField();
        colorlabel = new javax.swing.JLabel();
        colortxt = new javax.swing.JTextField();
        placaslabel = new javax.swing.JLabel();
        placatxt = new javax.swing.JTextField();
        asientoslabel = new javax.swing.JLabel();
        asientostxt = new javax.swing.JTextField();
        motorlabel = new javax.swing.JLabel();
        motortxt = new javax.swing.JTextField();
        modelolabel = new javax.swing.JLabel();
        modelotxt = new javax.swing.JTextField();
        Terrestres = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtbt_secundario = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbt_terrestres = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbt_aereos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        interfas.setText("Interfas");

        marcalabel.setText("Marca:");

        linealabel.setText("Linea:");

        colorlabel.setText("Color:");

        placaslabel.setText("Placas:");

        asientoslabel.setText("asientos:");

        motorlabel.setText("motor:");

        modelolabel.setText("modelo:");

        Terrestres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerrestresActionPerformed(evt);
            }
        });

        jLabel1.setText("vehiculos");

        tbt_terrestres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbt_terrestres);

        jtbt_secundario.addTab("Terrestres", jScrollPane1);

        tbt_aereos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbt_aereos);

        jtbt_secundario.addTab("areos", jScrollPane2);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_principalLayout = new javax.swing.GroupLayout(jp_principal);
        jp_principal.setLayout(jp_principalLayout);
        jp_principalLayout.setHorizontalGroup(
            jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_principalLayout.createSequentialGroup()
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_principalLayout.createSequentialGroup()
                        .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(placaslabel)
                            .addComponent(marcalabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marcatxt)
                            .addComponent(placatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addGroup(jp_principalLayout.createSequentialGroup()
                        .addComponent(modelolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modelotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_principalLayout.createSequentialGroup()
                        .addComponent(linealabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lineatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(colorlabel))
                    .addGroup(jp_principalLayout.createSequentialGroup()
                        .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_principalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_principalLayout.createSequentialGroup()
                                .addComponent(asientoslabel)
                                .addGap(18, 18, 18)
                                .addComponent(asientostxt)))
                        .addGap(26, 26, 26)
                        .addComponent(motorlabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(motortxt, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(colortxt))
                .addGap(94, 94, 94))
            .addGroup(jp_principalLayout.createSequentialGroup()
                .addComponent(jtbt_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jp_principalLayout.createSequentialGroup()
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_principalLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(interfas))
                    .addGroup(jp_principalLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Terrestres, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_principalLayout.setVerticalGroup(
            jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_principalLayout.createSequentialGroup()
                .addComponent(interfas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcalabel)
                    .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(marcatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lineatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(linealabel)
                        .addComponent(colorlabel)
                        .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(placaslabel)
                        .addComponent(placatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asientoslabel)
                        .addComponent(asientostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(motorlabel)
                        .addComponent(motortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelolabel)
                    .addComponent(modelotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Terrestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jtbt_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TerrestresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerrestresActionPerformed

    }//GEN-LAST:event_TerrestresActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
         String[]datos = new String[8];
        datos[0] = marcatxt.getText();
        datos[1] = lineatxt.getText();
        datos[2] = colortxt.getText();
        datos[3] = placatxt.getText();
        datos[4] = asientostxt.getText();
        datos[5] = motortxt.getText();
        datos[6] = modelotxt.getText();
        datos[7] = Terrestres.getSelectedItem().toString();
        t_Terrestres.addRow(datos);
        JOptionPane.showMessageDialog(rootPane, "Ingreso Correcto","Mensaje",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Terrestres;
    private javax.swing.JLabel asientoslabel;
    private javax.swing.JTextField asientostxt;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel colorlabel;
    private javax.swing.JTextField colortxt;
    private javax.swing.JLabel interfas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp_principal;
    private javax.swing.JTabbedPane jtbt_secundario;
    private javax.swing.JLabel linealabel;
    private javax.swing.JTextField lineatxt;
    private javax.swing.JLabel marcalabel;
    private javax.swing.JTextField marcatxt;
    private javax.swing.JLabel modelolabel;
    private javax.swing.JTextField modelotxt;
    private javax.swing.JLabel motorlabel;
    private javax.swing.JTextField motortxt;
    private javax.swing.JLabel placaslabel;
    private javax.swing.JTextField placatxt;
    private javax.swing.JTable tbt_aereos;
    private javax.swing.JTable tbt_terrestres;
    // End of variables declaration//GEN-END:variables
}

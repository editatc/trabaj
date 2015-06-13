package formLario;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Productos extends javax.swing.JFrame {

    public Productos () {
        initComponents();
      
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Productos");
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imag/ri.gif"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nmbreprodusctojTextField = new javax.swing.JTextField();
        categoriajComboBox = new javax.swing.JComboBox();
        peciojTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableproducto = new javax.swing.JTable();
        agregarjButton = new javax.swing.JButton();
        actulazarjButton = new javax.swing.JButton();
        eliminarjButton = new javax.swing.JButton();
        mensajejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StockjTextField = new javax.swing.JTextField();
        atrasjButton = new javax.swing.JButton();
        exitosojLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigojTextField = new javax.swing.JTextField();
        nuevojButton = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS DE VENTA Y STOCK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 153, 0)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP)); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 51, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Nombre del Producto");

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Tipo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Precio");

        nmbreprodusctojTextField.setForeground(new java.awt.Color(153, 0, 153));

        categoriajComboBox.setForeground(new java.awt.Color(0, 153, 0));
        categoriajComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pastilla ", "inyecciones ", "Almetacion", "jarabe ", " ", " " }));

        peciojTextField.setForeground(new java.awt.Color(102, 0, 102));

        Tableproducto.setBackground(new java.awt.Color(153, 153, 255));
        Tableproducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tableproducto.setForeground(new java.awt.Color(0, 0, 204));
        Tableproducto.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre del Producto", "Tipo", "Precio", "Cantida", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tableproducto.setGridColor(new java.awt.Color(255, 255, 0));
        Tableproducto.setOpaque(false);
        jScrollPane1.setViewportView(Tableproducto);

        agregarjButton.setBackground(new java.awt.Color(255, 153, 255));
        agregarjButton.setForeground(new java.awt.Color(255, 0, 51));
        agregarjButton.setText("Agregar");
        agregarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarjButtonActionPerformed(evt);
            }
        });

        actulazarjButton.setBackground(new java.awt.Color(255, 153, 153));
        actulazarjButton.setForeground(new java.awt.Color(255, 0, 0));
        actulazarjButton.setText("Actualizar");
        actulazarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulazarjButtonActionPerformed(evt);
            }
        });

        eliminarjButton.setBackground(new java.awt.Color(153, 255, 255));
        eliminarjButton.setForeground(new java.awt.Color(255, 0, 0));
        eliminarjButton.setText("ELIMINAR");
        eliminarjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarjButtonMouseClicked(evt);
            }
        });
        eliminarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarjButtonActionPerformed(evt);
            }
        });

        mensajejLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mensajejLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));

        StockjTextField.setForeground(new java.awt.Color(102, 0, 102));

        atrasjButton.setBackground(new java.awt.Color(255, 153, 102));
        atrasjButton.setForeground(new java.awt.Color(255, 0, 51));
        atrasjButton.setText("Atras");
        atrasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasjButtonActionPerformed(evt);
            }
        });

        exitosojLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitosojLabel.setForeground(new java.awt.Color(51, 204, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Codigo");

        codigojTextField.setForeground(new java.awt.Color(102, 0, 102));
        codigojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigojTextFieldActionPerformed(evt);
            }
        });

        nuevojButton.setBackground(new java.awt.Color(255, 102, 255));
        nuevojButton.setForeground(new java.awt.Color(255, 0, 0));
        nuevojButton.setText("Nuevo");
        nuevojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevojButtonActionPerformed(evt);
            }
        });

        SALIR.setBackground(new java.awt.Color(204, 204, 0));
        SALIR.setForeground(new java.awt.Color(255, 0, 0));
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nmbreprodusctojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(peciojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StockjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(categoriajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nuevojButton)
                                    .addComponent(agregarjButton))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actulazarjButton)
                                    .addComponent(atrasjButton))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(SALIR))
                                    .addComponent(eliminarjButton))))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mensajejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(exitosojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nmbreprodusctojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarjButton)
                    .addComponent(actulazarjButton)
                    .addComponent(eliminarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(categoriajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nuevojButton)
                        .addComponent(atrasjButton)
                        .addComponent(SALIR)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(peciojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(StockjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(codigojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensajejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(exitosojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void agregarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarjButtonActionPerformed

        mensajejLabel.setText(null);
        exitosojLabel.setText("Se Completo exitosamente");
        DefaultTableModel modelo = (DefaultTableModel) Tableproducto.getModel();

        if (!nmbreprodusctojTextField.getText().trim().equals("")) {
            modelo.addRow(new Object[]{
                nmbreprodusctojTextField.getText(),
                categoriajComboBox.getSelectedItem().toString(),
                peciojTextField.getText(),
                StockjTextField.getText(),
                codigojTextField.getText()
            }
            );
        } else {
            mensajejLabel.setText("Nombre del producto deve ser completado");
            exitosojLabel.setText(null);
        }
    }//GEN-LAST:event_agregarjButtonActionPerformed

    private void actulazarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulazarjButtonActionPerformed
        mensajejLabel.setText(null);
        exitosojLabel.setText("Se Completo exitosamente");
        DefaultTableModel modelo = (DefaultTableModel) Tableproducto.getModel();
        if (Tableproducto.getSelectedRow() == -1) {
            if (Tableproducto.getRowCount() == 0) {
                mensajejLabel.setText("Tabla Bacia");
                exitosojLabel.setText(null);
            } else {
                mensajejLabel.setText("Debe seleccionar un producto");
            }
        } else {
            modelo.setValueAt(nmbreprodusctojTextField.getText(), Tableproducto.getSelectedRow(), 0);
            modelo.setValueAt(categoriajComboBox.getSelectedItem().toString(), Tableproducto.getSelectedRow(), 1);
            modelo.setValueAt(peciojTextField.getText(), Tableproducto.getSelectedRow(), 2);
            modelo.setValueAt(StockjTextField.getText(), Tableproducto.getSelectedRow(), 3);
            modelo.setValueAt(codigojTextField.getText(), Tableproducto.getSelectedRow(), 4);
        }
    }//GEN-LAST:event_actulazarjButtonActionPerformed

    private void eliminarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarjButtonMouseClicked

        /*DefaultTableModel modelo = (DefaultTableModel) Tableproducto.getModel();
         nmbreprodusctojTextField.setText(modelo.getValueAt(Tableproducto.getSelectedRow(), 0).toString());
         categoriajComboBox.setSelectedItem(modelo.getValueAt(Tableproducto.getSelectedRow(), 1).toString());
         peciojTextField.setText(modelo.getValueAt(Tableproducto.getSelectedRow(), 2).toString());
         StockjTextField.setText(modelo.getValueAt(Tableproducto.getSelectedRow(), 3).toString());
         codigojTextField.setText(modelo.getValueAt(Tableproducto.getSelectedRow(), 4).toString());*/

    }//GEN-LAST:event_eliminarjButtonMouseClicked

    private void eliminarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarjButtonActionPerformed
        mensajejLabel.setText(null);
        exitosojLabel.setText("Se Completo exitosamente");
        DefaultTableModel modelo = (DefaultTableModel) Tableproducto.getModel();
        if (Tableproducto.getSelectedRow() == -1) {
            if (Tableproducto.getRowCount() == 0) {
                mensajejLabel.setText("Tabla Bacia");
                exitosojLabel.setText(null);
            } else {
                mensajejLabel.setText("Debe seleccionar un producto");
            }
        } else {
            modelo.removeRow(Tableproducto.getSelectedRow());
        }

    }//GEN-LAST:event_eliminarjButtonActionPerformed

    private void atrasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasjButtonActionPerformed



    }//GEN-LAST:event_atrasjButtonActionPerformed

    private void codigojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigojTextFieldActionPerformed

    private void nuevojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevojButtonActionPerformed
       peciojTextField.setText(null);
       codigojTextField.setText(null);
       StockjTextField.setText(null);
       nmbreprodusctojTextField.setText(null);
    }//GEN-LAST:event_nuevojButtonActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
      System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField StockjTextField;
    private javax.swing.JTable Tableproducto;
    private javax.swing.JButton actulazarjButton;
    private javax.swing.JButton agregarjButton;
    private javax.swing.JButton atrasjButton;
    private javax.swing.JComboBox categoriajComboBox;
    private javax.swing.JTextField codigojTextField;
    private javax.swing.JButton eliminarjButton;
    private javax.swing.JLabel exitosojLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensajejLabel;
    private javax.swing.JTextField nmbreprodusctojTextField;
    private javax.swing.JButton nuevojButton;
    private javax.swing.JTextField peciojTextField;
    // End of variables declaration//GEN-END:variables
}

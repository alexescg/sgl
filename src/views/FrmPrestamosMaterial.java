package views;

import controllers.LaboratorioMateriales;
import controllers.Laboratorios;
import controllers.Materiales;
import controllers.Prestamos;
import java.math.BigDecimal;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import models.Laboratorio;
import models.LaboratorioMaterial;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import models.BaseModel;
import models.Material;
import models.Prestamo;
import models.PrestamoMaterial;
import utils.OracleUtils;

/**
 *
 * @author Alejandro Escobedo
 */
public class FrmPrestamosMaterial extends javax.swing.JFrame {

    Random r;
    List<Prestamo> prestamos = (List<Prestamo>) Prestamos.select(OracleUtils.getDBConexion(), "select * from prestamo", Prestamo.class);
    List<Material> materiales = (List<Material>) Materiales.select(OracleUtils.getDBConexion(), "select * from material", Material.class);
    List<Laboratorio> laboratorios = (List<Laboratorio>) Laboratorios.select(OracleUtils.getDBConexion(), "select * from laboratorio", Laboratorio.class);
    List<LaboratorioMaterial> labmat = (List<LaboratorioMaterial>) LaboratorioMateriales.select(OracleUtils.getDBConexion(), "select * from laboratorio_material", LaboratorioMaterial.class);
    
    String material;
    String laboratorio;
    Integer index;

    /**
     * Creates new form FrmProveedores
     *
     * @throws java.lang.Exception
     */
    public FrmPrestamosMaterial() throws Exception {
           /*Creacion fondo*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        PanelImagen p = new PanelImagen();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);

        
        initComponents();
        Laboratorios.fillCombo(comboLabs, laboratorios, "nombre", Laboratorio.class);
        Materiales.fillCombo(comboMateriales, materiales, "descripcion", Material.class);
        Prestamos.fillCombo(comboPrestamos, prestamos, "descripcion", Prestamo.class);
                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel3 = new javax.swing.JLabel();
        btnChecar = new javax.swing.JButton();
        comboPrestamos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        comboMateriales = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboLabs = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pretamos Material");

        jLabel3.setText("Prestamo");

        btnChecar.setText("Checar");
        btnChecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecarActionPerformed(evt);
            }
        });

        comboPrestamos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Seleccion de Material");

        jLabel2.setText("Material");

        jLabel4.setText("Cantidad Disponible");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, comboMateriales, org.jdesktop.beansbinding.ELProperty.create("${selectedItem.getCantidad}"), lblCantidad, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        comboMateriales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboMateriales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMaterialesItemStateChanged(evt);
            }
        });
        comboMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaterialesActionPerformed(evt);
            }
        });

        jLabel5.setText("Laboratorio");

        comboLabs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnAgregar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(comboMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(btnChecar))
                                .addGap(18, 18, 18)
                                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(71, 71, 71)
                        .addComponent(comboLabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(comboMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboLabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChecar)
                            .addComponent(btnAgregar))))
                .addGap(20, 20, 20))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecarActionPerformed
            BigDecimal idLaboratorio = laboratorios.get(comboLabs.getSelectedIndex()).getIdlaboratorio();
            BigDecimal idMaterial = materiales.get(comboMateriales.getSelectedIndex()).getIdmaterial();
            
            labmat.stream().forEach((labmaterial) -> {
                
                if ((labmaterial.getIdlaboratorio().equals(idLaboratorio))
                        && ((labmaterial.getIdmaterial().equals(idMaterial)))) {
                    lblCantidad.setText("" + labmaterial.getExistencia());
                } 
            });
            
            if (lblCantidad.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Favor de confirmar primero la canttidad del material y su ubicacion");
        }


    }//GEN-LAST:event_btnChecarActionPerformed

    private void comboMaterialesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMaterialesItemStateChanged
//        prestMat.stream().forEach((labmateria) -> {
//
//                if ((labmateria.getIdlaboratorio().equals(comboLabs.getSelectedItem()))
//                        && ((labmateria.getIdmaterial().equals(comboMateriales.getSelectedItem())))) {
//                    lblCantidad.setText("" + labmateria.getExistencia());
//                }
//        });
    }//GEN-LAST:event_comboMaterialesItemStateChanged

    private void comboMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaterialesActionPerformed

    }//GEN-LAST:event_comboMaterialesActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            BigDecimal idPrestamo = prestamos.get(comboPrestamos.getSelectedIndex()).getIdprestamo();
            System.out.println("idPrestamo = " + idPrestamo);
            BigDecimal idLaboratorio = laboratorios.get(comboLabs.getSelectedIndex()).getIdlaboratorio();
            System.out.println("idLaboratorio = " + idLaboratorio);
            BigDecimal idMaterial = materiales.get(comboMateriales.getSelectedIndex()).getIdmaterial();
        System.out.println("idMaterial = " + idMaterial);
            
        
        if (PrestamoMaterial.isNumeric(lblCantidad.getText()) && Integer.parseInt(lblCantidad.getText()) > 0)  {
            
                    Materiales.executeQuery(OracleUtils.getDBConexion(),
                    String.format("insert into prestamo_material values(%s, %s, %s)",
                            idPrestamo,
                            idMaterial,
                            idLaboratorio));
            JOptionPane.showMessageDialog(rootPane, "Agregado exitosamente.");

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay suficiente.");
}

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FrmPrestamosMaterial().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(FrmPrestamosMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnChecar;
    private javax.swing.JComboBox comboLabs;
    private javax.swing.JComboBox comboMateriales;
    private javax.swing.JComboBox comboPrestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCantidad;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

package Vistas;

import Inscripciones.Alumno;
import static Vistas.ViewColegio.estudiantes;
import javax.swing.JOptionPane;

public class ViewFormularioAlumnos extends javax.swing.JInternalFrame {

    public ViewFormularioAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtLegajo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(737, 570));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Alumnos");

        jtLegajo.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jtLegajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtLegajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLegajoMouseClicked(evt);
            }
        });
        jtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLegajoActionPerformed(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNombreMouseClicked(evt);
            }
        });
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtApellido.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtApellidoMouseClicked(evt);
            }
        });
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jbRegistrar.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jbRegistrar.setText("REGISTRAR");
        jbRegistrar.setPreferredSize(new java.awt.Dimension(100, 32));
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbNuevo.setText("NUEVO");
        jbNuevo.setPreferredSize(new java.awt.Dimension(100, 40));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLegajoActionPerformed

    }//GEN-LAST:event_jtLegajoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed

        Integer legajo = Integer.parseInt(jtLegajo.getText());
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();

        Alumno estudiante = new Alumno(legajo, nombre, apellido);

        if (!estudiantes.containsKey(estudiante.getLegajo())) {
            ViewColegio.estudiantes.put(legajo, estudiante);
            JOptionPane.showMessageDialog(this, "Alumno Agregado");
            jtLegajo.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "El Alumno ya se encuentra Registrado");

        }


    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtLegajo.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtLegajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLegajoMouseClicked
        jtLegajo.setText("");
    }//GEN-LAST:event_jtLegajoMouseClicked

    private void jtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMouseClicked
        jtNombre.setText("");
    }//GEN-LAST:event_jtNombreMouseClicked

    private void jtApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtApellidoMouseClicked
        jtApellido.setText("");
    }//GEN-LAST:event_jtApellidoMouseClicked

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}

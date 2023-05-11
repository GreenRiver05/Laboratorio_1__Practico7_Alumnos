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
        jbEditar = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();
        jlNuevoLegajo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(737, 570));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Alumnos");

        jtLegajo.setFont(new java.awt.Font("Castellar", 1, 29)); // NOI18N
        jtLegajo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtLegajo.setText("LEGAJO:");
        jtLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtLegajoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtLegajoFocusLost(evt);
            }
        });
        jtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLegajoActionPerformed(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Castellar", 1, 29)); // NOI18N
        jtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtNombre.setText("NOMBRE:");
        jtNombre.setEnabled(false);
        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtApellido.setFont(new java.awt.Font("Castellar", 1, 29)); // NOI18N
        jtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtApellido.setText("APELLIDO:");
        jtApellido.setEnabled(false);
        jtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtApellidoFocusLost(evt);
            }
        });
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jbRegistrar.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jbRegistrar.setText("REGISTRAR");
        jbRegistrar.setEnabled(false);
        jbRegistrar.setPreferredSize(new java.awt.Dimension(100, 32));
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbNuevo.setText("NUEVO");
        jbNuevo.setEnabled(false);
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

        jbEditar.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jbEditar.setText("EDITAR");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jlEstado.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(153, 0, 0));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEstado.setText("Alumno Nuevo");

        jlNuevoLegajo.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(144, 144, 144))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jlNuevoLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlNuevoLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jlEstado)
                .addGap(43, 43, 43)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        
        Integer legajo = Integer.parseInt(jtLegajo.getText());
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        
        Alumno estudiante = new Alumno(legajo, nombre, apellido);
        
        if (!estudiantes.containsKey(estudiante.getLegajo())) {
            ViewColegio.estudiantes.put(legajo, estudiante);
            JOptionPane.showMessageDialog(this, "Alumno Agregado");
            jbNuevo.setEnabled(true);
            jbEditar.setEnabled(false);
            jlEstado.setText("Alumno Agregado");
            jlEstado.setForeground(new java.awt.Color(21, 153, 0));
            jbRegistrar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "El Alumno ya se encuentra Registrado");
            jlNuevoLegajo.setText("Legajo existente, ingrese otro");
        }
        

    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtLegajo.setText("LEGAJO:");
        jtLegajo.setEnabled(true);
        jtNombre.setText("NOMBRE:");
        jtApellido.setText("APELLIDO:");
        jlEstado.setText("Alumno Nuevo");
        jlEstado.setForeground(new java.awt.Color(153, 0, 0));
        jbNuevo.setEnabled(false);
       
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtLegajoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtLegajoFocusGained
        if (jtLegajo.getText().equals("LEGAJO:")) {
            jtLegajo.setText("");
        }
    }//GEN-LAST:event_jtLegajoFocusGained

    private void jtLegajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtLegajoFocusLost
        
        if (jtLegajo.getText().equals("")) {
            jtLegajo.setText("LEGAJO:");
        }
    }//GEN-LAST:event_jtLegajoFocusLost

    private void jtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLegajoActionPerformed
        try {
            Integer legajo = Integer.parseInt(jtLegajo.getText());
            jtNombre.setEnabled(true);
            jtLegajo.setEnabled(false);
            jbEditar.setEnabled(true);
            jlNuevoLegajo.setText("");
        } catch (NumberFormatException ex) {
//          ImageIcon iconoNumeroTelefonico = new ImageIcon(getClass().getResource("/Imagenes/gatitoVampiro.png"));
//          JOptionPane.showMessageDialog(this, "Por favor ingrese un Valor Numerico para el Telefono", "DATO INCORRECTO", WIDTH, iconoNumeroTelefonico);
            JOptionPane.showMessageDialog(this, "Por favor ingrese un Valor Numerico para el Legajo");
            jtLegajo.setText("");
            
        }

    }//GEN-LAST:event_jtLegajoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbEditar.setEnabled(false);
        jtLegajo.setEnabled(true);
        jtNombre.setEnabled(false);
        jtApellido.setEnabled(false);
        jbRegistrar.setEnabled(false);
        jtLegajo.requestFocus();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusGained
        if (jtNombre.getText().equals("NOMBRE:")) {
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtNombreFocusGained

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(false);
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoFocusGained
        if (jtApellido.getText().equals("APELLIDO:")) {
            jtApellido.setText("");
        }
    }//GEN-LAST:event_jtApellidoFocusGained

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        jbRegistrar.setEnabled(true);
        jtApellido.setEnabled(false);
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        if (jtNombre.getText().equals("")) {
            jtNombre.setText("NOMBRE:");
        }
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtApellidoFocusLost
        if (jtApellido.getText().equals("")) {
            jtApellido.setText("APELLIDO:");
        }
    }//GEN-LAST:event_jtApellidoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNuevoLegajo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}

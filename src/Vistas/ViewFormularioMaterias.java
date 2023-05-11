package Vistas;

import Inscripciones.Materia;
import static Vistas.ViewColegio.materias;
import java.util.Map;
import javax.swing.JOptionPane;

public class ViewFormularioMaterias extends javax.swing.JInternalFrame {

    public ViewFormularioMaterias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrbPrimero = new javax.swing.JRadioButton();
        jlAño = new javax.swing.JLabel();
        jrbTercero = new javax.swing.JRadioButton();
        jrbSegundo = new javax.swing.JRadioButton();
        jbRegistrar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();
        jbEditar = new javax.swing.JButton();
        jlNuevoCodigo = new javax.swing.JLabel();
        jlNuevaMateriaYAño = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(737, 570));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Materias");

        jtCodigo.setFont(new java.awt.Font("Castellar", 1, 29)); // NOI18N
        jtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCodigo.setText("CODIGO:");
        jtCodigo.setToolTipText("");
        jtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCodigoFocusLost(evt);
            }
        });
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
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

        jrbPrimero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbPrimero.setText("1° PRIMERO ");
        jrbPrimero.setEnabled(false);
        jrbPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPrimeroActionPerformed(evt);
            }
        });

        jlAño.setFont(new java.awt.Font("Castellar", 1, 20)); // NOI18N
        jlAño.setText("año");
        jlAño.setEnabled(false);
        jlAño.setPreferredSize(new java.awt.Dimension(70, 40));

        jrbTercero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbTercero.setText("3° TERCERO");
        jrbTercero.setEnabled(false);
        jrbTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTerceroActionPerformed(evt);
            }
        });

        jrbSegundo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbSegundo.setText("2° SEGUNDO");
        jrbSegundo.setEnabled(false);
        jrbSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSegundoActionPerformed(evt);
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
        jbSalir.setRolloverEnabled(true);
        jbSalir.setVerifyInputWhenFocusTarget(false);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlEstado.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(153, 0, 0));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEstado.setText("Alumno Nuevo");

        jbEditar.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jbEditar.setText("EDITAR");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jlNuevoCodigo.setForeground(new java.awt.Color(153, 0, 0));

        jlNuevaMateriaYAño.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbPrimero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbSegundo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbTercero)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlNuevaMateriaYAño, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlNuevoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jlNuevoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jlNuevaMateriaYAño, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPrimero)
                    .addComponent(jrbTercero)
                    .addComponent(jrbSegundo))
                .addGap(18, 18, 18)
                .addComponent(jlEstado)
                .addGap(45, 45, 45)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        try {
            Integer codigo = Integer.parseInt(jtCodigo.getText());
            jtNombre.setEnabled(true);
            jtCodigo.setEnabled(false);
            jbEditar.setEnabled(true);
            jlNuevoCodigo.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un Valor Numerico para el Codigo");
            jtCodigo.setText("");
        }

    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        jtNombre.setEnabled(false);
        jrbPrimero.setEnabled(true);
        jrbSegundo.setEnabled(true);
        jrbTercero.setEnabled(true);
        jlAño.setEnabled(true);
        if (jrbPrimero.isSelected() == true || jrbSegundo.isSelected() == true || jrbTercero.isSelected() == true) {
            jbRegistrar.setEnabled(true);
        }
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jrbTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTerceroActionPerformed
        if (jrbTercero.isSelected() == true) {
            jbRegistrar.setEnabled(true);
            jrbSegundo.setSelected(false);
            jrbPrimero.setSelected(false);
        }
    }//GEN-LAST:event_jrbTerceroActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed

        Integer idMateria = Integer.parseInt(jtCodigo.getText());
        String nombre = jtNombre.getText();
        int anio = 0;
        if (jrbPrimero.isSelected() == true) {
            anio = 1;
        } else if (jrbSegundo.isSelected() == true) {
            anio = 2;
        } else if (jrbTercero.isSelected() == true) {
            anio = 3;
        } else {
            JOptionPane.showMessageDialog(this, "Seleccion el Año por favor");
        }
        Materia materia = new Materia(idMateria, nombre, anio);
        boolean existe = false;
        if (!materias.containsKey(materia.getIdMateria())) {
            for (Map.Entry<Integer, Materia> m : materias.entrySet()) {
                if (m.getValue().getNombre().equalsIgnoreCase(nombre)) {
                    if (m.getValue().getAnio() == anio) {
                        existe = true;
                    }
                }
            }

            if (existe) {
                switch (anio) {
                    case 1:
                        JOptionPane.showMessageDialog(this, "Ya existe la Materia " + nombre + " de primer año");
                        jlNuevaMateriaYAño.setText("Verifique Fecha y Año, Ya existe " + nombre + " de primer año");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "Ya existe la Materia " + nombre + " de segundo año");
                        jlNuevaMateriaYAño.setText("Verifique Fecha y Año, Ya existe " + nombre + " de segundo año");
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Ya existe la Materia " + nombre + " de tercer año");
                        jlNuevaMateriaYAño.setText("Verifique Fecha y Año, Ya existe " + nombre + " de tercer año");
                        break;
                }
                jtNombre.setEnabled(true);
                jbRegistrar.setEnabled(false);
                jrbPrimero.setEnabled(false);
                jrbSegundo.setEnabled(false);
                jrbTercero.setEnabled(false);
                jtNombre.requestFocus();

            } else {

                ViewColegio.materias.put(idMateria, materia);
                JOptionPane.showMessageDialog(this, "Materia Agregada");
                jbNuevo.setEnabled(true);
                jbEditar.setEnabled(false);
                jbRegistrar.setEnabled(false);
                jrbPrimero.setEnabled(false);
                jrbSegundo.setEnabled(false);
                jrbTercero.setEnabled(false);
                jlAño.setEnabled(false);
                jlEstado.setText("Materia Agregada");
                jlEstado.setForeground(new java.awt.Color(21, 153, 0));
                jlNuevaMateriaYAño.setText("");
                jtNombre.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ya Existe una Materia con el Codigo : N° " + idMateria);
            jlNuevoCodigo.setText("Codigo existente, ingrese otro");
            jbRegistrar.setEnabled(false);
            jrbPrimero.setEnabled(false);
            jrbSegundo.setEnabled(false);
            jrbTercero.setEnabled(false);
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jbNuevo.setEnabled(false);
        jbRegistrar.setEnabled(false);
        jrbPrimero.setSelected(false);
        jrbSegundo.setSelected(false);
        jrbTercero.setSelected(false);
        jtCodigo.setEnabled(true);
        jtCodigo.setText("CODIGO:");
        jtNombre.setText("NOMBRE:");
        jlEstado.setText("Materia Nueva");
        jlEstado.setForeground(new java.awt.Color(153, 0, 0));
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jrbPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPrimeroActionPerformed
        if (jrbPrimero.isSelected() == true) {
            jbRegistrar.setEnabled(true);
            jrbSegundo.setSelected(false);
            jrbTercero.setSelected(false);
        }

    }//GEN-LAST:event_jrbPrimeroActionPerformed

    private void jrbSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSegundoActionPerformed
        if (jrbSegundo.isSelected() == true) {
            jbRegistrar.setEnabled(true);
            jrbPrimero.setSelected(false);
            jrbTercero.setSelected(false);
        }
    }//GEN-LAST:event_jrbSegundoActionPerformed

    private void jtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusGained
        if (jtCodigo.getText().equals("CODIGO:")) {
            jtCodigo.setText("");
        }
    }//GEN-LAST:event_jtCodigoFocusGained

    private void jtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusLost
        if (jtCodigo.getText().equals("")) {
            jtCodigo.setText("CODIGO:");
        }
    }//GEN-LAST:event_jtCodigoFocusLost

    private void jtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusGained
        if (jtNombre.getText().equals("NOMBRE:")) {
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtNombreFocusGained

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        if (jtNombre.getText().equals("")) {
            jtNombre.setText("NOMBRE:");
        }
    }//GEN-LAST:event_jtNombreFocusLost

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbEditar.setEnabled(false);
        jtCodigo.setEnabled(true);
        jtNombre.setEnabled(false);
        jrbPrimero.setEnabled(false);
        jrbSegundo.setEnabled(false);
        jrbTercero.setEnabled(false);
        jtCodigo.requestFocus();
        jbRegistrar.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAño;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNuevaMateriaYAño;
    private javax.swing.JLabel jlNuevoCodigo;
    private javax.swing.JRadioButton jrbPrimero;
    private javax.swing.JRadioButton jrbSegundo;
    private javax.swing.JRadioButton jrbTercero;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}

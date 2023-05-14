package Vistas;

import Inscripciones.Materia;
import static Vistas.ViewColegio.materias;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewFormularioMaterias extends javax.swing.JInternalFrame {

    ImageIcon iconoError = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
    ImageIcon iconoMateria = new ImageIcon(getClass().getResource("/Imagenes/materia.png"));

    public ViewFormularioMaterias() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(735, 548));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 548));

        jtCodigo.setBackground(new java.awt.Color(102, 102, 102));
        jtCodigo.setFont(new java.awt.Font("Castellar", 1, 29)); // NOI18N
        jtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCodigo.setText("CODIGO:");
        jtCodigo.setToolTipText("");
        jtCodigo.setOpaque(false);
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

        jtNombre.setBackground(new java.awt.Color(102, 102, 102));
        jtNombre.setFont(new java.awt.Font("Castellar", 1, 29)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(255, 255, 255));
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

        jrbPrimero.setBackground(new java.awt.Color(51, 51, 51));
        jrbPrimero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbPrimero.setForeground(new java.awt.Color(255, 255, 255));
        jrbPrimero.setText("1° PRIMERO ");
        jrbPrimero.setEnabled(false);
        jrbPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPrimeroActionPerformed(evt);
            }
        });

        jlAño.setBackground(new java.awt.Color(51, 51, 51));
        jlAño.setFont(new java.awt.Font("Castellar", 1, 20)); // NOI18N
        jlAño.setForeground(new java.awt.Color(255, 255, 255));
        jlAño.setText("año");
        jlAño.setEnabled(false);
        jlAño.setPreferredSize(new java.awt.Dimension(70, 40));

        jrbTercero.setBackground(new java.awt.Color(51, 51, 51));
        jrbTercero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbTercero.setForeground(new java.awt.Color(255, 255, 255));
        jrbTercero.setText("3° TERCERO");
        jrbTercero.setEnabled(false);
        jrbTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTerceroActionPerformed(evt);
            }
        });

        jrbSegundo.setBackground(new java.awt.Color(51, 51, 51));
        jrbSegundo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbSegundo.setForeground(new java.awt.Color(255, 255, 255));
        jrbSegundo.setText("2° SEGUNDO");
        jrbSegundo.setEnabled(false);
        jrbSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSegundoActionPerformed(evt);
            }
        });

        jbRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        jbRegistrar.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("REGISTRAR");
        jbRegistrar.setEnabled(false);
        jbRegistrar.setOpaque(false);
        jbRegistrar.setPreferredSize(new java.awt.Dimension(100, 32));
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jbNuevo.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setText("NUEVO");
        jbNuevo.setEnabled(false);
        jbNuevo.setPreferredSize(new java.awt.Dimension(100, 40));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("SALIR");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jbSalir.setRolloverEnabled(true);
        jbSalir.setVerifyInputWhenFocusTarget(false);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlEstado.setBackground(new java.awt.Color(51, 51, 51));
        jlEstado.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jlEstado.setForeground(new java.awt.Color(255, 0, 0));
        jlEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEstado.setText("Materia Nueva");

        jbEditar.setBackground(new java.awt.Color(51, 51, 51));
        jbEditar.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(255, 255, 255));
        jbEditar.setText("EDITAR");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jlNuevoCodigo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jlNuevoCodigo.setForeground(new java.awt.Color(255, 0, 0));

        jlNuevaMateriaYAño.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jlNuevaMateriaYAño.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Castellar", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Materias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jbEditar)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNuevaMateriaYAño, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jrbPrimero)
                                .addGap(18, 18, 18)
                                .addComponent(jrbSegundo)
                                .addGap(18, 18, 18)
                                .addComponent(jrbTercero)))
                        .addGap(111, 111, 111))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jlNuevoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jlNuevoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jlNuevaMateriaYAño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbPrimero)
                    .addComponent(jrbTercero)
                    .addComponent(jrbSegundo))
                .addGap(30, 30, 30)
                .addComponent(jlEstado)
                .addGap(30, 30, 30)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed

        Integer idMateria = Integer.parseInt(jtCodigo.getText());
        String nombre = jtNombre.getText().toUpperCase();
        
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
                        JOptionPane.showMessageDialog(this, "Ya existe la Materia " + nombre + " de primer año", "MATERIA EXISTENTE", WIDTH, iconoError);
                        jlNuevaMateriaYAño.setText("Verifique Fecha y Año, Ya existe " + nombre + " de primer año");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this, "Ya existe la Materia " + nombre + " de segundo año", "MATERIA EXISTENTE", WIDTH, iconoError);
                        jlNuevaMateriaYAño.setText("Verifique Fecha y Año, Ya existe " + nombre + " de segundo año");
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Ya existe la Materia " + nombre + " de tercer año", "MATERIA EXISTENTE", WIDTH, iconoError);
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
                JOptionPane.showMessageDialog(this, "Materia Agregada", "NUEVA MATERIA", WIDTH, iconoMateria);
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
            JOptionPane.showMessageDialog(this, "Ya Existe una Materia con el Codigo : N° " + idMateria, "MATERIA EXISTENTE", WIDTH, iconoError);
            jlNuevoCodigo.setText("Codigo existente, ingrese otro");
            jbRegistrar.setEnabled(false);
            jrbPrimero.setEnabled(false);
            jrbSegundo.setEnabled(false);
            jrbTercero.setEnabled(false);
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jrbSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSegundoActionPerformed
        if (jrbSegundo.isSelected() == true) {
            jbRegistrar.setEnabled(true);
            jrbPrimero.setSelected(false);
            jrbTercero.setSelected(false);
        }else {
            jbRegistrar.setEnabled(false);
        }
    }//GEN-LAST:event_jrbSegundoActionPerformed

    private void jrbTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTerceroActionPerformed
        if (jrbTercero.isSelected() == true) {
            jbRegistrar.setEnabled(true);
            jrbSegundo.setSelected(false);
            jrbPrimero.setSelected(false);
        }else {
            jbRegistrar.setEnabled(false);
        }
    }//GEN-LAST:event_jrbTerceroActionPerformed

    private void jrbPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPrimeroActionPerformed
        if (jrbPrimero.isSelected() == true) {
            jbRegistrar.setEnabled(true);
            jrbSegundo.setSelected(false);
            jrbTercero.setSelected(false);
        }else {
            jbRegistrar.setEnabled(false);
        }
    }//GEN-LAST:event_jrbPrimeroActionPerformed

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

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        if (jtNombre.getText().equals("")) {
            jtNombre.setText("NOMBRE:");
        }
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusGained
        if (jtNombre.getText().equals("NOMBRE:")) {
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtNombreFocusGained

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        try {
            Integer codigo = Integer.parseInt(jtCodigo.getText());
            jtNombre.setEnabled(true);
            jtCodigo.setEnabled(false);
            jbEditar.setEnabled(true);
            jlNuevoCodigo.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numerico para CODIGO", "ERROR", WIDTH, iconoError);
            jtCodigo.setText("");
        }
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusLost
        if (jtCodigo.getText().equals("")) {
            jtCodigo.setText("CODIGO:");
        }
    }//GEN-LAST:event_jtCodigoFocusLost

    private void jtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusGained
        if (jtCodigo.getText().equals("CODIGO:")) {
            jtCodigo.setText("");
        }
    }//GEN-LAST:event_jtCodigoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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

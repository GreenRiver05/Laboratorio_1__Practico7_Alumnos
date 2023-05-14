package Vistas;

import Inscripciones.Alumno;
import Inscripciones.Materia;
import static Vistas.ViewColegio.estudiantes;
import static Vistas.ViewColegio.materias;
import static Vistas.ViewColegio.misEstudiantes;
import static Vistas.ViewColegio.misMaterias;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ViewFormularioInscripciones extends javax.swing.JInternalFrame {

    public void llenarComboBoxYMapa() {
        int aux = 2;
        for (Map.Entry<Integer, Alumno> a : estudiantes.entrySet()) {
            String valor = a.getKey() + " - ";
            valor += a.getValue().getNombre();
            valor += " " + a.getValue().getApellido();
            valor = valor.toUpperCase();
            jcbAlumnos.addItem(valor);
            misEstudiantes.put(aux, a.getValue());  //llenamos otro mapa para guardar los valores de los alumnos
            aux++;
        }
        
        for (Map.Entry<Integer, Alumno> b : misEstudiantes.entrySet()) {
            System.out.println("\nClave: " + b.getKey() + "     Nombre: " + b.getValue().getNombre()
                    + "    Apellido: " + b.getValue().getApellido() + "   Legajo: " + b.getValue().getLegajo());
        }
    }

    public void llenarComboBox2YMapa() {
        int aux = 2;
        for (Map.Entry<Integer, Materia> matt : materias.entrySet()) {
            String valor = matt.getKey() + " - ";
            valor += matt.getValue().getNombre();
            valor += " de " + matt.getValue().getAnio() + "° año ";
            valor = valor.toUpperCase();
            jcbMaterias.addItem(valor);
            misMaterias.put(aux, matt.getValue());   //llenamos otro mapa para guardar los valores de las materias
            aux++;
        }
        for (Map.Entry<Integer, Materia> b : misMaterias.entrySet()) {
            System.out.println("\nClave: " + b.getKey() + "     Nombre: " + b.getValue().getNombre()
                    + "    Anio: " + b.getValue().getAnio() + "   Codigo: " + b.getValue().getIdMateria());
        }
    }

    public void llenarComboBox3Inscripciones(Alumno alumno) {
        jcbMateriasAlumnos.removeAllItems();
        jcbMateriasAlumnos.addItem("MATERIAS");
        jcbMateriasAlumnos.addItem("");
        for (Map.Entry<Integer, Materia> matt : alumno.getMaterias().entrySet()) {
            String valor = matt.getValue().getNombre();
            valor += " de " + matt.getValue().getAnio() + "° año ";
            valor = valor.toUpperCase();
            jcbMateriasAlumnos.addItem(valor);
        }
    }

    public ViewFormularioInscripciones() {
        initComponents();
        llenarComboBoxYMapa();
        llenarComboBox2YMapa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jcbMaterias = new javax.swing.JComboBox<>();
        jcbMateriasAlumnos = new javax.swing.JComboBox<>();
        jlNombre = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jlEstudiante = new javax.swing.JLabel();
        jlCantidadMateria = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(735, 548));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 558));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Castellar", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripcion");

        jcbAlumnos.setBackground(new java.awt.Color(51, 51, 51));
        jcbAlumnos.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jcbAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jcbAlumnos.setMaximumRowCount(10);
        jcbAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUMNOS REGISTRADO", " " }));
        jcbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnosItemStateChanged(evt);
            }
        });

        jcbMaterias.setBackground(new java.awt.Color(51, 51, 51));
        jcbMaterias.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jcbMaterias.setForeground(new java.awt.Color(255, 255, 255));
        jcbMaterias.setMaximumRowCount(10);
        jcbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATERIAS EXISTENTES", " " }));
        jcbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasActionPerformed(evt);
            }
        });

        jcbMateriasAlumnos.setBackground(new java.awt.Color(51, 51, 51));
        jcbMateriasAlumnos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcbMateriasAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        jcbMateriasAlumnos.setMaximumRowCount(10);
        jcbMateriasAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATERIAS", " " }));
        jcbMateriasAlumnos.setEnabled(false);

        jlNombre.setBackground(new java.awt.Color(51, 51, 51));
        jlNombre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 102, 0));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jtNumero.setEditable(false);
        jtNumero.setBackground(new java.awt.Color(51, 51, 51));
        jtNumero.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jtNumero.setForeground(new java.awt.Color(255, 255, 255));
        jtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNumero.setEnabled(false);

        jlEstudiante.setBackground(new java.awt.Color(51, 51, 51));
        jlEstudiante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        jlEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jlCantidadMateria.setBackground(new java.awt.Color(51, 51, 51));
        jlCantidadMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlCantidadMateria.setForeground(new java.awt.Color(255, 255, 255));
        jlCantidadMateria.setText("CANTIDAD DE MATERIAS");
        jlCantidadMateria.setEnabled(false);

        jbInscribir.setBackground(new java.awt.Color(51, 51, 51));
        jbInscribir.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(255, 255, 255));
        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.setPreferredSize(new java.awt.Dimension(100, 32));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("SALIR");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCantidadMateria)
                                .addGap(8, 8, 8)
                                .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbMateriasAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191)))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMateriasAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCantidadMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        int claveAlumno = jcbAlumnos.getSelectedIndex();
        int claveMateria = jcbMaterias.getSelectedIndex();

        boolean inscripto = false;
        for (Map.Entry<Integer, Alumno> a : misEstudiantes.entrySet()) {

            if (a.getKey() == claveAlumno) {

                for (Map.Entry<Integer, Materia> m : misMaterias.entrySet()) {

                    if (m.getKey() == claveMateria) {
                        a.getValue().agregarMateria(m.getValue());
                        inscripto = a.getValue().agregarMateria(m.getValue());
                        Alumno alum = a.getValue();

                        llenarComboBox3Inscripciones(alum);
                        int numeroMaterias = a.getValue().cantidadMaterias();
                        jtNumero.setText(numeroMaterias + "");
                        if (inscripto) {
                            JOptionPane.showMessageDialog(this, "Inscripto");
                           
                        } else {
                            JOptionPane.showMessageDialog(this, "Ya se encuentra Inscripto");
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jSalir3ActionPerformed

    private void jcbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnosItemStateChanged
        int claveAlumno = jcbAlumnos.getSelectedIndex();
        int claveMateria = jcbMaterias.getSelectedIndex();
        for (Map.Entry<Integer, Alumno> a : misEstudiantes.entrySet()) {
            if (a.getKey() == claveAlumno) {
                String datos = a.getValue().getNombre() + " " + a.getValue().getApellido();
                datos = datos.toUpperCase();
                jlEstudiante.setText("ESTUDIANTE:");
                jlNombre.setText(datos);
                Alumno alum = a.getValue();
                llenarComboBox3Inscripciones(alum);
                int numeroMaterias = a.getValue().cantidadMaterias();
                jtNumero.setText(numeroMaterias + "");
            }
        }
        if (claveAlumno < 2 || claveMateria < 2) {
            jbInscribir.setEnabled(false);
        } else {
            jbInscribir.setEnabled(true);
        }
        if (claveAlumno < 2) {
            jlNombre.setText("");
            jlEstudiante.setText("");
            jlCantidadMateria.setEnabled(false);
            jtNumero.setEnabled(false);
            jtNumero.setText("");
            jcbMateriasAlumnos.setEnabled(false);
        } else {
            jlCantidadMateria.setEnabled(true);
            jtNumero.setEnabled(true);
            jcbMateriasAlumnos.setEnabled(true);
        }
    }//GEN-LAST:event_jcbAlumnosItemStateChanged

    private void jcbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasActionPerformed
        int claveAlumno = jcbAlumnos.getSelectedIndex();
        int claveMateria = jcbMaterias.getSelectedIndex();
        if (claveAlumno < 2 || claveMateria < 2) {
            jbInscribir.setEnabled(false);
        } else {
            jbInscribir.setEnabled(true);
        }
    }//GEN-LAST:event_jcbMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumnos;
    private javax.swing.JComboBox<String> jcbMaterias;
    private javax.swing.JComboBox<String> jcbMateriasAlumnos;
    private javax.swing.JLabel jlCantidadMateria;
    private javax.swing.JLabel jlEstudiante;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtNumero;
    // End of variables declaration//GEN-END:variables
}

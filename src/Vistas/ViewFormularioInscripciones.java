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

        jLabel1 = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jcbMaterias = new javax.swing.JComboBox<>();
        jcbMateriasAlumnos = new javax.swing.JComboBox<>();
        jlNombre = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jlEstudiante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(737, 570));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripcion");

        jbInscribir.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setPreferredSize(new java.awt.Dimension(100, 32));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.setPreferredSize(new java.awt.Dimension(100, 40));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalir3ActionPerformed(evt);
            }
        });

        jcbAlumnos.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jcbAlumnos.setMaximumRowCount(10);
        jcbAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUMNOS REGISTRADO", " " }));
        jcbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnosItemStateChanged(evt);
            }
        });

        jcbMaterias.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jcbMaterias.setMaximumRowCount(10);
        jcbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATERIAS EXISTENTES", " " }));

        jcbMateriasAlumnos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcbMateriasAlumnos.setMaximumRowCount(10);
        jcbMateriasAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATERIAS", " " }));
        jcbMateriasAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasAlumnosActionPerformed(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(153, 204, 0));
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jtNumero.setEditable(false);
        jtNumero.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });

        jlEstudiante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("CANTIDAD DE MATERIAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbMateriasAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMateriasAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        int claveAlumno = jcbAlumnos.getSelectedIndex();
        int claveMateria = jcbMaterias.getSelectedIndex();
        boolean inscripto= false;
        for (Map.Entry<Integer, Alumno> a : misEstudiantes.entrySet()) {

            if (a.getKey() == claveAlumno) {

                for (Map.Entry<Integer, Materia> m : misMaterias.entrySet()) {

                    if (m.getKey() == claveMateria) {
                        inscripto= a.getValue().agregarMateria(m.getValue());
                    }
                    if(inscripto){
                        JOptionPane.showMessageDialog(this, "Inscripto");
                    }else{
                        JOptionPane.showMessageDialog(this, "Ya se encuentra Inscripto");
                    }
                }
            }
            for (Map.Entry<Integer,Materia > b : a.getValue().getMaterias().entrySet()) {
                System.out.println("\nClave: " + b.getKey() + "     Nombre: " + b.getValue().getNombre()
                        + "    Anio: " + b.getValue().getAnio() + "   Codigo: " + b.getValue().getIdMateria());
            }
        }
        System.out.println("___________________________________________________________________________");
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalir3ActionPerformed
        dispose();
    }//GEN-LAST:event_jSalir3ActionPerformed

    private void jcbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnosItemStateChanged
        int claveAlumno = jcbAlumnos.getSelectedIndex();
        Alumno alum = null;
        for (Map.Entry<Integer, Alumno> a : misEstudiantes.entrySet()) {
            if (a.getKey() == claveAlumno) {
                String datos = a.getValue().getNombre() + " " + a.getValue().getApellido();
                datos = datos.toUpperCase();
                jlEstudiante.setText("ESTUDIANTE:");
                jlNombre.setText(datos);
                alum = a.getValue();
                llenarComboBox3Inscripciones(alum);
            }
        }
        if(claveAlumno == 0 || claveAlumno == 1){
            jlNombre.setText("");
            jlEstudiante.setText("");
        }
    }//GEN-LAST:event_jcbAlumnosItemStateChanged

    private void jcbMateriasAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMateriasAlumnosActionPerformed

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumnos;
    private javax.swing.JComboBox<String> jcbMaterias;
    private javax.swing.JComboBox<String> jcbMateriasAlumnos;
    private javax.swing.JLabel jlEstudiante;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtNumero;
    // End of variables declaration//GEN-END:variables
}

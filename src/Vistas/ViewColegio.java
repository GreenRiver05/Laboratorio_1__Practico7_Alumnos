package Vistas;

import Inscripciones.Alumno;
import Inscripciones.Materia;
import java.util.HashMap;
import java.util.Map;

public class ViewColegio extends javax.swing.JFrame {

    public static Map<Integer, Alumno> estudiantes = new HashMap();
    public static Map<Integer, Materia> materias = new HashMap();
    public static Map<Integer, Alumno> misEstudiantes = new HashMap();
    public static Map<Integer, Materia> misMaterias = new HashMap();

    public ViewColegio() {
        initComponents();
        estudiantes.put(55, new Alumno(55, "Quito", "Esteban"));
        estudiantes.put(59, new Alumno(59, "Rico", "Pepe"));
        estudiantes.put(65, new Alumno(65, "Leria", "Cingu"));
        estudiantes.put(34, new Alumno(34, "Perez", "Sofia"));
        materias.put(29, new Materia(29, "Filosofia", 3));
        materias.put(10, new Materia(10, "Fisica", 2));
        materias.put(15, new Materia(15, "Quimica", 1));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMRegistros = new javax.swing.JMenu();
        jmFormularioMaterias = new javax.swing.JMenuItem();
        jmFormularioAlumnos = new javax.swing.JMenuItem();
        jmFormularioInscripciones = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();
        jmSalirDelRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 140, 784, 782));

        jEscritorio.setAutoscrolls(true);
        jEscritorio.setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(" GRUPO 9");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("INTEGRANTES : ");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pablo Nicolas Peñaloza");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Practico N° 7");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Becerra Diaz Gabriel Ezequiel");

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Alex Gustavo Astudillo Duran");

        jLabel8.setFont(new java.awt.Font("Castellar", 0, 80)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("COLEGIO");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inscripciones.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Castellar", 0, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("REGISTROS");

        jEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18))
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(49, 49, 49)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(241, 241, 241))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jMRegistros.setText("Registros");
        jMRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegistrosActionPerformed(evt);
            }
        });

        jmFormularioMaterias.setText("Formulario Materias");
        jmFormularioMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriasActionPerformed(evt);
            }
        });
        jMRegistros.add(jmFormularioMaterias);

        jmFormularioAlumnos.setText("Formulario Alumnos");
        jmFormularioAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnosActionPerformed(evt);
            }
        });
        jMRegistros.add(jmFormularioAlumnos);

        jmFormularioInscripciones.setText("Formulario Inscripciones");
        jmFormularioInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioInscripcionesActionPerformed(evt);
            }
        });
        jMRegistros.add(jmFormularioInscripciones);

        jMenuBar1.add(jMRegistros);

        jMSalir.setText("Salir");

        jmSalirDelRegistro.setText("Salir del Registro");
        jmSalirDelRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirDelRegistroActionPerformed(evt);
            }
        });
        jMSalir.add(jmSalirDelRegistro);

        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnosActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewFormularioAlumnos alumnos = new ViewFormularioAlumnos();
        jEscritorio.add(alumnos);
        alumnos.setVisible(true);

    }//GEN-LAST:event_jmFormularioAlumnosActionPerformed

    private void jMRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMRegistrosActionPerformed

    private void jmFormularioInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioInscripcionesActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewFormularioInscripciones inscripcion = new ViewFormularioInscripciones();
        jEscritorio.add(inscripcion);
        inscripcion.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jmFormularioInscripcionesActionPerformed

    private void jmSalirDelRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirDelRegistroActionPerformed
        dispose();
    }//GEN-LAST:event_jmSalirDelRegistroActionPerformed

    private void jmFormularioMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriasActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        ViewFormularioMaterias matt = new ViewFormularioMaterias();
        jEscritorio.add(matt);
        matt.setVisible(true);
    }//GEN-LAST:event_jmFormularioMateriasActionPerformed

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
            java.util.logging.Logger.getLogger(ViewColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewColegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMRegistros;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmFormularioAlumnos;
    private javax.swing.JMenuItem jmFormularioInscripciones;
    private javax.swing.JMenuItem jmFormularioMaterias;
    private javax.swing.JMenuItem jmSalirDelRegistro;
    // End of variables declaration//GEN-END:variables
}

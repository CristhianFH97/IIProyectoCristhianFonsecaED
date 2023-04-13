/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class MainUI extends javax.swing.JFrame {

    private MyLinkedList list;

    public MainUI() {
        initComponents();
        list = new MyLinkedList();
        BTMostrarListas.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Display = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTCrearLista = new javax.swing.JButton();
        BTMostrarListas = new javax.swing.JButton();
        BTReportePorEstado = new javax.swing.JButton();
        BTReportePorPrioridad = new javax.swing.JButton();
        BTGuardarDatos = new javax.swing.JButton();
        BTCargarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TListasTareas = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        BTActualizarLista = new javax.swing.JButton();
        BTEliminarLista = new javax.swing.JButton();
        TNumeroLista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TNumeroTarea = new javax.swing.JTextField();
        BTEditarTarea = new javax.swing.JButton();
        BTEliminarTarea = new javax.swing.JButton();
        BTAniadirTarea = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Tareas");
        setBackground(new java.awt.Color(51, 51, 255));

        Display.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Tareas");

        BTCrearLista.setText("Crear Lista de Tareas");
        BTCrearLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCrearListaActionPerformed(evt);
            }
        });

        BTMostrarListas.setText("Mostrar Listas");
        BTMostrarListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMostrarListasActionPerformed(evt);
            }
        });

        BTReportePorEstado.setText("Reporte por estado");
        BTReportePorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTReportePorEstadoActionPerformed(evt);
            }
        });

        BTReportePorPrioridad.setText("Reporte Prioridad");
        BTReportePorPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTReportePorPrioridadActionPerformed(evt);
            }
        });

        BTGuardarDatos.setText("Guardar");
        BTGuardarDatos.setToolTipText("");
        BTGuardarDatos.setActionCommand("Guardar");
        BTGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTGuardarDatosActionPerformed(evt);
            }
        });

        BTCargarDatos.setText("Cargar Datos");
        BTCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCargarDatosActionPerformed(evt);
            }
        });

        TListasTareas.setColumns(20);
        TListasTareas.setRows(5);
        jScrollPane1.setViewportView(TListasTareas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el # de lista:");

        BTActualizarLista.setText("Actualizar");
        BTActualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTActualizarListaActionPerformed(evt);
            }
        });

        BTEliminarLista.setText("Eliminar");
        BTEliminarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarListaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el # de tarea:");

        BTEditarTarea.setText("Editar");
        BTEditarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEditarTareaActionPerformed(evt);
            }
        });

        BTEliminarTarea.setText("Eliminar");
        BTEliminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarTareaActionPerformed(evt);
            }
        });

        BTAniadirTarea.setText("Añadir Tarea");
        BTAniadirTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAniadirTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display);
        Display.setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DisplayLayout.createSequentialGroup()
                        .addComponent(BTCrearLista, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTReportePorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTReportePorPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTMostrarListas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DisplayLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DisplayLayout.createSequentialGroup()
                                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TNumeroTarea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTEditarTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTEliminarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(DisplayLayout.createSequentialGroup()
                                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TNumeroLista, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTAniadirTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTActualizarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTEliminarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DisplayLayout.createSequentialGroup()
                        .addComponent(BTGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTCargarDatos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
        );
        DisplayLayout.setVerticalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTCrearLista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTReportePorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTReportePorPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTMostrarListas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DisplayLayout.createSequentialGroup()
                        .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DisplayLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TNumeroLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DisplayLayout.createSequentialGroup()
                                .addComponent(BTActualizarLista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTAniadirTarea)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTEliminarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DisplayLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TNumeroTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DisplayLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DisplayLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(BTEditarTarea))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayLayout.createSequentialGroup()
                                        .addComponent(BTEliminarTarea)
                                        .addGap(38, 38, 38)))))
                        .addGap(79, 79, 79))
                    .addGroup(DisplayLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTGuardarDatos)
                            .addComponent(BTCargarDatos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCargarDatosActionPerformed
        // TODO add your handling code here:
        // Actualizar la vista de las listas de tareas
        list.cargarDesdeArchivo("ListaTareas.txt");
        BTMostrarListas.doClick();
    }//GEN-LAST:event_BTCargarDatosActionPerformed

    private void BTGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTGuardarDatosActionPerformed
        // TODO add your handling code here:
        // Guardar la lista en el archivo
        list.guardarEnArchivo("ListaTareas.txt");
        // Actualizar la vista de las listas de tareas
        BTMostrarListas.doClick();
    }//GEN-LAST:event_BTGuardarDatosActionPerformed

    private void BTReportePorPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReportePorPrioridadActionPerformed
        // TODO add your handling code here:
        list.reportePorPrioridad();
    }//GEN-LAST:event_BTReportePorPrioridadActionPerformed

    private void BTReportePorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTReportePorEstadoActionPerformed
        // TODO add your handling code here:
        list.reportePorEstado();
    }//GEN-LAST:event_BTReportePorEstadoActionPerformed

    private void BTMostrarListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMostrarListasActionPerformed
        String info = list.getListasYTareasInfo();
        TListasTareas.setText(info);

    }//GEN-LAST:event_BTMostrarListasActionPerformed

    private void BTCrearListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCrearListaActionPerformed
        // TODO add your handling code here:
        String nombreLista = JOptionPane.showInputDialog("Ingrese el nombre de la nueva lista de tareas");
        if (nombreLista != null && !nombreLista.trim().isEmpty()) {
            list.insert(nombreLista);
            // Actualizar la vista de las listas de tareas
            BTMostrarListas.doClick();
            // Guardar la lista en el archivo
            list.guardarEnArchivo("ListaTareas.txt");
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre válido para la lista de tareas.");
        }
    }//GEN-LAST:event_BTCrearListaActionPerformed

    private void BTEliminarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarListaActionPerformed
        // TODO add your handling code here:

        if (TNumeroLista.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo 'Número de lista' está vacío.");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta lista?");
        if (confirmacion == JOptionPane.YES_OPTION) {
            boolean eliminado = list.eliminarLista(Integer.parseInt(TNumeroLista.getText()));
            if (!eliminado) {
                JOptionPane.showMessageDialog(this, "El índice ingresado no existe");
            } else {
                JOptionPane.showMessageDialog(this, "Lista eliminada exitosamente");
                // Actualizar la vista de las listas de tareas
                BTMostrarListas.doClick();
                // Guardar la lista en el archivo
                list.guardarEnArchivo("ListaTareas.txt");
            }
        }
    }//GEN-LAST:event_BTEliminarListaActionPerformed

    private void BTActualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTActualizarListaActionPerformed
        // TODO add your handling code here:
        if (TNumeroLista.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo 'Número de lista' está vacío.");
            return;
        }

        boolean actualizado = list.editarLista(Integer.parseInt(TNumeroLista.getText()));
        if (!actualizado) {
            JOptionPane.showMessageDialog(this, "El índice ingresado no existe");
        } else {
            // Actualizar la vista de las listas de tareas
            BTMostrarListas.doClick();
            // Guardar la lista en el archivo
            list.guardarEnArchivo("ListaTareas.txt");
        }
    }//GEN-LAST:event_BTActualizarListaActionPerformed

    private void BTAniadirTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAniadirTareaActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (TNumeroLista.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo 'Número de lista' está vacío.");
            return;
        }
        list.agregarTarea(Integer.parseInt(TNumeroLista.getText()));
        // Actualizar la vista de las listas de tareas
        BTMostrarListas.doClick();
        // Guardar la lista en el archivo
        list.guardarEnArchivo("ListaTareas.txt");
    }//GEN-LAST:event_BTAniadirTareaActionPerformed

    private void BTEliminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarTareaActionPerformed
        // TODO add your handling code here:
        // Obtener el texto de los campos TNumeroLista y TNumeroTarea
        String numeroListaTexto = TNumeroLista.getText();
        String numeroTareaTexto = TNumeroTarea.getText();

        // Verificar si los campos están vacíos
        if (numeroListaTexto.isEmpty() || numeroTareaTexto.isEmpty()) {
            // Mostrar un mensaje de error al usuario
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número de lista y un número de tarea.");
            return;
        }

        // Convertir los números de texto a enteros
        int numeroLista = Integer.parseInt(numeroListaTexto);
        int numeroTarea = Integer.parseInt(numeroTareaTexto);

        // Preguntar al usuario si está seguro de eliminar la tarea
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar la tarea?");

        if (opcion == JOptionPane.YES_OPTION) {
            // Eliminar la tarea de la lista
            list.eliminarTarea(numeroLista, numeroTarea);
            // Actualizar la vista de las listas de tareas
            BTMostrarListas.doClick();
            // Guardar la lista en el archivo
            list.guardarEnArchivo("ListaTareas.txt");
        } else if (opcion == JOptionPane.CANCEL_OPTION) {
            return;
        }
    }//GEN-LAST:event_BTEliminarTareaActionPerformed

    private void BTEditarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEditarTareaActionPerformed
        // TODO add your handling code here:
        // validando que los campos TNumeroLista y TNumeroTarea no estén vacíos
        if (TNumeroLista.getText().isEmpty() || TNumeroTarea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número de lista y un número de tarea.");
            return;
        }

        // Acción de editar tarea
        list.editarTareaPorIndice(Integer.parseInt(TNumeroLista.getText()), Integer.parseInt(TNumeroTarea.getText()));
        // Actualizar la vista de las listas de tareas
        BTMostrarListas.doClick();
        // Guardar la lista en el archivo
        list.guardarEnArchivo("ListaTareas.txt");
    }//GEN-LAST:event_BTEditarTareaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTActualizarLista;
    private javax.swing.JButton BTAniadirTarea;
    private javax.swing.JButton BTCargarDatos;
    private javax.swing.JButton BTCrearLista;
    private javax.swing.JButton BTEditarTarea;
    private javax.swing.JButton BTEliminarLista;
    private javax.swing.JButton BTEliminarTarea;
    private javax.swing.JButton BTGuardarDatos;
    private javax.swing.JButton BTMostrarListas;
    private javax.swing.JButton BTReportePorEstado;
    private javax.swing.JButton BTReportePorPrioridad;
    private javax.swing.JPanel Display;
    private javax.swing.JTextArea TListasTareas;
    private javax.swing.JTextField TNumeroLista;
    private javax.swing.JTextField TNumeroTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

package vista;
import Modelo.Funcion;
import Modelo.FuncionDAO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Panel_funciones extends JPanel {
    private JComboBox<String> Sala;
    private JButton btnActulizar;
    private JButton btnAgregar;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JTextField campoFechaHora;
    private JTextField campoPelicula;
    private JTextField campoPrecioBase;
    private JTable funciones;
    private JScrollPane jScrollPane1;
  private DefaultTableModel modelo;

 private FuncionDAO dao = new FuncionDAO();


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        funciones = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        campoPelicula = new javax.swing.JTextField();
        campoPrecioBase = new javax.swing.JTextField();
        Sala = new javax.swing.JComboBox<>();
        campoFechaHora = new javax.swing.JTextField();
        btnActulizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        funciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Funcion", "ID Pelicula", "Sala", "Fecha- Hora", "Precio Base"
            }
        ));
        jScrollPane1.setViewportView(funciones);

        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar ");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        campoPelicula.setText("Peliculas");

        campoPrecioBase.setText("Precio");
        campoPrecioBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioBaseActionPerformed(evt);
            }
        });

        Sala.setEditable(true);
        Sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Sala.setName("sala"); // NOI18N
        Sala.setNextFocusableComponent(Sala);
        Sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaActionPerformed(evt);
            }
        });

        campoFechaHora.setText("Fecha");

        btnActulizar.setText("Actualizar");
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAgregar)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnActulizar)))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(campoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActulizar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(campoFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        Sala.getAccessibleContext().setAccessibleName("sala");
        Sala.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents



    private void SalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaActionPerformed
Sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
    "1 - Sala 1",
    "2 - Sala VIP",
    "3 - Sala 4D",
    "4 - Sala Infantil",
    "5 - Sala Platinum",
    "6 - Sala 2"
}));

}
private void limpiarCampos() {
    campoPelicula.setText("");
    campoFechaHora.setText("");
    campoPrecioBase.setText("");
    Sala.setSelectedIndex(0);
}

private void actualizarTabla() {
    modelo = (DefaultTableModel) funciones.getModel();
    modelo.setRowCount(0); // limpia las filas actuales

    for (Funcion f : dao.listar()) {
        String salaTexto = ""; 
        // Opcional: puedes poner un nombre más legible para la sala
        switch (f.getSala_id()) {
            case 1: salaTexto = "Sala 1"; break;
            case 2: salaTexto = "Sala VIP"; break;
            case 3: salaTexto = "Sala 4D"; break;
            case 4: salaTexto = "Sala Infantil"; break;
            case 5: salaTexto = "Sala Platinum"; break;
            case 6: salaTexto = "Sala 2"; break;
            default: salaTexto = "Sala " + f.getSala_id();
        }

        Object[] fila = {
            f.getFuncion_id(),
            f.getPelicula_id(),
            salaTexto,
            f.getFecha_hora(),
            f.getPrecio_base()
        };
        modelo.addRow(fila);
    }
}
{
    }//GEN-LAST:event_SalaActionPerformed

    private void campoPrecioBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioBaseActionPerformed
      
    }//GEN-LAST:event_campoPrecioBaseActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
  try {
        int peliculaId = Integer.parseInt(campoPelicula.getText().trim());
        String fechaHora;
      fechaHora = campoFechaHora.getText().trim();
        float precio = Float.parseFloat(campoPrecioBase.getText().trim());
        String seleccionSala = (String) Sala.getSelectedItem();
        int salaId = Integer.parseInt(seleccionSala.split(" - ")[0]);
         Funcion f = new Funcion();
        f.setPelicula_id(peliculaId);
        f.setSala_id(salaId);
        f.setFecha_hora(fechaHora);
        f.setPrecio_base(precio);

        if (dao.agregar(f)) {
            limpiarCampos();
            actualizarTabla();
            System.out.println("Función agregada correctamente.");
        } else {
            System.out.println("Error al agregar función.");
        }
    } catch (Exception e) {
        System.out.println("Error al agregar función: " + e.getMessage());
    }
}{
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    int filaSeleccionada = funciones.getSelectedRow();
    if (filaSeleccionada == -1) {
        System.out.println("Selecciona una fila para editar.");
        return;
    }

    try {
        int funcionId = (int) modelo.getValueAt(filaSeleccionada, 0);
        int peliculaId = Integer.parseInt(campoPelicula.getText().trim());
        String fechaHora = campoFechaHora.getText().trim();
        float precio = Float.parseFloat(campoPrecioBase.getText().trim());
        String seleccionSala = (String) Sala.getSelectedItem();
        int salaId = Integer.parseInt(seleccionSala.split(" - ")[0]);

        Funcion f = new Funcion();
        f.setFuncion_id(funcionId);
        f.setPelicula_id(peliculaId);
        f.setSala_id(salaId);
        f.setFecha_hora(fechaHora);
        f.setPrecio_base(precio);

        if (dao.editar(f)) {
            limpiarCampos();
            actualizarTabla();
            System.out.println("Función editada correctamente.");
        } else {
            System.out.println("Error al editar función.");
        }
    } catch (Exception e) {
        System.out.println("Error al editar función: " + e.getMessage());
    }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 {
    int filaSeleccionada = funciones.getSelectedRow();
    if (filaSeleccionada == -1) {
        System.out.println("Selecciona una fila para eliminar.");
        return;
    }

    int funcionId = (int) modelo.getValueAt(filaSeleccionada, 0);

    if (dao.eliminar(funcionId)) {
        limpiarCampos();
        actualizarTabla();
        System.out.println("Función eliminada correctamente.");
    } else {
        System.out.println("Error al eliminar función.");
    }
}

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
   actualizarTabla();

    }//GEN-LAST:event_btnActulizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Sala;
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoFechaHora;
    private javax.swing.JTextField campoPelicula;
    private javax.swing.JTextField campoPrecioBase;
    private javax.swing.JTable funciones;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

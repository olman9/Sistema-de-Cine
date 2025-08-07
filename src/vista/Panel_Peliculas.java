package vista;

import Modelo.Pelicula;
import Modelo.PeliculaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.List;

public class Panel_Peliculas extends javax.swing.JPanel {
private PeliculaDAO dao;

private DefaultTableModel modelo;




public Panel_Peliculas() {
           initComponents();
        dao = new PeliculaDAO();
        modelo = (DefaultTableModel) tabla_peliculas.getModel();  // Usa tabla_peliculas (igual que en initComponents)
        mostrarPeliculas();
   
}  
public void mostrarPeliculas(){
        List<Pelicula> lista = dao.listar();
        modelo.setRowCount(0);
        for (Pelicula p : lista) 
           { Object[] fila = {
                p.getPelicula_id(),
                p.getTitulo(),
                p.getDuracion(),
                p.getClasificacion()
            };
            modelo.addRow(fila);
        }
}



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_peliculas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txduracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbclasificacion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnrefresh = new javax.swing.JButton();
        btnadgregapeli = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista De Peliculas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 450));

        tabla_peliculas.setBackground(new java.awt.Color(31, 41, 55));
        tabla_peliculas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_peliculas.setForeground(new java.awt.Color(229, 231, 235));
        tabla_peliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Duracion", "Clasificacion"
            }
        ));
        jScrollPane1.setViewportView(tabla_peliculas);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Titulo:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Duracion");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txduracionActionPerformed(evt);
            }
        });

        jLabel3.setText("Clasificacion");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbclasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G ", "PG ", "PG-13 ", "R" }));
        cbclasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbclasificacionActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnrefresh.setText("Actualizar");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnadgregapeli.setText("Agregar Pelicula");
        btnadgregapeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadgregapeliActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadgregapeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnrefresh)
                .addGap(18, 18, 18)
                .addComponent(btnadgregapeli)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbclasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbclasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txduracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

   
    




    private void txduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txduracionActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txduracionActionPerformed
 
    private void btnadgregapeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadgregapeliActionPerformed
        
                                                  
    String titulo = txtitulo.getText().trim();
    String duracionStr = txduracion.getText().trim();
    String clasificacion = cbclasificacion.getSelectedItem().toString();

    if (titulo.isEmpty() || duracionStr.isEmpty() || clasificacion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.");
        return;
    }

    int duracion;
    try {
        duracion = Integer.parseInt(duracionStr);
        if (duracion <= 0) {
            JOptionPane.showMessageDialog(null, "La duración debe ser un número entero positivo.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La duración debe ser un número.");
        return;
    }

    Pelicula p = new Pelicula(0, titulo, duracion, clasificacion);

    if (dao.agregar(p)) {
        JOptionPane.showMessageDialog(null, "Película agregada correctamente.");
        mostrarPeliculas();  // Recarga la tabla desde la base de datos
        limpiarCampos();     // Limpia los campos de entrada
    } else {
        JOptionPane.showMessageDialog(null, "Error al agregar la película.");
    }


       
    }//GEN-LAST:event_btnadgregapeliActionPerformed
private void limpiarCampos() {
    txtitulo.setText("");
    txduracion.setText("");
    cbclasificacion.setSelectedIndex(0); // o el índice que quieras por defecto
}

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        //deshabilita el boton mientras se actualiza
        btnrefresh.setEnabled(false);
        btnrefresh.setText("Actualizando...");
        
        try{
            //limpia las filas de la tabla 
            modelo.setRowCount(0);
            
            //vuelve a cargar los datos desde la base de datos
            mostrarPeliculas();
            
            //mensaje de exito 
            JOptionPane.showMessageDialog(null, "Tabla Actualizada correctamente",
                                        "Actualizacion",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar la tabla "+ ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            
        }finally{
            //vuelve a habilitar el boton
            btnrefresh.setEnabled(true);
            btnrefresh.setText("Actualizar");
        }
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void cbclasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbclasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbclasificacionActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
                                            
    if (modelo.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "No hay películas para eliminar", "Tabla vacía", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    int filaSeleccionada = tabla_peliculas.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor seleccione una película para eliminarla", "Sin Selección", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = (int) modelo.getValueAt(filaSeleccionada, 0);  // Suponiendo columna 0 es id

    int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar esta película?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        if (dao.eliminar(id)) {
            JOptionPane.showMessageDialog(null, "Película eliminada correctamente.");
            mostrarPeliculas();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar la película.");
        }
    }


    }//GEN-LAST:event_btneliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadgregapeli;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JComboBox<String> cbclasificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_peliculas;
    private javax.swing.JTextField txduracion;
    private javax.swing.JTextField txtitulo;
    // End of variables declaration//GEN-END:variables

public void setTablaPeliculas(List<Pelicula> peliculas) {
    modelo.setRowCount(0);
    for (Pelicula p : peliculas) {
        Object[] fila = {
            p.getPelicula_id(),
            p.getTitulo(),
            p.getDuracion(),
            p.getClasificacion()
        };
        modelo.addRow(fila);
    }
}}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.min;

import config.Storages;
import core.HLoader;
import core.item_combo;
import core.json;
import core.pasarela;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author wito
 */
public class admin_bitacora extends javax.swing.JInternalFrame {

    DefaultTableModel tablaSesiones, tablaMovimientos;
    DefaultComboBoxModel clientes;
    static boolean bandCombClientes;

    /**
     * Creates new form admin_bitacora
     */
    public admin_bitacora() {
        Storages.infoTerminal();
        bandCombClientes = false;
        initComponents();
        clientes = new DefaultComboBoxModel();
        jComboBox1.setModel(clientes);
        llenarClientes();
        tablaSesiones = new DefaultTableModel();
        jTable1.setModel(tablaSesiones);
        tablaSesiones.addColumn("Usuario");
        tablaSesiones.addColumn("Rol");
        tablaSesiones.addColumn("Nombre");
        tablaSesiones.addColumn("Sucursal");
        tablaSesiones.addColumn("Ciudad");
        tablaSesiones.addColumn("Fecha");
        tablaSesiones.addColumn("H. Inicio");
        tablaSesiones.addColumn("H. Fin");
        llenarTablaSesiones();
        tablaMovimientos = new DefaultTableModel();
        jTable2.setModel(tablaMovimientos);
        tablaMovimientos.addColumn("Cuenta");
        tablaMovimientos.addColumn("Tipo");
        tablaMovimientos.addColumn("Cliente");
        tablaMovimientos.addColumn("Movimiento");
        tablaMovimientos.addColumn("S. Anterior");
        tablaMovimientos.addColumn("Valor M.");
        tablaMovimientos.addColumn("Costo M.");
        tablaMovimientos.addColumn("Saldo");
        tablaMovimientos.addColumn("Fecha");
        tablaMovimientos.addColumn("Sucursal");
        tablaMovimientos.addColumn("Ciudad");
        llenarTablaMovimientos("none");
        llenarBitacoraUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
        setTitle("Bitacora");
        setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sesiones", jPanel1);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Movimientos", jPanel2);

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Editor", "Accion", "Editado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edición de usuarios", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarTablaSesiones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenarTablaMovimientos("none");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (bandCombClientes == true) {
            if (jComboBox1.getSelectedIndex() == 0) {
                llenarTablaMovimientos("none");
            } else {
                item_combo itemCliente = (item_combo) clientes.getSelectedItem();
                llenarTablaMovimientos("" + itemCliente.getId());
            }
        } else {
            bandCombClientes = true;
        }
        jButton2.requestFocus();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        llenarBitacoraUsuario();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void llenarClientes() {
        JSONObject Preparar = new JSONObject();
        Preparar.put("API", "getClientes");
        String rta = pasarela.call(Preparar);
        Preparar.clear();
        Preparar = json.decode(rta);
        JSONArray arreglo = (JSONArray) Preparar.get("clientes");
        clientes.removeAllElements();
        clientes.addElement(new item_combo(0, "Todos..."));
        for (int i = 0; i < arreglo.size(); i++) {
            JSONObject elemento = json.decode(arreglo.get(i).toString());
            clientes.addElement(new item_combo(Integer.parseInt(elemento.get("id").toString()), elemento.get("label").toString()));
        }
    }

    private void llenarTablaSesiones() {
        while (tablaSesiones.getRowCount() > 0) {
            tablaSesiones.removeRow(0);
        }
        JSONObject Preparar = new JSONObject();
        Preparar.put("API", "getBitSesiones");
        String rta = pasarela.call(Preparar);
        Preparar.clear();
        Preparar = json.decode(rta);
        JSONArray arreglo = (JSONArray) Preparar.get("sesiones");
        for (int i = 0; i < arreglo.size(); i++) {
            JSONObject fila = json.decode(arreglo.get(i).toString());
            Object[] data = {
                fila.get("usuario").toString(),
                fila.get("rol").toString(),
                fila.get("nombre").toString(),
                fila.get("sucursal").toString(),
                fila.get("ciudad").toString(),
                fila.get("fechaInicio").toString(),
                fila.get("horaInicio").toString(),
                fila.get("horaFin").toString()
            };
            tablaSesiones.addRow(data);
        }
    }

    private void llenarTablaMovimientos(String idCliente) {
        while (tablaMovimientos.getRowCount() > 0) {
            tablaMovimientos.removeRow(0);
        }
        JSONObject Preparar = new JSONObject();
        Preparar.put("API", "getBitMovimientos");
        Preparar.put("idCliente", idCliente);
        String rta = pasarela.call(Preparar);
        Preparar.clear();
        Preparar = json.decode(rta);
        JSONArray arreglo = (JSONArray) Preparar.get("movimientos");
        for (int i = 0; i < arreglo.size(); i++) {
            JSONObject fila = json.decode(arreglo.get(i).toString());
            Object[] data = {
                fila.get("numCuenta").toString(),
                fila.get("tipoCuenta").toString(),
                fila.get("nomCliente").toString(),
                fila.get("tipoMovimiento").toString(),
                NumberFormat.getNumberInstance(Locale.ITALY).format(Integer.parseInt(fila.get("saldo_anterior").toString())),
                NumberFormat.getNumberInstance(Locale.ITALY).format(Integer.parseInt(fila.get("valor_movimiento").toString())),
                NumberFormat.getNumberInstance(Locale.ITALY).format(Integer.parseInt(fila.get("costo_movimiento").toString())),
                NumberFormat.getNumberInstance(Locale.ITALY).format(Integer.parseInt(fila.get("saldo_restante").toString())),
                fila.get("fecha").toString(),
                fila.get("sucursal").toString(),
                fila.get("ciudad").toString()
            };
            tablaMovimientos.addRow(data);
        }
    }

    public void llenarBitacoraUsuario() {
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Editor", "Accion", "Editado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        DefaultTableModel MTabla = (DefaultTableModel) jTable3.getModel();
        HLoader LOAD_TB = new HLoader(MTabla, "");
        LOAD_TB.tablaBit();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}

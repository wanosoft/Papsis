/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Dao.productoDao;
import To.productoTo;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author WANOSOFT
 */
public class ComprasGUI extends javax.swing.JDialog {
    
    
    productoDao pDao = new productoDao();
    ResultSet rs;
    String codMarca;

    public ComprasGUI(java.awt.Frame parent, boolean modal) {
        
        
        super(parent, modal);
        initComponents();
        setSize(664, 397);
        setLocationRelativeTo(this);
        setResizable(false);
        calendario();
        llenaCbo();
        getRootPane().setDefaultButton(btnComprar);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADRIAN GEREDIA\\Downloads\\icono.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cboMarca = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventas - PAPSIS 2016");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compra de Articulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);

        cboMarca.setEditable(true);
        cboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarcaActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        jLabel5.setText("Importe:");

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addRCompra.png"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, 272, Short.MAX_VALUE)
                    .addComponent(txtCantidad)
                    .addComponent(txtImporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComprar)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 57, 630, 250));

        lblFecha.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 150, 60));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            String mensaje = "Compra Registrada";
            productoTo to = new productoTo();
            //  registra  compra
            to.setCantidad(Integer.parseInt(txtCantidad.getText()));
            to.setFecha(lblFecha.getText());
            pDao.RegistrarComprar(to);
            //  registra detalle de  la compra 
            codMarca = obtenerCodigo();
            String codCompra = pDao.obtenerCodProducto();
            to.setCodigoCompra(codCompra);
            to.setCodMarca(codMarca);
            to.setPrecio(Double.parseDouble(txtPrecio.getText()));
            to.setCantidad(Integer.parseInt(txtCantidad.getText()));
            to.setImporte(Double.valueOf(txtImporte.getText()));
            pDao.registrarDetalleCompra(to);
            JOptionPane.showMessageDialog(rootPane, mensaje);
            limpiaControles();
            System.out.println("Ud. Realizo una Compra");
            System.out.println("***********************");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        double precio = Double.parseDouble(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double importe = 0;
        importe = precio * cantidad;
        txtImporte.setText(String.valueOf(importe));
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void cboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarcaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox cboMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void calendario() {
        Calendar cal1 = Calendar.getInstance();
        String mesInt = "";
//********  AÑO   ********//
        int año = cal1.get(Calendar.YEAR);
        int añoAc = año - 2000;
//*********Mes*********//
        int mes = cal1.get(Calendar.MONTH);
        int mesActual = mes + 1;

        if (mesActual < 9) {
            mesInt = "/0" + mesActual;
        } else {
            mesInt = "/" + mesActual;
        }
//********Dia**********//
        int dia = cal1.get(Calendar.DAY_OF_YEAR);
        String diaInt = "";
        if (dia < 10) {
            diaInt = "/0" + dia;
        } else {
            diaInt = "/" + dia;
        }

        lblFecha.setText("" + añoAc + mesInt + diaInt);

    }

    private void llenaCbo() {
        try {
            rs = pDao.cargaMarcas();
            cboMarca.removeAllItems();
            while (rs.next()) {

                cboMarca.addItem(rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private String obtenerCodigo() {
        try {
            rs = pDao.cargaMarca();
            while (rs.next()) {
                if (cboMarca.getSelectedItem().equals(rs.getString(2))) {
                    codMarca = rs.getString(1);
                }
            }
        } catch (Exception e) {
        }
        return codMarca;
    }

    private void limpiaControles() {
        txtCantidad.setText("");
        txtImporte.setText("");
        txtPrecio.setText("");
    }
}

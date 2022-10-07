
package Jpanel;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Base_de_Datos.conexion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Listar extends javax.swing.JPanel {

    /**
     * Creates new form Listar
     */
    
    //INSTANCIAS Y VARIABLES
    conexion objcon = new conexion();
    String sql;
    String tipoVehiculo = "", estado = "", fecha = "";
    DefaultTableModel modelo;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String placa;
    
    public Listar() {
        initComponents();
        
        objcon.crearConexion();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTF_Placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        JButton_Buscar = new javax.swing.JButton();
        jButton_Cierre = new javax.swing.JButton();
        cbAuto = new javax.swing.JCheckBox();
        cbMoto = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        dcFechaBusqueda = new com.toedter.calendar.JDateChooser();
        jButton_reiniciar = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Buscar Vehiculos");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Placa");

        tblVehiculos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Propietario", "Tipo de Vehiculo", "Hora Entrada", "Hora Salida", "Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Tipo Vehiculo");

        JButton_Buscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JButton_Buscar.setForeground(new java.awt.Color(0, 102, 255));
        JButton_Buscar.setText("Buscar");
        JButton_Buscar.setBorder(null);
        JButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_BuscarActionPerformed(evt);
            }
        });

        jButton_Cierre.setBackground(new java.awt.Color(255, 255, 51));
        jButton_Cierre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton_Cierre.setText("Cierre");
        jButton_Cierre.setBorder(null);
        jButton_Cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CierreActionPerformed(evt);
            }
        });

        cbAuto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbAuto.setForeground(new java.awt.Color(0, 0, 51));
        cbAuto.setText("Automovil");

        cbMoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbMoto.setForeground(new java.awt.Color(0, 0, 51));
        cbMoto.setText("Motocicleta");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shop-around-for-your-perfect-used-car.png"))); // NOI18N

        jButton_reiniciar.setBackground(new java.awt.Color(255, 255, 51));
        jButton_reiniciar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton_reiniciar.setForeground(new java.awt.Color(0, 0, 51));
        jButton_reiniciar.setText("Reiniciar Tabla");
        jButton_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jButton_Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jButton_reiniciar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(jLabel5)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                .addComponent(JTF_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbAuto)
                                                .addGap(71, 71, 71)
                                                .addComponent(cbMoto)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(160, 160, 160)))
                                .addComponent(jLabel3)))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addComponent(JTF_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAuto)
                            .addComponent(cbMoto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    //METODO PARA CREAR LA TABLA
    public void crearTabla(){
        
        TableColumnModel columnModel = tblVehiculos.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(100);
        
        modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);
        
    } //Fin Crear Tabla
    
    //METODO PARA RELLENAR LA TABLA
    public void rellenarTabla(){
        try{
            
            modelo = (DefaultTableModel) tblVehiculos.getModel();
            modelo.setRowCount(0);
            
            sql = "SELECT * FROM vehiculos WHERE horasalida_vehiculo IS NULL";
            objcon.ejecutarSQLSelect(sql);

            conexion.resultado.first();

            do {
                String horasalida = conexion.resultado.getString(6);
                String pago = conexion.resultado.getString(7);
                
                if (horasalida == null) {
                    
                    horasalida = "No ha salido";
                    pago = "0";
                    
                } else {
                    
                    horasalida = conexion.resultado.getString(6).substring(10).substring(0,6);
                    pago = conexion.resultado.getString(7);
                    
                }
                
                String[] fila = {conexion.resultado.getString(2),
                                 conexion.resultado.getString(3),
                                 conexion.resultado.getString(4), 
                                 conexion.resultado.getString(5).substring(10).substring(0, 6), horasalida, "$" + pago};
                modelo.addRow(fila);
                
            } while (conexion.resultado.next());
            
        } catch (SQLException ex) {
             Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin rellenar Tabla
    
    //METODO PARA BUSCAR VEHICULO
    public void buscarVehiculo(){
        
        try {
            
            sql = "SELECT * FROM vehiculos WHERE tipo_vehiculo LIKE'%" + tipoVehiculo + "%' AND placa_vehiculo LIKE '" + placa + "%' AND horaentrada_vehiculo LIKE '%" + fecha + "%'";
            objcon.ejecutarSQLSelect(sql);

            conexion.resultado.first();

            do {
                String horasalida = conexion.resultado.getString("horasalida_vehiculo");
                String pago;
                pago = conexion.resultado.getString("valorpagado");
                
                if (horasalida == null) {
                    
                    horasalida = "No ha salido";
                    pago = "0";
                    
                } else {
                    
                    horasalida = conexion.resultado.getString("horasalida_vehiculo").substring(10).substring(0,6);
                    pago = conexion.resultado.getString("valorpagado");
                    
                }
                
                String[] fila = {conexion.resultado.getString(2),conexion.resultado.getString(3),
                    conexion.resultado.getString(4),conexion.resultado.getString(5).substring(10).substring(0, 6),
                    horasalida, "$" + pago};
                
                modelo.addRow(fila);
                
            } while (conexion.resultado.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin Buscar Vehiculo
    
    private void JButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_BuscarActionPerformed
      
         // TODO add your handling code here:
            
            if(cbAuto.isSelected()){
                
                if(cbMoto.isSelected()){
                    
                    tipoVehiculo = "";
                    
                }else{
                    
                    tipoVehiculo = "Automovil";
                }    
            }else if (cbMoto.isSelected()){
                
                tipoVehiculo = "Moto";
                
            }
            
            if (dcFechaBusqueda.getDate() != null) {
                
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dcFechaBusqueda.getDate();
            fecha = dateFormat.format(date);
                System.out.println(fecha);
            }
            
            placa = JTF_Placa.getText();
            
            crearTabla();
            
            buscarVehiculo();

    }//GEN-LAST:event_JButton_BuscarActionPerformed

    private void jButton_CierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CierreActionPerformed
        
        try {
            // TODO add your handling code here:

            fecha = dateFormat.format(date);
            sql = "SELECT SUM(valorpagado)AS total FROM vehiculos WHERE estado_vehiculo = 'No Disponible' AND horasalida_vehiculo LIKE '%" + fecha + "%'";
            
            objcon.ejecutarSQLSelect(sql);

            conexion.resultado.first();
            
            DecimalFormat df = new DecimalFormat("#.00");

            Double IngresosTotales = Double.parseDouble(conexion.resultado.getString("total"));

            JOptionPane.showMessageDialog(null, "El ingreso total del dia seleccionado es de : $ " 
                                                 + df.format(IngresosTotales) + " Pesos");
          
        }catch (SQLException | NoClassDefFoundError | NullPointerException ex){
           
           JOptionPane.showMessageDialog(null,"No se realizaron salidas el dia de hoy.");
                
           Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            
        }


    }//GEN-LAST:event_jButton_CierreActionPerformed

    private void jButton_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reiniciarActionPerformed
        // TODO add your handling code here:
        
        rellenarTabla();
        
        JTF_Placa.setText("");
        
    }//GEN-LAST:event_jButton_reiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Buscar;
    private javax.swing.JTextField JTF_Placa;
    private javax.swing.JCheckBox cbAuto;
    private javax.swing.JCheckBox cbMoto;
    private com.toedter.calendar.JDateChooser dcFechaBusqueda;
    private javax.swing.JButton jButton_Cierre;
    private javax.swing.JButton jButton_reiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}

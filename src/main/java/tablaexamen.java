
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TEFYTA
 */
public class tablaexamen extends javax.swing.JFrame {
     DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form tablaexamen
     */
    public tablaexamen() {
        initComponents();
         this.getContentPane().setBackground(Color.GREEN);   
    }
    
    ArrayList<Agregar>F1 = new ArrayList<Agregar>();
    ArrayList<Agregar>F2 = new ArrayList<Agregar>();
    ArrayList<Agregar>F3 = new ArrayList<Agregar>();
    ArrayList<Compra>Com = new ArrayList<Compra>();
    
    int fila;

    
       public void agregar(){
    Agregar producto = new Agregar();
    producto.setNombre(txtnombr.getText());
    producto.setDescripcion(txtdescripcion.getText());
    producto.setPrecio(txtprecio.getText());
    producto.setExistencia(txtexistencia.getText());
    producto.setFranquisia(combofranquisia.getSelectedItem().toString());
    String fran =  combofranquisia.getSelectedItem().toString();
    if(fran.equals("MARVEL")){
        F1.add(producto);
        JOptionPane.showMessageDialog(this, " Producto Agregado a la Franquicia MARVEL");
        tablaFranquisias();
    }else if (fran.equals("DC")){
        F2.add(producto);
        JOptionPane.showMessageDialog(this, " Producto Agregado a la Franquicia DC");
        tablaFranquisias();
            }else if (fran.equals("CAPCOM")){
            
        F3.add(producto);
        JOptionPane.showMessageDialog(this, " Producto Agregado a la Franquicia CAPCOM");
        tablaFranquisias();
            }else{
            JOptionPane.showMessageDialog(this, "Error al Agregar");
                }
    }
      public void tablaFranquisias(){
      String franquisia = combofranquisia.getSelectedItem().toString();
      
      if(franquisia.equals("MARVEL")){
          String matriz [][]= new String[F1.size()][6];
          
          for(int i=0; i<F1.size(); i++){
           matriz[i][0] = Integer.toString(i+1);
           matriz[i][1] = F1.get(i).getNombre();
           matriz[i][2] = F1.get(i).getDescripcion();
           matriz[i][3] = F1.get(i).getPrecio();
           matriz[i][4] = F1.get(i).getExistencia();
           matriz[i][5] = F1.get(i).getFranquisia();
          }
          
          tablad.setModel(new javax.swing.table.DefaultTableModel(
    matriz,
    new String [] {
        "No.", "Nombre", "Descripcion", "Precio", "Existencia", "Franquisia"
    }
));
      
      }else if(franquisia.equals("DC")){
             String matriz [][]= new String[F1.size()][6];
          for(int i=0; i<F2.size(); i++){
           matriz[i][0] = Integer.toString(i+1);
           matriz[i][1] = F2.get(i).getNombre();
           matriz[i][2] = F2.get(i).getDescripcion();
           matriz[i][3] = F2.get(i).getPrecio();
           matriz[i][4] = F2.get(i).getExistencia();
           matriz[i][5] = F2.get(i).getFranquisia();
          }
          
          tablad.setModel(new javax.swing.table.DefaultTableModel(
    matriz,
    new String [] {
        "No.", "Nombre", "Descripcion", "Precio", "Existencia", "Franquisia"
    }
));
      
      }else if (franquisia.equals("CAPCOM")){
      String matriz [][]= new String[F3.size()][6];
          for(int i=0; i<F3.size(); i++){
           matriz[i][0] = Integer.toString(i+1);
           matriz[i][1] = F3.get(i).getNombre();
           matriz[i][2] = F3.get(i).getDescripcion();
           matriz[i][3] = F3.get(i).getPrecio();
           matriz[i][4] = F3.get(i).getExistencia();
           matriz[i][5] = F3.get(i).getFranquisia();
          }
          
          tablad.setModel(new javax.swing.table.DefaultTableModel(
    matriz,
    new String [] {
        "No.", "Nombre", "Descripcion", "Precio", "Existencia", "Franquisia"
    }
));
      }else{
      JOptionPane.showMessageDialog(this, "Error al mostrar la tabla");
      }
      
      }
      
public void editar(){
   String franquisia =combofranquisia.getSelectedItem().toString();
   
   if(franquisia.equals("MARVEL")){
       F1.get(fila).setNombre(txtnombr.getText());
       F1.get(fila).setDescripcion(txtdescripcion.getText());
       F1.get(fila).setPrecio(txtprecio.getText());
       F1.get(fila).setExistencia(txtexistencia.getText());
       tablaFranquisias();
       
   }else if(franquisia.equals("DC")){
       F2.get(fila).setNombre(txtnombr.getText());
       F2.get(fila).setDescripcion(txtdescripcion.getText());
       F2.get(fila).setPrecio(txtprecio.getText());
       F2.get(fila).setExistencia(txtexistencia.getText());
       tablaFranquisias();
       
}else if(franquisia.equals("CAPCOM")){
       F3.get(fila).setNombre(txtnombr.getText());
       F3.get(fila).setDescripcion(txtdescripcion.getText());
       F3.get(fila).setPrecio(txtprecio.getText());
       F3.get(fila).setExistencia(txtexistencia.getText());
       tablaFranquisias();
       
}else{
        JOptionPane.showMessageDialog(this, "No se puedo modificar el producto seleccionado!!!");
}
}

public void limpiar(){
txtnombr.setText("");
txtdescripcion.setText("");
txtprecio.setText("");
txtexistencia.setText("");
}

public void productos(){
String franquisia = ComboSeleccion.getSelectedItem().toString();

if(franquisia.equals("MARVEL")){
ComboExistencias.setModel(new javax.swing.DefaultComboBoxModel( new String[] {}));
String matriz [] = new String[F1.size()];

for(int i = 0; i<F1.size(); i++){
matriz[i] = F1.get(i).getNombre();
ComboExistencias.addItem(matriz[i]);
}
}else if(franquisia.equals("DC")){
ComboExistencias.setModel(new javax.swing.DefaultComboBoxModel( new String[] {}));
String matriz [] = new String[F2.size()];

for(int i = 0; i<F2.size(); i++){
matriz[i] = F2.get(i).getNombre();
ComboExistencias.addItem(matriz[i]);
}
}else if(franquisia.equals("COPCAM")){
ComboExistencias.setModel(new javax.swing.DefaultComboBoxModel( new String[] {}));
String matriz [] = new String[F3.size()];

for(int i = 0; i<F3.size(); i++){
matriz[i] = F3.get(i).getNombre();
ComboExistencias.addItem(matriz[i]);
}
}
}
   
public void DatosProducto(){
int seleccionado = ComboExistencias.getSelectedIndex();
String franquisia = ComboSeleccion.getSelectedItem().toString();

if(franquisia.equals("MARVEL")){
txtdesc.setText(F1.get(seleccionado).getDescripcion());
txtexiste.setText(F1.get(seleccionado).getExistencia());
txtpreci.setText(F1.get(seleccionado).getPrecio());
}else if(franquisia.equals("DC")){
txtdesc.setText(F2.get(seleccionado).getDescripcion());
txtexiste.setText(F2.get(seleccionado).getExistencia());
txtpreci.setText(F2.get(seleccionado).getPrecio());
}else if(franquisia.equals("CAPCOM")){
txtdesc.setText(F3.get(seleccionado).getDescripcion());
txtexiste.setText(F3.get(seleccionado).getExistencia());
txtpreci.setText(F3.get(seleccionado).getPrecio());
}else{
  
}
}

public void compras(){
    
    Compra ventas = new Compra();
int cantidad = Integer.parseInt(txtCantidad.getText());
int existencia = Integer.parseInt(txtexiste.getText());

if(txtCantidad.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Los campos Deven Estar completos");
}else if(cantidad>existencia){
JOptionPane.showMessageDialog(this, "No contamos con  esa cantidad de producto!!!!");
}else if(cantidad<=0){
JOptionPane.showMessageDialog(this,"No se haceptan valores negativos");
}else{
String franquisia = ComboSeleccion.getSelectedItem().toString();
int cantida = Integer.parseInt(txtCantidad.getText());
int producto = ComboExistencias.getSelectedIndex();
int precio = Integer.parseInt( txtpreci.getText());
int total= cantida*precio;
ventas.setNombre(ComboExistencias.getSelectedItem().toString());
ventas.setPrecio(txtpreci.getText());
ventas.setTotal(Integer.toString(total));
ventas.setFranquisia(ComboSeleccion.getSelectedItem().toString());
Com.add(ventas);


switch(franquisia){
        case "MARVEL":
            int existeciaActual = Integer.parseInt(F1.get(producto).getExistencia());
            int ExistenciaFinal =0;
            ExistenciaFinal =  existeciaActual-cantidad;
            F1.get(producto).setExistencia(Integer.toString(ExistenciaFinal));
            break;
            case "DC":
            int existeciaActual2 = Integer.parseInt(F2.get(producto).getExistencia());
            int ExistenciaFinal2 =0;
            ExistenciaFinal2 =  existeciaActual2-cantidad;
            F2.get(producto).setExistencia(Integer.toString(ExistenciaFinal2));
            break;
             case "CAPCOM":
            int existeciaActual3 = Integer.parseInt(F3.get(producto).getExistencia());
            int ExistenciaFinal3 =0;
            ExistenciaFinal3 =  existeciaActual3-cantidad;
            F3.get(producto).setExistencia(Integer.toString(ExistenciaFinal3));
            break;
        default:
            JOptionPane.showMessageDialog(this, "Error al modificar existencias");
            break;
            
    }
    
    String  matriz [][] = new String [Com.size()][5];
    
    for(int i = 0; i< Com.size(); i++){
    matriz[i][0] = Integer.toString(i+1);
    matriz[i][1]= Com.get(i).getNombre();
    matriz[i][2] = Com.get(i).getPrecio();
    matriz[i][3] = Com.get(i).getFranquisia();
    matriz[i][4] = Com.get(i).getTotal();
    }
    
    jTable3.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
    new String [] {
        "No.", "Nombre", "Precio por Unidad", "Franqusias", "Total"
    }
));


}

}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtnombre = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtFranquisia = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        txtdescrip = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablla = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtfigura = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnselec = new javax.swing.JComboBox<>();
        txtp = new javax.swing.JTextField();
        txtpagar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtnom = new javax.swing.JLabel();
        txtprec = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        txtfigura1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnombr = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtexistencia = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablad = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        combofranquisia = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        ComboExistencias = new javax.swing.JComboBox<>();
        ComboSeleccion = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtpreci = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtdesc = new javax.swing.JLabel();
        txtexiste = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btncomprar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel2);

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

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
        jScrollPane5.setViewportView(jTable1);

        jScrollPane2.setViewportView(txtnombre);

        jTextField1.setText("Marvel");

        jTextField2.setText("DC");

        jTextField3.setText("Capcom");

        txtFranquisia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFranquisia.setText("Franquisia ");

        txtdescrip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdescrip.setText("Descripcion");

        tablla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tablla);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de la Compra"));

        jButton4.setText("Quitar Compra");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 255, 51));

        txtfigura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtfigura.setText("Cual Figura de Accion desea Comprar");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Realizar Compra");

        btnselec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnselec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Marvel", "DC", "Capcom" }));
        btnselec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtnom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnom.setText("Nombre");

        txtprec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprec.setText("Precio");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Total de Pagar");

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Total");

        txtfigura1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtfigura1.setText("Pagar");

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
        jScrollPane10.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(27, 27, 27)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel14)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(txtfigura1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(396, 396, 396)
                                .addComponent(jLabel21)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(321, 321, 321))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtprec)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(782, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(60, 60, 60))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtfigura)
                        .addGap(34, 34, 34)
                        .addComponent(btnselec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtnom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(623, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(153, 153, 153)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel15)
                .addGap(78, 78, 78)
                .addComponent(jLabel14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtfigura)
                                .addComponent(btnselec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnom))
                            .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel16))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(txtfigura1)))
                        .addGap(69, 69, 69)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtprec)
                        .addContainerGap())))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(646, Short.MAX_VALUE)))
        );

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel22.setText("Descripcion");

        jLabel18.setText("Precio");

        jLabel19.setText("Nombre");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Marvel", "DC", "CAPCOM" }));

        jLabel23.setText("Total de Pagar");

        jLabel13.setText("Comprar");

        jLabel3.setText("Ventas ");

        jLabel24.setText("jLabel24");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(204, 255, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Franquisia ");

        jScrollPane1.setViewportView(txtnombr);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Descripcion");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane3.setViewportView(txtdescripcion);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Existencia");

        jScrollPane4.setViewportView(txtexistencia);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Precio ");

        tablad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Descripcion", "Precio", "Existencia", "Franquisia"
            }
        ));
        tablad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablad);

        btnagregar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btneditar.setText("Editar");
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditarMouseClicked(evt);
            }
        });
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        combofranquisia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARVEL", "DC", "CAPCOM" }));
        combofranquisia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combofranquisiaItemStateChanged(evt);
            }
        });
        combofranquisia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combofranquisiaMouseClicked(evt);
            }
        });
        combofranquisia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combofranquisiaActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(combofranquisia, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)))
                                        .addGap(47, 47, 47))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnagregar)
                                .addGap(83, 83, 83)
                                .addComponent(btneditar)
                                .addGap(69, 69, 69)
                                .addComponent(btnlimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(148, 148, 148)))
                .addGap(156, 156, 156))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(combofranquisia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btneditar)
                            .addComponent(btnlimpiar)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(441, 441, 441)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Administracion", jPanel6);

        ComboExistencias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboExistenciasItemStateChanged(evt);
            }
        });
        ComboExistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboExistenciasMouseClicked(evt);
            }
        });

        ComboSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARVEL", "DC", "CAPCOM" }));
        ComboSeleccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboSeleccionItemStateChanged(evt);
            }
        });
        ComboSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboSeleccionMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Franquisias");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Productos");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Descripcion");

        txtpreci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Existencia");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Precio");

        txtdesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtexiste.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Precio por Unidad", "Franqusias", "Total"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        btncomprar.setText("Comprar");
        btncomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel31))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(btncomprar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addComponent(txtdesc, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addGap(10, 10, 10)
                                .addComponent(txtexiste, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(txtpreci, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(74, 74, 74)
                                .addComponent(ComboSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel26)
                                .addGap(30, 30, 30)
                                .addComponent(ComboExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(ComboExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexiste, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtpreci, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel31))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncomprar))))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Ventas", jPanel10);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
            agregar();
            limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
editar();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btneditarActionPerformed
      
    private void btnselecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecActionPerformed
      
    }//GEN-LAST:event_btnselecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combofranquisiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combofranquisiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combofranquisiaActionPerformed

    private void combofranquisiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combofranquisiaItemStateChanged
        tablaFranquisias();
    }//GEN-LAST:event_combofranquisiaItemStateChanged

    private void combofranquisiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combofranquisiaMouseClicked
        tablaFranquisias();
    }//GEN-LAST:event_combofranquisiaMouseClicked

    private void tabladMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladMouseClicked
    fila = tablad.rowAtPoint(evt.getPoint());
    txtnombr.setText(tablad.getValueAt(fila, 1).toString());
    txtdescripcion.setText(tablad.getValueAt(fila, 2).toString());
    txtprecio.setText(tablad.getValueAt(fila, 3).toString());
    txtexistencia.setText(tablad.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_tabladMouseClicked

    private void btneditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseClicked
        editar();
    }//GEN-LAST:event_btneditarMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
        tablaFranquisias();
        
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void ComboSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboSeleccionMouseClicked
      productos();
    }//GEN-LAST:event_ComboSeleccionMouseClicked

    private void ComboSeleccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboSeleccionItemStateChanged
      productos();
    }//GEN-LAST:event_ComboSeleccionItemStateChanged

    private void ComboExistenciasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboExistenciasItemStateChanged
     DatosProducto();
    }//GEN-LAST:event_ComboExistenciasItemStateChanged

    private void ComboExistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboExistenciasMouseClicked
     DatosProducto();
    }//GEN-LAST:event_ComboExistenciasMouseClicked

    private void btncomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprarActionPerformed
        compras();
    }//GEN-LAST:event_btncomprarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

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
            java.util.logging.Logger.getLogger(tablaexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaexamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaexamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboExistencias;
    private javax.swing.JComboBox<String> ComboSeleccion;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncomprar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox<String> btnselec;
    private javax.swing.JComboBox<String> combofranquisia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tablad;
    private javax.swing.JTable tablla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtFranquisia;
    private javax.swing.JLabel txtdesc;
    private javax.swing.JLabel txtdescrip;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JLabel txtexiste;
    private javax.swing.JTextPane txtexistencia;
    private javax.swing.JLabel txtfigura;
    private javax.swing.JLabel txtfigura1;
    private javax.swing.JTextField txtn;
    private javax.swing.JLabel txtnom;
    private javax.swing.JTextPane txtnombr;
    private javax.swing.JTextPane txtnombre;
    private javax.swing.JTextField txtp;
    private javax.swing.JTextField txtpagar;
    private javax.swing.JLabel txtprec;
    private javax.swing.JLabel txtpreci;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

   
}




import java.util.Arrays;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {


  public Principal() {
    initComponents();
    
    //Se bloquean los campos de salida para que no pongan datos
    TXTREGALO.setEditable(false);
    TXTINTERES.setEditable(false);
    TXTCOSTOTOTAL.setEditable(false);
    TXTTIPOCUCENTA.setEditable(false);
    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    TXTNOMBRE = new javax.swing.JTextField();
    TXTDIRECCION = new javax.swing.JTextField();
    TXTEDAD = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    CMBTARJETA = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    LBLSALUDAR = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    TXTTIPOCUCENTA = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    TXTVALOR = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    TXTREGALO = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    TXTCOSTOTOTAL = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    TXTINTERES = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    BTNCOTIZAR = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("NOMBRE:");

    jLabel2.setText("DIRECCION:");

    TXTNOMBRE.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TXTNOMBREActionPerformed(evt);
      }
    });

    jLabel3.setText("EDAD:");

    CMBTARJETA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "NOMINA", "PENSION" }));

    jLabel4.setText("TARJETA:");

    LBLSALUDAR.setText("HOLA");

    jLabel6.setText("TIPO CUENTA:");

    jLabel7.setText("VALOR COMPRA:");

    jLabel8.setText("REGALO:");

    jLabel9.setText("COSTO TOTAL DE LA COCMPRA:");

    jLabel10.setText("INTERES:");

    BTNCOTIZAR.setText("COTIZAR");
    BTNCOTIZAR.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTNCOTIZARActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2)
                  .addComponent(jLabel3)
                  .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(CMBTARJETA, 0, 194, Short.MAX_VALUE)
                  .addComponent(TXTEDAD)
                  .addComponent(TXTDIRECCION))
                .addGap(258, 258, 258)
                .addComponent(BTNCOTIZAR))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(18, 18, 18)
                  .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(48, 48, 48)
                  .addComponent(jLabel7)
                  .addGap(18, 18, 18)
                  .addComponent(TXTVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                      .addComponent(jLabel8)
                      .addGap(18, 18, 18)
                      .addComponent(TXTREGALO, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabel10))
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                      .addComponent(LBLSALUDAR)
                      .addGap(261, 261, 261)
                      .addComponent(jLabel6)))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTTIPOCUCENTA)
                    .addComponent(TXTCOSTOTOTAL)
                    .addComponent(TXTINTERES, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 118, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1)
          .addComponent(jLabel7)
          .addComponent(TXTVALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(TXTDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(TXTEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(CMBTARJETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(BTNCOTIZAR))
        .addGap(18, 18, 18)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(LBLSALUDAR)
          .addComponent(jLabel6)
          .addComponent(TXTTIPOCUCENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(TXTREGALO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel10)
          .addComponent(TXTINTERES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel9)
          .addComponent(TXTCOSTOTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(17, 17, 17)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void TXTNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNOMBREActionPerformed

  }//GEN-LAST:event_TXTNOMBREActionPerformed

  private void BTNCOTIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCOTIZARActionPerformed
    
    //Se arrastran los datos de los campos y se ponen en las variables que usaremos. 
   
    String nombre = TXTNOMBRE.getText();
    String tarjeta = CMBTARJETA.getSelectedItem().toString();
    
    
    // Envia datos a label de saludo con el nombre en mayuscualas
    LBLSALUDAR.setText("HOLA "+ nombre.toUpperCase());
    
    //Se arrastra el valor como String para enviarlo a metodo isNumber 
    String v = TXTVALOR.getText();
    String e = TXTEDAD.getText();
    //Se revisa con metodo isNumber si la informacion del campo de valor es numerica
    boolean flagV = isNumberdouble(v);
    boolean flagE = isNumberint(e);
    
    //Se ponen condiciones para funcionar el programa
    if(flagV && flagE){
      
      double valor = Double.parseDouble(TXTVALOR.getText());
       int edad = Integer.parseInt(TXTEDAD.getText());
       //Si se cumplen las condiciones se inicia el factory
       if(valor > 0 && edad > 0 ){
         
        //Se llama a la fabrica para que nos cree una cuenta segun los parametros
        Cuenta c = Factory.crearCuenta(edad, tarjeta, valor);
        //Se llama metodo cotizar con el valor guardado
        double total = c.cotizar(valor);
        double interes = c.getInteres();
        //Se guardan los resultados en los campos destinados.
        TXTINTERES.setText(interes +"%");
        TXTREGALO.setText(c.getRegalo());
        TXTCOSTOTOTAL.setText(total+"");
        String[] cuenta = c.getClass().toString().split(" ");
        TXTTIPOCUCENTA.setText(cuenta[1].toString());
       
       }else{
        JOptionPane.showMessageDialog(null, "No va a tronar, inserte un valor o edad superior a 0");
       }
    }else{
      JOptionPane.showMessageDialog(null, "No va a tronar, inserte un valor superior a 0");    
  }                                          
 
  }//GEN-LAST:event_BTNCOTIZARActionPerformed

  //Metodo para revisar si es numerico
  public boolean isNumberdouble(String s){
  
    //Se abre un trycatch para revisar si hay un error
    try {
      //Se convierte lo que hay en el campo valor y edad a numerico
      double v = Double.parseDouble(s);
      
    } catch (NumberFormatException n) {
      //Si no es numerico regresa un falso
      return false;
    }
    //Si es numerico regresa un true.
    return true;
  }
   public boolean isNumberint(String s){
  
    //Se abre un trycatch para revisar si hay un error
    try {
      //Se convierte lo que hay en el campo valor y edad a numerico
      int v = Integer.parseInt(s);
      
    } catch (NumberFormatException n) {
      //Si no es numerico regresa un falso
      return false;
    }
    //Si es numerico regresa un true.
    return true;
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BTNCOTIZAR;
  private javax.swing.JComboBox<String> CMBTARJETA;
  private javax.swing.JLabel LBLSALUDAR;
  private javax.swing.JTextField TXTCOSTOTOTAL;
  private javax.swing.JTextField TXTDIRECCION;
  private javax.swing.JTextField TXTEDAD;
  private javax.swing.JTextField TXTINTERES;
  private javax.swing.JTextField TXTNOMBRE;
  private javax.swing.JTextField TXTREGALO;
  private javax.swing.JTextField TXTTIPOCUCENTA;
  private javax.swing.JTextField TXTVALOR;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  // End of variables declaration//GEN-END:variables
}

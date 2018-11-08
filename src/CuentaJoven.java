


//Se extiende la cuenta para traer los valores
public class CuentaJoven extends Cuenta{

  // Se declaran e inicializan los valores que pueden cambiar y no se traeran desde la vista.
    private double interes = 0.02;
    private String regalo = "CD Musica";

  public CuentaJoven() {
  }

  //Se hace un superconstructor con toda la informacion. Solo se traen los datos de la clase cuenta.
  //No se van a modificar las variables de las clases hijos.
  public CuentaJoven(int edad, String nombre, String direccion, boolean nomina, boolean pension, double valor) {
    super(edad, nombre, direccion, nomina, pension, valor);
  }    

  //Solo se hace un getter para traer la variable regalo, ya que es una constante.
    @Override
  public String getRegalo() {
    return regalo;
  }

  // Se llama el interes para mostrarlo en la vista.
    @Override
  public double getInteres() {
    return interes * 100;
  }
  

  //Se pasa el valor a traves del parametro y se procesa segun la formula Cuenta Joven.
    @Override
  public double cotizar(double valor) {
    
    //A valor se le suma el interes generado.
    valor += valor * interes;  
    
    //regresa el total.
    return valor;

  }
  
  
  
}

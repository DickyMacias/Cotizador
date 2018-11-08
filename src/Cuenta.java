


// Se hace calse abstracta para extender a las clases fabrica
public abstract class Cuenta {
  
  //Se declaran las variables que son comunes
  private int edad;
  private String nombre;
  private String direccion;
  private boolean nomina;
  private boolean pension;
  public double valor;

  public Cuenta() {
  }

  //Se crea constructor con todos los valores que se usaran para utilizar el metodo
  public Cuenta(int edad, String nombre, String direccion, boolean nomina, boolean pension, double valor) {
    this.edad = edad;
    this.nombre = nombre;
    this.direccion = direccion;
    this.nomina = nomina;
    this.pension = pension;
    this.valor = valor;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public boolean isNomina() {
    return nomina;
  }

  public void setNomina(boolean nomina) {
    this.nomina = nomina;
  }

  public boolean isPension() {
    return pension;
  }

  public void setPension(boolean pension) {
    this.pension = pension;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
  
  public abstract String getRegalo();
  
  public abstract double getInteres();
  
  // Se envia el parametro valor a traves del metodo. Por eso es publico.
  public abstract double cotizar(double valor);
 
  
}

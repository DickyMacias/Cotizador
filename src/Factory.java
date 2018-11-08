
// Se crea una clase factory con los valores que se evaluan en las decisiones.
public class Factory {
  public static Cuenta crearCuenta(int edad, String tarjeta, double valor){
       
      // Se realiza la validacion para saber de que clase hija decendera.
      if (edad >= 18 && edad <= 25 && tarjeta.equals("NINGUNA")){
        //Se crea objeto cuenta con polimorfismo para llamar su catalogo y se regresa
        return new CuentaJoven();
        
      }else if (edad > 25 && edad<65 && tarjeta.equals("NOMINA")){
        return new Cuenta10();  

      }else if (edad >= 65 && tarjeta.equals("PENSION")){
        return new CuentaOro();
        
      }else{
        return new CuentaEstandar();
    }
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dicky
 */
public class Cuenta10 extends Cuenta {


    private double interes = 0.01;
    private String regalo = "Reproductor de CD";

  public Cuenta10() {
  }

  public Cuenta10(int edad, String nombre, String direccion, boolean nomina, boolean pension, double valor) {
    super(edad, nombre, direccion, nomina, pension, valor);
  }    

    @Override
  public String getRegalo() {
    return regalo;
  }

    @Override
  public double getInteres() {
    return interes * 100;
  }

    @Override
  public double cotizar(double valor) {
    
    valor = (valor += valor * interes);  
    
    return valor;

  }
  
}

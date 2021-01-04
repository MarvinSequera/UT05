/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut05;

/**
 *
 * @author marvin
 */
public class CuentaBancaria {
    private String nombre;
    private int numeroCuenta;
    private double interes, saldo;
    
    public CuentaBancaria() {
        nombre = "John Doe";
        numeroCuenta = 1032605316;
        interes = 0.5;
        saldo = 0;
    }
    
    public CuentaBancaria(String nombre, int numeroCuenta, double interes, double saldo) throws Exception {
        this.setNombre(nombre);
        this.setInteres(interes);
        this.setNumeroCuenta(numeroCuenta);
        this.Ingreso(saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Ingreso(double saldo) throws Exception {
        if(saldo <= 0) 
            throw new Exception ("Debe ingresar mas de 0 Euros");
        this.saldo += saldo;
    }
    
    public void Reintegro(double saldo) throws Exception {
        if(this.getSaldo() < saldo) 
            throw new Exception ("Sabes que no tienes ese dinero");
        this.saldo -= saldo;
    }
    
}

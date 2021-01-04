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
public class UT05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CuentaBancaria cliente = new CuentaBancaria("Pedro Navaja", 2087093815, 0.1, 100) ;
        
        System.out.println(cliente.getSaldo());
        cliente.Reintegro(50);
        cliente.Ingreso(100);
        System.out.println(cliente.getSaldo());
    }
    
}

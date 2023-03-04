package com.mycompany.cuentas;

public class Main {
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            operativa_cuenta(cuenta1, false, 2300);
            System.out.println("Retiro en cuenta" );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }         
         
        try {
            operativa_cuenta(cuenta1, true, 695 );
            System.out.println("Ingreso en cuenta");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    /**
     * Método que realiza la operativa de ingresar o retirar cantidad
     * @param cuenta1
     * @param ingresar
     * @param cantidad
     * @throws Exception 
     */
    public static void operativa_cuenta(CCuenta cuenta1, boolean ingresar, float cantidad) throws Exception {
        
        if(ingresar == true)
            cuenta1.ingresar(cantidad);
       else
            cuenta1.retirar(cantidad);
        
    }
}

    

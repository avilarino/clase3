

/* Clase numero 3 - ejercicio 3 */
/* ------ AGUSTIN VILARINO -------------- */

package com.mycompany.numeromes;

import javax.swing.JOptionPane;


public class NumeroMes {

    public static void main(String[] args) {
        
        // ejercicios clase 
        
        double total;
        double capital = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el capital"));
        
        
        if (capital > 10000){
            total = capital + (capital * 10) / 100;
            System.out.println("el total es " + total);
        } else if (capital >= 10.000 && capital < 25.000){
            total = capital + (capital * 7.5) / 100;
            System.out.println("el total es " + total);
        } else if (capital >= 25.000) {
            total = capital + (capital * 5) / 100;
            System.out.println("el total es " + total);
        }
        
        
        
        
        double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "que monto es ?"));
        String factura = JOptionPane.showInputDialog(null, "que factura va a hacer A, B, C");
        
        switch (factura){
            case "A": System.out.println("factura" + factura + "valor iva" + (monto * 10.5) / 100);
                      
            case "B": System.out.println("factura" + factura + "valor iva" + (monto * 10.5) / 100);
            break;
            case "C": System.out.println("factura" + factura + "valor iva" + (monto * 10.5) / 100);
            break;

        }
        
        
        
        String meses = JOptionPane.showInputDialog("Decime el mes por favor !");
                
        if (meses.equals("Enero")){
            System.out.println("EL NUMERO ES 1");
        } else if (meses.equals("Febrero")) {
            System.out.println("NUMERO 2");
        } else if (meses.equals("Marzo")){
            System.out.println("Numero 3");
        } else if (meses.equals("Abril")){
            System.out.println("Numero 4");
        } else if (meses.equals("Mayo")){
            System.out.println("Numero 5");
        } else if (meses.equals("Junio")){
            System.out.println("Numero 6");
        } else if (meses.equals("Julio")){
            System.out.println("Numero 7");
        } else if (meses.equals("Agosto")){
            System.out.println("Numero 8");
        } else if (meses.equals("Septiembre")){
            System.out.println("Numero 9");
        } else if (meses.equals("Octubre")){
            System.out.println("Numero 10");
        } else if (meses.equals("Noviembre")){
            System.out.println("Numero 11");
        } else if (meses.equals("Diciembre")){
            System.out.println("Numero 12");
        } else {
            System.out.println("Mes Mal escrito, utilizar mayuscula al principio");
        }
        
        
        
        
        String mes = JOptionPane.showInputDialog(null, "Que mes elegis?");
        
        switch(mes) {
            case "Enero": System.out.println("NUMERO 1");
                break;
            case "Febrero": System.out.println("NUMERO 2");
                break;
            case "Marzo": System.out.println("NUMERO 3");
                break;
            case "Abril": System.out.println("NUMERO 4");
                break;
            case "Mayo": System.out.println("NUMERO 5");
                break;
            case "Junio": System.out.println("NUMERO 6");
                break;
            case "Julio": System.out.println("NUMERO 7");
                break;
            case "Agosto": System.out.println("NUMERO 8");
                break;
            case "Septiembre": System.out.println("NUMERO 9");
                break;
            case "Octubre": System.out.println("NUMERO 10");
                break;
            case "Noviembre": System.out.println("NUMERO 11");
                break;
            case "Diciembre": System.out.println("NUMERO 12");
                break;
        }
        
        
        
    }
}

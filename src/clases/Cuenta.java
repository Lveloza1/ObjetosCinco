/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Cuenta {

    private long Ncuenta;
    private long Nidentificacion;
    private long Sactual;
    private long Ianual;

    public Cuenta(long Ncuenta, long Nidentificacion, long Sactual, long Ianual) {
        this.Ncuenta = Ncuenta;
        this.Nidentificacion = Nidentificacion;
        this.Sactual = Sactual;
        this.Ianual = Ianual;
    }

    public long getNcuenta() {
        return Ncuenta;
    }

    public long getNidentificacion() {
        return Nidentificacion;
    }

    public long getSactual() {
        return Sactual;
    }

    public long getIanual() {
        return Ianual;
    }

    public void setNcuenta(long Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public void setNidentificacion(long Nidentificacion) {
        this.Nidentificacion = Nidentificacion;
    }

    public void setSactual(long Sactual) {
        this.Sactual = Sactual;
    }

    public void setIanual(long Ianual) {
        this.Ianual = Ianual;
    }

    public long ActualizarSaldo() {
        long res;
        res = this.Sactual + (this.Ianual / 365);
        this.Sactual=res;
        return this.Sactual;
    }

    public long Ingresar() {
        long aux;
        long ns;
        boolean au=true;
        int res1, sw;

        do {
            sw = 1;

            try {
                aux = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el total a ingresar"));
                
                    ns = aux + this.Sactual;
                    this.Sactual = ns;

            } catch (NumberFormatException e) {
                res1 = JOptionPane.showConfirmDialog(null, "¿Desea Abandonar?", "Salir", JOptionPane.YES_NO_OPTION);
                if (res1 == 0) {
                    au=false;
                    sw = 1;
                } else {
                    sw = 0;
                }
            }

        } while (sw == 0);
        
        return this.Sactual;
    }
    public long Retirar(){
        long aux;
        long ns;
        int res;
        if (this.Sactual == 0) {
            JOptionPane.showMessageDialog(null, "Usted no tiene saldo");
        }
        aux = Long.parseLong(JOptionPane.showInputDialog( "Digite el total a retirar"));
        while (aux > this.Sactual) {
            aux = Long.parseLong(JOptionPane.showInputDialog( "Debe tener una cantidad validad para retirar, ingrese su saldo nuevamente"));
        }
        res = JOptionPane.showConfirmDialog(null, "¿Seguro que desea retirar esta cantidad?: " + aux, "Pregunta", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            ns = this.Sactual- aux;
            this.Sactual= (ns);
            

        }
        return this.Sactual;
    }

}

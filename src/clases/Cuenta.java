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
        return res;
    }

    public long Ingresar() {
        long aux;
        long ns;
        int res;
        aux = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el total a ingresar"));
        res = JOptionPane.showConfirmDialog(null, "¿Seguro que desea ingresar esta cantidad?: " + aux, "Pregunta", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            ns = aux + this.Sactual;
            this.Sactual = ns;

        } else {
            this.Sactual = this.Sactual;
        }
        return this.Sactual;
    }

}

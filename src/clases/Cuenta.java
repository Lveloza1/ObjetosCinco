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
    private double Sactual;

    public Cuenta(long Ncuenta, long Nidentificacion, double Sactual) {
        this.Ncuenta = Ncuenta;
        this.Nidentificacion = Nidentificacion;
        this.Sactual = Sactual;
    }

    public Cuenta(long Nuenta, long Nidentificacion) {
        this.Ncuenta = Ncuenta;
        this.Nidentificacion = Nidentificacion;
        this.Sactual = 0;
    }

    public long getNcuenta() {
        return Ncuenta;
    }

    public long getNidentificacion() {
        return Nidentificacion;
    }

    public double getSactual() {
        return Sactual;
    }

    public void setNcuenta(long Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public void setNidentificacion(long Nidentificacion) {
        this.Nidentificacion = Nidentificacion;
    }

    public void setSactual(double Sactual) {
        this.Sactual = Sactual;
    }
    //No modifiques antes de aquí  c:

    public void ActualizarSaldo(double Ianual) {
        double aux, aux2;

        aux = this.getSactual() * (Ianual / 365);
        aux2 = this.getSactual() + aux;
        this.setSactual(aux2);

    }

    public void Ingresar(double ingreso) {
        double aux;
        double ns;

        aux = this.getSactual() + ingreso;
        this.setSactual(aux);

    }

    public void Retirar(double egreso) {
        double aux;

        if (this.Sactual == 0) {
            JOptionPane.showMessageDialog(null, "No hay saldo en la cuenta");
        } else {
            aux = this.getSactual() - egreso;
            this.setSactual(aux);
        }

    }

    public String mostrar() {
        String aux;
        aux = "Numero de la cuenta: " + this.getNcuenta() + "\n"
                + "Numero de indentificación :" + this.getNidentificacion() + "\n"
                + "Saldo actual: " + this.getSactual();
        return aux;
    }

}

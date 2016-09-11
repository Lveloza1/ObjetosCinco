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

    private long identificacion;
    private int saldoactual;
    private int interesanual;
    private int ingreso;

    public Cuenta(long identificacion, int saldoactual, int interesanual, int ingreso) {
        this.identificacion = identificacion;
        this.saldoactual = saldoactual;
        this.interesanual = interesanual;
        this.ingreso = ingreso;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public double getInteresanual() {
        return interesanual;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    public void setInteresanual(int interesanual) {
        this.interesanual = interesanual;
    }

    public Cuenta actualizar() {
        Cuenta as;
        int saldo, retiro, retiro1=0, ia;
        long id;

        saldo = (this.interesanual / 365) + this.saldoactual;
        ia=this.interesanual;
        retiro = this.ingreso;
        if (saldo < retiro) {
            JOptionPane.showMessageDialog(null, "No tiene suficiente saldo para este retiro", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            retiro1 = saldo - retiro;
        }
        id = this.identificacion;

        as = new Cuenta(id, saldo,ia, retiro1);
        return as;
     
    }

}

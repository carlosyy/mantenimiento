/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Usuario
 */
public class Trabajo extends Contacto {

    public String nombreEmpresa = "";
    public int telOficina = 0;
    public String cargo = "";

    public Trabajo() {
        super();
    }

    public Trabajo(String nombre1, String nombre2, String apellido1, String apellido2, String celular, String email, String direccion, int fijo, String fechaNacimiento, String ciudad, String documento, String estado, String profesion, String genero, String nombreEmpresa, int telOficina, String cargo) {
        super(nombre1, nombre2, apellido1, apellido2, celular, email, direccion, fijo, fechaNacimiento, ciudad, documento, estado, profesion, genero);
        this.nombreEmpresa = nombreEmpresa;
        this.telOficina = telOficina;
        this.cargo = cargo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTelOficina() {
        return telOficina;
    }

    public void setTelOficina(int telOficina) {
        this.telOficina = telOficina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

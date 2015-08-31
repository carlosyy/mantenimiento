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
public class Familia extends Contacto {

    private String parentesco = "";
    private String apodo = "";

    public Familia() {
        super();
    }

    public Familia(String nombre1, String nombre2, String apellido1, String apellido2, String celular, String email, String direccion, int fijo, String fechaNacimiento, String ciudad, String documento, String estado, String profesion, String genero, String parentesco, String apodo) {
        super(nombre1, nombre2, apellido1, apellido2, celular, email, direccion, fijo, fechaNacimiento, ciudad, documento, estado, profesion, genero);
        this.parentesco = parentesco;
        this.apodo = apodo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
}

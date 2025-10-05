package model;

import java.io.Serializable;

/**
 * Clase Cliente que representa a un cliente del sistema.
 * Implementa Serializable para permitir la persistencia del objeto.
 */
public class Cliente implements Serializable {

    // Identificador único de versión para la serialización
    private static final long serialVersionUID = 123L;

    // Atributos privados del cliente
    private int id;
    private String nombre;
    private String email;

    /**
     * Constructor vacío necesario para ciertos procesos de serialización/deserialización
     * que requieren un constructor sin parámetros.
     */
    public Cliente() {
    }

    /**
     * Constructor con todos los campos de la clase.
     * @param id Identificador único del cliente
     * @param nombre Nombre completo del cliente
     * @param email Correo electrónico del cliente
     */
    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }


    // Métodos getters y setters para acceder y modificar los atributos privados
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Representación en cadena del objeto Cliente
     * @return String con los datos del cliente separados por comas.
     */
    @Override
    public String toString() {
        return String.format("%d,%s,%s",id,nombre,email);
    }

}
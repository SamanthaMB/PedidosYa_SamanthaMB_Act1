package model;

import java.io.Serializable;

/**
 * Clase Pedido que representa un pedido realizado por un cliente.
 * Implementa Serializable para permitir la persistencia del objeto.
 */
public class Pedido implements Serializable {
    // Identificador único de versión para la serialización
    private static final long serialVersionUID = 234L;

    // Atributos privados del pedido
    private int id;
    private int clienteId;
    private String producto;
    private int cantidad;


    /**
     * Constructor vacío necesario para ciertos procesos de serialización/deserialización
     * que requieren un constructor sin parámetros.
     */
    public Pedido() {
    }


    /**
     * Constructor con todos los campos de la clase.
     * @param id Identificador único del pedido
     * @param cantidad Cantidad del producto solicitado
     * @param producto Nombre del producto
     * @param clienteId Identificador del cliente que realizó el pedido
     */
    public Pedido(int id, int cantidad, String producto, int clienteId) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.clienteId = clienteId;
    }


    // Métodos getters y setters para acceder y modificar los atributos privados

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }


    /**
     * Representación en cadena del objeto Pedido.
     * @return String con los datos del pedido separados por comas.
     */
    @Override
    public String toString() {
        return String.format("%d,%d,%s,%d",id,clienteId,producto,cantidad);
    }
}


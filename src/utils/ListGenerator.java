package utils;

import model.Cliente;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de utilidad para generar listas predefinidas de clientes y pedidos.
 */

public class ListGenerator {

    /**
     * Crea una lista simulada de clientes con datos de ejemplo.
     * @return Lista de objetos Cliente.
     */
    public static List<Cliente> crearListaClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Alba", "alba@unir.com"));
        clientes.add(new Cliente(2, "Laura", "laura@unir.com"));
        clientes.add(new Cliente(3, "Roberto", "roberto@unir.com"));
        return clientes;
    }

    /**
     * Crea una lista simulada de pedidos con datos de ejemplo.
     * @return Lista de objetos Pedido.
     */
    public static List<Pedido> crearListaPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1,1,"Mesa Madera",2));
        pedidos.add(new Pedido(2, 2, "Cortina Blanca", 3));
        pedidos.add(new Pedido(3, 4, "Silla Camel", 2));
        pedidos.add(new Pedido(4, 1, "Lámpara Globo", 1));
        pedidos.add(new Pedido(5, 4, "Cojín Negro", 3));
        return pedidos;
    }
}

